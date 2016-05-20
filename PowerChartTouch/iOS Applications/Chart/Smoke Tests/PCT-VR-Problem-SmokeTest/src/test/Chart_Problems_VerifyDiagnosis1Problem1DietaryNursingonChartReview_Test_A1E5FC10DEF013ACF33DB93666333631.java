/**@generated
 * WARNING  Changes you make to this file may be lost.
 *           File is generated and may be re-generated without warning.
 * @RPT-Core-generated Version 8.6
 */
/******************************************************************
* Licensed Materials - Property of IBM
* IBM Rational Test Workbench
* Copyright IBM Corporation 2013. All Rights Reserved.
* 
* U.S. Government Users Restricted Rights - Use, duplication or 
* disclosure restricted by GSA ADP Schedule Contract with IBM Corp.
******************************************************************/
/* TestScript.template - Suitable for collaborative code generation */
package test;

import com.ibm.rational.test.lt.datacorrelation.execution.action.VariableAction;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.DataCorrelationVar;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.DataVar;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.IDCCoreVar;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.IDataCorrelationVar;
import com.ibm.rational.test.lt.datacorrelation.execution.proto.ProtoAdapterHandler;
import com.ibm.rational.test.lt.datacorrelation.execution.sub.DataSub;
import com.ibm.rational.test.lt.datacorrelation.execution.sub.IDataSub;
import com.ibm.rational.test.lt.datacorrelation.execution.sub.ISubRule;
import com.ibm.rational.test.lt.datacorrelation.execution.sub.SubRule;
import com.ibm.rational.test.lt.execution.core.impl.LTTestScript;
import com.ibm.rational.test.lt.execution.moeb.action.EndMoebStepBatchAction;
import com.ibm.rational.test.lt.execution.moeb.action.MoebStepBatchAction;
import com.ibm.rational.test.lt.execution.moeb.services.*;
import com.ibm.rational.test.lt.kernel.IDataArea;
import com.ibm.rational.test.lt.kernel.action.IContainer;
import com.ibm.rational.test.lt.kernel.action.impl.KThrow;
import com.ibm.rational.test.lt.kernel.services.*;
import com.ibm.rational.test.lt.kernel.services.RPTEventStructure;

@SuppressWarnings("all")
public class Chart_Problems_VerifyDiagnosis1Problem1DietaryNursingonChartReview_Test_A1E5FC10DEF013ACF33DB93666333631 extends LTTestScript  {

    static ProtoAdapterHandler pa = new ProtoAdapterHandler();
    static {           
        pa.addPA("com.ibm.rational.test.lt.datacorrelation.execution.protocol.core.CoreProtoAdapter", "coreAdapter");
pa.addPA("com.ibm.rational.test.lt.execution.moeb.dc.MoebDataAdapter", "com.ibm.rational.test.lt.execution.moeb.action.MoebStepBatchAction");
    }
	
	private DataVar[] vars = new DataVar[2];
	
    
    
	
	public Chart_Problems_VerifyDiagnosis1Problem1DietaryNursingonChartReview_Test_A1E5FC10DEF013ACF33DB93666333631(IContainer container, String invocationId) {
		super(container, "Chart_Problems_VerifyDiagnosis1Problem1DietaryNursingonChartReview", invocationId, "A1E5FC10DEF013ACF33DB93666333631");
		setArmEnabled(false);
		stopAtYourConvenience=false;
		
	}

