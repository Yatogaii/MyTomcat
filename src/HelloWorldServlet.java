public class HelloWorldServlet extends MyServlet {
    @Override
    public void deGet(MyRequest myRequest, MyResponse myResponse) {
        try {
            myResponse.write("Hello!");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void doPost(MyRequest myRequestm, MyResponse myResponse) {
    }
}
