package com.duoyi.springbootssm.service;

import com.duoyi.springbootssm.dao.UserDao;
import com.duoyi.springbootssm.domain.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    Logger logger = LoggerFactory.getLogger(UserService.class);

    public List<User> searchAllUser() {
        List<User> userList = userDao.searchAllUser();
        return userList;
    }

    public User searchUserById(int id) {
        User user = userDao.searchUserById(id);
        return user;
    }

    public Map<String, Object> addUser(User user) {
        Map<String, Object> result = new HashMap<>();
        try {
            int id = userDao.addUser(user);
            logger.info("id : " + user.getId());
            if (id > 0) {
                result.put("success", true);
                result.put("message", "插入成功");

            } else {
                result.put("success", false);
                result.put("message", "插入失败");
            }
        } catch (Exception e) {
            e.printStackTrace();
            result.put("success", false);
            result.put("message", "插入失败");
        }
        return result;
    }

    public Map<String, Object> updateUser(User user) {
        Map<String, Object> result = new HashMap<>();
        try {
            if (userDao.updateUser(user) > 0) {
                result.put("success", true);
                result.put("message", "更新成功");
            } else {
                result.put("success", false);
                result.put("message", "更新失败");
            }
        } catch (Exception e) {
            e.printStackTrace();
            result.put("success", false);
            result.put("message", "更新失败");
        }
        return result;
    }

    public Map<String, Object> delteUser(User user) {
        Map<String, Object> result = new HashMap<>();
        try {
            if (userDao.deleteUser(user) > 0) {
                result.put("success", true);
                result.put("message", "删除成功");
            } else {
                result.put("success", false);
                result.put("message", "删除失败");
            }
        } catch (Exception e) {
            e.printStackTrace();
            result.put("success", false);
            result.put("message", "删除失败");
        }
        return result;
    }
}
