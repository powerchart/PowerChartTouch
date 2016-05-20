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
public class ExpandedDemographicsBanner_Verify_PreferredPharmacy_iPad_Test_A1E5F0B97544D76BD7E1E53436373330 extends LTTestScript  {

    static ProtoAdapterHandler pa = new ProtoAdapterHandler();
    static {           
        pa.addPA("com.ibm.rational.test.lt.datacorrelation.execution.protocol.core.CoreProtoAdapter", "coreAdapter");
pa.addPA("com.ibm.rational.test.lt.execution.moeb.dc.MoebDataAdapter", "com.ibm.rational.test.lt.execution.moeb.action.MoebStepBatchAction");
    }
	
	private DataVar[] vars = new DataVar[4];
	
    
    
	
	public ExpandedDemographicsBanner_Verify_PreferredPharmacy_iPad_Test_A1E5F0B97544D76BD7E1E53436373330(IContainer container, String invocationId) {
		super(container, "ExpandedDemographicsBanner_Verify_PreferredPharmacy_iPad", invocationId, "A1E5F0B97544D76BD7E1E53436373330");
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
		     log("Test Execution: ExpandedDemographicsBanner_Verify_PreferredPharmacy_iPad_Test_A1E5F0B97544D76BD7E1E53436373330 ",e);
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

	VariableAction vc = new VariableAction(parent, "", "A1E5E108E2BFD993DB93B83565626163");	
			vars[0] = new DataVar("Var_Pharmacy_name_value", null, IDataArea.VIRTUALUSER, "FATAL", false, false);

	
		vars[1] = new DataVar("Var_Pharmacy_phone_value", null, IDataArea.VIRTUALUSER, "INFO", true, false);

	
		vars[2] = new DataVar("Var_Pharmacy_fax_value", null, IDataArea.VIRTUALUSER, "INFO", false, false);

	
		vars[3] = new DataVar("Var_Pharmacy_address_value", "", IDataArea.VIRTUALUSER, "INFO", false, false);

		
	vc.add(vars);
	return vc;
	
}
	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_1(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Ambulatory",
												  "A1E5E11B96DA3E80D175E46437306234",
												  "{\"variables\":[{\"id\":\"113\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"Pharmacy name\\n\\n\\n\\n\",\"key\":\"MOEB_FIELD\\/STL:A1E5F00EF1EA2339C4DFB46533363364\\/TPM:A1E5F00EF1EA233FC4DFB46533363364\\/WID:A1E5F00EF1EA2349C4DFB46533363364\\/IDB:A1E5F00EF1EA2353C4DFB46533363364\"},{\"id\":\"114\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"Pharmacy name\",\"key\":\"MOEB_FIELD\\/IDB:A1E5F00EF1EA4A33C4DFB46533363364\"},{\"id\":\"115\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"Pharmacy name\",\"key\":\"MOEB_FIELD\\/TEX:A1E5F00EF1EA716BC4DFB46533363364\\/TPM:A1E5F00EF1EA7171C4DFB46533363364\"},{\"id\":\"116\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"Pharmacy name\",\"key\":\"MOEB_FIELD\\/TLC:A1E5F00EF1EA985FC4DFB46533363364\\/TPM:A1E5F00EF1EA9865C4DFB46533363364\\/WID:A1E5F00EF1EA986FC4DFB46533363364\\/IDB:A1E5F00EF1EA9879C4DFB46533363364\"},{\"id\":\"117\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"Pharmacy phone\",\"key\":\"MOEB_FIELD\\/STL:A1E5F00EF1EA9885C4DFB46533363364\\/TPM:A1E5F00EF1EA988BC4DFB46533363364\\/WID:A1E5F00EF1EABF50C4DFB46533363364\\/IDB:A1E5F00EF1EABF5AC4DFB46533363364\"},{\"id\":\"118\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"fax value\",\"key\":\"MOEB_FIELD\\/STL:A1E5F00EF1EB34C5C4DFB46533363364\\/TPM:A1E5F00EF1EB34CBC4DFB46533363364\\/WID:A1E5F00EF1EB34D5C4DFB46533363364\\/IDB:A1E5F00EF1EB34E1C4DFB46533363364\"},{\"id\":\"119\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"fax value\",\"key\":\"MOEB_FIELD\\/TLC:A1E5F00EF1EB82BFC4DFB46533363364\\/TPM:A1E5F00EF1EB82C5C4DFB46533363364\\/WID:A1E5F00EF1EB82CFC4DFB46533363364\\/IDB:A1E5F00EF1EB82D9C4DFB46533363364\"},{\"id\":\"120\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"address value\",\"key\":\"MOEB_FIELD\\/STL:A1E5F00EF1EB82E5C4DFB46533363364\\/TPM:A1E5F00EF1EB82EBC4DFB46533363364\\/WID:A1E5F00EF1EB82F5C4DFB46533363364\\/IDB:A1E5F00EF1EB82FFC4DFB46533363364\"},{\"id\":\"121\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"fax value\",\"key\":\"MOEB_FIELD\\/IDB:A1E5F00EF1EBF7E3C4DFB46533363364\"},{\"id\":\"122\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"fax value\",\"key\":\"MOEB_FIELD\\/TEX:A1E5F00EF1EC1EFBC4DFB46533363364\\/TPM:A1E5F00EF1EC1F01C4DFB46533363364\"}],\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"uid\":\"A1E5F00EF1E9D4F3C4DFB46533363364\",\"isWeb\":false,\"description\":\"Verify that <b>Text<\\/b> equals <b>Preferred Pharmacy<\\/b> on <b>Label<\\/b> <b>'Preferred Pharmacy'<\\/b> to the right of Label <b>'Encounter Details'<\\/b> and above Label <b>'Pharmacy'<\\/b>\",\"id\":\"1\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVPUIObject\",\"application_uid\":\"550EB7B70A7BD58D6A6A0A9309E667BC\",\"timeout\":0,\"retry\":false,\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"name\":\"text\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Preferred Pharmacy\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"secondaryLocator\":{\"parameter\":{\"name\":\"objectId\",\"id\":\"11\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TUIObject\",\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"name\":\"text\",\"id\":\"14\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Pharmacy\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"13\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"12\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\"}},\"id\":\"10\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceLocator\",\"type\":\"LAbove\"},\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\",\"locator\":{\"parameter\":{\"name\":\"objectId\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TUIObject\",\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"name\":\"text\",\"id\":\"9\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Encounter Details\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"8\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\"}},\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceLocator\",\"type\":\"LRight\"}},\"vpExpression\":{\"expression\":\"text\",\"parameter\":{\"name\":\"text\",\"id\":\"16\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Preferred Pharmacy\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"15\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceSimpleExpression\",\"translatedName\":\"Text\",\"operator\":\"TEquals\"}},{\"description\":\"Verify that <b>Text<\\/b> equals <b>Pharmacy<\\/b> on <b>Label<\\/b> <b>'Pharmacy'<\\/b> below Label <b>'Preferred Pharmacy'<\\/b> and above Label <b>'<subst key=\\\"MOEB_FIELD\\/STL:A1E5F00EF1EA2339C4DFB46533363364\\/TPM:A1E5F00EF1EA233FC4DFB46533363364\\/WID:A1E5F00EF1EA2349C4DFB46533363364\\/IDB:A1E5F00EF1EA2353C4DFB46533363364\\\">Pharmacy name <\\/subst>'<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"550EB7B70A7BD58D6A6A0A9309E667BC\",\"timeout\":0,\"vpExpression\":{\"expression\":\"text\",\"parameter\":{\"name\":\"text\",\"id\":\"32\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Pharmacy\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"31\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceSimpleExpression\",\"translatedName\":\"Text\",\"operator\":\"TEquals\"},\"uid\":\"A1E5F00EF1E9FC7DC4DFB46533363364\",\"substitutionParameters\":[{\"name\":\"text\",\"variableKey\":\"MOEB_FIELD\\/STL:A1E5F00EF1EA2339C4DFB46533363364\\/TPM:A1E5F00EF1EA233FC4DFB46533363364\\/WID:A1E5F00EF1EA2349C4DFB46533363364\\/IDB:A1E5F00EF1EA2353C4DFB46533363364\",\"id\":\"18\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Pharmacy name\\n\\n\\n\\n\"}],\"isWeb\":false,\"id\":\"17\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVPUIObject\",\"retry\":false,\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"name\":\"text\",\"id\":\"21\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Pharmacy\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"20\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"secondaryLocator\":{\"parameter\":{\"name\":\"objectId\",\"id\":\"28\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TUIObject\",\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"$ref\":\"18\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"30\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"29\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\"}},\"id\":\"27\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceLocator\",\"type\":\"LAbove\"},\"id\":\"19\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\",\"locator\":{\"parameter\":{\"name\":\"objectId\",\"id\":\"23\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TUIObject\",\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"name\":\"text\",\"id\":\"26\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Preferred Pharmacy\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"25\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"24\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\"}},\"id\":\"22\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceLocator\",\"type\":\"LUnder\"}}},{\"description\":\"Verify that <b>Text<\\/b> equals <b><subst key=\\\"MOEB_FIELD\\/TEX:A1E5F00EF1EA716BC4DFB46533363364\\/TPM:A1E5F00EF1EA7171C4DFB46533363364\\\">Pharmacy name<\\/subst><\\/b> on <b>Label<\\/b> <b>'<subst key=\\\"MOEB_FIELD\\/IDB:A1E5F00EF1EA4A33C4DFB46533363364\\\">Pharmacy name<\\/subst>'<\\/b> below Label <b>'Pharmacy'<\\/b> and above Label <b>'Phone'<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"550EB7B70A7BD58D6A6A0A9309E667BC\",\"timeout\":0,\"vpExpression\":{\"expression\":\"text\",\"parameter\":{\"$ref\":\"35\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"48\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceSimpleExpression\",\"translatedName\":\"Text\",\"operator\":\"TEquals\"},\"uid\":\"A1E5F00EF1EA4A23C4DFB46533363364\",\"substitutionParameters\":[{\"name\":\"text\",\"variableKey\":\"MOEB_FIELD\\/IDB:A1E5F00EF1EA4A33C4DFB46533363364\",\"id\":\"34\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Pharmacy name\"},{\"name\":\"text\",\"variableKey\":\"MOEB_FIELD\\/TEX:A1E5F00EF1EA716BC4DFB46533363364\\/TPM:A1E5F00EF1EA7171C4DFB46533363364\",\"id\":\"35\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Pharmacy name\"}],\"isWeb\":false,\"id\":\"33\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVPUIObject\",\"retry\":false,\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"$ref\":\"34\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"37\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"secondaryLocator\":{\"parameter\":{\"name\":\"objectId\",\"id\":\"44\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TUIObject\",\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"name\":\"text\",\"id\":\"47\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Phone\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"46\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"45\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\"}},\"id\":\"43\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceLocator\",\"type\":\"LAbove\"},\"id\":\"36\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\",\"locator\":{\"parameter\":{\"name\":\"objectId\",\"id\":\"39\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TUIObject\",\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"name\":\"text\",\"id\":\"42\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Pharmacy\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"41\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"40\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\"}},\"id\":\"38\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceLocator\",\"type\":\"LUnder\"}}},{\"description\":\"Verify that <b>Text<\\/b> equals <b>Phone<\\/b> on <b>Label<\\/b> <b>'Phone'<\\/b> below Label <b>'<subst key=\\\"MOEB_FIELD\\/TLC:A1E5F00EF1EA985FC4DFB46533363364\\/TPM:A1E5F00EF1EA9865C4DFB46533363364\\/WID:A1E5F00EF1EA986FC4DFB46533363364\\/IDB:A1E5F00EF1EA9879C4DFB46533363364\\\">Pharmacy name<\\/subst>'<\\/b> and above Label <b>'<subst key=\\\"MOEB_FIELD\\/STL:A1E5F00EF1EA9885C4DFB46533363364\\/TPM:A1E5F00EF1EA988BC4DFB46533363364\\/WID:A1E5F00EF1EABF50C4DFB46533363364\\/IDB:A1E5F00EF1EABF5AC4DFB46533363364\\\">Pharmacy phone<\\/subst>'<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"550EB7B70A7BD58D6A6A0A9309E667BC\",\"timeout\":0,\"vpExpression\":{\"expression\":\"text\",\"parameter\":{\"name\":\"text\",\"id\":\"64\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Phone\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"63\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceSimpleExpression\",\"translatedName\":\"Text\",\"operator\":\"TEquals\"},\"uid\":\"A1E5F00EF1EA9843C4DFB46533363364\",\"substitutionParameters\":[{\"name\":\"text\",\"variableKey\":\"MOEB_FIELD\\/TLC:A1E5F00EF1EA985FC4DFB46533363364\\/TPM:A1E5F00EF1EA9865C4DFB46533363364\\/WID:A1E5F00EF1EA986FC4DFB46533363364\\/IDB:A1E5F00EF1EA9879C4DFB46533363364\",\"id\":\"50\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Pharmacy name\"},{\"name\":\"text\",\"variableKey\":\"MOEB_FIELD\\/STL:A1E5F00EF1EA9885C4DFB46533363364\\/TPM:A1E5F00EF1EA988BC4DFB46533363364\\/WID:A1E5F00EF1EABF50C4DFB46533363364\\/IDB:A1E5F00EF1EABF5AC4DFB46533363364\",\"id\":\"51\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Pharmacy phone\"}],\"isWeb\":false,\"id\":\"49\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVPUIObject\",\"retry\":false,\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"name\":\"text\",\"id\":\"54\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Phone\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"53\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"secondaryLocator\":{\"parameter\":{\"name\":\"objectId\",\"id\":\"60\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TUIObject\",\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"$ref\":\"51\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"62\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"61\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\"}},\"id\":\"59\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceLocator\",\"type\":\"LAbove\"},\"id\":\"52\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\",\"locator\":{\"parameter\":{\"name\":\"objectId\",\"id\":\"56\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TUIObject\",\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"$ref\":\"50\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"58\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"57\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\"}},\"id\":\"55\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceLocator\",\"type\":\"LUnder\"}}},{\"description\":\"Verify that <b>Text<\\/b> equals <b>Fax<\\/b> on <b>Label<\\/b> <b>'Fax'<\\/b> to the right of Label <b>'Insurance Information'<\\/b> and above Label <b>'<subst key=\\\"MOEB_FIELD\\/STL:A1E5F00EF1EB34C5C4DFB46533363364\\/TPM:A1E5F00EF1EB34CBC4DFB46533363364\\/WID:A1E5F00EF1EB34D5C4DFB46533363364\\/IDB:A1E5F00EF1EB34E1C4DFB46533363364\\\">fax value<\\/subst>'<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"550EB7B70A7BD58D6A6A0A9309E667BC\",\"timeout\":0,\"vpExpression\":{\"expression\":\"text\",\"parameter\":{\"name\":\"text\",\"id\":\"80\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Fax\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"79\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceSimpleExpression\",\"translatedName\":\"Text\",\"operator\":\"TEquals\"},\"uid\":\"A1E5F00EF1EB3483C4DFB46533363364\",\"substitutionParameters\":[{\"name\":\"text\",\"variableKey\":\"MOEB_FIELD\\/STL:A1E5F00EF1EB34C5C4DFB46533363364\\/TPM:A1E5F00EF1EB34CBC4DFB46533363364\\/WID:A1E5F00EF1EB34D5C4DFB46533363364\\/IDB:A1E5F00EF1EB34E1C4DFB46533363364\",\"id\":\"66\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"fax value\"}],\"isWeb\":false,\"id\":\"65\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVPUIObject\",\"retry\":false,\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"name\":\"text\",\"id\":\"69\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Fax\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"68\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"secondaryLocator\":{\"parameter\":{\"name\":\"objectId\",\"id\":\"76\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TUIObject\",\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"$ref\":\"66\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"78\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"77\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\"}},\"id\":\"75\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceLocator\",\"type\":\"LAbove\"},\"id\":\"67\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\",\"locator\":{\"parameter\":{\"name\":\"objectId\",\"id\":\"71\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TUIObject\",\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"name\":\"text\",\"id\":\"74\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Insurance Information\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"73\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"72\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\"}},\"id\":\"70\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceLocator\",\"type\":\"LRight\"}}},{\"description\":\"Verify that <b>Text<\\/b> equals <b>Address<\\/b> on <b>Label<\\/b> <b>'Address'<\\/b> below Label <b>'<subst key=\\\"MOEB_FIELD\\/TLC:A1E5F00EF1EB82BFC4DFB46533363364\\/TPM:A1E5F00EF1EB82C5C4DFB46533363364\\/WID:A1E5F00EF1EB82CFC4DFB46533363364\\/IDB:A1E5F00EF1EB82D9C4DFB46533363364\\\">fax value<\\/subst>'<\\/b> and above Label <b>'<subst key=\\\"MOEB_FIELD\\/STL:A1E5F00EF1EB82E5C4DFB46533363364\\/TPM:A1E5F00EF1EB82EBC4DFB46533363364\\/WID:A1E5F00EF1EB82F5C4DFB46533363364\\/IDB:A1E5F00EF1EB82FFC4DFB46533363364\\\">address value<\\/subst>'<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"550EB7B70A7BD58D6A6A0A9309E667BC\",\"timeout\":0,\"vpExpression\":{\"expression\":\"text\",\"parameter\":{\"name\":\"text\",\"id\":\"96\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Address\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"95\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceSimpleExpression\",\"translatedName\":\"Text\",\"operator\":\"TEquals\"},\"uid\":\"A1E5F00EF1EB82A3C4DFB46533363364\",\"substitutionParameters\":[{\"name\":\"text\",\"variableKey\":\"MOEB_FIELD\\/TLC:A1E5F00EF1EB82BFC4DFB46533363364\\/TPM:A1E5F00EF1EB82C5C4DFB46533363364\\/WID:A1E5F00EF1EB82CFC4DFB46533363364\\/IDB:A1E5F00EF1EB82D9C4DFB46533363364\",\"id\":\"82\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"fax value\"},{\"name\":\"text\",\"variableKey\":\"MOEB_FIELD\\/STL:A1E5F00EF1EB82E5C4DFB46533363364\\/TPM:A1E5F00EF1EB82EBC4DFB46533363364\\/WID:A1E5F00EF1EB82F5C4DFB46533363364\\/IDB:A1E5F00EF1EB82FFC4DFB46533363364\",\"id\":\"83\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"address value\"}],\"isWeb\":false,\"id\":\"81\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVPUIObject\",\"retry\":false,\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"name\":\"text\",\"id\":\"86\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Address\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"85\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"secondaryLocator\":{\"parameter\":{\"name\":\"objectId\",\"id\":\"92\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TUIObject\",\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"$ref\":\"83\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"94\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"93\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\"}},\"id\":\"91\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceLocator\",\"type\":\"LAbove\"},\"id\":\"84\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\",\"locator\":{\"parameter\":{\"name\":\"objectId\",\"id\":\"88\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TUIObject\",\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"$ref\":\"82\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"90\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"89\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\"}},\"id\":\"87\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceLocator\",\"type\":\"LUnder\"}}},{\"description\":\"Verify that <b>Text<\\/b> equals <b><subst key=\\\"MOEB_FIELD\\/TEX:A1E5F00EF1EC1EFBC4DFB46533363364\\/TPM:A1E5F00EF1EC1F01C4DFB46533363364\\\">fax value<\\/subst><\\/b> on <b>Label<\\/b> <b>'<subst key=\\\"MOEB_FIELD\\/IDB:A1E5F00EF1EBF7E3C4DFB46533363364\\\">fax value<\\/subst>'<\\/b> below Label <b>'Fax'<\\/b> and above Label <b>'Address'<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"550EB7B70A7BD58D6A6A0A9309E667BC\",\"timeout\":0,\"vpExpression\":{\"expression\":\"text\",\"parameter\":{\"$ref\":\"99\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"112\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceSimpleExpression\",\"translatedName\":\"Text\",\"operator\":\"TEquals\"},\"uid\":\"A1E5F00EF1EBF7D3C4DFB46533363364\",\"substitutionParameters\":[{\"name\":\"text\",\"variableKey\":\"MOEB_FIELD\\/IDB:A1E5F00EF1EBF7E3C4DFB46533363364\",\"id\":\"98\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"fax value\"},{\"name\":\"text\",\"variableKey\":\"MOEB_FIELD\\/TEX:A1E5F00EF1EC1EFBC4DFB46533363364\\/TPM:A1E5F00EF1EC1F01C4DFB46533363364\",\"id\":\"99\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"fax value\"}],\"isWeb\":false,\"id\":\"97\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVPUIObject\",\"retry\":false,\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"$ref\":\"98\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"101\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"secondaryLocator\":{\"parameter\":{\"name\":\"objectId\",\"id\":\"108\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TUIObject\",\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"name\":\"text\",\"id\":\"111\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Address\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"110\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"109\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\"}},\"id\":\"107\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceLocator\",\"type\":\"LAbove\"},\"id\":\"100\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\",\"locator\":{\"parameter\":{\"name\":\"objectId\",\"id\":\"103\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TUIObject\",\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"name\":\"text\",\"id\":\"106\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Fax\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"105\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"104\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\"}},\"id\":\"102\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceLocator\",\"type\":\"LUnder\"}}}],\"timeout\":10}",
												  null,
												  null,
												  "<default>");
		IDataSub subContainer_1 = new DataSub();
		stepBatch.addDataSub(subContainer_1);
	ISubRule sub_0 = new SubRule("MOEB_FIELD/STL:A1E5F00EF1EA2339C4DFB46533363364/TPM:A1E5F00EF1EA233FC4DFB46533363364/WID:A1E5F00EF1EA2349C4DFB46533363364/IDB:A1E5F00EF1EA2353C4DFB46533363364", 0, 13, false, (IDCCoreVar)vars[0], false, "Pharmacy name", null, 0, false);
	subContainer_1.addSubInstruction(sub_0);
	
