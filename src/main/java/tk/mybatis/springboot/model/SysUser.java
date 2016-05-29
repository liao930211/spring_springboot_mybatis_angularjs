package tk.mybatis.springboot.model;

import tk.mybatis.springboot.common.BaseModel;

/**
 * Description:
 *
 * @author: liaohao
 * @Date: 2016/4/19 22:46
 */
public class SysUser extends BaseModel  {


    private String userName;

    private String userPassword;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }
}
