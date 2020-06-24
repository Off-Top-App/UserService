package offtop.UserService.Service;

import java.util.Map;

import com.google.gson.Gson;

import org.springframework.stereotype.Service;

@Service
public class MessageParserService{

    public Map parseMessage(String message){
        message = message.substring(1, message.length() - 1);
        String _message = message.replaceAll("\\\\\"", "\"");
        System.out.println("_message: " + _message);
        Map value = new Gson().fromJson(_message, Map.class);
        return value;
    }

}