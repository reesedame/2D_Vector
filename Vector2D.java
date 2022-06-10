public class Vector2D {
    public final double x;
    public final double y;

    public Vector2D(double vec_x, double vec_y) {
        x = vec_x;
        y = vec_y;
    }

    public String toString() {
        String str = "(" + x + "," + " " + y + ")";
        return str;
    }

    public Vector2D plus(Vector2D other) {
        Vector2D result = new Vector2D(x + other.x, y + other.y);
        return result;
    }

    public Vector2D minus(Vector2D other) {
        Vector2D result = new Vector2D(x - other.x, y - other.y);
        return result;
    }

    public double dot(Vector2D other) {
        double result = (x * other.x) + (y * other.y);
        return result;
    }
}