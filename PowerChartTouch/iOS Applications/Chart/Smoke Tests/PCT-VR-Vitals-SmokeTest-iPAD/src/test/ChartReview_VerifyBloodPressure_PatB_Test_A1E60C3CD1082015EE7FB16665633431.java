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
public class ChartReview_VerifyBloodPressure_PatB_Test_A1E60C3CD1082015EE7FB16665633431 extends LTTestScript  {

    static ProtoAdapterHandler pa = new ProtoAdapterHandler();
    static {           
        pa.addPA("com.ibm.rational.test.lt.datacorrelation.execution.protocol.core.CoreProtoAdapter", "coreAdapter");
pa.addPA("com.ibm.rational.test.lt.execution.moeb.dc.MoebDataAdapter", "com.ibm.rational.test.lt.execution.moeb.action.MoebStepBatchAction");
    }
	
	private DataVar[] vars = new DataVar[2];
	
    
    
	
	public ChartReview_VerifyBloodPressure_PatB_Test_A1E60C3CD1082015EE7FB16665633431(IContainer container, String invocationId) {
		super(container, "ChartReview_VerifyBloodPressure_PatB", invocationId, "A1E60C3CD1082015EE7FB16665633431");
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
		     log("Test Execution: ChartReview_VerifyBloodPressure_PatB_Test_A1E60C3CD1082015EE7FB16665633431 ",e);
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

	VariableAction vc = new VariableAction(parent, "", "A1E5E072C2BA971EE43DB13337353663");	
			vars[0] = new DataVar("Var_BP_Systolic_PatB", null, IDataArea.VIRTUALUSER, "WARNING", false, false);

	
		vars[1] = new DataVar("Var_BP_Diastolic_PatB", null, IDataArea.VIRTUALUSER, "WARNING", false, false);

		
	vc.add(vars);
	return vc;
	
}
	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_1(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Ambulatory",
												  "A1E5EA6C47D3D260CC60B03461646165",
												  "{\"variables\":[{\"id\":\"49\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"Systolic_Value\",\"key\":\"MOEB_FIELD\\/IDB:A1E5E08642B5AC30E43DB13337353663\"},{\"id\":\"50\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"Systolic_Value\",\"key\":\"MOEB_FIELD\\/TEX:A1E5E086363CC575E43DB13337353663\\/TPM:A1E5E086363CC579E43DB13337353663\"},{\"id\":\"51\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"Diastolic_Value\",\"key\":\"MOEB_FIELD\\/IDB:A1E5E0866D3F90B0E43DB13337353663\"},{\"id\":\"52\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"Diastolic_Value\",\"key\":\"MOEB_FIELD\\/TEX:A1E5E08666F267F7E43DB13337353663\\/TPM:A1E5E08666F267FBE43DB13337353663\"}],\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"uid\":\"A1E5E07C31049AAFE43DB13337353663\",\"isWeb\":false,\"description\":\"Verify that <b>Text<\\/b> equals <b>Blood Pressure<\\/b> on <b>Label<\\/b> <b>'Blood Pressure'<\\/b> to the left of Label <b>'Height'<\\/b> and above Label <b>'Body Mass Index'<\\/b>\",\"id\":\"1\",\"to_overriden\":true,\"skipScrollingIniOSDF\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVPUIObject\",\"application_uid\":\"550EB7B70A7BD58D6A6A0A9309E667BC\",\"timeout\":30,\"retry\":false,\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"name\":\"text\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Blood Pressure\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"secondaryLocator\":{\"parameter\":{\"name\":\"objectId\",\"id\":\"11\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TUIObject\",\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"name\":\"text\",\"id\":\"14\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Body Mass Index\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"13\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"12\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\"}},\"id\":\"10\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceLocator\",\"type\":\"LAbove\"},\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\",\"locator\":{\"parameter\":{\"name\":\"objectId\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TUIObject\",\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"name\":\"text\",\"id\":\"9\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Height\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"8\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\"}},\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceLocator\",\"type\":\"LLeft\"}},\"vpExpression\":{\"expression\":\"text\",\"parameter\":{\"name\":\"text\",\"id\":\"16\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Blood Pressure\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"15\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceSimpleExpression\",\"translatedName\":\"Text\",\"operator\":\"TEquals\"}},{\"description\":\"Verify that <b>Text<\\/b> equals <b><subst key=\\\"MOEB_FIELD\\/TEX:A1E5E086363CC575E43DB13337353663\\/TPM:A1E5E086363CC579E43DB13337353663\\\">Systolic_Value<\\/subst><\\/b> on <b>Label<\\/b> <b>'<subst key=\\\"MOEB_FIELD\\/IDB:A1E5E08642B5AC30E43DB13337353663\\\">Systolic_Value<\\/subst>'<\\/b> to the left of Label <b>'Height'<\\/b> and to the right of Label <b>'Blood Pressure'<\\/b>\",\"to_overriden\":true,\"skipScrollingIniOSDF\":false,\"application_uid\":\"550EB7B70A7BD58D6A6A0A9309E667BC\",\"timeout\":30,\"vpExpression\":{\"expression\":\"text\",\"parameter\":{\"$ref\":\"19\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"32\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceSimpleExpression\",\"translatedName\":\"Text\",\"operator\":\"TEquals\"},\"uid\":\"A1E5E086363CC56EE43DB13337353663\",\"substitutionParameters\":[{\"name\":\"text\",\"variableKey\":\"MOEB_FIELD\\/IDB:A1E5E08642B5AC30E43DB13337353663\",\"id\":\"18\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Systolic_Value\"},{\"name\":\"text\",\"variableKey\":\"MOEB_FIELD\\/TEX:A1E5E086363CC575E43DB13337353663\\/TPM:A1E5E086363CC579E43DB13337353663\",\"id\":\"19\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Systolic_Value\"}],\"isWeb\":false,\"id\":\"17\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVPUIObject\",\"retry\":false,\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"$ref\":\"18\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"21\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"secondaryLocator\":{\"parameter\":{\"name\":\"objectId\",\"id\":\"28\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TUIObject\",\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"name\":\"text\",\"id\":\"31\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Blood Pressure\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"30\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"29\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\"}},\"id\":\"27\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceLocator\",\"type\":\"LRight\"},\"id\":\"20\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\",\"locator\":{\"parameter\":{\"name\":\"objectId\",\"id\":\"23\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TUIObject\",\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"name\":\"text\",\"id\":\"26\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Height\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"25\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"24\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\"}},\"id\":\"22\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceLocator\",\"type\":\"LLeft\"}}},{\"description\":\"Verify that <b>Text<\\/b> equals <b><subst key=\\\"MOEB_FIELD\\/TEX:A1E5E08666F267F7E43DB13337353663\\/TPM:A1E5E08666F267FBE43DB13337353663\\\">Diastolic_Value<\\/subst><\\/b> on <b>Label<\\/b> <b>'<subst key=\\\"MOEB_FIELD\\/IDB:A1E5E0866D3F90B0E43DB13337353663\\\">Diastolic_Value<\\/subst>'<\\/b> to the right of Label <b>'Blood Pressure'<\\/b> and to the left of Label <b>'Height'<\\/b>\",\"to_overriden\":true,\"skipScrollingIniOSDF\":false,\"application_uid\":\"550EB7B70A7BD58D6A6A0A9309E667BC\",\"timeout\":30,\"vpExpression\":{\"expression\":\"text\",\"parameter\":{\"$ref\":\"35\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"48\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceSimpleExpression\",\"translatedName\":\"Text\",\"operator\":\"TEquals\"},\"uid\":\"A1E5E08666F267F0E43DB13337353663\",\"substitutionParameters\":[{\"name\":\"text\",\"variableKey\":\"MOEB_FIELD\\/IDB:A1E5E0866D3F90B0E43DB13337353663\",\"id\":\"34\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Diastolic_Value\"},{\"name\":\"text\",\"variableKey\":\"MOEB_FIELD\\/TEX:A1E5E08666F267F7E43DB13337353663\\/TPM:A1E5E08666F267FBE43DB13337353663\",\"id\":\"35\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Diastolic_Value\"}],\"isWeb\":false,\"id\":\"33\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVPUIObject\",\"retry\":false,\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"$ref\":\"34\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"37\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"secondaryLocator\":{\"parameter\":{\"name\":\"objectId\",\"id\":\"44\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TUIObject\",\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"name\":\"text\",\"id\":\"47\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Height\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"46\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"45\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\"}},\"id\":\"43\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceLocator\",\"type\":\"LLeft\"},\"id\":\"36\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\",\"locator\":{\"parameter\":{\"name\":\"objectId\",\"id\":\"39\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TUIObject\",\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"name\":\"text\",\"id\":\"42\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Blood Pressure\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"41\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"40\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\"}},\"id\":\"38\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceLocator\",\"type\":\"LRight\"}}}],\"timeout\":10}",
												  null,
												  null,
												  "<default>");
		IDataSub subContainer_1 = new DataSub();
		stepBatch.addDataSub(subContainer_1);
	ISubRule sub_0 = new SubRule("MOEB_FIELD/IDB:A1E5E08642B5AC30E43DB13337353663", 0, 14, false, (IDCCoreVar)vars[0], false, "Systolic_Value", null, 0, false);
	subContainer_1.addSubInstruction(sub_0);
	
	ISubRule sub_1 = new SubRule("MOEB_FIELD/TEX:A1E5E086363CC575E43DB13337353663/TPM:A1E5E086363CC579E43DB13337353663", 0, 14, false, (IDCCoreVar)vars[0], false, "Systolic_Value", null, 0, false);
	subContainer_1.addSubInstruction(sub_1);
	
	ISubRule sub_2 = new SubRule("MOEB_FIELD/IDB:A1E5E0866D3F90B0E43DB13337353663", 0, 15, false, (IDCCoreVar)vars[1], false, "Diastolic_Value", null, 0, false);
	subContainer_1.addSubInstruction(sub_2);
	
	ISubRule sub_3 = new SubRule("MOEB_FIELD/TEX:A1E5E08666F267F7E43DB13337353663/TPM:A1E5E08666F267FBE43DB13337353663", 0, 15, false, (IDCCoreVar)vars[1], false, "Diastolic_Value", null, 0, false);
	subContainer_1.addSubInstruction(sub_3);
	


		return stepBatch;
	}

}
