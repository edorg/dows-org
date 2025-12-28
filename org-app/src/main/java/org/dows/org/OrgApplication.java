package org.dows.org;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"org.dows.org", "org.dows.rade.mock"})
public class OrgApplication{
    public static void main(String[] args) {
        Dotenv dotenv = Dotenv.configure()
            .directory(System.getProperty("user.home"))
            .ignoreIfMissing()
            .load();
        dotenv.entries().forEach(entry -> System.setProperty(entry.getKey(), entry.getValue()));
        SpringApplication.run(OrgApplication.class, args);
    }
}
