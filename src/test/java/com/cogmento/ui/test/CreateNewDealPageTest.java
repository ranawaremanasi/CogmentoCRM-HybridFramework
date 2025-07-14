package com.cogmento.ui.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.cogmento.ui.base.Base;
import com.cogmento.ui.pages.CreateNewDealPage;
import com.cogmento.ui.pages.DealsPage;

public class CreateNewDealPageTest extends Base {

	@Test(priority = 1)
	public void validateCreateNewDealFunctionality() {

		CreateNewDealPage newDealPage = new CreateNewDealPage();
		newDealPage.createNewDealFunctionality("Today's Deal");

		DealsPage dealsPage = new DealsPage();
		dealsPage.navigateToDeal();

		newDealPage = new CreateNewDealPage(); // Re-initialize
		newDealPage.createNewDealFunctionality("Today's Deal", "Deals Description");

		dealsPage.navigateToDeal();

		newDealPage = new CreateNewDealPage(); // Re-initialize again
		newDealPage.createNewDealFunctionality("Today's Deal", "Deals Description", "July 2025", "20", "02:00");
	}

}
