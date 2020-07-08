package offtop.UserService.Services;

import java.util.Map;

import com.google.gson.Gson;

import org.springframework.stereotype.Service;

@Service
public class MessageParserService{

    public Map<String, Double> parseMessage(String message){
        Map<String, Double> value = new Gson().fromJson(message, Map.class);
        return value;
    }
}
