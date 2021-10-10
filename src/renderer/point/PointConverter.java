package renderer.point;

import renderer.Display;

import java.awt.Point;

public class PointConverter {

    public static Point convertPoint(MyPoint point3D) {
        int x2d = (int) (Display.WIDTH / 2 + point3D.y);
        int y2d = (int) (Display.HEIGHT / 2 - point3D.z); // Need to subtract because inverted

        Point point2D = new Point(x2d, y2d);
        return point2D;

    }
}
