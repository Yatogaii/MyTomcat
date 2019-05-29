import java.io.File;

public class TianmaoServlet extends MyServlet {
    @Override
    public void deGet(MyRequest myRequest, MyResponse myResponse) {
        try{
        myResponse.write(new File("F:\\html\\Study\\home.html"));
        }catch (Exception e){e.printStackTrace();}
    }

    @Override
    public void doPost(MyRequest myRequestm, MyResponse myResponse) {

    }
}
