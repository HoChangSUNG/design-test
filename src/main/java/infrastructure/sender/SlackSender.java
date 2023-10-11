package infrastructure.sender;

public class SlackSender implements Sender{
    @Override
    public void send() {
        System.out.println("SlackSender.send");
    }
}
