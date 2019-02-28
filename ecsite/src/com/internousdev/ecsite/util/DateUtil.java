package com.internousdev.ecsite.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

	public String getDate(){
		Date da=new Date();
		SimpleDateFormat sida =new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		return sida.format(da);
	}
}

