import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

/**
 * Created by Aakash on 11/8/2016.
 * BeanFactoryPostProcessor
 * executes once
 */
public class DisplayBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("DisplayBeanFactoryPostProcessor.postProcessBeanFactory");
    }
}
