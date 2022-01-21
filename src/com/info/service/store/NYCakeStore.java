package com.info.service.store;

import com.info.service.BlackForestCake;
import com.info.service.Cake;
import com.info.service.ChocolateCake;

public class NYCakeStore  extends CakeStore{

	@Override
	protected Cake createCake(String typeOfCake) {
		// TODO Auto-generated method stub
		if(typeOfCake.equals("Chocolate")) {
			return new ChocolateCake();
		}
		else if (typeOfCake.equals("BlackForest")) {
			return new BlackForestCake();
		}
		else {
			return null;
		}
		
	}

}
