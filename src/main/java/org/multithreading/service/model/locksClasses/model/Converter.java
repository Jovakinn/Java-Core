package org.multithreading.service.model.locksClasses.model;

@FunctionalInterface
public interface Converter<F, T>{
    T convert(F from);
}
