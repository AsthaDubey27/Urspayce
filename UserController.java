package com.urspayce.Controller;
import com.urspayce.Service.Autowired;
import com.urspayce.Service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value="/user")
    public String userDashboard(){
        return "user";
    }
    
}




