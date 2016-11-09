package core;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * Created by Aakash on 11/8/2016.
 */
public class TriangleAbstract implements InitializingBean, DisposableBean {
    public Point pointA;
    public Point pointB;
    public Point pointC;

    public TriangleAbstract() {
        System.out.println("Inside Constructor of Abstract Triangle");
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
        System.out.println("TriangleAbstract.draw");
        System.out.println("PointA " + getPointA().getX() + "," +getPointA().getY());
        System.out.println("PointB " + getPointB().getX() + "," +getPointB().getY());
        System.out.println("PointC " + getPointC().getX() + "," +getPointC().getY());
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("TriangleAbstract.afterPropertiesSet");;
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("TriangleAbstract.destroy");
    }

    public void myInit() {
        System.out.println("TriangleAbstract.myInit");
    }

    public void cleanUp() {
        System.out.println("TriangleAbstract.cleanUp");
    }
}
