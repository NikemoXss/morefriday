package com.more.friday.repository;

import com.more.friday.domain.User;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;

@Repository
public class UserRepository {
    /**
     * 采用内存型的存储方式——>map
     */
    private  final ConcurrentMap<Integer,User> repository=new ConcurrentHashMap<>();

    private final static AtomicInteger idGenerator=new AtomicInteger();

    public  Boolean save(User user){
        Boolean success=false;

        Integer id=idGenerator.incrementAndGet();
        user.setId(id);
        return repository.put(id,user)==null;
    }

    public  Collection<User> findAll(){
        System.out.println("123");
       return repository.values();

    }

}
