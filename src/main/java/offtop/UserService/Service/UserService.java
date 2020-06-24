package offtop.UserService.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import offtop.UserService.Models.User;
import offtop.UserService.Repositories.UserRepository;

@Service
public class UserService{

    @Autowired
    public UserRepository userRepository;

    public User getUserByEmail(String email){
        return userRepository.findByEmail(email).get(0);
    }
    
    public User getUserById(int id){
        return userRepository.findById(id);
    }

    public User insertUser(User user){
        return userRepository.save(user);   
    }
}
