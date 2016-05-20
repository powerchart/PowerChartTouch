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

		this.add(new test.Chart_Problems_LaunchCustomCode_Test_A1E5FC147909F807F33DB93666333631(
				this, "A1E5FC1481A3A880F33DB93666333631") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Chart_Problems_NavigateToDetailsClassificationProblemModal_iPad_Test_A1E5F1CEB6541982DFEEB03663373561(
				this, "A1E608A5B2236932EE5AE26131613130") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Chart_Problems_SelectClassificationDetail_iPad_Test_A1E5F1CEB5F24AD2DFEEB03663373561(
				this, "A1E608A5B2236939EE5AE26131613130") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Chart_Problems_NavigateToDetailsConfirmationProblemModal_iPad_Test_A1E5F1CEB4EA0220DFEEB03663373561(
				this, "A1E608A5B2236940EE5AE26131613130") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Chart_Problems_SelectConfirmationDetail_iPad_Test_A1E5F1CEB56106E0DFEEB03663373561(
				this, "A1E608A5B2236947EE5AE26131613130") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		super.execute();
	}

}