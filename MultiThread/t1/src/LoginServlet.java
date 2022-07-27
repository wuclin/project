public class LoginServlet {
    private static String usernameRef;
    private static String passwordRef;
    synchronized public static void doPost(String username, String password){
        try{
            usernameRef = username;
            if (username.equals("a"))
                Thread.sleep(5000);
            passwordRef = password;
            System.out.println(usernameRef + "__" +passwordRef);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
    /**
     * 可以去掉synchronized看不同
     */
}
