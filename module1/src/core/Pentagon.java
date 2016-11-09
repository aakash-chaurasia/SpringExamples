package core; /**
 * Created by Aakash on 11/8/2016.
 */
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
public class Pentagon implements ApplicationContextAware, BeanNameAware {
    private ApplicationContext context = null;
    private Point pointA;
    private Point pointB;
    private Point pointC;
    private Point pointD;
    private Point pointE;

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

    public Point getPointE() {
        return pointE;
    }

    public void setPointE(Point pointE) {
        this.pointE = pointE;
    }

    public void draw(){
        System.out.println("PointA " + getPointA().getX() + "," +getPointA().getY());
        System.out.println("PointB " + getPointB().getX() + "," +getPointB().getY());
        System.out.println("PointC " + getPointC().getX() + "," +getPointC().getY());
        System.out.println("PointD " + getPointD().getX() + "," +getPointD().getY());
        System.out.println("PointE " + getPointE().getX() + "," +getPointE().getY());
    }

    private void initialize() {
        pointA = (Point) context.getBean("zeroPoint");
        pointB = (Point) context.getBean("point2");
        pointC = (Point) context.getBean("point3");
        pointD = (Point) context.getBean("point4");
        pointE = (Point) context.getBean("zeroPoint");
    }
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("context set");
        context = applicationContext;
        initialize();
    }

    //whenever bean is created this method is called
    @Override
    public void setBeanName(String name) {
        System.out.println("bean setter name = " + name);
    }
}

