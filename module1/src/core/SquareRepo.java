package core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by Aakash on 11/8/2016.
 */
@Repository
public class SquareRepo implements shape {
    @Autowired
    private Point zeroPoint;
    @Autowired
    private Point point2;
    @Autowired
    private Point point3;
    @Autowired
    private Point point4;

    public Point getZeroPoint() {
        return zeroPoint;
    }

    public void setZeroPoint(Point zeroPoint) {
        this.zeroPoint = zeroPoint;
    }

    public Point getPoint2() {
        return point2;
    }

    public void setPoint2(Point point2) {
        this.point2 = point2;
    }

    public Point getPoint3() {
        return point3;
    }

    public void setPoint3(Point point3) {
        this.point3 = point3;
    }

    public Point getPoint4() {
        return point4;
    }

    public void setPoint4(Point point4) {
        this.point4 = point4;
    }

    @Override
    public void draw() {
        System.out.println("SquareRepo.draw");
        System.out.println("PointA " + getZeroPoint().getX() + "," +getZeroPoint().getY());
        System.out.println("PointB " + getPoint2().getX() + "," +getPoint2().getY());
        System.out.println("PointC " + getPoint3().getX() + "," +getPoint3().getY());
        System.out.println("PointD " + getPoint4().getX() + "," +getPoint4().getY());
    }
}
