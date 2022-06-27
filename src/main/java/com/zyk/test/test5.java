package com.zyk.test;

import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 功能描述:
 *
 * @author zyk
 * @date 2021/9/6 20:14
 * @version: 1.0
 */
public class test5 {
    public Set<Integer> test(List<String> list, Map<Integer,Object> map){
        return null;
    }

    public static void main(String[] args) throws NoSuchMethodException {
        Method method = test5.class.getMethod("test",List.class, Map.class);
        Type[] types = method.getGenericParameterTypes();
        for (Type type : types) {
            System.out.println("测试直接输出参数类型："+type.getTypeName());
            if (type instanceof ParameterizedType){
                ParameterizedType parameterizedType = (ParameterizedType) type;
                System.out.println("原始类型" + parameterizedType.getRawType());
                Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                for (int i = 0; i < actualTypeArguments.length; i++) {
                    System.out.printf("泛型参数[%d]-%s\n",i,actualTypeArguments[i]);
                    
                }
            }
        }

        Type genericReturnType = method.getGenericReturnType();

        System.out.println("测试返回类型输出:"+genericReturnType.getTypeName());
        System.out.println(test5.class.getClassLoader());
        System.out.println(test5.class.getMethods());
    }
}
