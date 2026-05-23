package patterns.structural.bridge;

public class RasterRenderer implements Renderer {
    @Override
    public void renderCircle(float radius) {
        System.out.println("raster rendering drawing circle with radius: " + radius);
    }

    @Override
    public void renderSquare(float length) {
        System.out.println("raster rendering drawing square with length: " + length);
    }
}
