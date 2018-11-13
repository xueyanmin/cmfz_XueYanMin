package com.test;

import com.App;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = App.class)//这里的Application是springboot的启动类名
@WebAppConfiguration

public class BaseTest {



}
