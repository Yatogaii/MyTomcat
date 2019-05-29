package $test;

import java.io.File;
import java.io.FileInputStream;

public class $file {
    public static void main(String[] args) throws  Exception{
        File html = new File("F:\\html\\Study\\home.html");
        System.out.println(html.getAbsolutePath());
        FileInputStream fip = new FileInputStream(html);
        byte[] bytes = new byte[(int)html.length()];
        fip.read(bytes);
        String res = new String(bytes);
        System.out.println(res);
    }
}
