package offtop.UserService.Service;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import offtop.UserService.Models.User;

@Service
public class ConsumerService {
    private final Logger logger = LoggerFactory.getLogger(ConsumerService.class);

    @Autowired
    UserService userService;
    @Autowired
    ProducerService producerService;
    @Autowired
    MessageParserService messageParserService;

    @KafkaListener(topics = "requestUserData", groupId = "group_Id")
    public void handleUserDataRequest(String message) {
        Map consumedData = messageParserService.parseMessage(message);
        int userId = (int)consumedData.get("user_id");
        User user = userService.getUserById(userId);
        producerService.sendUserData(user);
    }

}
