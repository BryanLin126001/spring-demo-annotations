package ntt.global;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

public class SwimCoach implements ICoach
{
    FortuneService fortuneService;

    public SwimCoach(FortuneService fortuneService)
    {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout()
    {
        return "Go swimming";
    }

    @Override
    public String getDailyFortune()
    {
        return fortuneService.getFortune();
    }

}
