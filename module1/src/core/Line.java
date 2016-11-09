package core;

/**
 * Created by Aakash on 10/30/2016.
 */
public class Line {
    Point startPoint;
    Point endPoint;

    public Point getStartPoint() {
        return startPoint;
    }

    public void setStartPoint(Point startPoint) {
        this.startPoint = startPoint;
    }

    public Point getEndPoint() {
        return endPoint;
    }

    public void setEndPoint(Point endPoint) {
        this.endPoint = endPoint;
    }

    public void draw() {
        System.out.println("start point " + getStartPoint().getX() + "," +getStartPoint().getY());
        System.out.println("end Point " + getEndPoint().getX() + "," +getEndPoint().getY());
    }

}
