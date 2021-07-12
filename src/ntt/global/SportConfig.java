package ntt.global;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("ntt.global")
@PropertySource("classpath:mylogger.properties")
@PropertySource("classpath:sport.properties")
public class SportConfig
{


    @Bean
    public MyLoggerConfig myLoggerConfig(@Value("${root.logger.level}") String rootLoggerLevel,
                                         @Value("${printed.logger.level}") String printedLoggerLevel) {

        MyLoggerConfig myLoggerConfig = new MyLoggerConfig(rootLoggerLevel, printedLoggerLevel);

        return myLoggerConfig;
    }

    // define bean for our sad fortune service
    @Bean
    public FortuneService happeFortuneService() {
        return new HappyFortuneService2();
    }

    // define bean for our swim coach AND inject dependency
    @Bean
    public ICoach swimCoach() {
      return new SwimCoach(happeFortuneService());
    }
}
