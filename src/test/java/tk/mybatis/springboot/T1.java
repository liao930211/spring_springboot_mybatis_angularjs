package tk.mybatis.springboot;

/**
 * Description:
 *
 * @author: liaohao
 * @Date: 2016/5/17 23:02
 */
public class T1 {

    public  Integer getInt(String s){
        if(s.equals("20")){
            return  9999;
        }
        return  10;
    }
}
