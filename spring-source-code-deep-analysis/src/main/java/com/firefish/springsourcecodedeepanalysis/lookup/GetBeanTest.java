package com.firefish.springsourcecodedeepanalysis.lookup;

public abstract class GetBeanTest {
	public void showMe() {
		getBean().showMe();
	}

	public abstract User getBean();
}
