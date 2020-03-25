package logic;

public class HistoricalWeather extends QueryParameters{
    public String historical_date;
    public String hourly;
    public String interval;

    public HistoricalWeather(String query, String historical_date) {
        super(query);
        queryParameters.put("historical_date",historical_date);
    }

    public HistoricalWeather(String query, String units, String language, String callback, String historical_date, String hourly, String interval) {
        super(query, units, language, callback);
        queryParameters.put("historical_date",historical_date);
        queryParameters.put("hourly",hourly);
        queryParameters.put("interval",interval);
    }
}
