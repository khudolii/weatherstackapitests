package logic;

public class TimeSeriesWeather extends HistoricalWeather {
    public String historical_date_start;
public String historical_date_end;

    public TimeSeriesWeather(String query, String historical_date_start, String historical_date_end) {
        super(query, historical_date_start);
        queryParameters.put("historical_date_end",historical_date_end);
    }

    public TimeSeriesWeather(String query, String units, String language, String callback, String historical_date_start, String historical_date_end, String hourly, String interval) {
        super(query, units, language, callback, historical_date_start, hourly, interval);
        queryParameters.put("historical_date_end",historical_date_end);
    }
}
