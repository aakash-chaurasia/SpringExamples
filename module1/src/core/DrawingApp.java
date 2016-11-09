package core;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

/**
 * Created by Aakash on 10/30/2016.
 */
public class DrawingApp {
    Class c;
    DrawingApp() {
        c = this.getClass();
    }
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("core/spring.xml");
        BeanFactory factory = new XmlBeanFactory(new FileSystemResource("module1/src/core/spring.xml"));
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
        //example lof application context aware and Bean Aware
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
        //Bean Definition Inheritance
        Rectangle rectangleWithParent = (Rectangle) context.getBean("rectangleWithParentBean");
        rectangleWithParent.draw();
        //Bean Definition Inheritance over written parents data
        Rectangle rectangleWithParentOverWritten = (Rectangle) context.getBean("rectangleWithParentBeanOverwritten");
        rectangleWithParentOverWritten.draw();
        //Bean with List, Parent, Replace
        Polygon polygonListWithParentDefault = (Polygon) context.getBean("polygonWithParentReplaceParent");
        polygonListWithParentDefault.draw();
        //Bean with List, Parent, Merge
        Polygon polygonListWithParentMerge = (Polygon) context.getBean("polygonWithParentMerging");
        polygonListWithParentMerge.draw();
        //Abstract Parent Bean
        Polygon abstractParent = (Polygon) context.getBean("polygonAbstractParent");
        //below line doesnt print anything since abstract no implementation found
        abstractParent.draw();
        Polygon polygonListWithAbstractParent = (Polygon) context.getBean("polygonWithAbstractParent");
        polygonListWithAbstractParent.draw();

        //Lifecycle callbacks
        AbstractApplicationContext abstractApplicationContext = new ClassPathXmlApplicationContext("core/spring.xml");
        abstractApplicationContext.registerShutdownHook();
        TriangleAbstract triangle = (TriangleAbstract) abstractApplicationContext.getBean("abstractTriangle");
        triangle.draw();
        TriangleMyInit triangleMyInit = (TriangleMyInit) abstractApplicationContext.getBean("customTriangle");
        triangle.draw();

        //substitution form postProcessot and properties
        Line lineProperties = (Line)  context.getBean("lineWithProperties");
        lineProperties.draw();

        //beans for classes with interface
        shape s = (shape) context.getBean("circle");
        s.draw();
        shape s1 = (shape) context.getBean("hexagon");
        s1.draw();
        //bean with required variables
        shape s2 = (shape) context.getBean("triangleWithRequired");
        s2.draw();
        //bean with Autowired
        shape s3 = (shape) context.getBean("rectangleWithAutowire");
        s3.draw();
        //@Component Example
        shape s4 = (shape) context.getBean("square");
        s4.draw();

        //@Service Example
        shape s5 = (shape) context.getBean("squareService");
        s5.draw();

        //@Repository Example
        shape s6 = (shape) context.getBean("squareRepo");
        s6.draw();

        //@Controller Example
        shape s7 = (shape) context.getBean("squareController");
        s7.draw();

    }
}
