package com.more.friday.repository;

import com.more.friday.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserJpaRepository  extends JpaRepository<User,Long>{
    User findByName(String name);

    User findById(Integer id);

    @Query(value = "SELECT * from user u where u.name=:name", nativeQuery = true)
    User findUser(@Param("name") String name);
}
