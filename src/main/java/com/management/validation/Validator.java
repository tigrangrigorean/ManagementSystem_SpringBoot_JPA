package com.management.validation;

import java.util.List;

import static java.lang.Math.E;

public class Validator {

	/**
	 * Method checks Entity valid or not
	 * @param <E>
	 * @param entity
	 * @return
	 */

	public static <E> void checkEntity(E entity) {

		if(entity == null) {
			throw new IllegalArgumentException("Entity does not exist.");
		}
	}

	/**
	 * Method checks ID correct or not
	 * @param id
	 */
	public static void checkId(long id) {
		if(id <= 0) {
			throw new IllegalArgumentException("Entered ID is incorrect.");
		}
	}

	/**
	 * Method checks list
	 * @param <E>
	 * @param listCheck
	 */
	public static<E> void checkList(List<E> listCheck) {
		if(listCheck.isEmpty()) {
			throw new IllegalArgumentException("Not any entity");
		}
	}
}
