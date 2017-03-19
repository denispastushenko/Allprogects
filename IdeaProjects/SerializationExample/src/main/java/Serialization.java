import com.fasterxml.jackson.databind.ObjectMapper;
import example.Example;
import org.apache.http.client.fluent.Request;

import java.io.IOException;

public class Serialization {
    public static void main(String[] args) throws IOException {

        String response = Request.Get("http://www.canadiantire.ca/ESB/PriceAvailability?SKU=0500285&Store=0144&Banner=CTR&isKiosk=FALSE&Language=E")
                .connectTimeout(3000).execute().returnContent().asString();
        ObjectMapper objectMapper = new ObjectMapper();
        Example[] example = objectMapper.readValue(response, Example[].class);
        System.out.println(example[0].getPrice());
        if (example[0].getPrice() != 0){
             example = objectMapper.readValue(response, Example[].class);
            example[0].setPrice(100.8);
            System.out.println(example[0].getPrice());
        }
    }

}
