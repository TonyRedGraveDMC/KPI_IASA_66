package ua.myhospital.servlet;

import ua.myhospital.model.User;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

public class Test {

    public static void main(String[] args) {
        List<User> users1 = new CopyOnWriteArrayList<>();
        users1.add(new User("Java", 10));
        users1.add(new User("Vision", 20));
        users1.add(new User("Sharp", 7));

        Map<String, List<User>> reqMap = new HashMap<>();
        reqMap.put("users", users1);

        List<User> items = reqMap.get("users");
        for (User user : items) {
            System.out.println(user.getAge());
        }
    }
}
