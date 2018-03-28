package chapter3.annotation1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringIdolConfig {
    @Bean
    public Guitar performGuitar() {
        return new Guitar();
    }
}
