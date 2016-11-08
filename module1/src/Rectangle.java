import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * Created by Aakash on 10/30/2016.
 */
public class Rectangle implements ApplicationContextAware {
    private ApplicationContext context = null;
    private Point pointA;
    private Point pointB;
    private Point pointC;
    private Point pointD;

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

    public Point getPointD() {
        return pointD;
    }

    public void setPointD(Point pointD) {
        this.pointD = pointD;
    }

    public void draw(){
        System.out.println("PointA " + getPointA().getX() + "," +getPointA().getY());
        System.out.println("PointB " + getPointB().getX() + "," +getPointB().getY());
        System.out.println("PointC " + getPointC().getX() + "," +getPointC().getY());
        System.out.println("PointD " + getPointD().getX() + "," +getPointD().getY());
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        context = applicationContext;
    }
}
