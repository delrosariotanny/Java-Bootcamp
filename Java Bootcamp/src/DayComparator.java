import java.util.Comparator;

public class DayComparator implements Comparator<Car> {

	@Override
	public int compare(Car c1, Car c2) {
		return  c1.getUvvrpDay().compareTo(c2.getUvvrpDay());
	}

}
