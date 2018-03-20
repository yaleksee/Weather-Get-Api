package my.test.weatherforecast.model;

import java.time.LocalDateTime;

public class Data {
    /**
     *
     */
    private DataMain dataMain;
    private Fall fall;
    private LocalDateTime localDateTime;

    /**
     *
     */
    @Override
    public String toString() {
        return "Data{" +
                "dataMain=" + dataMain.toString() +
                ", fall=" + fall.toString() +
                ", date=" + localDateTime +
                '}';
    }

    /**
     *
     */
    public LocalDateTime getDate() {
        return localDateTime;
    }

    public void setDate(LocalDateTime date) {
        this.localDateTime = date;
    }

    public DataMain getDataMain() {
        return dataMain;
    }

    public void setDataMain(DataMain dataMain) {
        this.dataMain = dataMain;
    }

    public Fall getFall() {
        return fall;
    }

    public void setPrecipitation(Fall fall) {
        this.fall = fall;
    }

    /**
     *
     */
    public static class Fall {

        private String main;
        private String description;

        @Override
        public String toString() {
            return "fall{" +
                    "main='" + main + '\'' +
                    ", description='" + description + '\'' +
                    '}';
        }

        public String getMain() {
            return main;
        }

        public void setMain(String main) {
            this.main = main;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }
    }

    /**
     *
     */
    public static class DataMain {
        private String temperature;
        private String pressure;
        private String humidity;


        @Override
        public String toString() {
            return "DataMain{" +
                    "temperature='" + temperature + '\'' +
                    ", pressure='" + pressure + '\'' +
                    ", humidity='" + humidity + '\'' +
                    '}';
        }

        public String getTemp() {
            return temperature;
        }

        public void setTemp(String temp) {
            this.temperature = temp;
        }

        public String getPressure() {
            return pressure;
        }

        public void setPressure(String pressure) {
            this.pressure = pressure;
        }

        public String getHumidity() {
            return humidity;
        }

        public void setHumidity(String humidity) {
            this.humidity = humidity;
        }
    }
}
