package a.b.c;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class UseAllBeans {

    private final MyBean myBeanXml;
    private final MyXmlOnlyBean myBeanXmlOnly2;
    private final MyJavaOnlyBean myBeanJavaOnly1;
    private final MyBean myBeanJava;

    public UseAllBeans(@Qualifier("myBeanXml") MyBean myBeanXml,
                       MyBean myBeanJava,
                       @Qualifier("myBeanXmlOnly2") MyXmlOnlyBean myBeanXmlOnly2,
                       @Qualifier("myBeanJavaOnly1") MyJavaOnlyBean myBeanJavaOnly1) {
        this.myBeanXml = myBeanXml;
        this.myBeanJava = myBeanJava;
        this.myBeanXmlOnly2 = myBeanXmlOnly2;
        this.myBeanJavaOnly1 = myBeanJavaOnly1;
    }

   public void useAllBeans() {
       System.out.println(myBeanXml);
       System.out.println(myBeanJava);
       System.out.println(myBeanXmlOnly2);
       System.out.println(myBeanJavaOnly1);
   }
}
