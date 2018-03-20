package my.test.weatherforecast.json;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;
import my.test.weatherforecast.model.Weather;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class WeatherObjectCreator extends ObjectMapper {

    public WeatherObjectCreator() {
        setSerializationInclusion(JsonInclude.Include.NON_NULL);
        configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        SimpleModule module = new SimpleModule();
        module.addDeserializer(Weather.class, new WeatherDeserializer());
        this.registerModule(module);
    }


}