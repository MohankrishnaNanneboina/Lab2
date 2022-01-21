package com.info.client;

import com.info.service.Cake;
import com.info.service.store.CakeStore;
import com.info.service.store.NYCakeStore;
import com.info.singleton.DeliveryService;

public class OrderCake {
	
	public static void main(String[] args) {
		
		CakeStore nyCakeStore = new NYCakeStore();
		System.out.println("****Order blackForest Cake****");
        System.out.println();
		Cake blackForestCake = nyCakeStore.orderCake("BlackForest");
        System.out.println();
		System.out.println("****Order Chocalte cake****");
		System.out.println();
		Cake chocolate = nyCakeStore.orderCake("Chocolate");

		//Deliver the cake using the singleton pattern 
		System.out.println("****Deliver the cake****");
		DeliveryService deliveryService = DeliveryService.getInstance();
		deliveryService.deliverCake();
	}

}
