package com.cogmento.ui.utility;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import com.cogmento.ui.base.Base;
import com.cogmento.ui.iHelper.IWindowHandle;

public class WindowHandleImpl extends Base implements IWindowHandle {

	@Override
	public void switchToWindow(Set<String> sets, int windowIndex) {

		ArrayList<String> allWindowArrayList = new ArrayList<String>();
		Iterator<String> iterator = sets.iterator();

		while (iterator.hasNext()) {
			allWindowArrayList.add(iterator.next());
		}

		getDriver().switchTo().window(allWindowArrayList.get(windowIndex));
	}

}
