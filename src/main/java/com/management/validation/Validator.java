package com.management.validation;

import java.util.List;

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
<<<<<<< HEAD
		if(id<0) {
=======
		if(id <= 0) {
>>>>>>> origin/Lilia_Branch
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
