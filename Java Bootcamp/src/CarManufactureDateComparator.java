import java.util.Comparator;

public class CarManufactureDateComparator implements Comparator<Car> {

	@Override
	public int compare(Car o1, Car o2) {
		return o1.getManufactureDate().compareTo(o2.getManufactureDate());
	}

}
