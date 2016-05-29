package tk.mybatis.springboot.service;

import org.mockito.InjectMocks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.springboot.mapper.SysUserMapper;
import tk.mybatis.springboot.model.SysUser;

/**
 * Description:
 *
 * @author: liaohao
 * @Date: 2016/4/19 22:53
 */
@Transactional
@Service("sysUserService")
public class SysUserServiceImpl implements SysUserService {

    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public SysUser selectByPrimaryKey(Long id) {
       return sysUserMapper.selectByPrimaryKey(id);
    }

    @Override
    public SysUser selectByUserNameAndPassword(SysUser sysUser) {
       return sysUserMapper.selectByUserNameAndPassword(sysUser);
    }
}
