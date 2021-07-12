package ntt.global;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp
{
    public static void main(String[] args)
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        ICoach theCoach = context.getBean("tennisCoach", ICoach.class);

        System.out.println(theCoach.getDailyFortune());

        System.out.println(theCoach.getDailyWorkout());

        context.close();

    }
}
