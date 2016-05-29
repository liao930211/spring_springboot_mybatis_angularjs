package tk.mybatis.springboot.mapper;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;
import tk.mybatis.springboot.model.SysUser;

/**
 * Description:
 *
 * @author: liaohao
 * @Date: 2016/4/19 22:45
 */
public interface SysUserMapper {

    SysUser selectByPrimaryKey(Long id);

    @Select(" select s.id AS id, s.user_name as userName, s.user_password as userPassword  FROM   sys_user  s where ID = #{id}")
    SysUser selectByUserNameAndPassword(SysUser sysUser);


}
