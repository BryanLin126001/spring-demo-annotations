package ntt.global;

import org.springframework.stereotype.Component;


public class HappyFortuneService2 implements FortuneService
{

    @Override
    public String getFortune()
    {
        return "This is the HappyFortuneService2";
    }
}
