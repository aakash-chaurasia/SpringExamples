import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
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
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        BeanFactory factory = new XmlBeanFactory(new FileSystemResource("module1/src/spring.xml"));
        Triangle triangle = (Triangle) context.getBean("triangle");

        triangle.draw();
        DrawingApp d = new DrawingApp();
    }
}
