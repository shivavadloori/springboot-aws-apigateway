package com.javatechie.aws.api;

import java.util.Locale;
import java.util.MissingResourceException;

import org.apache.commons.lang3.LocaleUtils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Book {

	private int id;
	private String name;
	private double price;

	public static void main(String[] args) {
		String locale="af_NA";
		Locale lo = parseLocale(locale);
		if (isValid(lo)) {
			System.out.println(lo.getDisplayCountry());
		} else {
			System.out.println("invalid: " + locale);
		}
	}

	private static Locale parseLocale(String locale) {
		String[] parts = locale.split("_");
		switch (parts.length) {
		case 3:
			return new Locale(parts[0], parts[1], parts[2]);
		case 2:
			return new Locale(parts[0], parts[1]);
		case 1:
			return new Locale(parts[0]);
		default:
			throw new IllegalArgumentException("Invalid locale: " + locale);
		}
	}

	private static boolean isValid(Locale locale) {
		try {
			return locale.getISO3Language() != null && locale.getISO3Country() != null;
		} catch (MissingResourceException e) {
			return false;
		}
	}
}
