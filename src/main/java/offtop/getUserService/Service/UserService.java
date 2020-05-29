package offtop.getUserService.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import offtop.getUserService.Models.User;
import offtop.getUserService.Repositories.UserRepository;

@Service
public class UserService{

    @Autowired
    public UserRepository userRepository;

    public User getUserService(String email){
        return userRepository.findByEmail(email).get(0);
    }
}