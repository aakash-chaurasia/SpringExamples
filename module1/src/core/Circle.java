package core;

/**
 * Created by Aakash on 11/8/2016.
 */
public class Circle implements shape {
    private Point centre;

    public Point getCentre() {
        return centre;
    }

    public void setCentre(Point centre) {
        this.centre = centre;
    }

    @Override
    public void draw() {
        System.out.println("Circle.draw");
        System.out.println("Center " + getCentre().getX() + "," +getCentre().getY());
    }
}
