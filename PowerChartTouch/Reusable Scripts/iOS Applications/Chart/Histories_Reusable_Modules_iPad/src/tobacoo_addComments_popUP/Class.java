package tobacoo_addComments_popUP;

import javax.swing.JOptionPane;

import com.ibm.rational.test.lt.kernel.services.ITestExecutionServices;

/**
 * @author unknown
 */
public class Class implements
		com.ibm.rational.test.lt.kernel.custom.ICustomCode2 {

	/**
	 * Instances of this will be created using the no-arg constructor.
	 */
	public Class() {
	}

	/**
	 * For javadoc of ICustomCode2 and ITestExecutionServices interfaces, select 'Help Contents' in the
	 * Help menu and select 'Extending Rational Performance Tester functionality' -> 'Extending test execution with custom code'
	 */
	public String exec(ITestExecutionServices tes, String[] args) {
		JOptionPane.showInputDialog(null, "Tobacco Details", "Edit details and add Comments." + "\n" + "Note: Do Not Cancel/Save");
		
		return null;
	}

}
