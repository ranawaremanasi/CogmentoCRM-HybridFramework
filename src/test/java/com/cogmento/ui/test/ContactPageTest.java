package com.cogmento.ui.test;

import org.testng.annotations.Test;

import com.cogmento.ui.base.Base;
import com.cogmento.ui.pages.ContactPage;
import com.cogmento.ui.utility.FakerUtils;

public class ContactPageTest extends Base {
	private ContactPage contactPage;

	@Test
	public void validateNewContactFunctionality() {
		contactPage = new ContactPage();

		String fname = FakerUtils.getFirstName();
		String lname = FakerUtils.getLastName();
		String email = FakerUtils.getEmail();
		contactPage.createNewContact(fname, lname, email, "On Hold", "Mumbai");

	}

}
