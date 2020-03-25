package logic;

import java.util.HashMap;

public class ForecastWeather extends QueryParameters
{
    public String forecast_days;
    public String hourly;
    public String interval;
    public ForecastWeather(String query) {
        super(query);
    }

    public ForecastWeather(String query, String units, String language, String callback, String forecast_days, String hourly, String interval) {
        super(query, units, language, callback);
        queryParameters.put("forecast_days",this.forecast_days);
        queryParameters.put("hourly",this.hourly);
        queryParameters.put("interval",this.interval);
    }

    public HashMap<String, String> getQueryParameters() {
        return queryParameters;
    }
}
