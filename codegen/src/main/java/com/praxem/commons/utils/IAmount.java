package com.praxem.commons.utils;

import java.math.BigDecimal;

public interface IAmount extends Comparable<IAmount>
{
   public IAmount add(IAmount amount);
   
   public IAmount add(Integer integer);
   
   public IAmount add(Double double_);
   
   public IAmount add(BigDecimal bigDecimal);
   
   
   public IAmount multiply(IAmount amount);
   
   public IAmount multiply(Integer integer);
   
   public IAmount multiply(Double double_);
   
   public IAmount multiply(BigDecimal bigDecimal);
   
   
   public IAmount substract(IAmount amount);
   
   public IAmount substract(Integer integer);
   
   public IAmount substract(Double double_);
   
   public IAmount substract(BigDecimal bigDecimal);
   
   
   public IAmount divide(IAmount amount);
   
   public IAmount divide(Integer integer);
   
   public IAmount divide(Double double_);
   
   public IAmount divide(BigDecimal bigDecimal);
   
   public BigDecimal getBigDecimal();
   
   public boolean equalsToZero();
}
