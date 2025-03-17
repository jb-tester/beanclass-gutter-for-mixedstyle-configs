package a.b.c;

import a.b.d.BarConfig;
import org.springframework.context.annotation.*;


@Configuration
@ComponentScan
@ImportResource("classpath:foo.xml")
@Import(BarConfig.class)
public class FooConfig {

    @Bean public MyBean myBeanJava() {
        MyBean myBean = new MyBean();
        myBean.setId("myBean from Java");
        return myBean;
    }
    @Bean public MyJavaOnlyBean myBeanJavaOnly2() {
        return new MyJavaOnlyBean();
    }

    @Bean
    public MyJavaOnlyBean myBeanJavaOnly1() {
        return new MyJavaOnlyBean();
    }
}
