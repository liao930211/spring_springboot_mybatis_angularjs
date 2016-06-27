package tk.mybatis.springboot.mapper;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;
import tk.mybatis.springboot.model.SysUser;

import java.util.List;

/**
 * Description:
 *
 * @author: liaohao
 * @Date: 2016/4/19 22:45
 */
public interface SysUserMapper {

    SysUser selectByPrimaryKey(Long id);


    SysUser selectByUserNameAndPassword(SysUser sysUser);

    @Select("SELECT s1.ID as id,s1.USER_NAME as userName ,s1.USER_PASSWORD as userPassWord FROM sys_user s1")
    List<SysUser> selectAll( );

}
