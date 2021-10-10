package renderer.shapes;

import renderer.point.MyPoint;
import renderer.point.PointConverter;

import java.awt.*;

public class MyPolygon {

    private MyPoint[] points;

    public MyPolygon(MyPoint... points) {
        this.points = new MyPoint[points.length];
        for(int i = 0; i < points.length; i++) {
            MyPoint p = points[i];
            this.points[i] = new MyPoint(p.x, p.y, p.z);
        }
    }

    public void render(Graphics g) {
        Polygon poly = new Polygon();
        for(int i = 0; i < points.length; i++) {
            Point p = PointConverter.convertPoint(points[i]);
            poly.addPoint(p.x, p.y);
        }
        g.setColor(Color.RED);
        g.fillPolygon(poly);
    }
}
