import java.util.ArrayList;
import java.util.List;

//mapping configuration
public class ServletMappingConfig {
    public static List<ServletMapping> servletMappingList= new ArrayList<>();
    static{
        servletMappingList.add(new ServletMapping("/world","Hello","HelloWorldServlet"));
        servletMappingList.add(new ServletMapping("/tianmao","Tianmao","TianmaoServlet"));
        servletMappingList.add(new ServletMapping("/index.js","JS_index","FileServlet"));
        servletMappingList.add(new ServletMapping("/index.css","CSS_index","FileServlet"));
        servletMappingList.add(new ServletMapping("/practice.js","JS_practice","FileServlet"));
        servletMappingList.add(new ServletMapping("/","helloWorld","HelloWorldServlet"));
        servletMappingList.add(new ServletMapping("/index.html","homepage","FileServlet"));
        /* not completed yet */
        servletMappingList.add(new ServletMapping("/img/site/logo.gif","IMG_logo","FileServlet"));
        servletMappingList.add(new ServletMapping("/test.html","DOWNLOAD_test","DownloadServlet"));
    }
}
