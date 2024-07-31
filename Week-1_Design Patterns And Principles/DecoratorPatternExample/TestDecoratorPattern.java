package DecoratorPatternExample;

// TestDecoratorPattern.java
public class TestDecoratorPattern {
    public static void main(String[] args) {
        Notifier emailNotifier = new EmailNotifier();

        // Send an email notification
        emailNotifier.send("Hello, this is a test email!");

        // Decorate email notifier with SMS functionality
        Notifier smsNotifier = new SMSNotifierDecorator(emailNotifier);
        smsNotifier.send("Hello, this is a test message!");

        // Decorate email notifier with Slack functionality
        Notifier slackNotifier = new SlackNotifierDecorator(emailNotifier);
        slackNotifier.send("Hello, this is a test message!");

        // Decorate email notifier with both SMS and Slack functionalities
        Notifier combinedNotifier = new SlackNotifierDecorator(new SMSNotifierDecorator(emailNotifier));
        combinedNotifier.send("Hello, this is a test message!");
    }
}

