package ntt.global;

import org.springframework.stereotype.Component;


public class HappyFortuneService implements FortuneService
{
    @Override
    public String getFortune()
    {
        return "Today is your lucky day! 22222";
    }
}
