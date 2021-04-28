package com.water.controller;

import com.water.entity.User;
import com.water.service.UserService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * (User)表控制层
 *
 * @author makejava
 * @since 2021-02-18 23:13:33
 */
@RestController
@RequestMapping("user")
public class UserController {
    /**
     * 服务对象
     */
    @Resource
    private UserService userService;

    /**
     * 登录
     * @param u
     * @return token
     */
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public Map<String, Object> login(@RequestBody User u) throws Exception {
        Map<String, Object> result = new HashMap<>();
        if(u!=null){
           String tell =u.getTell();
           String pass =u.getPass();
            System.out.println(tell+"321"+pass+"12345");
            Map<String, Object> userToken = new HashMap<>();
            Map<String, Object> msg = new HashMap<>();
            if (userService.isUserExist(tell, pass)) {
                userToken.put("token", tell);
                result.put("code", 20000);
                result.put("data", userToken);
            } else {
                msg.put("msg", "用户或密码错误");
                result.put("code", 50000);
                result.put("data", msg);
            }
        }
            return result;

    }
    /**
     * 通过token获取用户信息
     *  @param token
     *  @return map
     */
    @RequestMapping(value = "/info",method = RequestMethod.GET)
    public
    Map<String, Object> info(String token) throws Exception {
        Map<String, Object> result = new HashMap<>();
        result.put("code", 20000);
       // List<User> l= new ArrayList<>();
        if(token!=null){
            System.out.println(token);
            User u=new User();
            u.setTell(token);
            List<User> u2=userService.queryAll(u);
            if(u2.size()==0){

                result.put("data",0);
            }else{
                result.put("data",u2.get(0));
            }
        }

          return result;

    }
    /**
     * 退出登录
     *
     *  @return map
     */
    @RequestMapping(value = "/logout",method = RequestMethod.GET)
    public Map<String, Object> logout() throws Exception {
        Map<String, Object> result = new HashMap<>();
        // List<User> l= new ArrayList<>();
            result.put("code", 20000);
            result.put("data","success");
        return result;

    }
    /**
     * 注册
     *
     *  @return map
     */
    @RequestMapping(value = "/register",method = RequestMethod.POST)
    public Map<String, Object> register(@RequestBody User o) throws Exception {
        Map<String, Object> result = new HashMap<>();
        System.out.println(o);

        userService.insert(o);
        result.put("code", 20000);
        result.put("data","success");
        return result;

    }


    @RequestMapping(value = "/updateInfo",method = RequestMethod.POST)
    public Map<String, Object> updateInfo(@RequestBody User o)  {
        Map<String, Object> result = new HashMap<>();
        System.out.println(o);
        userService.update(o);
        result.put("code", 20000);
        result.put("data","success");
        return result;

    }

}
