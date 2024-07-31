package BuilderPatternExample;

    // TestBuilderPattern.java
    public class TestBuilderPattern {
        public static void main(String[] args) {
            // Creating a computer with only required attributes
            Computer basicComputer = new Computer.Builder("Intel i5", "8GB", "256GB SSD")
                    .build();
            System.out.println(basicComputer);

            // Creating a high-end computer with all attributes
            Computer highEndComputer = new Computer.Builder("Intel i7", "16GB", "1TB SSD")
                    .setGraphicsCardEnabled(true)
                    .setBluetoothEnabled(true)
                    .build();
            System.out.println(highEndComputer);

            // Creating a mid-range computer with some optional attributes
            Computer midRangeComputer = new Computer.Builder("Intel i3", "4GB", "500GB HDD")
                    .setGraphicsCardEnabled(true)
                    .build();
            System.out.println(midRangeComputer);
        }
}
