package com.qasurge.java.tutorial.encapsulation.override;

import java.io.FileNotFoundException;

/**
 * 
 * The overriding method can throw narrower or new sub class of exception
 *
 */
class B1{
	public void testB1() throws Exception{}
}

class B2 extends B1{
	public void testB1() throws FileNotFoundException{}
}

/**
 * 
 * The overriding method can throw fewer exceptions.
 *
 */
class C1{
	public void testC1() throws FileNotFoundException, ClassCastException{}
}

class C2 extends C1{
	public void testC1() throws ClassCastException{}
}

public class OverrideCheckedExceptionRules2 {

}
