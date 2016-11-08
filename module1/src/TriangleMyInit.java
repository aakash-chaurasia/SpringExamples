/**
 * Created by Aakash on 11/8/2016.
 */
public class TriangleMyInit {
    public Point pointA;
    public Point pointB;
    public Point pointC;

    public TriangleMyInit() {
        System.out.println("TriangleMyInit.TriangleMyInit");
    }

    public Point getPointA() {
        return pointA;
    }

    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    public Point getPointC() {
        return pointC;
    }

    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }

    public void draw() {
        System.out.println("TriangleMyInit.draw");
        System.out.println("PointA " + getPointA().getX() + "," +getPointA().getY());
        System.out.println("PointB " + getPointB().getX() + "," +getPointB().getY());
        System.out.println("PointC " + getPointC().getX() + "," +getPointC().getY());
    }

    public void myInit() {
        System.out.println("TriangleMyInit.myInit");
    }

    public void cleanUp() {
        System.out.println("TriangleMyInit.cleanUp");
    }
}