	ISubRule sub_1 = new SubRule("MOEB_FIELD/IDB:A1E5F00EF1EA4A33C4DFB46533363364", 0, 13, false, (IDCCoreVar)vars[0], false, "Pharmacy name", null, 0, false);
	subContainer_1.addSubInstruction(sub_1);
	
	ISubRule sub_2 = new SubRule("MOEB_FIELD/TEX:A1E5F00EF1EA716BC4DFB46533363364/TPM:A1E5F00EF1EA7171C4DFB46533363364", 0, 13, false, (IDCCoreVar)vars[0], false, "Pharmacy name", null, 0, false);
	subContainer_1.addSubInstruction(sub_2);
	
	ISubRule sub_3 = new SubRule("MOEB_FIELD/TLC:A1E5F00EF1EA985FC4DFB46533363364/TPM:A1E5F00EF1EA9865C4DFB46533363364/WID:A1E5F00EF1EA986FC4DFB46533363364/IDB:A1E5F00EF1EA9879C4DFB46533363364", 0, 13, false, (IDCCoreVar)vars[0], false, "Pharmacy name", null, 0, false);
	subContainer_1.addSubInstruction(sub_3);
	
	ISubRule sub_4 = new SubRule("MOEB_FIELD/STL:A1E5F00EF1EA9885C4DFB46533363364/TPM:A1E5F00EF1EA988BC4DFB46533363364/WID:A1E5F00EF1EABF50C4DFB46533363364/IDB:A1E5F00EF1EABF5AC4DFB46533363364", 0, 14, false, (IDCCoreVar)vars[1], false, "Pharmacy phone", null, 0, false);
	subContainer_1.addSubInstruction(sub_4);
	
