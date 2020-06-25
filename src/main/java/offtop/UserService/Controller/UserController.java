package offtop.UserService.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import offtop.UserService.Models.User;
import offtop.UserService.Services.ProducerService;
import offtop.UserService.Services.UserService;

@RestController
public class UserController{
    
    @Autowired
    UserService userService;

    @Autowired
    ProducerService producerService;
    
    @GetMapping(value="/test")
    public String testService(){
        return "UserService works!";
    }

    @GetMapping(value = "/user/{email}")
    public User getUser(@PathVariable("email") String email) {
        User user = userService.getUserByEmail(email);
        return user;
    }

    @PostMapping(value ="/setUser")
    public User setUser (@RequestBody User user){
        User newUser = userService.insertUser(user);
        return newUser;
        
    }
}