package my.test.weatherforecast;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class FindOutWeatherApplication extends SpringBootServletInitializer {
    /**
     *
     */
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(FindOutWeatherApplication.class);
    }
    /**
     *
     */
    public static void main(String[] args) {

        SpringApplication.run(FindOutWeatherApplication.class, args);
    }
}