    public void execute() {
    	try {
			
	    		if (!isScheduleRun()) setThinkMax(2000);
	
	if (!isScheduleRun()){
this.addEventBehavior(new RPTEventStructure(new RPTFailVPEvent(), new RPTContinueEvent("Content Verification Point failed"), 1, "Content Verification Point failed"));
	this.addEventBehavior(new RPTEventStructure(new RPTConnectEvent(), new RPTContinueEvent("Connection failed"), 1, "Connection failed"));
	this.addEventBehavior(new RPTEventStructure(new RPTAuthenticationEvent(), new RPTContinueEvent("Authentication failed"), 1, "Authentication failed"));
	this.addEventBehavior(new RPTEventStructure(new RPTDataPoolEOFEvent(), new RPTStopUserEvent("End of datapool reached"), 1, "End of datapool reached"));
	this.addEventBehavior(new RPTEventStructure(new RPTReferenceEvent(), new RPTContinueEvent("Failed to extract reference"), 1, "Failed to extract reference"));
	this.addEventBehavior(new RPTEventStructure(new RPTSubstitutionEvent(), new RPTContinueEvent("Substitution failed"), 1, "Substitution failed"));
	this.addEventBehavior(new RPTEventStructure(new RPTServerTimeoutEvent(), new RPTContinueEvent("Timeout"), 1, "Timeout"));
	this.addEventBehavior(new RPTEventStructure(new RPTCustomCodeVPFailureEvent(), new RPTContinueEvent("Custom Verification Point failed"), 1, "Custom Verification Point failed"));
	this.addEventBehavior(new RPTEventStructure(new RPTCustomCodeAlertEvent(), new RPTContinueEvent("Custom Code reported an Alert"), 0, "Custom Code reported an Alert"));
	this.addEventBehavior(new RPTEventStructure(new RPTCustomCodeExceptionEvent(), new RPTStopUserEvent("Custom Code reported an unhandled exception"), 1, "Custom Code reported an unhandled exception"));
	}
	        	this.add(varAction_1(this));
	this.add(applicationContext_1(this));
			this.addFinally(new EndMoebStepBatchAction(this));

	    } catch (Throwable e) {
		     log("Test Execution: Chart_Problems_VerifyDiagnosis1Problem1DietaryNursingonChartReview_Test_A1E5FC10DEF013ACF33DB93666333631 ",e);
	    } finally {
	        super.execute();
		}	    
    }
    
	public void preFinish() {
		
		super.preFinish();
	}
	
	public void stop() {
		
		super.stop();
	}	
	
