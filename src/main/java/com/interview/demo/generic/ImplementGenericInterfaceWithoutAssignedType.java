package com.interview.demo.generic;

// 实现泛型接口，不指定类型
public class ImplementGenericInterfaceWithoutAssignedType<T> implements GenericInterfaceDemo<T>{
    public T method() {
        return null;
    }
}
