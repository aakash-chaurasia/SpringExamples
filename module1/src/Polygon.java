import java.util.List;

/**
 * Created by Aakash on 10/30/2016.
 */
public class Polygon {
    public Polygon() {
    }

    public List<Point> getPoints() {
        return points;
    }

    public void setPoints(List<Point> points) {
        this.points = points;
    }

    private List<Point> points;

    public void draw(){
        for(Point p : getPoints()){
            System.out.println("point  = " + p.getX() + "," + p.getY());
        }
    }
}
