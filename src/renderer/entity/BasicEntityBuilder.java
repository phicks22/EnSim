package renderer.entity;

import renderer.point.MyPoint;
import renderer.shapes.MyPolygon;
import renderer.shapes.Tetrahedron;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class BasicEntityBuilder {

    public static IEntity createCube(double size, double centerX, double centerY, double centerZ) {

        MyPoint p1 = new MyPoint( centerX + size/2, centerY + -size/2, centerZ + -size/2);
        MyPoint p2 = new MyPoint( centerX + size/2, centerY + size/2, centerZ + -size/2);
        MyPoint p3 = new MyPoint( centerX + size/2, centerY + size/2, centerZ + size/2);
        MyPoint p4 = new MyPoint( centerX + size/2, centerY + -size/2, centerZ + size/2);
        MyPoint p5 = new MyPoint( centerX + -size/2, centerY + -size/2, centerZ + -size/2);
        MyPoint p6 = new MyPoint( centerX + -size/2, centerY + size/2, centerZ + -size/2);
        MyPoint p7 = new MyPoint( centerX + -size/2, centerY + size/2, centerZ + size/2);
        MyPoint p8 = new MyPoint( centerX + -size/2, centerY + -size/2, centerZ + size/2);
        Tetrahedron tetra = new Tetrahedron(
                new MyPolygon(Color.WHITE, p5, p6, p7, p8),
                new MyPolygon(Color.RED, p1, p2, p6, p5),
                new MyPolygon(Color.ORANGE, p1, p5, p8, p4),
                new MyPolygon(Color.GRAY, p2, p6, p7, p3),
                new MyPolygon(Color.GREEN, p4, p3, p7, p8),
                new MyPolygon(Color.BLUE, p1, p2, p3, p4));

        List<Tetrahedron> tetras = new ArrayList<Tetrahedron>();
        tetras.add(tetra);

        return new Entity(tetras);
        }
    }
