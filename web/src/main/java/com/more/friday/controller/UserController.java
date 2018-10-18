package com.more.friday.controller;

import com.more.friday.domain.User;
import com.more.friday.repository.UserJpaRepository;
import com.more.friday.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;


@RestController
public class UserController {

    @Autowired
    private UserJpaRepository jpauserRepository;

    private  final UserRepository userRepository;

    @Autowired
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostMapping("/person/save")
    public User save(@RequestParam String name){
        User user=new User();
        user.setName(name);
        if(userRepository.save(user)){
            System.out.println("用户对象：%是"+user+"");
        }
        return  user;
    }

    @PostMapping("/person/find/all")
    public Collection<User> findAll(){

        return  userRepository.findAll();
    }


    @PostMapping(value = "/person/findbyid")
    public String test(Integer id){
        User us=jpauserRepository.findById(id);
        if(us!=null){
            System.out.print(us.toString());
            return us.getName()+"--------";
        }else {
            return "未查询到数据";
        }

    }

    @RequestMapping(value = "/person/findbyids")
    public String test1(){

            return "333333";

    }
}
