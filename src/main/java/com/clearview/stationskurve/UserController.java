package com.clearview.stationskurve;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path="/users")
public class UserController {
    @Autowired
    private UserRepository userRepository;


    // @Responsebody: returned String param is the response, not a view name
    @PostMapping(path="/addUser")
    public @ResponseBody String addNewUser(@RequestParam String name){
        User u = new User();
        u.setName(name);
        userRepository.save(u);
        return "User was successfully saved";
    }


    @GetMapping(path="/allUsers")
    public @ResponseBody Iterable<User> getAllUsers(){
        return userRepository.findAll();
    }

}
