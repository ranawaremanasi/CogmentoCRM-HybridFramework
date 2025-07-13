package com.cogmento.ui.utility;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.cogmento.ui.iHelper.IDateAndTime;

public class DateAndTimeImpl implements IDateAndTime {

	@Override
	public String getDateAndTime(String dateFormat) {

		return new SimpleDateFormat(dateFormat).format(new Date());
	}

}
