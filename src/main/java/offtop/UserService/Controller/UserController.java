package offtop.UserService.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import offtop.UserService.Models.User;
import offtop.UserService.Service.UserService;

@RestController
public class UserController{
    
    @Autowired
    UserService userService;
    
    @GetMapping(value = "/user/{email}")
    public User getUser(@PathVariable("email") String email) {
        User user = userService.getUserService(email);
        return user;
        
    }
}