package com.google.gson;

import com.praxem.commons.utils.SaveMethod;

public interface JsonGlobalContext
{
   public JsonGlobalContext getContext();
   
   public SaveMethod getSaveMethod();
}