	private VariableAction varAction_1(final IContainer parent) {

	VariableAction vc = new VariableAction(parent, "", "A1E5EA2AE88E8B20F48EB36166393661");	
			vars[0] = new DataVar("Var_Diagnosis1", null, IDataArea.VIRTUALUSER, "IGNORE", false, false);

	
		vars[1] = new DataVar("Var_Problem1", null, IDataArea.VIRTUALUSER, "IGNORE", false, false);

		
	vc.add(vars);
	return vc;
	
}
	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_1(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "PowerChart",
												  "A1E5EA2AE8E07BA0F48EB36166393661",
												  "{\"variables\":[{\"id\":\"48\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"Var_Diagnosis1\",\"key\":\"MOEB_FIELD\\/TEX:A1E5F2AE3A552CFEE3F1E26563303839\\/TPM:A1E5F2AE3A552D02E3F1E26563303839\"},{\"id\":\"49\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"Var_Diagnosis1\",\"key\":\"MOEB_FIELD\\/TLC:A1E5EC78F6B1DBAFF8D5B73764643364\\/TPM:A1E5EC78F6B1DBB8F8D5B73764643364\\/WID:A1E5EC78F6B1DBB3F8D5B73764643364\\/TLC:A1E607E1A27EE500F6D1B63961313936\\/TPM:A1E607E1A27EE504F6D1B63961313936\\/WID:A1E607E1A27EE508F6D1B63961313936\\/IDB:A1E607E1A419F761F6D1B63961313936\"},{\"id\":\"50\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"Var_Problem1\",\"key\":\"MOEB_FIELD\\/TEX:A1E5EC78F791B4A5F8D5B73764643364\\/TPM:A1E5EC78F791B4A9F8D5B73764643364\"},{\"id\":\"51\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"Var_Problem1\",\"key\":\"MOEB_FIELD\\/TLC:A1E5FC1307B308BFF33DB93666333631\\/TPM:A1E5FC1307B308C5F33DB93666333631\\/WID:A1E5FC1307B308CFF33DB93666333631\\/IDB:A1E5FC1307B308DBF33DB93666333631\"}],\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"description\":\"Verify that <b>Text<\\/b> contains <b><subst key=\\\"MOEB_FIELD\\/TEX:A1E5F2AE3A552CFEE3F1E26563303839\\/TPM:A1E5F2AE3A552D02E3F1E26563303839\\\">Var_Diagnosis1<\\/subst><\\/b> on <b>Label<\\/b> below Label <b>'Problems'<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"2D1DC2D1DEB758FD884CB3B7930832CD\",\"timeout\":0,\"vpExpression\":{\"expression\":\"text\",\"parameter\":{\"$ref\":\"2\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"9\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceSimpleExpression\",\"translatedName\":\"Text\",\"operator\":\"TContains\"},\"uid\":\"A1E5F2AE3A552CF7E3F1E26563303839\",\"substitutionParameters\":[{\"name\":\"text\",\"variableKey\":\"MOEB_FIELD\\/TEX:A1E5F2AE3A552CFEE3F1E26563303839\\/TPM:A1E5F2AE3A552D02E3F1E26563303839\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Var_Diagnosis1\"}],\"isWeb\":false,\"id\":\"1\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVPUIObject\",\"retry\":false,\"object\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\",\"locator\":{\"parameter\":{\"name\":\"objectId\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TUIObject\",\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"name\":\"text\",\"id\":\"8\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Problems\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\"}},\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceLocator\",\"type\":\"LUnder\"}}},{\"description\":\"Verify that <b>Text<\\/b> contains <b><subst key=\\\"MOEB_FIELD\\/TEX:A1E5EC78F791B4A5F8D5B73764643364\\/TPM:A1E5EC78F791B4A9F8D5B73764643364\\\">Var_Problem1<\\/subst><\\/b> on <b>Label<\\/b> below Table view cell containing Label <b>'<subst key=\\\"MOEB_FIELD\\/TLC:A1E5EC78F6B1DBAFF8D5B73764643364\\/TPM:A1E5EC78F6B1DBB8F8D5B73764643364\\/WID:A1E5EC78F6B1DBB3F8D5B73764643364\\/TLC:A1E607E1A27EE500F6D1B63961313936\\/TPM:A1E607E1A27EE504F6D1B63961313936\\/WID:A1E607E1A27EE508F6D1B63961313936\\/IDB:A1E607E1A419F761F6D1B63961313936\\\">Var_Diagnosis1<\\/subst>'<\\/b>\",\"to_overriden\":true,\"skipScrollingIniOSDF\":false,\"application_uid\":\"2D1DC2D1DEB758FD884CB3B7930832CD\",\"timeout\":10,\"vpExpression\":{\"expression\":\"text\",\"parameter\":{\"$ref\":\"12\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"21\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceSimpleExpression\",\"translatedName\":\"Text\",\"operator\":\"TContains\"},\"uid\":\"A1E5EC78F791B49EF8D5B73764643364\",\"substitutionParameters\":[{\"name\":\"text\",\"variableKey\":\"MOEB_FIELD\\/TLC:A1E5EC78F6B1DBAFF8D5B73764643364\\/TPM:A1E5EC78F6B1DBB8F8D5B73764643364\\/WID:A1E5EC78F6B1DBB3F8D5B73764643364\\/TLC:A1E607E1A27EE500F6D1B63961313936\\/TPM:A1E607E1A27EE504F6D1B63961313936\\/WID:A1E607E1A27EE508F6D1B63961313936\\/IDB:A1E607E1A419F761F6D1B63961313936\",\"id\":\"11\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Var_Diagnosis1\"},{\"name\":\"text\",\"variableKey\":\"MOEB_FIELD\\/TEX:A1E5EC78F791B4A5F8D5B73764643364\\/TPM:A1E5EC78F791B4A9F8D5B73764643364\",\"id\":\"12\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Var_Problem1\"}],\"isWeb\":false,\"id\":\"10\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVPUIObject\",\"retry\":false,\"object\":{\"id\":\"13\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\",\"locator\":{\"parameter\":{\"name\":\"objectId\",\"id\":\"15\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TUIObject\",\"object\":{\"id\":\"16\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UITableViewCell\",\"locator\":{\"parameter\":{\"name\":\"objectId\",\"id\":\"18\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TUIObject\",\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"$ref\":\"11\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"20\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"19\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\"}},\"id\":\"17\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceLocator\",\"type\":\"LContain\"}}},\"id\":\"14\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceLocator\",\"type\":\"LUnder\"}}},{\"description\":\"Verify that <b>Text<\\/b> contains <b>DIETARY<\\/b> on <b>Label<\\/b> below Label whose <b>Text<\\/b> contains <b><subst key=\\\"MOEB_FIELD\\/TLC:A1E5FC1307B308BFF33DB93666333631\\/TPM:A1E5FC1307B308C5F33DB93666333631\\/WID:A1E5FC1307B308CFF33DB93666333631\\/IDB:A1E5FC1307B308DBF33DB93666333631\\\">Var_Problem1<\\/subst><\\/b> and to the left of Label whose <b>Text<\\/b> contains <b>Nursing<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"2D1DC2D1DEB758FD884CB3B7930832CD\",\"timeout\":0,\"vpExpression\":{\"expression\":\"text\",\"parameter\":{\"name\":\"text\",\"id\":\"35\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"DIETARY\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"34\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceSimpleExpression\",\"translatedName\":\"Text\",\"operator\":\"TContains\"},\"uid\":\"A1E5FC1307B308A3F33DB93666333631\",\"substitutionParameters\":[{\"name\":\"text\",\"variableKey\":\"MOEB_FIELD\\/TLC:A1E5FC1307B308BFF33DB93666333631\\/TPM:A1E5FC1307B308C5F33DB93666333631\\/WID:A1E5FC1307B308CFF33DB93666333631\\/IDB:A1E5FC1307B308DBF33DB93666333631\",\"id\":\"23\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Var_Problem1\"}],\"isWeb\":false,\"id\":\"22\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVPUIObject\",\"retry\":false,\"object\":{\"secondaryLocator\":{\"parameter\":{\"name\":\"objectId\",\"id\":\"30\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TUIObject\",\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"name\":\"text\",\"id\":\"33\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Nursing\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"32\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TContains\"},\"id\":\"31\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\"}},\"id\":\"29\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceLocator\",\"type\":\"LLeft\"},\"id\":\"24\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\",\"locator\":{\"parameter\":{\"name\":\"objectId\",\"id\":\"26\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TUIObject\",\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"$ref\":\"23\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"28\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TContains\"},\"id\":\"27\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\"}},\"id\":\"25\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceLocator\",\"type\":\"LUnder\"}}},{\"uid\":\"A1E5FC129A10A0AEF33DB93666333631\",\"isWeb\":false,\"description\":\"Verify that <b>Text<\\/b> contains <b>Nursing<\\/b> on <b>Label<\\/b> to the right of View containing Label <b>'DIETARY'<\\/b>\",\"id\":\"36\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVPUIObject\",\"application_uid\":\"2D1DC2D1DEB758FD884CB3B7930832CD\",\"timeout\":0,\"retry\":false,\"object\":{\"id\":\"37\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\",\"locator\":{\"parameter\":{\"name\":\"objectId\",\"id\":\"39\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TUIObject\",\"object\":{\"id\":\"40\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UIView\",\"locator\":{\"parameter\":{\"name\":\"objectId\",\"id\":\"42\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TUIObject\",\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"name\":\"text\",\"id\":\"45\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"DIETARY\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"44\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"43\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\"}},\"id\":\"41\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceLocator\",\"type\":\"LContain\"}}},\"id\":\"38\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceLocator\",\"type\":\"LRight\"}},\"vpExpression\":{\"expression\":\"text\",\"parameter\":{\"name\":\"text\",\"id\":\"47\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Nursing\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"46\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceSimpleExpression\",\"translatedName\":\"Text\",\"operator\":\"TContains\"}}],\"timeout\":10}",
												  null,
												  null,
												  "<default>");
		IDataSub subContainer_1 = new DataSub();
		stepBatch.addDataSub(subContainer_1);
	ISubRule sub_0 = new SubRule("MOEB_FIELD/TEX:A1E5F2AE3A552CFEE3F1E26563303839/TPM:A1E5F2AE3A552D02E3F1E26563303839", 0, 14, false, (IDCCoreVar)vars[0], false, "Var_Diagnosis1_2", null, 0, false);
	subContainer_1.addSubInstruction(sub_0);
	
