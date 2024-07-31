package SingletonPatternExample;

    public class Logger {
        // Private static instance of the Logger class
        private static Logger instance;

        // Private constructor to prevent instantiation from outside the class
        private Logger() {
            // Initialization code, if necessary
        }

        // Public static method to provide the single instance of the class
        public static Logger getInstance() {
            if (instance == null) {
                // Create the instance if it doesn't exist
                instance = new Logger();
            }
            return instance;
        }

        // Example method to demonstrate logging functionality
        public void log(String message) {
            System.out.println("Log message: " + message);
        }
}
