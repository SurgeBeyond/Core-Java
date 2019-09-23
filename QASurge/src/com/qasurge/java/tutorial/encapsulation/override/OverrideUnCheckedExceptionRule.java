package com.qasurge.java.tutorial.encapsulation.override;

/**
 * The overriding method CAN throw any unchecked (runtime) exception, regardless
 * of whether the overridden method declares the exception.
 */

/**
 * Example of UnChecked Exceptions or Runtime exceptions.
 * 
 * ArithmeticException. ArrayStoreException. ClassCastException.
 * EnumConstantNotPresentException. IllegalArgumentException.
 * IllegalThreadStateException. NumberFormatException.
 * IllegalMonitorStateException. IllegalStateException.
 * IndexOutOfBoundsException. ArrayIndexOutOfBoundsException.
 * StringIndexOutOfBoundsException.
 *
 */

class A {
	public void testA() throws ArithmeticException {

	}
}

class B {
	public void testA() throws ArithmeticException, IndexOutOfBoundsException {

	}
}

public class OverrideUnCheckedExceptionRule {

}
