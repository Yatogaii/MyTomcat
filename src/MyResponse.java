import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class MyResponse {
    OutputStream oStream;
    public MyResponse(OutputStream oStream){
        this.oStream = oStream;
    }
    public void write(String content) throws Exception{
        StringBuilder response = new StringBuilder();
        response.append("HTTP/1.1 200 OK\n")
                .append("Content-type: text/html\n")
                .append("\r\n")
                .append("<html><body>")
                .append(content)
                .append("</body></html>");
        oStream.write(response.toString().getBytes());
        System.out.println("写入成功");
    }
    //We need write the corresponding file with the url,such as /index.js
    public void write(File file) throws Exception{
        StringBuilder response = new StringBuilder();
        byte[] fileBytes = new byte[(int)(file.length())];
        FileInputStream fip = new FileInputStream(file);
        fip.read(fileBytes);
        System.out.println(new String(fileBytes));
        response.append("HTTP/1.1 200 OK\n")
                .append("Content-type: text/html\n")
                .append("\r\n")
                .append(new String(fileBytes));
        oStream.write(response.toString().getBytes());
    }
    public void download(File file) throws Exception{
        StringBuilder response = new StringBuilder();
        FileInputStream fip = new FileInputStream(file);
        byte[] buffer = new byte[1024];
        int len;
        response.append("HTTP/1.1 200 OK\n")
                .append("Content-type: application/octet-stream;charset=utf-8\n")
                .append("\r\n");
        oStream.write(response.toString().getBytes());
        while ((len = fip.read(buffer)) != -1) {
            oStream.write(buffer, 0, len);
        }
        System.out.println(new String(buffer));
    }
}
