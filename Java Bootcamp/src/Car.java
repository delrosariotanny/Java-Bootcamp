import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Car implements Comparable<Car> {

	enum DAY_OF_WEEK {
		MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY
	}

	public static final Map<String, Integer> daysOfWeek = new HashMap<String, Integer>();

	static {
		daysOfWeek.put("Monday", 1);
		daysOfWeek.put("Tuesday", 2);
		daysOfWeek.put("Wednesday", 3);
		daysOfWeek.put("Thursday", 4);
		daysOfWeek.put("Friday", 5);

	}

	private String plateNumber;
	private String brand;
	private int modelYear;
	private Date manufactureDate;
	private DAY_OF_WEEK uvvrpDay;
	private String uvvrpDayAsString;

	public Car() {

	}

	public Car(String plateNumber, String brand, int modelYear, Date manufactureDate, DAY_OF_WEEK uvvrpDay,
			String uvvrpDayAsString) {
		super();
		this.plateNumber = plateNumber;
		this.brand = brand;
		this.modelYear = modelYear;
		this.manufactureDate = manufactureDate;
		this.uvvrpDay = uvvrpDay;
		this.uvvrpDayAsString = uvvrpDayAsString;
	}

	public Car(String plateNumber, String brand, int modelYear, Date manufactureDate, String uvvrpDayAsString) {
		this(plateNumber, brand, modelYear, manufactureDate, null, uvvrpDayAsString);
	}

	public Car(String plateNumber, String brand, int modelYear, Date manufactureDate, DAY_OF_WEEK uvvrpDay) {
		this(plateNumber, brand, modelYear, manufactureDate, uvvrpDay, null);
	}

	public String getPlateNumber() {
		return plateNumber;
	}

	public void setPlateNumber(String plateNumber) {
		this.plateNumber = plateNumber;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getModelYear() {
		return modelYear;
	}

	public void setModelYear(int modelYear) {
		this.modelYear = modelYear;
	}

	public Date getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}

	public DAY_OF_WEEK getUvvrpDay() {
		return uvvrpDay;
	}

	public void setUvvrpDay(DAY_OF_WEEK uvvrpDay) {
		this.uvvrpDay = uvvrpDay;
	}

	public String getUvvrpDayAsString() {
		return uvvrpDayAsString;
	}

	public void setUvvrpDay(String uvvrpDayAsString) {
		this.uvvrpDayAsString = uvvrpDayAsString;
	}

	@Override
	public int compareTo(Car car) {
		return plateNumber.compareTo(car.getPlateNumber());
	}

	@Override
	public String toString() {
		return "Car [plateNumber=" + plateNumber + ", brand=" + brand + ", modelYear=" + modelYear
				+ ", manufactureDate=" + new SimpleDateFormat("MMMM dd, yyyy").format(manufactureDate) + ", uvvrpDay="
				+ uvvrpDay + ", uvvrpDayAsString=" + uvvrpDayAsString + "]\n";
	}

}
