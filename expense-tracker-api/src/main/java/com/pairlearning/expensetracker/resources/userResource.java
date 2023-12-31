package com.pairlearning.expensetracker.resources;

import org.apache.logging.log4j.message.StringFormattedMessage;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/users")
public class userResource {
 @PostMapping("/register")
    public String registerUser(@RequestBody Map<String,Object> userMap) {
     String firstName=(String) userMap.get("firstName");
     String lastName=(String) userMap.get("lastName");
     String email=(String) userMap.get("email");
     String password=(String) userMap.get("password");
     return firstName + "," + lastName + "," +email + ","+password;

 }
}
