package com.google.gson;

public interface InstanceInitializer<T>
{
   public void initialize(JsonGlobalContext globalContext, T t);
}
