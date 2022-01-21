package com.info.service.store;

import com.info.service.Cake;

public abstract class CakeStore {

	public Cake orderCake(String typeOfCake) {
		
		Cake cake = createCake(typeOfCake);
		cake.prepare();
		cake.bake();
		cake.cut();
		cake.box();
		return cake;
		
	}

	protected abstract Cake createCake(String typeOfCake);
	
	
}
