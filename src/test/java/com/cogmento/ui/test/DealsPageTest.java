package com.cogmento.ui.test;

import org.testng.annotations.Test;

import com.cogmento.ui.base.Base;
import com.cogmento.ui.pages.DealsPage;

public class DealsPageTest extends Base {

	@Test
	public void validateNavigateToDeal() {

		DealsPage dealsPage = new DealsPage();

		dealsPage.navigateToDeal();

	}

}
