package offtop.UserService.Listeners;

import java.util.List;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import offtop.UserService.Models.User;

@Service
public class UserDataProducer{

   private static final Logger logger = LoggerFactory.getLogger(UserDataProducer.class);
   private static final String TOPIC = "AllUserDataResponse";

   @Autowired
   private KafkaTemplate<String, List<User>> kafkaUserTemplate;
   public void sendAllUserData(List<User> userData){
      logger.info("Producing userDataResponse Event");
      kafkaUserTemplate.send(TOPIC, userData);
   }
}
