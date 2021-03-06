package tk.mybatis.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import tk.mybatis.springboot.model.SysUser;
import tk.mybatis.springboot.service.SysUserService;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

/**
 * Description:
 * @author: liaohao
 * @Date: 2016/4/19 22:55
 */
@RestController
@RequestMapping("/sysuser")
public class SysUserController {

    @Autowired
    SysUserService sysUserService;

    @RequestMapping("/findId/{id}")
    @ResponseBody
    public String getById(@PathVariable Long id){
        SysUser sysUserNew = new SysUser();
        sysUserNew.setId(id);
//        List<Long> longList = new ArrayList<Long>();
//        longList.add(id);
//        sysUserNew.setIds(longList);
        sysUserNew.setUserName("t1");
        SysUser sysUser = sysUserService.selectByUserNameAndPassword(sysUserNew);
        return sysUser.getUserPassword();
    }

    @RequestMapping (value =  "/test")
    public SysUser test(HttpServletRequest request){
        SysUser sysUser = new SysUser();
        sysUser.setUserName("2");
        sysUser.setUserPassword("3");
        SysUser sysUserQuery = sysUserService.selectByUserNameAndPassword(sysUser);
        return sysUserQuery;
    }

    @RequestMapping (value =  "/findAll")
    public SysUser findAll(HttpServletRequest request){

        List<SysUser> sysUserQuery = sysUserService.selectAll();
        System.out.println(sysUserQuery);
        return null;
    }
}
