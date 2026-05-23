package patterns.structural.bridge;

public class VectorRenderer implements Renderer {
    @Override
    public void renderCircle(float radius) {
        System.out.println("vector rendering drawing circle with radius: " + radius);
    }

    @Override
    public void renderSquare(float length) {
        System.out.println("vector rendering drawing square with length: " + length);
    }
}
