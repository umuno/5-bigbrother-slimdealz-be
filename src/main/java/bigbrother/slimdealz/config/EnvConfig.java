package bigbrother.slimdealz.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("file:${user.dir}/.env")
public class EnvConfig {

}
