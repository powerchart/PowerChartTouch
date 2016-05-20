/**@generated
 * WARNING  Changes you make to this file may be lost.
 *           File is generated and may be re-generated without warning.
 * @RPT-Core-generated Version 8.6
 */
package test;

import com.ibm.rational.test.lt.kernel.action.IContainer;
import com.ibm.rational.test.lt.kernel.data.FeatureOptionsDataAreaCreation;
import java.util.HashMap;

@SuppressWarnings("all")
public class CompoundTest_A1E5F844058D0260E942E13461306131 extends
		com.ibm.rational.test.lt.kernel.action.impl.CompoundTest {

	public CompoundTest_A1E5F844058D0260E942E13461306131(IContainer parent,
			String name) {
		super(parent, "PCT-VR-Problem-SmokeTest PLAY COPY DO NOT USE",
				"A1E5F844058D0260E942E13461306131");
	}

	public void execute() {

		this.add(new test.Chart_Problems_LaunchCustomCode_Test_A1E6162FC4EB5590E432B66266616431(
				this, "A1E61862559F6570D494B66637613066") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.PatientMenu_OpenPatientMenu_iPhone_Test_A1E617E51ABB703EC97EB23962633932(
				this, "A1E6188C8C4E2B40D494B66637613066") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		super.execute();
	}

}