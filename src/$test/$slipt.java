package $test;

public class $slipt {
    static String request = "GET / HTTP/1.1\n" +
            "Host: localhost:8080\n" +
            "User-Agent: Mozilla/5.0 (Windows NT 10.0; WOW64; rv:64.0) Gecko/20100101 Firefox/64.0\n" +
            "Accept: text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8\n" +
            "Accept-Language: zh-CN,zh;q=0.8,zh-TW;q=0.7,zh-HK;q=0.5,en;q=0.3,en-US;q=0.2\n" +
            "Accept-Encoding: gzip, deflate\n" +
            "DNT: 1\n" +
            "Connection: keep-alive\n" +
            "Upgrade-Insecure-Requests: 1\n" +
            "Pragma: no-cache\n" +
            "Cache-Control: no-cache";

    public static void main(String[] args) {
        /* 通过换行符将其分成一个字符串数组 */
        for(String tmp:request.split("\n"))
            System.out.println(tmp);
        String header = request.split("\n")[0];
        for (String tmp:header.split(" "))
            System.out.println(tmp);
        /* \s在正则表达式中就是空白符，但是\具有转义功能，所以这里用\\s */
        for (String tmp:header.split("\\s"))
            System.out.println(tmp);
    }
}
