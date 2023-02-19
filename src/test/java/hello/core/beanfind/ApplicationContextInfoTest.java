package hello.core.beanfind;

import hello.core.AppConfig;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationContextInfoTest {

    AnnotationConfigApplicationContext ac=new AnnotationConfigApplicationContext(AppConfig.class);
    @Test
    @DisplayName("모든 빈 출력")
    void findAllBean(){
        String[] beanDefinitionNames=ac.getBeanDefinitionNames();
        for(String beanDefinionName:beanDefinitionNames){
            Object bean=ac.getBean(beanDefinionName);
            System.out.println("name="+beanDefinionName+" obejct = "+bean);
        }
    }

    @Test
    @DisplayName("애플리케이션 빈 출력")
    void findApplicationBean(){
        String[] beanDefinitionNames=ac.getBeanDefinitionNames();
        for(String beanDefinionName:beanDefinitionNames){
            BeanDefinition beanDefinition=ac.getBeanDefinition(beanDefinionName);

            if(beanDefinition.getRole()==BeanDefinition.ROLE_APPLICATION){
                Object bean=ac.getBean(beanDefinionName);
                System.out.println("name="+beanDefinionName+" obejct = "+bean);
            }

        }
    }
}
