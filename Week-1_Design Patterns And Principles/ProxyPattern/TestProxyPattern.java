package ProxyPattern;

// TestProxyPattern.java
public class TestProxyPattern {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("image1.jpg");
        Image image2 = new ProxyImage("image2.jpg");

        // First access: image will be loaded and displayed
        image1.display();

        // Second access: image will be displayed from the cache
        image1.display();

        // First access for a different image: image will be loaded and displayed
        image2.display();

        // Second access: image will be displayed from the cache
        image2.display();
    }
}

