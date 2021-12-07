package renderer.shapes;

import renderer.point.MyPoint;

import java.awt.*;

public class Tetrahedron {

    private MyPolygon[] polygons;
    private Color color;

    public Tetrahedron(Color color, MyPolygon... polygons) {
        this.color = color;
        this.polygons = polygons;
        this.setPolygonColor();
    }

    public Tetrahedron(MyPolygon... polygons) {
        this.color = Color.BLUE;
        this.polygons = polygons;
    }

    public void render(Graphics g) {
        for(MyPolygon poly : this.polygons ) {
            poly.render(g);
        }
    }

    public void rotate(boolean CW, double xDegrees, double yDegrees, double zDegrees) {
        for(MyPolygon p : this.polygons) {
            p.rotate(CW, xDegrees, yDegrees, zDegrees);
        }
        this.sortPolygons();

    }

    private void sortPolygons() {

    }

    private void setPolygonColor() {
        for(MyPolygon poly : this.polygons) {
            poly.setColor(this.color);
        }
    }
}
