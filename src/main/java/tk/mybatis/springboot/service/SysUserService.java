package tk.mybatis.springboot.service;

import org.apache.ibatis.annotations.Select;
import tk.mybatis.springboot.model.SysUser;

/**
 * Description:
 *
 * @author: liaohao
 * @Date: 2016/4/19 22:52
 */
public interface SysUserService {

    SysUser selectByPrimaryKey(Long id);

    SysUser selectByUserNameAndPassword(SysUser sysUser);

}
