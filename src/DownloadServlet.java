import java.io.File;

public class DownloadServlet extends MyServlet{
    @Override
    public void deGet(MyRequest myRequest, MyResponse myResponse) {
        switch (myRequest.getUrl()){
            case "/test.html":
                try{
                myResponse.download(new File("files/home.html"));
                }catch (Exception e){e.printStackTrace();}
        }
    }

    @Override
    public void doPost(MyRequest myRequestm, MyResponse myResponse) {

    }
}
