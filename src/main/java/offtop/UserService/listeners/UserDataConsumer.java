package offtop.UserService.Listeners;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import offtop.UserService.Models.User;
import offtop.UserService.Services.UserService;

@Service
public class UserDataConsumer {
    private final Logger logger = LoggerFactory.getLogger(UserDataConsumer.class);

    @Autowired
    UserService userService;

    @Autowired
    UserDataProducer userDataProducer;

    @KafkaListener(topics = "requestAllUserData", groupId = "group_Id")
    public void handleAllUsersDataRequest(String message) {
      logger.info("Consuming requestAllUserData Event");
      List<User> allUsers = userService.getAllUsers();
      userDataProducer.sendAllUserData(allUsers);
    }
}
