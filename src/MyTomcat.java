import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MyTomcat{
    private int port = 8080;
    private Map<String,String> ServletMap;

    public MyTomcat(int port){
        this.port = port;
        /* Initialize the relationship between the url and the corresponding servlet */
        ServletMap = new HashMap<String, String>();
        for(ServletMapping tmp:ServletMappingConfig.servletMappingList){
            ServletMap.put(tmp.getUrl(),tmp.getClazz());
        }
    }
    public void start(){
        ServerSocket mServer = null;
        try {
            mServer = new ServerSocket(port);
            while (true){
                Socket client = mServer.accept();
                MyRequest   myRequest   = new MyRequest (client.getInputStream());
                MyResponse  myResponse  = new MyResponse(client.getOutputStream());
                dispatch(myRequest,myResponse);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private void dispatch(MyRequest myRequest,MyResponse myResponse){
        String url  = myRequest.getUrl();
        //Use url to get the corresponding servletName
        String clazz= ServletMap.get(url);
        //use reflect to get an instance of the servlet
        try{
             Class<MyServlet> myServletClass = (Class<MyServlet>) Class.forName(clazz);
//            MyServlet myServlet = myServletClass.cast(MyServlet.class);
            MyServlet myServlet = myServletClass.getDeclaredConstructor().newInstance();
            myServlet.service(myRequest,myResponse);
        }catch (Exception e){e.printStackTrace();}
    }
    public static void main(String[] args) throws Exception{
        new MyTomcat(8080).start();
    }
}