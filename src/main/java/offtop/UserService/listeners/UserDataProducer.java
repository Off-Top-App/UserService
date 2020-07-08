package offtop.UserService.Services;

import java.util.*;
import org.slf4j.LoggerFactory;
import org.apache.kafka.clients.producer.Producer;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import offtop.UserService.Models.User;

@Service
public class UserDataProducer{

   private static final Logger logger = LoggerFactory.getLogger(ProducerService.class);
   private static final String TOPIC = "AllUserDataResponse";

   @Autowired
   private KafkaTemplate<String, List<User>> kafkaUserTemplate;
   public void sendAllUserData(List<User> userData){
      kafkaUserTemplate.send(TOPIC, userData);
      logger.info(String.format("Producing userDataResponse Event: -> %s", userData));
   }
}