package com.praxem.commons.utils;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class Amount extends Number implements Comparable<IAmount>, IAmount
{
	private static final long serialVersionUID = 8157002248669941957L;

	private BigDecimal bigDecimal;
	
	public Amount()
	{
		setBigDecimal(new BigDecimal(0, MathContext.DECIMAL128));
		normalize();
	}
	
	public Amount(BigDecimal amount)
	{
		setBigDecimal(new BigDecimal(amount.toString(), MathContext.DECIMAL128));
		normalize();
	}
	
	public Amount(String amount)
	{
		setBigDecimal(new BigDecimal(amount, MathContext.DECIMAL128));
		normalize();
	}
	
	private void normalize()
	{
		setBigDecimal(getBigDecimal().setScale(2, RoundingMode.HALF_UP));
	}
	
	public static final Amount ZERO = new Amount("0");
	
	@Override
   public double doubleValue()
   {
	   return getBigDecimal().doubleValue();
   }

	@Override
   public float floatValue()
   {
	   return getBigDecimal().floatValue();
   }

	@Override
   public int intValue()
   {
	   return getBigDecimal().intValue();
   }

	@Override
   public long longValue()
   {
	   return getBigDecimal().longValue();
   }

	@Override
   public byte byteValue()
   {
	   return getBigDecimal().byteValue();
   }

	@Override
   public short shortValue()
   {
	   return getBigDecimal().shortValue();
   }

	@Override
   public boolean equals(Object arg0)
   {
		IAmount a = (IAmount)arg0;
		return getBigDecimal().equals(a.getBigDecimal());
   }

	@Override
   public int hashCode()
   {
	   return getBigDecimal().hashCode();
   }

	@Override
   public String toString()
   {
	   return getBigDecimal().toString();
   }

	@Override
   public int compareTo(IAmount arg0)
   {
	   return getBigDecimal().compareTo(arg0.getBigDecimal());
   }
	
	public static void main(String[] args)
   {
	   Amount amount = null; 
	   
	   try
	   {
	      amount = new Amount("123sewer");
	   }
	   catch (NumberFormatException e)
	   {
	   	System.out.println("test");
	   }
   }

	@Override
   public Amount add(IAmount amount)
   {
	   return new Amount(getBigDecimal().add(amount.getBigDecimal()));
	   
   }

	@Override
   public Amount multiply(IAmount amount)
   {
		return new Amount(getBigDecimal().multiply(amount.getBigDecimal()));
	   
   }

	@Override
   public Amount substract(IAmount amount)
   {
		return new Amount(getBigDecimal().subtract(amount.getBigDecimal()));
	   
   }

	@Override
   public Amount divide(IAmount amount)
   {
		return new Amount(getBigDecimal().divide(amount.getBigDecimal()));
	   
   }

	@Override
   public IAmount add(Integer integer)
   {
	   return new Amount(getBigDecimal().add(new BigDecimal(integer)));
	   
   }

	@Override
   public IAmount add(Double double_)
   {
	   return new Amount(getBigDecimal().add(new BigDecimal(double_)));
	   
   }

	@Override
   public IAmount add(BigDecimal bigDecimal)
   {
	   return new Amount(getBigDecimal().add(bigDecimal));
	   
   }

	@Override
   public IAmount multiply(Integer integer)
   {
		return new Amount(getBigDecimal().multiply(new BigDecimal(integer)));
	   
   }

	@Override
   public IAmount multiply(Double double_)
   {
		return new Amount(getBigDecimal().multiply(new BigDecimal(double_)));
	   
   }

	@Override
   public IAmount multiply(BigDecimal bigDecimal)
   {
		return new Amount(getBigDecimal().multiply(bigDecimal));
	   
   }

	@Override
   public IAmount substract(Integer integer)
   {
		return new Amount(getBigDecimal().subtract(new BigDecimal(integer)));
	   
   }

	@Override
   public IAmount substract(Double double_)
   {
		return new Amount(getBigDecimal().subtract(new BigDecimal(double_)));
	   
   }

	@Override
   public IAmount substract(BigDecimal bigDecimal)
   {
		return new Amount(getBigDecimal().subtract(bigDecimal));
	   
   }

	@Override
   public IAmount divide(Integer integer)
   {
		return new Amount(getBigDecimal().divide(new BigDecimal(integer)));
	   
   }

	@Override
   public IAmount divide(Double double_)
   {
		return new Amount(getBigDecimal().divide(new BigDecimal(double_)));
	   
   }

	@Override
   public IAmount divide(BigDecimal bigDecimal)
   {
		return new Amount(getBigDecimal().divide(bigDecimal));
	   
   }

	public BigDecimal getBigDecimal()
   {
	   return bigDecimal;
   }

	public void setBigDecimal(BigDecimal bigDecimal)
   {
	   this.bigDecimal = bigDecimal;
   }

	@Override
   public boolean equalsToZero()
   {
	   return this.bigDecimal.equals(BigDecimal.ZERO);
   }
	
	
}
