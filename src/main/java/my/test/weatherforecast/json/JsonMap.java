package my.test.weatherforecast.json;


import my.test.weatherforecast.model.Weather;
import org.apache.log4j.Logger;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class JsonMap {
    /**
     *
     */
    @Autowired
    WeatherObjectCreator mapper;
    /**
     *
     */
    private static final Logger LOG = Logger.getLogger(JsonMap.class);
    /**
     *
     */
    public Weather parseJson(String json) {
        System.setProperty("file.encoding", "UTF-8");
        Weather weather = null;

        LOG.info("JSON: " + json);
        try {
            weather = mapper.readValue(json, Weather.class);

        } catch (JsonParseException | JsonMappingException e) {
            LOG.error("Not valid  Json", e);
        } catch (IOException e) {
            LOG.error("IO exception", e);
        }
        return weather;
    }
}