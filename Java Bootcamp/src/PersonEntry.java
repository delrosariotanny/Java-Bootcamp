import javax.swing.JOptionPane;

public class PersonEntry {

	public static void main(String[] args) {
		int ageAsInt = 0;
		boolean valid = false;
		
		do {
			String age = JOptionPane.showInputDialog("Enter age:");
			
			if (age == null) {
				break;
			}
			
			try {
				ageAsInt = Integer.parseInt(age);
				valid = true;
			} catch (NumberFormatException nfe) {
				JOptionPane.showMessageDialog(null, nfe.getClass().getSimpleName() + "- " + nfe.getMessage());
				valid = false;
			}
		} while (!valid);
	}

}
