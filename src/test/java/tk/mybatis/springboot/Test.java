package tk.mybatis.springboot;

import com.sun.org.apache.xerces.internal.xs.StringList;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Description:
 *
 * @author: liaohao
 * @Date: 2016/5/17 20:36
 */
public class Test {

    public static void main(String[] args){

        List<String> stringList = new ArrayList<String>();
        stringList.add("20");
        stringList.add("10");
        stringList.add("2");
        stringList.add("1");
        T1 t1 = new T1();
    /*    Function<String, Integer> toInteger = t1::getInt;
        List<Integer> integes =  stringList.stream().map(toInteger).filter( f -> Integer.parseInt(f+"")>10).flatMap()  .collect(Collectors.toList());
        System.out.println();*/

//        System.out.println(stringList);
//               stringList.stream().map(something::sta);
//        System.out.println(integerList);
//        Predicate<Boolean> predicate = Objects::isNull;

//        predicate.
//        System.out.println(stringList);

    }

    private static Integer getCount(String s) {
        return Integer.valueOf(s);
    }


    public static int getCount(){
        return 10;
    }
}
