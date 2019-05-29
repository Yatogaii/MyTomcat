import java.io.File;

public class FileServlet extends  MyServlet{
    @Override
    public void deGet(MyRequest myRequest, MyResponse myResponse) {
        try{
        switch (myRequest.getUrl()){
            case "/index.html":myResponse.write(new File("F:\\html\\Blog\\html\\index.html"));break;
        }}catch (Exception e){e.printStackTrace();}
    }

    @Override
    public void doPost(MyRequest myRequestm, MyResponse myResponse) {

    }
}
