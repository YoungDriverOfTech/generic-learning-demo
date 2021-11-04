package com.interview.demo.generic;

// 实现泛型接口，指定类型
public class ImplementGenericInterfaceWithAssignedType implements GenericInterfaceDemo<String>{
    public String method() {
        return "Hello";
    }
}
