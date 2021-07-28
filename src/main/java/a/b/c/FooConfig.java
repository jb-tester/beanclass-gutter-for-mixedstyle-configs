package a.b.c;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * *
 * <p>Created by irina on 28.07.2021.</p>
 * <p>Project: foo</p>
 * *
 */
@Configuration
@ImportResource("classpath:foo.xml")
public class FooConfig {
    @Bean
    public MyJavaOnlyBean myBeanJavaOnly1() {
        return new MyJavaOnlyBean();
    }
    @Bean
    public MyJavaOnlyBean myBeanJavaOnly2() {
        return new MyJavaOnlyBean();
    }

    @Bean
    public MyBean myBeanJava() {
        return new MyBean();
    }
}
