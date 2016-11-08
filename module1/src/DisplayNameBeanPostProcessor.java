import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * Created by Aakash on 11/8/2016.
 * Execute some methods before and after every bean is created
 */
public class DisplayNameBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("before bean = [" + bean + "], beanName = [" + beanName + "]");
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("after bean = [" + bean + "], beanName = [" + beanName + "]");
        return bean;
    }
}
