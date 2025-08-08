import java.util.Map;

public record TasasConversion (String base_code,
                         String time_last_update_utc,
                         Map<String, Double> conversion_rates){

}
