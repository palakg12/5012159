package BuilderPatternExample;

    // Computer.java
    public class Computer {
        // Required attributes
        private String CPU;
        private String RAM;
        private String storage;

        // Optional attributes
        private boolean graphicsCardEnabled;
        private boolean bluetoothEnabled;

        // Private constructor
        private Computer(Builder builder) {
            this.CPU = builder.CPU;
            this.RAM = builder.RAM;
            this.storage = builder.storage;
            this.graphicsCardEnabled = builder.graphicsCardEnabled;
            this.bluetoothEnabled = builder.bluetoothEnabled;
        }

        // Getters
        public String getCPU() {
            return CPU;
        }

        public String getRAM() {
            return RAM;
        }

        public String getStorage() {
            return storage;
        }

        public boolean isGraphicsCardEnabled() {
            return graphicsCardEnabled;
        }

        public boolean isBluetoothEnabled() {
            return bluetoothEnabled;
        }

        @Override
        public String toString() {
            return "Computer [CPU=" + CPU + ", RAM=" + RAM + ", Storage=" + storage
                    + ", Graphics Card=" + graphicsCardEnabled
                    + ", Bluetooth=" + bluetoothEnabled + "]";
        }
// Static nested Builder class
public static class Builder {
    // Required attributes
    private String CPU;
    private String RAM;
    private String storage;

    // Optional attributes
    private boolean graphicsCardEnabled;
    private boolean bluetoothEnabled;

    // Constructor for required attributes
    public Builder(String CPU, String RAM, String storage) {
        this.CPU = CPU;
        this.RAM = RAM;
        this.storage = storage;
    }

    // Setter methods for optional attributes
    public Builder setGraphicsCardEnabled(boolean graphicsCardEnabled) {
        this.graphicsCardEnabled = graphicsCardEnabled;
        return this;
    }

    public Builder setBluetoothEnabled(boolean bluetoothEnabled) {
        this.bluetoothEnabled = bluetoothEnabled;
        return this;
    }

    // Build method to create the Computer instance
    public Computer build() {
        return new Computer(this);
    }
}
}
