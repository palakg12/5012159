package SingletonPatternExample;

    public class TestLogger {
        public static void main(String[] args) {
            // Attempt to get the Logger instance multiple times
            Logger logger1 = Logger.getInstance();
            Logger logger2 = Logger.getInstance();

            // Log messages to demonstrate functionality
            logger1.log("First log message.");
            logger2.log("Second log message.");

            // Verify if logger1 and logger2 are the same instance
            if (logger1 == logger2) {
                System.out.println("logger1 and logger2 are the same instance.");
            } else {
                System.out.println("logger1 and logger2 are different instances.");
            }
        }
}