	ISubRule sub_5 = new SubRule("MOEB_FIELD/STL:A1E5F00EF1EB34C5C4DFB46533363364/TPM:A1E5F00EF1EB34CBC4DFB46533363364/WID:A1E5F00EF1EB34D5C4DFB46533363364/IDB:A1E5F00EF1EB34E1C4DFB46533363364", 0, 9, false, (IDCCoreVar)vars[2], false, "fax value", null, 0, false);
	subContainer_1.addSubInstruction(sub_5);
	
	ISubRule sub_6 = new SubRule("MOEB_FIELD/TLC:A1E5F00EF1EB82BFC4DFB46533363364/TPM:A1E5F00EF1EB82C5C4DFB46533363364/WID:A1E5F00EF1EB82CFC4DFB46533363364/IDB:A1E5F00EF1EB82D9C4DFB46533363364", 0, 9, false, (IDCCoreVar)vars[2], false, "fax value", null, 0, false);
	subContainer_1.addSubInstruction(sub_6);
	
	ISubRule sub_7 = new SubRule("MOEB_FIELD/STL:A1E5F00EF1EB82E5C4DFB46533363364/TPM:A1E5F00EF1EB82EBC4DFB46533363364/WID:A1E5F00EF1EB82F5C4DFB46533363364/IDB:A1E5F00EF1EB82FFC4DFB46533363364", 0, 13, false, (IDCCoreVar)vars[3], false, "address value", null, 0, false);
	subContainer_1.addSubInstruction(sub_7);
	
	ISubRule sub_8 = new SubRule("MOEB_FIELD/IDB:A1E5F00EF1EBF7E3C4DFB46533363364", 0, 9, false, (IDCCoreVar)vars[2], false, "fax value", null, 0, false);
	subContainer_1.addSubInstruction(sub_8);
	
	ISubRule sub_9 = new SubRule("MOEB_FIELD/TEX:A1E5F00EF1EC1EFBC4DFB46533363364/TPM:A1E5F00EF1EC1F01C4DFB46533363364", 0, 9, false, (IDCCoreVar)vars[2], false, "fax value", null, 0, false);
	subContainer_1.addSubInstruction(sub_9);
	


		return stepBatch;
	}

}
