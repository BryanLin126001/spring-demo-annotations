package ntt.global;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

public class SwimJavaConfigDemoApp
{
    public static void main(String[] args)
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

        ICoach theCoach = context.getBean("swimCoach", ICoach.class);

        System.out.println(theCoach.getDailyWorkout());

        System.out.println(theCoach.getDailyFortune());



        context.close();
    }
}
