public class Greetings {
    //static means u can access that function without creating its object
    
    public static void main(String[] args) {
        Message m=new Message(4, "Hello");
        // m.message();
        Message m2=new Message(5, "Hello");
        System.out.println(Message.from);
        System.out.println(Message.from);



    }
}
