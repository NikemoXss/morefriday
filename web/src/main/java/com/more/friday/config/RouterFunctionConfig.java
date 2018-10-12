//package com.more.friday.config;
//
//import com.more.friday.domain.User;
//import com.more.friday.repository.UserRepository;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.reactive.function.server.*;
//import reactor.core.publisher.Flux;
//
//import java.util.Collection;
//
///**
// * 路由器函数 配置
// */
//@Configuration
//public class RouterFunctionConfig {
//
//    @Bean
//    public RouterFunction<ServerResponse> personFindAll(UserRepository userRepository){
//
//        return  RouterFunctions.route(RequestPredicates.GET("/person/find/all"),
//                request->{
//                    Collection<User> users=userRepository.findAll();
//                    Flux<User> userFlux=Flux.fromIterable(users);
//                    return  ServerResponse.ok().body(userFlux,User.class);
//                });
//    }
//}
