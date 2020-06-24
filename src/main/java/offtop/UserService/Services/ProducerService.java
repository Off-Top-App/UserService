package offtop.UserService.Services;

import org.slf4j.LoggerFactory;
import org.apache.kafka.clients.producer.Producer;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import offtop.UserService.Models.User;

@Service
public class ProducerService{

   private static final Logger logger = LoggerFactory.getLogger(ProducerService.class);
   private static final String TOPIC = "userDataResponse";

   @Autowired
   private KafkaTemplate<String, User> kafkaTemplate;


   public void sendUserData(User userData){
      System.out.println("BBBBAAARS");
      kafkaTemplate.send(TOPIC, userData);
      logger.info(String.format("Producing userDataResponse Event: -> %s", userData));

   }

}