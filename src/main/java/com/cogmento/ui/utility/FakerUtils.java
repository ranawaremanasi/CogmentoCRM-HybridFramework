package com.cogmento.ui.utility;

import com.github.javafaker.Faker;

public class FakerUtils {

	static Faker faker = new Faker();

	public static String getFirstName() {
		return faker.name().firstName();
	}

	public static String getLastName() {
		return faker.name().lastName();
	}

	public static String getEmail() {
		return faker.internet().emailAddress();
	}

	public static String getPhoneNumber() {
		return faker.phoneNumber().cellPhone();
	}
}