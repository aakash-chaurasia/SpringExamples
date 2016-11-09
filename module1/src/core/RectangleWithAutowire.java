package core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * Created by Aakash on 11/8/2016.
 */
public class RectangleWithAutowire implements shape {
    private Point zeroPoint;
    private Point point2;
    private Point point3;
    private Point pointD;

    public Point getZeroPoint() {
        return zeroPoint;
    }
    @Autowired
    public void setZeroPoint(Point zeroPoint) {
        this.zeroPoint = zeroPoint;
    }

    public Point getPoint2() {
        return point2;
    }
    @Autowired
    public void setPoint2(Point point2) {
        this.point2 = point2;
    }

    public Point getPoint3() {
        return point3;
    }
    @Autowired
    public void setPoint3(Point point3) {
        this.point3 = point3;
    }

    public Point getPointD() {
        return pointD;
    }
    //finds bean with qualifier if there are mutiple beans of same type and no bean present of particular name not working
    @Autowired
    @Qualifier("rectangleRelated")
    public void setPointD(Point pointD) {
        this.pointD = pointD;
    }

    @Override
    public void draw() {
        System.out.println("RectangleWithAutowire.draw");
        System.out.println("PointA " + getZeroPoint().getX() + "," +getZeroPoint().getY());
        System.out.println("PointB " + getPoint2().getX() + "," +getPoint2().getY());
        System.out.println("PointC " + getPoint3().getX() + "," +getPoint3().getY());
        System.out.println("PointD " + getPointD().getX() + "," +getPointD().getY());
    }
}
