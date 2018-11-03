import dao.IUserDao;
import entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:ApplicationContext.xml"})
public class userTest {
    @Autowired
    private IUserDao userDao;
    @Test
    public void String (){
        List<User> list=userDao.queryAll();
        for(User user:list){
            System.out.println(user.toString());
        }
    }
}
