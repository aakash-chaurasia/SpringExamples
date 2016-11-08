import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;
import org.springframework.messaging.PollableChannel;

import java.awt.*;


/**
 * Created by Aakash on 10/30/2016.
 */
public class DrawingApp {
    Class c;
    DrawingApp() {
        c = this.getClass();
    }
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        BeanFactory factory = new XmlBeanFactory(new FileSystemResource("module1/src/spring.xml"));
        /**
         Triangle triangleWith1Constructor = (Triangle) context.getBean("triangleWith1Constructor");
         triangleWith1Constructor.draw();
         */
        Triangle triangleWith2Constructor = (Triangle) context.getBean("triangleWith2Constructor");
        triangleWith2Constructor.draw();
        Triangle triangleWithProperty = (Triangle) context.getBean("triangleWithProperty");
        triangleWithProperty.draw();
        Triangle triangleWithStringConstructor = (Triangle) context.getBean("triangleWithStringConstructor");
        triangleWithStringConstructor.draw();
        Triangle triangleWithintConstructor = (Triangle) context.getBean("triangleWithIntConstructor");
        triangleWithintConstructor.draw();
        Rectangle rectangle = (Rectangle) context.getBean("rectangle");
        rectangle.draw();
        Rectangle rectangleWithInnerBean = (Rectangle) context.getBean("rectangleWithInnerBean");
        rectangleWithInnerBean.draw();
        Rectangle rectangleWithInnerBeanAlias = (Rectangle) context.getBean("rectangleWithInnerBeanAlias");
        rectangleWithInnerBeanAlias.draw();
        Polygon polygon = (Polygon) context.getBean("polygon");
        polygon.draw();
        Line line = (Line) context.getBean("line");
        line.draw();
        //example lof application context aware
        Pentagon pentagon = (Pentagon) context.getBean("pentagon");
        pentagon.draw();
        //example of singleton bean, always creates beans in start
        pentagon.setPointA(new Point(25, 25));
        Pentagon pentagon1 = (Pentagon) context.getBean("pentagon");
        pentagon1.draw();
        //example of prototype bean, creates everytime new request arrives
        Pentagon pentagon2 = (Pentagon) context.getBean("pentagonPrototype");
        pentagon2.draw();
        pentagon2.setPointA(new Point(25, 25));
        pentagon2.draw();
        Pentagon pentagon3 = (Pentagon) context.getBean("pentagonPrototype");
        pentagon3.draw();
        //example of

    }
}
