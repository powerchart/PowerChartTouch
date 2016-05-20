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
public class CompoundTest_A1E5F1CFABEF9ECFDFEEB03663373561 extends
		com.ibm.rational.test.lt.kernel.action.impl.CompoundTest {

	public CompoundTest_A1E5F1CFABEF9ECFDFEEB03663373561(IContainer parent,
			String name) {
		super(parent, "PCT-VR-Problem-SmokeTest(iPad)",
				"A1E5F1CFABEF9ECFDFEEB03663373561");
	}

	public void execute() {

		this.add(new test.Location_LaunchApp_Test_A1E601A7094CC090F886E66533333539(
				this, "A1E601A7243DE0A0F886E66533333539") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Location_SelectPersonalBadge_Test_A1E5F1DF9E94A331DFEEB03663373561(
				this, "A1E608A7C5B5B780EE5AE26131613130") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new KDelay(this, "Delay (5 sec.)",
				"A1E5F785E6F7D1E0DE5BB03663663931", 5000));
		this.add(new test.LogIn_LogInPersonalBadge_Test_A1E5F1DF8C6E06CCDFEEB03663373561(
				this, "A1E608A7C98E0FB0EE5AE26131613130") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Dismiss_Pin_Screen_Reminder_PopUp_iPad_Test_A1E5F1D989D234A9DFEEB03663373561(
				this, "A1E608AC1C504AC0EE5AE26131613130") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.If_RoleSelection_Displays_NotDisplays_Test_A1E608AB83634655EE5AE26131613130(
				this, "A1E608AC37416AD2EE5AE26131613130") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new KDelay(this, "Delay (5 sec.)",
				"A1E5FC05FFBDC112C94BB16134353538", 5000));
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

		this.add(new test.EstablishRelationShipWindowiPad_Test_A1E608ABA370FE83EE5AE26131613130(
				this, "A1E608AC56C66AE0EE5AE26131613130") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Chart_Problems_VerifyNoChronicProblems_Test_A1E5F1CEB5C76A66DFEEB03663373561(
				this, "A1E5ED3AFDB93E50E0CDB23838363563") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new KDelay(this, "Delay (5 sec.)",
				"A1E607E3BB0C3992F6D1B63961313936", 5000));
		this.add(new test.Chart_Problems_SelectAddProblemButton_ChartReview_Test_A1E5F1CEB634F977DFEEB03663373561(
				this, "A1E606677446BD50FA17E13032373066") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Chart_Problems_Search_SelectCondition_Test_A1E5F7530A237407DE5BB03663663931(
				this, "A1E5F754905E2270DE5BB03663663931") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Chart_Problems_SaveDetails_ModalView_iPad_Test_A1E60718EABCCD5AD255B73165396236(
				this, "A1E6071908CE1840D255B73165396236") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Chart_Problems_VerifyDiagnosis1BelowNoChronicProblems_Test_A1E5F2AD899B52BFE3F1E26563303839(
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

		this.add(new test.EstablishRelationShipWindowiPad_Test_A1E608ABA370FE83EE5AE26131613130(
				this, "A1E608B0F239CF42EE5AE26131613130") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new KDelay(this, "Delay (5 sec.)",
				"A1E607E3C0DDF0C2F6D1B63961313936", 5000));
		this.add(new test.Chart_Problems_SelectAddProblemButton_ChartReview_Test_A1E5F1CEB634F977DFEEB03663373561(
				this, "A1E60667BE6B25B2FA17E13032373066") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Chart_Problems_AddProblem_NoPrevious_Test_A1E60666D444110FFA17E13032373066(
				this, "A1E60667BE6B25B7FA17E13032373066") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Chart_Problems_Search_SelectCondition_Test_A1E5F7530A237407DE5BB03663663931(
				this, "A1E5F754AA1B2F50DE5BB03663663931") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Chart_Problems_CheckChronic_ProblemsModal_iPad_Test_A1E5F1CEB595850EDFEEB03663373561(
				this, "A1E5F067A429D1D0F155E13537323334") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new KDelay(this, "Delay (5 sec.)",
				"A1E607E4CB79BDB2F6D1B63961313936", 5000));
		this.add(new test.Chart_Problems_UncheckThisVisit_ProblemsModal_iPad_Test_A1E60712D6532DD8D255B73165396236(
				this, "A1E607143D8A4130D255B73165396236") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Chart_Problems_NavigateToDetailsClassification_iPad_Test_A1E6065E1FB533DEFA17E13032373066(
				this, "A1E608B3627D0EF0EE5AE26131613130") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Chart_Problems_SelectClassificationDetail_iPad_Test_A1E5F1CEB5F24AD2DFEEB03663373561(
				this, "A1E5F75A1D65DB40DE5BB03663663931") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Chart_Problems_NavigateToDetailsConfirmation_iPad_Test_A1E6065E1FBC5FCBFA17E13032373066(
				this, "A1E608B3686CFC80EE5AE26131613130") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Chart_Problems_SelectConfirmationDetail_iPad_Test_A1E5F1CEB56106E0DFEEB03663373561(
				this, "A1E5F2B96C239150E3F1E26563303839") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Chart_Problems_AddComment_WithCustomCode_Test_A1E6089EEF889729EE5AE26131613130(
				this, "A1E6089FA3919C30EE5AE26131613130") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Chart_Problems_SaveDetails_ModalView_iPad_Test_A1E60718EABCCD5AD255B73165396236(
				this, "A1E6071912114F82D255B73165396236") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new KDelay(this, "Delay (5 sec.)",
				"A1E5FB50048C30C0C96FE43534333938", 5000));
		this.add(new test.Chart_Problems_VerifyCommentIndicatorProblem1_Test_A1E5F5F62EEA3B7CD231B43633326139(
				this, "A1E5F5F73BB84F10D231B43633326139") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Chart_Problems_VerifyDiagnosis1andProblem1OrderonChartReview_Test_A1E5F5ED3221AD5DD231B43633326139(
				this, "A1E5F5ED428784A0D231B43633326139") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Chart_Problems_NavigateToSplitView_Ambulatory_Test_A1E5F1CEB5506551DFEEB03663373561(
				this, "A1E5F2B9EFB890B0E3F1E26563303839") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Chart_Problems_SelectConditionFromMasterList_Test_A1E601871D3A1FF4F886E66533333539(
				this, "A1E60188F3F3A5B2F886E66533333539") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new KDelay(this, "Delay (5 sec.)",
				"A1E60715D8828982D255B73165396236", 5000));
		this.add(new test.Chart_Problems_VerifyDiagnosisDataPointWithCustomCode_Test_A1E5F2BC6AA8F838E3F1E26563303839(
				this, "A1E5F2BC77919070E3F1E26563303839") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Chart_Problems_SelectAddProblemButton_DetailView_iPad_Test_A1E60667F8DADE2DFA17E13032373066(
				this, "A1E606687834F200FA17E13032373066") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Chart_Problems_Search_SelectCondition_Test_A1E5F7530A237407DE5BB03663663931(
				this, "A1E5F754B84AEDE0DE5BB03663663931") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Chart_Problems_SaveDetails_ModalView_iPad_Test_A1E60718EABCCD5AD255B73165396236(
				this, "A1E6071917CF57A2D255B73165396236") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new KDelay(this, "Delay (5 sec.)",
				"A1E5FB51C9C9B370C96FE43534333938", 5000));
		this.add(new test.Chart_Problems_NavigateFromProblemsToChartReview_Test_A1E5F1CEB448E0C6DFEEB03663373561(
				this, "A1E608B67EBFADE2EE5AE26131613130") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Chart_Problems_SelectAddProblemButton_ChartReview_Test_A1E5F1CEB634F977DFEEB03663373561(
				this, "A1E608B688F5F7B0EE5AE26131613130") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Chart_Problems_Search_SelectCondition_Test_A1E5F7530A237407DE5BB03663663931(
				this, "A1E5F754AE3A7B90DE5BB03663663931") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Chart_Problems_CheckChronic_ProblemsModal_iPad_Test_A1E5F1CEB595850EDFEEB03663373561(
				this, "A1E5F067B4BA3CB0F155E13537323334") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Chart_Problems_UncheckThisVisit_ProblemsModal_iPad_Test_A1E60712D6532DD8D255B73165396236(
				this, "A1E60712EAC36AE0D255B73165396236") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Chart_Problems_NavigateToDetailsClassification_iPad_Test_A1E6065E1FB533DEFA17E13032373066(
				this, "A1E608B69E4E9900EE5AE26131613130") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Chart_Problems_SelectClassificationDetail_iPad_Test_A1E5F1CEB5F24AD2DFEEB03663373561(
				this, "A1E601BB6DF0D279F886E66533333539") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Chart_Problems_NavigateToDetailsConfirmation_iPad_Test_A1E6065E1FBC5FCBFA17E13032373066(
				this, "A1E608B6A216C490EE5AE26131613130") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Chart_Problems_SelectConfirmationDetail_iPad_Test_A1E5F1CEB56106E0DFEEB03663373561(
				this, "A1E601BB6DF0D287F886E66533333539") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Chart_Problems_SaveDetails_ModalView_iPad_Test_A1E60718EABCCD5AD255B73165396236(
				this, "A1E607191C7CDA22D255B73165396236") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new KDelay(this, "Delay (5 sec.)",
				"A1E5FB54817CE9E2C96FE43534333938", 5000));
		this.add(new test.Chart_Problems_NavigateToSplitView_Ambulatory_Test_A1E5F1CEB5506551DFEEB03663373561(
				this, "A1E608B6B584FB02EE5AE26131613130") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new KDelay(this, "Delay (5 sec.)",
				"A1E608BAAC32D2D2EE5AE26131613130", 5000));
		this.add(new test.Chart_Problems_VerifyDiagnosis1_2Problem1_2OrderMasterList_Test_A1E5FB5375A172EBC96FE43534333938(
				this, "A1E5FB5380F008A0C96FE43534333938") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new KDelay(this, "Delay (1 min.)",
				"A1E60662055CFA80FA17E13032373066", 60000));
		this.add(new test.Chart_Problems_SelectConditionFromMasterList_Test_A1E601871D3A1FF4F886E66533333539(
				this, "A1E60188CCFB7370F886E66533333539") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new KDelay(this, "Delay (5 sec.)",
				"A1E60715D0753A32D255B73165396236", 5000));
		this.add(new test.Chart_Problems_NavigateToDetailsClassification_iPad_Test_A1E6065E1FB533DEFA17E13032373066(
				this, "A1E6070FFC4960B0D255B73165396236") {
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

		this.add(new test.Chart_Problems_SaveDetails_DetailView_iPad_Test_A1E5F1DEA3823039DFEEB03663373561(
				this, "A1E5F12925869BC0F6F2B53062316137") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new KDelay(this, "Delay (5 sec.)",
				"A1E5FB548471E6F2C96FE43534333938", 5000));
		this.add(new test.Chart_Problems_VerifyDiagnosis2BelowDietaryinMasterList_iPad_Test_A1E5FB54CB267D94C96FE43534333938(
				this, "A1E5FB54D6B2E0E0C96FE43534333938") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Chart_Problems_SelectConditionFromMasterList_Test_A1E601871D3A1FF4F886E66533333539(
				this, "A1E60188D40DC0F2F886E66533333539") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new KDelay(this, "Delay (5 sec.)",
				"A1E60715DEF3DC12D255B73165396236", 5000));
		this.add(new test.Chart_Problems_NavigateToDetailsClassification_iPad_Test_A1E6065E1FB533DEFA17E13032373066(
				this, "A1E60660E9F31D70FA17E13032373066") {
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

		this.add(new test.Chart_Problems_NavigateToDetailsStatus_iPad_Test_A1E5F1CEB4A04F9DDFEEB03663373561(
				this, "A1E5F83A011B5BF0E942E13461306131") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Chart_Problems_SelectStatusDetail_iPad_Test_A1E5F1CEB43F6A6EDFEEB03663373561(
				this, "A1E5F83A0EC1C640E942E13461306131") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Chart_Problems_SaveDetails_DetailView_iPad_Test_A1E5F1DEA3823039DFEEB03663373561(
				this, "A1E5F1293B040320F6F2B53062316137") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new KDelay(this, "Delay (5 sec.)",
				"A1E5FB5572F85F22C96FE43534333938", 5000));
		this.add(new test.Chart_Problems_VerifyProblem2BelowNursinginMasterList_iPad_Test_A1E5FB558D9C71C2C96FE43534333938(
				this, "A1E5FB5590F55FA0C96FE43534333938") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Chart_Problems_NavigateFromProblemsToChartReview_Test_A1E5F1CEB448E0C6DFEEB03663373561(
				this, "A1E5F132010B1330F6F2B53062316137") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new KDelay(this, "Delay (5 sec.)",
				"A1E608BAC0E04002EE5AE26131613130", 5000));
		this.add(new test.Chart_Problems_VerifyDiagnosis1Problem1DietaryNursingonChartReview_Test_A1E5FC10DEF013ACF33DB93666333631(
				this, "A1E5FC10E64B02A0F33DB93666333631") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Chart_Problems_NavigateToSplitView_Ambulatory_Test_A1E5F1CEB5506551DFEEB03663373561(
				this, "A1E5FC17A34FEE00F33DB93666333631") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Chart_Problems_SelectConditionFromMasterList_Test_A1E601871D3A1FF4F886E66533333539(
				this, "A1E60188DA3F4B62F886E66533333539") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new KDelay(this, "Delay (5 sec.)",
				"A1E60715E3106932D255B73165396236", 5000));
		this.add(new test.Chart_Problems_NavigateToDetailsStatus_iPad_Test_A1E5F1CEB4A04F9DDFEEB03663373561(
				this, "A1E5FC17710616E0F33DB93666333631") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Chart_Problems_SelectStatusDetail_iPad_Test_A1E5F1CEB43F6A6EDFEEB03663373561(
				this, "A1E5FC17772FD920F33DB93666333631") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Chart_Problems_SaveDetails_DetailView_iPad_Test_A1E5F1DEA3823039DFEEB03663373561(
				this, "A1E5FC1904A76790F33DB93666333631") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new KDelay(this, "Delay (5 sec.)",
				"A1E5FC1907066630F33DB93666333631", 5000));
		this.add(new test.Chart_Problems_SelectConditionFromMasterList_Test_A1E601871D3A1FF4F886E66533333539(
				this, "A1E60188DE60E192F886E66533333539") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new KDelay(this, "Delay (5 sec.)",
				"A1E60715EA1B63B2D255B73165396236", 5000));
		this.add(new test.Chart_Problems_UncheckThisVisit_DetailView_iPad_Test_A1E5F1CEB46987E8DFEEB03663373561(
				this, "A1E5FC185C742B80F33DB93666333631") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Chart_Problems_SaveDetails_DetailView_iPad_Test_A1E5F1DEA3823039DFEEB03663373561(
				this, "A1E5FC198F4FC5E0F33DB93666333631") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new KDelay(this, "Delay (5 sec.)",
				"A1E608BADD039E82EE5AE26131613130", 5000));
		this.add(new test.Chart_Problems_VerifyDietaryNursingHistoricalandRemovedProblem1MasterList_Test_A1E5FC19D1B1F1CBF33DB93666333631(
				this, "A1E5FC19EB6C8D90F33DB93666333631") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Chart_Problems_NavigateFromProblemsToChartReview_Test_A1E5F1CEB448E0C6DFEEB03663373561(
				this, "A1E608B78368CE20EE5AE26131613130") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Chart_Problems_SelectAddProblemButton_ChartReview_Test_A1E5F1CEB634F977DFEEB03663373561(
				this, "A1E608B7891745E0EE5AE26131613130") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Chart_Problems_AddProblem_NoPrevious_Test_A1E60666D444110FFA17E13032373066(
				this, "A1E608BA771C2010EE5AE26131613130") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Chart_Problems_Search_SelectCondition_Test_A1E5F7530A237407DE5BB03663663931(
				this, "A1E5FC22F0ACEB22F33DB93666333631") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new KDelay(this, "Delay (5 sec.)",
				"A1E608BAEC556EE2EE5AE26131613130", 5000));
		this.add(new test.Chart_Problems_VerifyAddProblem2ModalDetails_Test_A1E5FC240A3648A3F33DB93666333631(
				this, "A1E5FC2421F75E30F33DB93666333631") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Chart_Problems_ChangeAnnotatedDisplay_withCustomCode_Test_A1E6089F4473A27FEE5AE26131613130(
				this, "A1E6089FB58874E0EE5AE26131613130") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Chart_Problems_AddComment_WithCustomCode_Test_A1E6089EEF889729EE5AE26131613130(
				this, "A1E608A08ECE1980EE5AE26131613130") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Chart_Problems_SaveDetails_ModalView_iPad_Test_A1E60718EABCCD5AD255B73165396236(
				this, "A1E607192EDF9402D255B73165396236") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new KDelay(this, "Delay (5 sec.)",
				"A1E608AAA6552802EE5AE26131613130", 5000));
		this.add(new test.Chart_Problems_NavigateToSplitView_Ambulatory_Test_A1E5F1CEB5506551DFEEB03663373561(
				this, "A1E608B7AD280FA2EE5AE26131613130") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new KDelay(this, "Delay (5 sec.)",
				"A1E608BAF3E291B2EE5AE26131613130", 5000));
		this.add(new test.Chart_Problems_VerifyDietaryNursingHistoricalandAnnotatedDisplayMasterList_Test_A1E600CE1C0680DFC4D8E23063343465(
				this, "A1E600CE21AC9400C4D8E23063343465") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Chart_Problems_VerifyCommentIndicatorDiagnosis2_Test_A1E600CEE2732A53C4D8E23063343465(
				this, "A1E600CEF722E120C4D8E23063343465") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Chart_ChangePatientOrEncounter_iPad_Test_A1E5F2B322C287B6E3F1E26563303839(
				this, "A1E600DA979B80C2C4D8E23063343465") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.PatientSearch_DecisionSupportOverride_Test_A1E5F1DA471EBF92DFEEB03663373561(
				this, "A1E600DA979B80C7C4D8E23063343465") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Chart_Problems_NavigateToSplitView_Ambulatory_Test_A1E5F1CEB5506551DFEEB03663373561(
				this, "A1E6018914B21022F886E66533333539") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Chart_Problems_SelectConditionFromMasterList_Test_A1E601871D3A1FF4F886E66533333539(
				this, "A1E601891E041470F886E66533333539") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new KDelay(this, "Delay (5 sec.)",
				"A1E60715EF5372F2D255B73165396236", 5000));
		this.add(new test.Chart_Problems_VerifyFreetextProblemNotEditable_Test_A1E60186E3F37ED0F886E66533333539(
				this, "A1E6018921F524C0F886E66533333539") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Chart_Problems_SelectConditionFromMasterList_Test_A1E601871D3A1FF4F886E66533333539(
				this, "A1E6018B25142D20F886E66533333539") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new KDelay(this, "Delay (5 sec.)",
				"A1E60715F0C886C2D255B73165396236", 5000));
		this.add(new test.Chart_Problems_VerifyFreetextProblemNotEditable_Test_A1E60186E3F37ED0F886E66533333539(
				this, "A1E6018B27E94622F886E66533333539") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new KDelay(this, "Delay (5 sec.)",
				"A1E607E3D7AB09A2F6D1B63961313936", 5000));
		this.add(new test.Chart_Problems_NavigateFromProblemsToChartReview_Test_A1E5F1CEB448E0C6DFEEB03663373561(
				this, "A1E608B7C6D7AF02EE5AE26131613130") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Chart_Problems_SelectAddProblemButton_ChartReview_Test_A1E5F1CEB634F977DFEEB03663373561(
				this, "A1E608B7C6D7AF07EE5AE26131613130") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Chart_Problems_Search_SelectCondition_Test_A1E5F7530A237407DE5BB03663663931(
				this, "A1E6018B9A3CDA22F886E66533333539") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Chart_Problems_CheckHistorical_ProblemsModal_iPad_Test_A1E6018C0E7F1FAAF886E66533333539(
				this, "A1E6018C1502C0D0F886E66533333539") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Chart_Problems_NavigateToDetailsClassificationProblemModal_iPad_Test_A1E5F1CEB6541982DFEEB03663373561(
				this, "A1E6073350FCA542D255B73165396236") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Chart_Problems_SelectClassificationDetail_iPad_Test_A1E5F1CEB5F24AD2DFEEB03663373561(
				this, "A1E6073350FCA549D255B73165396236") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Chart_Problems_SaveDetails_ModalView_iPad_Test_A1E60718EABCCD5AD255B73165396236(
				this, "A1E607193A9B4552D255B73165396236") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Chart_Problems_NavigateToSplitView_Ambulatory_Test_A1E5F1CEB5506551DFEEB03663373561(
				this, "A1E608B7D7F47B60EE5AE26131613130") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new KDelay(this, "Delay (5 sec.)",
				"A1E608BB0072F822EE5AE26131613130", 5000));
		this.add(new test.Chart_Problems_VerifyProblem6BelowHistoricalinMasterList_iPad_Test_A1E6018C492F149FF886E66533333539(
				this, "A1E6018C686641C0F886E66533333539") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Chart_Problems_SelectConditionFromMasterList_Test_A1E601871D3A1FF4F886E66533333539(
				this, "A1E6018D4BC8DBD2F886E66533333539") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new KDelay(this, "Delay (5 sec.)",
				"A1E60715F3F66E22D255B73165396236", 5000));
		this.add(new test.Chart_Problems_CheckThisVisit_DetailView_iPad_Test_A1E607CB5B297DF6F6D1B63961313936(
				this, "A1E608A540E98290EE5AE26131613130") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Chart_Problems_SaveDetails_DetailView_iPad_Test_A1E5F1DEA3823039DFEEB03663373561(
				this, "A1E6018D7F5767F2F886E66533333539") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new KDelay(this, "Delay (5 sec.)",
				"A1E601A2C2044BD0F886E66533333539", 5000));
		this.add(new test.Chart_Problems_VerifyThisVisitSwitchOn_Test_A1E601A24E322E78F886E66533333539(
				this, "A1E601A2BE6EA1F0F886E66533333539") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Chart_Problems_NavigateFromProblemsToChartReview_Test_A1E5F1CEB448E0C6DFEEB03663373561(
				this, "A1E6018D909996A2F886E66533333539") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new KDelay(this, "Delay (5 sec.)",
				"A1E608BB052E3642EE5AE26131613130", 5000));
		this.add(new test.Chart_Problems_VerifyProblem4ThisVisitOnChartReview_Test_A1E6018DFBE00E4CF886E66533333539(
				this, "A1E6018E9A620E00F886E66533333539") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Chart_Problems_NavigateToSplitView_Ambulatory_Test_A1E5F1CEB5506551DFEEB03663373561(
				this, "A1E6019116A86842F886E66533333539") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Chart_Problems_SelectConditionFromMasterList_Test_A1E601871D3A1FF4F886E66533333539(
				this, "A1E601911E981D72F886E66533333539") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new KDelay(this, "Delay (5 sec.)",
				"A1E60715F6772592D255B73165396236", 5000));
		this.add(new test.Chart_Problems_CheckThisVisit_DetailView_iPad_Test_A1E607CB5B297DF6F6D1B63961313936(
				this, "A1E608A502A2F980EE5AE26131613130") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Chart_Problems_SelectDxIcon_ProblemsModal_iPad_Test_A1E5F1CEB5316BD1DFEEB03663373561(
				this, "A1E6019943945F00F886E66533333539") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new KDelay(this, "Delay (5 sec.)",
				"A1E608BB092C3EE0EE5AE26131613130", 5000));
		this.add(new test.Chart_Problems_VerifyTermMatchWindow_Test_A1E60199865A5601F886E66533333539(
				this, "A1E6019FF5CE3AA0F886E66533333539") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Chart_Problems_Search_SelectTermMatch_Test_A1E601A05349F626F886E66533333539(
				this, "A1E601A05CD90360F886E66533333539") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Chart_Problems_SelectDone_Test_A1E601A180C1415DF886E66533333539(
				this, "A1E601A18AEE8A30F886E66533333539") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Chart_Problems_SaveDetails_DetailView_iPad_Test_A1E5F1DEA3823039DFEEB03663373561(
				this, "A1E601A1AC6261F2F886E66533333539") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new KDelay(this, "Delay (5 sec.)",
				"A1E601A2D211F222F886E66533333539", 5000));
		this.add(new test.Chart_Problems_VerifyThisVisitSwitchOn_Test_A1E601A24E322E78F886E66533333539(
				this, "A1E601A2D211F229F886E66533333539") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Chart_Problems_NavigateFromProblemsToChartReview_Test_A1E5F1CEB448E0C6DFEEB03663373561(
				this, "A1E601A1DF445A62F886E66533333539") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new KDelay(this, "Delay (5 sec.)",
				"A1E608BB0C54A802EE5AE26131613130", 5000));
		this.add(new test.Chart_Problems_VerifyProblem3ThisVisitOnChartReview_Test_A1E601A1E971A380F886E66533333539(
				this, "A1E601A1ECA75310F886E66533333539") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.LogOut_LogOut_iPad_Test_A1E601A3DDE8B017F886E66533333539(
				this, "A1E601A4180EDB70F886E66533333539") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Location_SelectPersonalBadge_Test_A1E5F1DF9E94A331DFEEB03663373561(
				this, "A1E608A944435F20EE5AE26131613130") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.LogIn_LogInPersonalBadge_Test_A1E5F1DF8C6E06CCDFEEB03663373561(
				this, "A1E608A94A5BBC40EE5AE26131613130") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Dismiss_Pin_Screen_Reminder_PopUp_iPad_Test_A1E5F1D989D234A9DFEEB03663373561(
				this, "A1E608AC25EFF9E0EE5AE26131613130") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.If_RoleSelection_Displays_NotDisplays_Test_A1E608AB83634655EE5AE26131613130(
				this, "A1E608AC309AFE80EE5AE26131613130") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.PatientSearch_OpenPatientChart_iPad_Test_A1E5F1CEB582728DDFEEB03663373561(
				this, "A1E601A75A854B32F886E66533333539") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.PatientSearch_DecisionSupportOverride_Test_A1E5F1DA471EBF92DFEEB03663373561(
				this, "A1E601A75A857242F886E66533333539") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.EstablishRelationShipWindowiPad_Test_A1E608ABA370FE83EE5AE26131613130(
				this, "A1E608AC5D703290EE5AE26131613130") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Chart_Problems_NavigateToSplitView_Ambulatory_Test_A1E5F1CEB5506551DFEEB03663373561(
				this, "A1E601A7FFD73942F886E66533333539") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Chart_Problems_SelectConditionFromMasterList_Test_A1E601871D3A1FF4F886E66533333539(
				this, "A1E601A7FFD73947F886E66533333539") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new KDelay(this, "Delay (5 sec.)",
				"A1E60715FA9909E2D255B73165396236", 5000));
		this.add(new test.Chart_Problems_CheckThisVisit_ProblemsModal_iPad_Test_A1E6018D6D41485AF886E66533333539(
				this, "A1E601A7FFD76052F886E66533333539") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Chart_Problems_SelectDxIcon_ProblemsModal_iPad_Test_A1E5F1CEB5316BD1DFEEB03663373561(
				this, "A1E601A7FFD76057F886E66533333539") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new KDelay(this, "Delay (5 sec.)",
				"A1E608BB1058F232EE5AE26131613130", 5000));
		this.add(new test.Chart_Problems_VerifyDiagnosisAssistantWindow_Test_A1E601A89176E358F886E66533333539(
				this, "A1E601A8CD60B760F886E66533333539") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Chart_Problems_SelectDiagnosisFilter_Test_A1E601A9699DD130F886E66533333539(
				this, "A1E601A9A0E76980F886E66533333539") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Chart_Problems_SelectDiagnosisAssistantValue_Test_A1E601AA52BDFE30F886E66533333539(
				this, "A1E601AA5A4CA7A0F886E66533333539") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Chart_Problems_SelectDone_Test_A1E601A180C1415DF886E66533333539(
				this, "A1E601ACD5042482F886E66533333539") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Chart_Problems_SaveDetails_DetailView_iPad_Test_A1E5F1DEA3823039DFEEB03663373561(
				this, "A1E601B15C62D942F886E66533333539") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new KDelay(this, "Delay (5 sec.)",
				"A1E601B16BCDFE02F886E66533333539", 5000));
		this.add(new test.Chart_Problems_VerifyThisVisitSwitchOn_Test_A1E601A24E322E78F886E66533333539(
				this, "A1E601B16BCDFE09F886E66533333539") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Chart_Problems_NavigateFromProblemsToChartReview_Test_A1E5F1CEB448E0C6DFEEB03663373561(
				this, "A1E601B16BCDFE0EF886E66533333539") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new KDelay(this, "Delay (5 sec.)",
				"A1E608BB138C09B2EE5AE26131613130", 5000));
		this.add(new test.Chart_Problems_VerifyProblem5ThisVisitOnChartReview_Test_A1E601B17D3AE679F886E66533333539(
				this, "A1E601B18311A670F886E66533333539") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new KDelay(this, "Delay (5 sec.)",
				"A1E607E3E3D1D8D2F6D1B63961313936", 5000));
		this.add(new test.Chart_Problems_SelectAddProblemButton_ChartReview_Test_A1E5F1CEB634F977DFEEB03663373561(
				this, "A1E6072E9DBCB960D255B73165396236") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Chart_Problems_Search_SelectCondition_Test_A1E5F7530A237407DE5BB03663663931(
				this, "A1E601B264E40390F886E66533333539") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new KDelay(this, "Delay (5 sec.)",
				"A1E608BB15790CA2EE5AE26131613130", 5000));
		this.add(new test.Chart_Problems_VerifyThisVisitSwitchOn_WithDiagAssistant_Test_A1E601B2ACC4BD80F886E66533333539(
				this, "A1E601B2CB9B7C30F886E66533333539") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Chart_Problems_SelectDxIcon_ProblemsModal_iPad_Test_A1E5F1CEB5316BD1DFEEB03663373561(
				this, "A1E601B2F382A252F886E66533333539") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new KDelay(this, "Delay (5 sec.)",
				"A1E608BB17FE57F2EE5AE26131613130", 5000));
		this.add(new test.Chart_Problems_VerifyDiagnosisAssistantWindow_Test_A1E601A89176E358F886E66533333539(
				this, "A1E601B303EC7262F886E66533333539") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Chart_Problems_SelectDiagnosisFilter_Test_A1E601A9699DD130F886E66533333539(
				this, "A1E601B318F87A52F886E66533333539") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Chart_Problems_SelectDiagnosisAssistantValue_Test_A1E601AA52BDFE30F886E66533333539(
				this, "A1E601B318F87A57F886E66533333539") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Chart_Problems_SelectDone_Test_A1E601A180C1415DF886E66533333539(
				this, "A1E601B318F87A5CF886E66533333539") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Chart_Problems_SaveDetails_DetailView_iPad_Test_A1E5F1DEA3823039DFEEB03663373561(
				this, "A1E601B318F87A61F886E66533333539") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new KDelay(this, "Delay (5 sec.)",
				"A1E601B318F87A66F886E66533333539", 5000));
		this.add(new test.Chart_Problems_VerifyThisVisitSwitchOn_Test_A1E601A24E322E78F886E66533333539(
				this, "A1E601B318F87A6DF886E66533333539") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Chart_Problems_VerifyProblem3ThisVisitOnChartReview_Test_A1E601A1E971A380F886E66533333539(
				this, "A1E601B362724AD0F886E66533333539") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Chart_Problems_NavigateToSplitView_Ambulatory_Test_A1E5F1CEB5506551DFEEB03663373561(
				this, "A1E601B46B43B802F886E66533333539") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Chart_Problems_SelectConditionFromMasterList_Test_A1E601871D3A1FF4F886E66533333539(
				this, "A1E601B46B43B807F886E66533333539") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new KDelay(this, "Delay (5 sec.)",
				"A1E6071600AFB952D255B73165396236", 5000));
		this.add(new test.Chart_Problems_UncheckThisVisit_DetailView_iPad_Test_A1E5F1CEB46987E8DFEEB03663373561(
				this, "A1E601B48ADD2A70F886E66533333539") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Chart_Problems_SaveDetails_DetailView_iPad_Test_A1E5F1DEA3823039DFEEB03663373561(
				this, "A1E601B491F06252F886E66533333539") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Chart_Problems_SelectConditionFromMasterList_Test_A1E601871D3A1FF4F886E66533333539(
				this, "A1E601B496F134F2F886E66533333539") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new KDelay(this, "Delay (5 sec.)",
				"A1E6071604177562D255B73165396236", 5000));
		this.add(new test.Chart_Problems_UncheckThisVisit_DetailView_iPad_Test_A1E5F1CEB46987E8DFEEB03663373561(
				this, "A1E601B4A803A112F886E66533333539") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Chart_Problems_SaveDetails_DetailView_iPad_Test_A1E5F1DEA3823039DFEEB03663373561(
				this, "A1E601B4A803C822F886E66533333539") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Chart_Problems_SelectConditionFromMasterList_Test_A1E601871D3A1FF4F886E66533333539(
				this, "A1E601B4CB26FD90F886E66533333539") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new KDelay(this, "Delay (5 sec.)",
				"A1E6071605D1CF92D255B73165396236", 5000));
		this.add(new test.Chart_Problems_UncheckThisVisit_DetailView_iPad_Test_A1E5F1CEB46987E8DFEEB03663373561(
				this, "A1E601B4D76DB0D2F886E66533333539") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Chart_Problems_SaveDetails_DetailView_iPad_Test_A1E5F1DEA3823039DFEEB03663373561(
				this, "A1E601B4D76DB0D7F886E66533333539") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.LogOut_LogOut_iPad_Test_A1E601A3DDE8B017F886E66533333539(
				this, "A1E601B979164920F886E66533333539") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		super.execute();
	}

}