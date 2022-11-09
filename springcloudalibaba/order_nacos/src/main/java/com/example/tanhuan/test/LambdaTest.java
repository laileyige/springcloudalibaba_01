package com.example.tanhuan.test;

import com.example.tanhuan.pojo.User;
import org.apache.commons.lang.ObjectUtils;
import org.apache.commons.lang.StringUtils;

import java.io.File;
import java.util.*;
import java.util.stream.Collectors;

public class LambdaTest {
    public static void main(String[] args) {
        //相对路径，从工程
        File f = new File("order_nacos/src/main/java/com/example/tanhuan/file.txt");
        System.out.println(f.length());
        //相对路径
        File f1 = new File("");
        System.out.println(f1.getPath());

        System.out.println(f(10));
        //lambda 线程
        /*new Thread( () -> System.out.println(Thread.currentThread().getName()) ).start();

        *//*List list=new ArrayList();
        list.add("asd");
        list.add("11");
        list.add("a22sd");
        list.forEach( System.out::println );*//*

        List<Map<String,Object>> list1=new ArrayList();
        Map map=new HashMap();
        map.put("name","lihua");
        map.put("age",5);
        list1.add(map);
        Map map1=new HashMap();
        map1.put("name","liaoyong");
        map1.put("age",3);
        list1.add(map1);
        Map map2=new HashMap();
        map2.put("name","tanhuan");
        map2.put("age",1);
        list1.add(map2);
        Map map3=new HashMap();
        map3.put("name","tt");
        map3.put("age",null);
        list1.add(map3);

        List<Map<String, Object>> collect1 = list1.stream().filter(m ->  m.get("age")!=null ).collect(Collectors.toList());
        List<Map<String, Object>> collect2 = list1.stream().filter(m ->  m.get("age") == null).collect(Collectors.toList());
        Collections.sort(collect1,(m1,m2) -> (Integer) m1.get("age")-(Integer)m2.get("age"));
        collect1.addAll(collect2);
        collect1.forEach(System.out::println);

        System.out.println(StringUtils.isNotBlank(null));
*/

    }

    static int f(int x){
        if(x==1){
            return 1;
        }else {
            return f(x-1)+1;
        }
    }
}
