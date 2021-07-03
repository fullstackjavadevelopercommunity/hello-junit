package com.fullstackjavadevelopercommunity.traning.junit;

/**
 * @author Full Stack Java developer Community
 *
 * Jul 3, 2020
 */
public class GreetingImpl implements Greeting {

	/* (non-Javadoc)
	 * @see com.fullstackjavadevelopercommunity.traning.junit.Greeting#greet(java.lang.String)
	 */

	@Override
	public String greet(String name) {
		
		if(name==null || name.length()==0) {
			throw new IllegalArgumentException();
		}
		return "Hello "+name;
	}

}
