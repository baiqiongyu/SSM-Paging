package dao;

import entity.User;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface IUserDao {
    public List<User> queryAll();
}
