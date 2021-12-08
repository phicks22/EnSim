package renderer.input;

import java.awt.event.*;

public class Mouse implements MouseListener, MouseMotionListener, MouseWheelListener {

    private int mouseX = -1;
    private int mouseY = -1;
    private int mouseB = -1;
    private int scroll = 0;

    public int getX() {
        return this.mouseX;
    }

    public int getY() {
        return this.mouseY;
    }

    public int getButton() {
        return this.mouseB;
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        System.out.println("Mouse Dragged");
        this.mouseX = e.getX();
        this.mouseY = e.getY();
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        System.out.println("Mouse Moved");
        this.mouseX = e.getX();
        this.mouseY = e.getY();
    }

    @Override
    public void mouseWheelMoved(MouseWheelEvent e) {

    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
