package tk.mybatis.springboot.model;

import tk.mybatis.springboot.common.BaseModel;

import java.util.List;

/**
 * Description:
 *
 * @author: liaohao
 * @Date: 2016/4/19 22:46
 */
public class SysUser extends BaseModel  {

    private String userName;

    private String userPassword;

    private List<UserInfo> userInfos;

    private List<Long> ids;

    public List<Long> getIds() {
        return ids;
    }

    public void setIds(List<Long> ids) {
        this.ids = ids;
    }

    public List<UserInfo> getUserInfos() {
        return userInfos;
    }

    public void setUserInfos(List<UserInfo> userInfos) {
        this.userInfos = userInfos;
    }

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
