/**@generated
 * WARNING  Changes you make to this file may be lost.
 *           File is generated and may be re-generated without warning.
 * @RPT-Core-generated Version 8.6
 */
package test;

import com.ibm.rational.test.lt.kernel.action.IContainer;
import com.ibm.rational.test.lt.kernel.action.impl.KDelay;
import com.ibm.rational.test.lt.kernel.data.FeatureOptionsDataAreaCreation;
import java.util.HashMap;

@SuppressWarnings("all")
public class CompoundTest_A1E5F841E678D85FE942E13461306131 extends
		com.ibm.rational.test.lt.kernel.action.impl.CompoundTest {

	public CompoundTest_A1E5F841E678D85FE942E13461306131(IContainer parent,
			String name) {
		super(parent, "PCT-VR-Problem-SmokeTest(iPad)  PLAY COPY DO NOT USE",
				"A1E5F841E678D85FE942E13461306131");
	}

	public void execute() {

		this.add(new test.Location_SelectSharedBadge_Test_A1E5F1CEB496B2F6DFEEB03663373561(
				this, "A1E5F1CFE2A58212DFEEB03663373561") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new KDelay(this, "Delay (5 sec.)",
				"A1E5F785E6F7D1E0DE5BB03663663931", 5000));
		this.add(new test.LogIn_LogInSharedBadge_Test_A1E5F1CEB607A7C0DFEEB03663373561(
				this, "A1E5F1CFE2A58217DFEEB03663373561") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.PatientSearch_OpenPatientChart_iPad_Test_A1E5F1CEB582728DDFEEB03663373561(
				this, "A1E5F1CFE2A5821CDFEEB03663373561") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.PatientSearch_DecisionSupportOverride_Test_A1E5F1DA471EBF92DFEEB03663373561(
				this, "A1E5F1DA8E09CE40DFEEB03663373561") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.ChartReview_VerifyNoChronicProblemsRecorded_Test_A1E5F1CEB5C76A66DFEEB03663373561(
				this, "A1E5ED3AFDB93E50E0CDB23838363563") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Chart_ProblemsStatus_AddProblemWithCustomCode_Test_A1E5F2B51A27DAA5E3F1E26563303839(
				this, "A1E5F2B5305B4B80E3F1E26563303839") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Chart_AddProblem_SearchandSelectCondition_Test_A1E5F7530A237407DE5BB03663663931(
				this, "A1E5F754905E2270DE5BB03663663931") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Chart_AddProblem_SaveDetails_Test_A1E5F1DEA3823039DFEEB03663373561(
				this, "A1E5F2AEEAEBEE70E3F1E26563303839") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.ChartReview_VerifyDiagnosis1BelowNoChronicProblemsRecorded_Test_A1E5F2AD899B52BFE3F1E26563303839(
				this, "A1E5F2AD8F89E0B0E3F1E26563303839") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Chart_ChangePatientOrEncounter_iPad_Test_A1E5F2B322C287B6E3F1E26563303839(
				this, "A1E5F2B3392F5820E3F1E26563303839") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.PatientSearch_DecisionSupportOverride_Test_A1E5F1DA471EBF92DFEEB03663373561(
				this, "A1E5F2BF5E894D42E3F1E26563303839") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Chart_ProblemsStatus_AddProblemWithCustomCode_Test_A1E5F2B51A27DAA5E3F1E26563303839(
				this, "A1E5F2B5560FB322E3F1E26563303839") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Chart_AddProblem_SearchandSelectCondition_Test_A1E5F7530A237407DE5BB03663663931(
				this, "A1E5F754AA1B2F50DE5BB03663663931") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Chart_Problems_SelectToggleButtonChronic_Test_A1E5F1CEB595850EDFEEB03663373561(
				this, "A1E5F067A429D1D0F155E13537323334") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Chart_Problems_SelectToggleButtonThisVisit_Test_A1E5F1CEB46987E8DFEEB03663373561(
				this, "A1E5F6C25F761292D105B63035356137") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Chart_Problems_AddComment_Test_A1E5F1CEB5D80BFBDFEEB03663373561(
				this, "A1E5F05AED560A70D1C5B03731383837") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Chart_AddProblem_SaveDetails_Test_A1E5F1DEA3823039DFEEB03663373561(
				this, "A1E5F2B70197F120E3F1E26563303839") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Chart_Problems_VerifyCommentIndicator_Test_A1E5F5F62EEA3B7CD231B43633326139(
				this, "A1E5F5F73BB84F10D231B43633326139") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.ChartReview_VerifyProblem1BelowDiagnosis1_Test_A1E5F5ED3221AD5DD231B43633326139(
				this, "A1E5F5ED428784A0D231B43633326139") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Chart_Problems_NavigateToDetails_Test_A1E5F1CEB5506551DFEEB03663373561(
				this, "A1E5F2B9EFB890B0E3F1E26563303839") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Chart_Problems_VerifyDiagnosisDataPointWithCustomCode_Test_A1E5F2BC6AA8F838E3F1E26563303839(
				this, "A1E5F2BC77919070E3F1E26563303839") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Chart_ProblemsStatus_AddProblemWithCustomCode_Test_A1E5F2B51A27DAA5E3F1E26563303839(
				this, "A1E5F2B714242C00E3F1E26563303839") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Chart_AddProblem_SearchandSelectCondition_Test_A1E5F7530A237407DE5BB03663663931(
				this, "A1E5F754B84AEDE0DE5BB03663663931") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Chart_AddProblem_SaveDetails_Test_A1E5F1DEA3823039DFEEB03663373561(
				this, "A1E5F5E278869C90D231B43633326139") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Chart_ProblemsStatus_AddProblemWithCustomCode_Test_A1E5F2B51A27DAA5E3F1E26563303839(
				this, "A1E5F5E2501251A2D231B43633326139") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Chart_AddProblem_SearchandSelectCondition_Test_A1E5F7530A237407DE5BB03663663931(
				this, "A1E5F754AE3A7B90DE5BB03663663931") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Chart_Problems_SelectToggleButtonChronic_Test_A1E5F1CEB595850EDFEEB03663373561(
				this, "A1E5F067B4BA3CB0F155E13537323334") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Chart_Problems_SelectToggleButtonThisVisit_Test_A1E5F1CEB46987E8DFEEB03663373561(
				this, "A1E5F067B4BA3CB3F155E13537323334") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Chart_AddProblem_SaveDetails_Test_A1E5F1DEA3823039DFEEB03663373561(
				this, "A1E5F06832056EB0F155E13537323334") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Chart_Problems_SelectDiagnosis2_FromMasterList_Test_A1E5F5E52AB8FAF0D231B43633326139(
				this, "A1E5F5E6DD4AACD0D231B43633326139") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Chart_Problems_NavigateToDetailsClassification_Test_A1E5F1CEB6541982DFEEB03663373561(
				this, "A1E5F072332CA510F155E13537323334") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Chart_Problems_SelectClassificationDetail_iPad_Test_A1E5F1CEB5F24AD2DFEEB03663373561(
				this, "A1E5F072332CA513F155E13537323334") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Chart_AddProblem_SaveDetails_Test_A1E5F1DEA3823039DFEEB03663373561(
				this, "A1E5F12925869BC0F6F2B53062316137") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Chart_Problems_SelectProblem2_FromMasterList_Test_A1E5F5EA83E89B80D231B43633326139(
				this, "A1E5F5EA9570D3E0D231B43633326139") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Chart_Problems_NavigateToDetailsClassification_Test_A1E5F1CEB6541982DFEEB03663373561(
				this, "A1E5F839CADC7CE2E942E13461306131") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Chart_Problems_SelectClassificationDetail_iPad_Test_A1E5F1CEB5F24AD2DFEEB03663373561(
				this, "A1E5F839CADC7CE7E942E13461306131") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Chart_Problems_NavigateToDetailsStatus_Test_A1E5F1CEB4A04F9DDFEEB03663373561(
				this, "A1E5F83A011B5BF0E942E13461306131") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Chart_Problems_SelectStatusDetailOption_Test_A1E5F1CEB43F6A6EDFEEB03663373561(
				this, "A1E5F83A0EC1C640E942E13461306131") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Chart_AddProblem_SaveDetails_Test_A1E5F1DEA3823039DFEEB03663373561(
				this, "A1E5F1293B040320F6F2B53062316137") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Chart_AddProblem_NavigateFromProblemsToChartReview_Test_A1E5F1CEB448E0C6DFEEB03663373561(
				this, "A1E5F132010B1330F6F2B53062316137") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Chart_Problems_NavigateToDetails_Test_A1E5F1CEB5506551DFEEB03663373561(
				this, "A1E5F83AA4F501E2E942E13461306131") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.ChartReview_VerifyDiagnosis1_Test_A1E5F1CEB6410731DFEEB03663373561(
				this, "A1E5F1371669DCC0F6F2B53062316137") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.ChartReview_VerifyProblem1_Test_A1E5F1CEB53897E1DFEEB03663373561(
				this, "A1E5F137166EE5D0F6F2B53062316137") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.ChartReview_VerifyNursingSection_Test_A1E5F1CEB56F5F3ADFEEB03663373561(
				this, "A1E5F137166DD460F6F2B53062316137") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.ChartReview_VerifyDietarySection_Test_A1E5F1CEB4F39F86DFEEB03663373561(
				this, "A1E5F137166B1540F6F2B53062316137") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.ChartReview_VerifyDiagnosis1_Test_A1E5F1CEB6410731DFEEB03663373561(
				this, "A1E5F139CCCF0F60F6F2B53062316137") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.ChartReview_VerifyProblem1_Test_A1E5F1CEB53897E1DFEEB03663373561(
				this, "A1E5F139CCCF0F69F6F2B53062316137") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.ChartReview_VerifyNursingSection_Test_A1E5F1CEB56F5F3ADFEEB03663373561(
				this, "A1E5F139CCCF0F66F6F2B53062316137") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.ChartReview_VerifyDietarySection_Test_A1E5F1CEB4F39F86DFEEB03663373561(
				this, "A1E5F139CCCF0F63F6F2B53062316137") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		super.execute();
	}

}