	ISubRule sub_1 = new SubRule("MOEB_FIELD/TLC:A1E5EC78F6B1DBAFF8D5B73764643364/TPM:A1E5EC78F6B1DBB8F8D5B73764643364/WID:A1E5EC78F6B1DBB3F8D5B73764643364/TLC:A1E607E1A27EE500F6D1B63961313936/TPM:A1E607E1A27EE504F6D1B63961313936/WID:A1E607E1A27EE508F6D1B63961313936/IDB:A1E607E1A419F761F6D1B63961313936", 0, 14, false, (IDCCoreVar)vars[0], false, "Var_Diagnosis1", null, 0, false);
	subContainer_1.addSubInstruction(sub_1);
	
	ISubRule sub_2 = new SubRule("MOEB_FIELD/TEX:A1E5EC78F791B4A5F8D5B73764643364/TPM:A1E5EC78F791B4A9F8D5B73764643364", 0, 12, false, (IDCCoreVar)vars[1], false, "Var_Problem1_2", null, 0, false);
	subContainer_1.addSubInstruction(sub_2);
	
	ISubRule sub_3 = new SubRule("MOEB_FIELD/TLC:A1E5FC1307B308BFF33DB93666333631/TPM:A1E5FC1307B308C5F33DB93666333631/WID:A1E5FC1307B308CFF33DB93666333631/IDB:A1E5FC1307B308DBF33DB93666333631", 0, 12, false, (IDCCoreVar)vars[1], false, "Var_Problem1", null, 0, false);
	subContainer_1.addSubInstruction(sub_3);
	


		return stepBatch;
	}

}
