package com.sample.ex00.sample;

import jdk.swing.interop.SwingInterOpUtils;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.sql.rowset.serial.SQLOutputImpl;

@ExtendWith(SpringExtension.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class DITests {

    @Autowired
    Restaurant restaurant;

    @Test
    public void testExist() {  // 여기서 Run을 눌러서 test
        System.out.println(restaurant);

    }
}
