package logic;

import java.util.HashMap;

public class StatusCode {
    static HashMap <Integer, String> statusCode = new HashMap<Integer, String>();
    public StatusCode() {
        statusCode.put(404,"404_not_found");
        statusCode.put(101,"invalid_access_key");
        statusCode.put(102,"inactive_user");
        statusCode.put(103,"invalid_api_function");
        statusCode.put(104,"usage_limit_reached");
        statusCode.put(105,"function_access_restricted");
        statusCode.put(601,"missing_query");
        statusCode.put(602,"no_results");
        statusCode.put(603,"historical_queries_not_supported_on_plan");
        statusCode.put(604,"bulk_queries_not_supported_on_plan");
        statusCode.put(605,"invalid_language");
        statusCode.put(606,"invalid_unit");
        statusCode.put(607,"invalid_interval");
        statusCode.put(608,"invalid_forecast_days");
        statusCode.put(609,"forecast_days_not_supported_on_plan");
        statusCode.put(611,"invalid_historical_date");
        statusCode.put(612,"invalid_historical_time_frame");
        statusCode.put(613,"historical_time_frame_too_long");
        statusCode.put(614,"missing_historical_date");
        statusCode.put(615,"request_failed");
    }

public static String returnCode (int code){
    return statusCode.get(code);
}

}
