package my.test.weatherforecast;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import my.test.weatherforecast.model.Weather;
import my.test.weatherforecast.service.WeatherService;


@RunWith(SpringRunner.class)
@SpringBootTest
public class FindOutWeatherApplicationTests {

    @Autowired
    WeatherService weatherService;

    @Test
    public void contextLoads() {
    }

    @Test
    public void getWeather() {
        Weather weather = weatherService.getWeatherByCity("London");
        Assert.assertEquals(weather.getCity().getCountry(), "GB");
    }
}
