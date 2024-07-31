package DecoratorPatternExample;

// SlackNotifierDecorator.java
public class SlackNotifierDecorator extends NotifierDecorator {
    public SlackNotifierDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        super.send(message); // Delegate to the base notifier
        sendSlack(message); // Add Slack functionality
    }

    private void sendSlack(String message) {
        System.out.println("Sending Slack message: " + message);
    }
}

