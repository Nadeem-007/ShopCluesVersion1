package com.ShopCluesV1.GenericUtility;

import java.time.LocalDateTime;

public class TimeStamp {

	public String timeStamp() {
		
		String value=LocalDateTime.now().toString().replace('-', ':');
		return value;
		
	}
}
