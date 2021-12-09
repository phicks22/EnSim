package renderer.entity;

import renderer.input.ClickType;
import renderer.input.Mouse;
import renderer.point.PointConverter;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class EntityManager {

    private List<IEntity> entities;
    private int initialX, initialY;
    private ClickType prevMouse = ClickType.Unknown;
    private double mouseSensitivity = 1;

    public EntityManager() {
        this.entities = new ArrayList<IEntity>();

    }

    public void init() {
        this.entities.add(BasicEntityBuilder.createCube(100, 0, 0, 0));

    }

    public void update(Mouse mouse) {
        int x = mouse.getX();
        int y = mouse.getY();
        if(mouse.getButton() == ClickType.LeftClick) {
            int xDif = x - initialX;
            int yDif = y - initialY;

            this.rotate(true, 0, -yDif/mouseSensitivity, xDif/mouseSensitivity);

        }

        else if(mouse.getButton() == ClickType.RightClick) {
            int xDif = x - initialX;
            int yDif = y - initialY;

            this.rotate(true, 0, -xDif/mouseSensitivity, 0);

        }

        if(mouse.isScrollingUp()) {
            PointConverter.zoomIn();

        }

        if(mouse.isScrollingDown()) {
            PointConverter.zoomOut();

        }

        mouse.resetScroll();

        initialX = x;
        initialY = y;

    }

    public void rotate(boolean CW, double xDegrees, double yDegrees, double zDegrees) {
        for(IEntity entity : this.entities) {
            entity.rotate(CW, xDegrees, yDegrees, zDegrees);

        }

    }

    public void render(Graphics g) {
        for(IEntity entity : this.entities) {
            entity.render(g);

        }

    }

}
