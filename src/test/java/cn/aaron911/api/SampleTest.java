package cn.aaron911.api;

import cn.aaron911.api.dao.UserDao;
import cn.aaron911.api.entity.UserEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ApiApplication.class)
public class SampleTest {

    @Autowired
    private UserDao userMapper;

    @Test
    public void testSelect() {
        System.out.println(("----- selectAll method test ------"));
        List<UserEntity> userList = userMapper.selectList(null);
       
        userList.forEach(System.out::println);
    }

}