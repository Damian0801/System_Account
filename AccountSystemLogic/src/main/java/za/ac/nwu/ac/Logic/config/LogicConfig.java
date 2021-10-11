package za.ac.nwu.ac.Logic.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import za.ac.nwu.ac.translator.config.TranslatorConfig;

@Import({TranslatorConfig.class})
@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages = {
        "za.ac.nwu.ac.Logic.flow"

})
public class LogicConfig {
}
