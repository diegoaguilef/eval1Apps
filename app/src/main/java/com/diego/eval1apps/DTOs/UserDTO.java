package com.diego.eval1apps.DTOs;

import com.diego.eval1apps.models.User;

import java.util.ArrayList;

public class UserDTO {
    private static ArrayList<User> users = new ArrayList<>();

    public static void initUsers(){
        users.add(new User("erickxkunz", "erick123"));
        users.add(new User("diego", "diego123"));
        users.add(new User("admin", "admin123"));
        users.add(new User("ropazo", "opazo123"));
    }

    public static boolean isValid(User user){
        boolean valid = false;
        for(User u : users){
            if (u.getUsername().equals(user.getUsername()) &&
                    u.getPassword().equals(user.getPassword()))
            {
                return true;
            }
        };
        return valid;
    }
}
