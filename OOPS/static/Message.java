public class Message {
    int c;
    String to;
    static int from;

    public Message(int c, String to) {
        this.c = c;
        this.to = to;
        Message.from+=1;
    }
    
}
