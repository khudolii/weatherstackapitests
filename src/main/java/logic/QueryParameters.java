package logic;

import java.util.HashMap;

public class QueryParameters {
    public static final String ACCESS_KEY = "8cdf44a5f616296b13d2450da3e81ec2";
    public String query;
    public String units;
    public String language;
    public String callback;
    static HashMap<String, String> queryParameters = new HashMap<String, String>();

    public  HashMap<String, String> getQueryParameters() {
        return queryParameters;
    }

    public QueryParameters(String query) {
        //this.query = query;
        queryParameters.put("access_key", ACCESS_KEY);
        queryParameters.put("query", query);
    }

    public QueryParameters(String query, String units, String language, String callback) {
        queryParameters.put("access_key", ACCESS_KEY);
        queryParameters.put("query", query);
        queryParameters.put("units", units);
        queryParameters.put("language", language);
        queryParameters.put("callback", callback);
    }
}
