package chapter3.annotation1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Configuration 告诉spring容器这是一个有多个bean的配置类
 */
@Configuration
public class SpringIdolConfig {
    /**
     * 注入容器的bean的id和方法名，保持一致
     * 
     * @return
     */
    @Bean
    public Guitar performGuitar() {
        return new Guitar();
    }
}
