package ntt.global;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class TennisCoach implements ICoach
{
    @Autowired
    @Qualifier("randomFortuneService")
    private FortuneService fortuneService;

    public TennisCoach()
    {
        System.out.println("inside the default constructor");
    }

    @PostConstruct
    public void doMyStartupStuff()
    {
        System.out.println(">> TennisCoach: inside of doMyStartupStuff()");
    }

    @PreDestroy
    public void doMyCleanupStuff()
    {
        System.out.println(">> TennisCoach: inside of doMyCleanupStuff()");
    }

//    @Autowired
//    public void doSomeCrazyStuff(FortuneService fortuneService)
//    {
//        System.out.println("inside doDomeCrazyStuff() method");
//        this.fortuneService = fortuneService;
//    }

    @PostConstruct
    public void cleanUp()
    {
        System.out.println("Got out the tennis coach");
    }

    @Override
    public String getDailyWorkout()
    {
        return "It is your tennis coach";
    }

    @Override
    public String getDailyFortune()
    {
        return fortuneService.getFortune();
    }
}