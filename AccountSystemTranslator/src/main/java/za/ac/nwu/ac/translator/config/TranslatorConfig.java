package za.ac.nwu.ac.translator.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import za.ac.nwu.repo.config.RepoConfig;

@Import({RepoConfig.class})
@Configuration
@ComponentScan(basePackages ={
        "za.ac.nwu.ac.translator"
})
public class TranslatorConfig {
}
