import java.util.List;

/**
 * Created by Aakash on 11/8/2016.
 */
public class Hexagon implements shape {

    List<Point> points;

    public List<Point> getPoints() {
        return points;
    }

    public void setPoints(List<Point> points) {
        this.points = points;
    }

    @Override
    public void draw() {
        System.out.println("Hexagon.draw");
        for(Point p : getPoints()){
            System.out.println("point  = " + p.getX() + "," + p.getY());
        }
    }
}
