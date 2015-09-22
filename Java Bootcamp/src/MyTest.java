import static org.junit.Assert.*;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.TreeSet;

import javax.swing.JOptionPane;

import org.junit.Test;

public class MyTest {

	@Test
	public void test() {
		// int i = 0;
		// System.out.println(++i);
		// fail("Not yet implemented");

		int x = 0;
		int y = 0;

		for (int z = 0; z < 5; z++) {
			if ((++x > 2) || (++y > 2)) {
				x++;
			}

		}

		System.out.println(x + " " + y);
	}

	@Test
	public void testSwitch() {
		char alphabet = 'A';

		switch (alphabet) {
		case 'A':
			System.out.println("A");
		}
	}

	@Test
	public void testPerson() {

		// Write a Person with firstname, lastname, and age that could be
		// constructed as follows:

		// with default values. i.e null firstname; null lastname; 0 age.
		Person person = new Person();

		// firstname initialized to "Juan"; lastname is the default; age is the
		// default.
		Person juan = new Person("Juan");

		// firstname initialized to "Tupac"; lastname initialized to "dela
		// Cruz"; age is the default.
		Person tupac = new Person("Tupac", "dela Cruz");

		// firstname initialized to "Trinity"; lastname initialized to "Smith";
		// age initialized to 20.
		Person trinity = new Person("Trinity", "Smith", 20);

		System.out.println(person);

		System.out.println(juan);

		System.out.println(tupac);

		System.out.println(trinity);
	}

	@Test
	public void testThread() {
		DownCounter downCounter = new DownCounter();
		Thread thread = null;

		boolean threadNotStarted = true;
		String startNumber = null;
		int startNumberAsInt = 0;

		do {
			startNumber = JOptionPane.showInputDialog("Enter start number: ");

			try {

				startNumberAsInt = Integer.parseInt(startNumber);

				if (downCounter.getStartNumber() < 0) {
					threadNotStarted = true;
				}

				downCounter.setStartNumber(startNumberAsInt);

			} catch (NumberFormatException e) {
				startNumberAsInt = 0;
				downCounter.setStartNumber(0);

			}

			if (threadNotStarted) {
				thread = new Thread(downCounter);
				thread.start();

				threadNotStarted = false;
			}

		} while (startNumberAsInt > 0);
	}

	@Test
	public void testComparator() {
		SimpleDateFormat sdf = new SimpleDateFormat("MMMM dd, yyyy");

		try {
			Car txn437 = new Car("TXN 437", "Toyota", 1996, sdf.parse("January 5, 1996"), Car.DAY_OF_WEEK.THURSDAY,
					"Thursday");
			Car uwk532 = new Car("UWK 532", "Honda", 2013, sdf.parse("April 15, 2013"), Car.DAY_OF_WEEK.MONDAY,
					"Monday");
			Car txn430 = new Car("TXN 430", "Kia", 2000, sdf.parse("May 23, 2000"), Car.DAY_OF_WEEK.FRIDAY, "Friday");

			TreeSet<Car> treeSetDefault = new TreeSet<>();
			treeSetDefault.add(txn437);
			treeSetDefault.add(uwk532);
			treeSetDefault.add(txn430);

			System.out.println("Default: ");
			System.out.println(treeSetDefault);

			TreeSet<Car> treeSetUvvrpDay = new TreeSet<>(new DayComparator());
			treeSetUvvrpDay.add(txn437);
			treeSetUvvrpDay.add(uwk532);
			treeSetUvvrpDay.add(txn430);

			System.out.println("UvvrpDay: ");
			System.out.println(treeSetUvvrpDay);

			TreeSet<Car> treeSetUvvrpDayAsString = new TreeSet<>(new Comparator<Car>() {
				public int compare(Car c1, Car c2) {
					return Car.daysOfWeek.get(c1.getUvvrpDayAsString()).toString()
							.compareTo(Car.daysOfWeek.get(c2.getUvvrpDayAsString()).toString());
				}
			});
			treeSetUvvrpDayAsString.add(txn437);
			treeSetUvvrpDayAsString.add(uwk532);
			treeSetUvvrpDayAsString.add(txn430);

			System.out.println("UvvrpDayAsString: ");
			System.out.println(treeSetUvvrpDayAsString);

			TreeSet<Car> treeSetBrand = new TreeSet<>(new Comparator<Car>() {
				public int compare(Car c1, Car c2) {
					return c1.getBrand().compareTo(c2.getBrand());
				}
			});
			treeSetBrand.add(txn437);
			treeSetBrand.add(uwk532);
			treeSetBrand.add(txn430);

			System.out.println("Brand: ");
			System.out.println(treeSetBrand);

			TreeSet<Car> treeSetManufacturedDate = new TreeSet<>(new Comparator<Car>() {
				public int compare(Car c1, Car c2) {
					return c1.getManufactureDate().compareTo(c2.getManufactureDate());
				}
			});
			treeSetManufacturedDate.add(txn437);
			treeSetManufacturedDate.add(uwk532);
			treeSetManufacturedDate.add(txn430);

			System.out.println("ManufactureDate: ");
			System.out.println(treeSetManufacturedDate);

			TreeSet<Car> modelYear = new TreeSet<>(new Comparator<Car>() {
				public int compare(Car c1, Car c2) {
					return c1.getModelYear() - c2.getModelYear();
				}
			});
			modelYear.add(txn437);
			modelYear.add(uwk532);
			modelYear.add(txn430);

			System.out.println("modelYear: ");
			System.out.println(modelYear);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// System.out.println(treeSet);

	}
}
