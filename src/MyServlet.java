
/* Request processing base class */
public abstract class MyServlet {
    public abstract void deGet(MyRequest myRequest,MyResponse myResponse);
    public abstract void doPost(MyRequest myRequestm,MyResponse myResponse);

    public void service(MyRequest myRequest,MyResponse myResponse){
        if (myRequest.getMethod().equals("GET"))
            deGet(myRequest,myResponse);
        else if (myRequest.getMethod().equals("POST"))
            doPost(myRequest,myResponse);
    }
}
