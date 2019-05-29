import java.io.InputStream;

public class MyRequest {
    String httpRequestHead;
    String httpRequest;
    String url;
    String method;
    InputStream iStream;

    public MyRequest(InputStream iStream) {
        this.iStream = iStream;
        byte[] httpRequestByte = new byte[1024];
        try{
        iStream.read(httpRequestByte);}catch (Exception e){e.printStackTrace();}
//        httpRequest = httpRequestByte.toString(); //byte[] cannot toString!
        httpRequest = new String(httpRequestByte);
        System.out.println(httpRequest);
        httpRequestHead = httpRequest.split("\n")[0];
        System.out.println(httpRequestHead);
        try{
            method = httpRequestHead.split("\\s")[0];
            /* WARNING! */
            url = httpRequestHead.split("\\s")[1];
        } catch (Exception e){
            System.out.println(e.toString());
            System.out.println(httpRequestHead);
        }
    }

    public String getUrl() {
        return url;
    }

    public String getMethod() {
        return method;
    }
}
