package a.b.c;

import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.ContextStartedEvent;
import org.springframework.context.event.EventListener;

/**
 * *
 * <p>beans for this class are defined in xml config only</p>
 * *
 */
public class MyJavaOnlyBean {

    @Override
    public String toString() {
        return "MyJavaOnlyBean{}";
    }

    @EventListener
    public void on(ContextRefreshedEvent event) {
        System.out.println("ContextRefreshedEvent occurred");
        event.getApplicationContext().getBean("useAllBeans", UseAllBeans.class).useAllBeans();
    }
}
