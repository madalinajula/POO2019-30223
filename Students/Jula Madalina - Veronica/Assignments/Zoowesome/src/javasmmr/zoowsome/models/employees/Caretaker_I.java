package javasmmr.zoowsome.models.employees;

import javasmmr.zoowsome.models.animals.Animal;

public interface Caretaker_I {

	public default String takeCareOf(Animal animal) {
		return null;
	}

}
