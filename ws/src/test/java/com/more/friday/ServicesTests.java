package com.more.friday;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ServicesTests {
    @Test
   public  void  testSystem(){
        System.out.println(3 | 9);
        System.out.println(3 & 9);
   }
}

