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
public class Chart_Problems_VerifyDiagnosis1_2Problem1_2OrderMasterList_Test_A1E5FB5375A172EBC96FE43534333938 extends LTTestScript  {

    static ProtoAdapterHandler pa = new ProtoAdapterHandler();
    static {           
        pa.addPA("com.ibm.rational.test.lt.datacorrelation.execution.protocol.core.CoreProtoAdapter", "coreAdapter");
pa.addPA("com.ibm.rational.test.lt.execution.moeb.dc.MoebDataAdapter", "com.ibm.rational.test.lt.execution.moeb.action.MoebStepBatchAction");
    }
	
	private DataVar[] vars = new DataVar[4];
	
    
    
	
	public Chart_Problems_VerifyDiagnosis1_2Problem1_2OrderMasterList_Test_A1E5FB5375A172EBC96FE43534333938(IContainer container, String invocationId) {
		super(container, "Chart_Problems_VerifyDiagnosis1&2Problem1&2OrderMasterList", invocationId, "A1E5FB5375A172EBC96FE43534333938");
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
		     log("Test Execution: Chart_Problems_VerifyDiagnosis1_2Problem1_2OrderMasterList_Test_A1E5FB5375A172EBC96FE43534333938 ",e);
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

	
		vars[2] = new DataVar("Var_Diagnosis2", null, IDataArea.VIRTUALUSER, "IGNORE", false, false);

	
		vars[3] = new DataVar("Var_Problem2", null, IDataArea.VIRTUALUSER, "IGNORE", false, false);

		
	vc.add(vars);
	return vc;
	
}
	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_1(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "PowerChart",
												  "A1E5EA2AE8E07BA0F48EB36166393661",
												  "{\"variables\":[{\"id\":\"46\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"Var_Diagnosis1\",\"key\":\"MOEB_FIELD\\/TEX:A1E5F2AE3A552CFEE3F1E26563303839\\/TPM:A1E5F2AE3A552D02E3F1E26563303839\"},{\"id\":\"47\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"Var_Diagnosis1\",\"key\":\"MOEB_FIELD\\/TLC:A1E5FB53C5136C8FC96FE43534333938\\/TPM:A1E5FB53C5136C95C96FE43534333938\\/WID:A1E5FB53C5136C9FC96FE43534333938\\/TLC:A1E607E100954F40F6D1B63961313936\\/TPM:A1E607E100954F44F6D1B63961313936\\/WID:A1E607E100954F48F6D1B63961313936\\/IDB:A1E607E101C73F91F6D1B63961313936\"},{\"id\":\"48\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"Var_Diagnosis2\",\"key\":\"MOEB_FIELD\\/TEX:A1E5FB53C5136CB7C96FE43534333938\\/TPM:A1E5FB53C5136CBDC96FE43534333938\"},{\"id\":\"49\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"Var_Diagnosis2\",\"key\":\"MOEB_FIELD\\/TLC:A1E5EC78F6B1DBAFF8D5B73764643364\\/TPM:A1E5EC78F6B1DBB8F8D5B73764643364\\/WID:A1E5EC78F6B1DBB3F8D5B73764643364\\/TLC:A1E607E159BFB1F0F6D1B63961313936\\/TPM:A1E607E159BFB1F4F6D1B63961313936\\/WID:A1E607E159BFB1F8F6D1B63961313936\\/IDB:A1E607E15B364C61F6D1B63961313936\"},{\"id\":\"50\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"Var_Problem2\",\"key\":\"MOEB_FIELD\\/TEX:A1E5EC78F791B4A5F8D5B73764643364\\/TPM:A1E5EC78F791B4A9F8D5B73764643364\"},{\"id\":\"51\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"Var_Problem2\",\"key\":\"MOEB_FIELD\\/TLC:A1E5FB53C401AE6FC96FE43534333938\\/TPM:A1E5FB53C401AE75C96FE43534333938\\/WID:A1E5FB53C401AE7FC96FE43534333938\\/TLC:A1E607E174179F40F6D1B63961313936\\/TPM:A1E607E17417C650F6D1B63961313936\\/WID:A1E607E17417C654F6D1B63961313936\\/IDB:A1E607E175A62E81F6D1B63961313936\"},{\"id\":\"52\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"Var_Problem1\",\"key\":\"MOEB_FIELD\\/TEX:A1E5FB53C401AE97C96FE43534333938\\/TPM:A1E5FB53C401AE9DC96FE43534333938\"}],\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"description\":\"Verify that <b>Text<\\/b> contains <b><subst key=\\\"MOEB_FIELD\\/TEX:A1E5F2AE3A552CFEE3F1E26563303839\\/TPM:A1E5F2AE3A552D02E3F1E26563303839\\\">Var_Diagnosis1<\\/subst><\\/b> on <b>Label<\\/b> below Label <b>'Problems'<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"2D1DC2D1DEB758FD884CB3B7930832CD\",\"timeout\":0,\"vpExpression\":{\"expression\":\"text\",\"parameter\":{\"$ref\":\"2\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"9\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceSimpleExpression\",\"translatedName\":\"Text\",\"operator\":\"TContains\"},\"uid\":\"A1E5F2AE3A552CF7E3F1E26563303839\",\"substitutionParameters\":[{\"name\":\"text\",\"variableKey\":\"MOEB_FIELD\\/TEX:A1E5F2AE3A552CFEE3F1E26563303839\\/TPM:A1E5F2AE3A552D02E3F1E26563303839\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Var_Diagnosis1\"}],\"isWeb\":false,\"id\":\"1\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVPUIObject\",\"retry\":false,\"object\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\",\"locator\":{\"parameter\":{\"name\":\"objectId\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TUIObject\",\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"name\":\"text\",\"id\":\"8\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Problems\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\"}},\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceLocator\",\"type\":\"LUnder\"}}},{\"description\":\"Verify that <b>Text<\\/b> contains <b><subst key=\\\"MOEB_FIELD\\/TEX:A1E5FB53C5136CB7C96FE43534333938\\/TPM:A1E5FB53C5136CBDC96FE43534333938\\\">Var_Diagnosis2<\\/subst><\\/b> on <b>Label<\\/b> below Table view cell containing Label <b>'<subst key=\\\"MOEB_FIELD\\/TLC:A1E5FB53C5136C8FC96FE43534333938\\/TPM:A1E5FB53C5136C95C96FE43534333938\\/WID:A1E5FB53C5136C9FC96FE43534333938\\/TLC:A1E607E100954F40F6D1B63961313936\\/TPM:A1E607E100954F44F6D1B63961313936\\/WID:A1E607E100954F48F6D1B63961313936\\/IDB:A1E607E101C73F91F6D1B63961313936\\\">Var_Diagnosis1<\\/subst>'<\\/b>\",\"to_overriden\":true,\"skipScrollingIniOSDF\":false,\"application_uid\":\"2D1DC2D1DEB758FD884CB3B7930832CD\",\"timeout\":10,\"vpExpression\":{\"expression\":\"text\",\"parameter\":{\"$ref\":\"12\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"21\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceSimpleExpression\",\"translatedName\":\"Text\",\"operator\":\"TContains\"},\"uid\":\"A1E5FB53C5136C73C96FE43534333938\",\"substitutionParameters\":[{\"name\":\"text\",\"variableKey\":\"MOEB_FIELD\\/TLC:A1E5FB53C5136C8FC96FE43534333938\\/TPM:A1E5FB53C5136C95C96FE43534333938\\/WID:A1E5FB53C5136C9FC96FE43534333938\\/TLC:A1E607E100954F40F6D1B63961313936\\/TPM:A1E607E100954F44F6D1B63961313936\\/WID:A1E607E100954F48F6D1B63961313936\\/IDB:A1E607E101C73F91F6D1B63961313936\",\"id\":\"11\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Var_Diagnosis1\"},{\"name\":\"text\",\"variableKey\":\"MOEB_FIELD\\/TEX:A1E5FB53C5136CB7C96FE43534333938\\/TPM:A1E5FB53C5136CBDC96FE43534333938\",\"id\":\"12\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Var_Diagnosis2\"}],\"isWeb\":false,\"id\":\"10\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVPUIObject\",\"retry\":false,\"object\":{\"id\":\"13\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\",\"locator\":{\"parameter\":{\"name\":\"objectId\",\"id\":\"15\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TUIObject\",\"object\":{\"id\":\"16\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UITableViewCell\",\"locator\":{\"parameter\":{\"name\":\"objectId\",\"id\":\"18\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TUIObject\",\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"$ref\":\"11\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"20\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"19\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\"}},\"id\":\"17\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceLocator\",\"type\":\"LContain\"}}},\"id\":\"14\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceLocator\",\"type\":\"LUnder\"}}},{\"description\":\"Verify that <b>Text<\\/b> contains <b><subst key=\\\"MOEB_FIELD\\/TEX:A1E5EC78F791B4A5F8D5B73764643364\\/TPM:A1E5EC78F791B4A9F8D5B73764643364\\\">Var_Problem2<\\/subst><\\/b> on <b>Label<\\/b> below Table view cell containing Label <b>'<subst key=\\\"MOEB_FIELD\\/TLC:A1E5EC78F6B1DBAFF8D5B73764643364\\/TPM:A1E5EC78F6B1DBB8F8D5B73764643364\\/WID:A1E5EC78F6B1DBB3F8D5B73764643364\\/TLC:A1E607E159BFB1F0F6D1B63961313936\\/TPM:A1E607E159BFB1F4F6D1B63961313936\\/WID:A1E607E159BFB1F8F6D1B63961313936\\/IDB:A1E607E15B364C61F6D1B63961313936\\\">Var_Diagnosis2<\\/subst>'<\\/b>\",\"to_overriden\":true,\"skipScrollingIniOSDF\":false,\"application_uid\":\"2D1DC2D1DEB758FD884CB3B7930832CD\",\"timeout\":10,\"vpExpression\":{\"expression\":\"text\",\"parameter\":{\"$ref\":\"24\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"33\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceSimpleExpression\",\"translatedName\":\"Text\",\"operator\":\"TContains\"},\"uid\":\"A1E5EC78F791B49EF8D5B73764643364\",\"substitutionParameters\":[{\"name\":\"text\",\"variableKey\":\"MOEB_FIELD\\/TLC:A1E5EC78F6B1DBAFF8D5B73764643364\\/TPM:A1E5EC78F6B1DBB8F8D5B73764643364\\/WID:A1E5EC78F6B1DBB3F8D5B73764643364\\/TLC:A1E607E159BFB1F0F6D1B63961313936\\/TPM:A1E607E159BFB1F4F6D1B63961313936\\/WID:A1E607E159BFB1F8F6D1B63961313936\\/IDB:A1E607E15B364C61F6D1B63961313936\",\"id\":\"23\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Var_Diagnosis2\"},{\"name\":\"text\",\"variableKey\":\"MOEB_FIELD\\/TEX:A1E5EC78F791B4A5F8D5B73764643364\\/TPM:A1E5EC78F791B4A9F8D5B73764643364\",\"id\":\"24\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Var_Problem2\"}],\"isWeb\":false,\"id\":\"22\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVPUIObject\",\"retry\":false,\"object\":{\"id\":\"25\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\",\"locator\":{\"parameter\":{\"name\":\"objectId\",\"id\":\"27\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TUIObject\",\"object\":{\"id\":\"28\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UITableViewCell\",\"locator\":{\"parameter\":{\"name\":\"objectId\",\"id\":\"30\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TUIObject\",\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"$ref\":\"23\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"32\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"31\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\"}},\"id\":\"29\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceLocator\",\"type\":\"LContain\"}}},\"id\":\"26\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceLocator\",\"type\":\"LUnder\"}}},{\"description\":\"Verify that <b>Text<\\/b> contains <b><subst key=\\\"MOEB_FIELD\\/TEX:A1E5FB53C401AE97C96FE43534333938\\/TPM:A1E5FB53C401AE9DC96FE43534333938\\\">Var_Problem1<\\/subst><\\/b> on <b>Label<\\/b> below Table view cell containing Label <b>'<subst key=\\\"MOEB_FIELD\\/TLC:A1E5FB53C401AE6FC96FE43534333938\\/TPM:A1E5FB53C401AE75C96FE43534333938\\/WID:A1E5FB53C401AE7FC96FE43534333938\\/TLC:A1E607E174179F40F6D1B63961313936\\/TPM:A1E607E17417C650F6D1B63961313936\\/WID:A1E607E17417C654F6D1B63961313936\\/IDB:A1E607E175A62E81F6D1B63961313936\\\">Var_Problem2<\\/subst>'<\\/b>\",\"to_overriden\":true,\"skipScrollingIniOSDF\":false,\"application_uid\":\"2D1DC2D1DEB758FD884CB3B7930832CD\",\"timeout\":10,\"vpExpression\":{\"expression\":\"text\",\"parameter\":{\"$ref\":\"36\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"45\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceSimpleExpression\",\"translatedName\":\"Text\",\"operator\":\"TContains\"},\"uid\":\"A1E5FB53C401AE53C96FE43534333938\",\"substitutionParameters\":[{\"name\":\"text\",\"variableKey\":\"MOEB_FIELD\\/TLC:A1E5FB53C401AE6FC96FE43534333938\\/TPM:A1E5FB53C401AE75C96FE43534333938\\/WID:A1E5FB53C401AE7FC96FE43534333938\\/TLC:A1E607E174179F40F6D1B63961313936\\/TPM:A1E607E17417C650F6D1B63961313936\\/WID:A1E607E17417C654F6D1B63961313936\\/IDB:A1E607E175A62E81F6D1B63961313936\",\"id\":\"35\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Var_Problem2\"},{\"name\":\"text\",\"variableKey\":\"MOEB_FIELD\\/TEX:A1E5FB53C401AE97C96FE43534333938\\/TPM:A1E5FB53C401AE9DC96FE43534333938\",\"id\":\"36\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Var_Problem1\"}],\"isWeb\":false,\"id\":\"34\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVPUIObject\",\"retry\":false,\"object\":{\"id\":\"37\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\",\"locator\":{\"parameter\":{\"name\":\"objectId\",\"id\":\"39\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TUIObject\",\"object\":{\"id\":\"40\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UITableViewCell\",\"locator\":{\"parameter\":{\"name\":\"objectId\",\"id\":\"42\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TUIObject\",\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"$ref\":\"35\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"44\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"43\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\"}},\"id\":\"41\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceLocator\",\"type\":\"LContain\"}}},\"id\":\"38\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceLocator\",\"type\":\"LUnder\"}}}],\"timeout\":10}",
												  null,
												  null,
												  "<default>");
		IDataSub subContainer_1 = new DataSub();
		stepBatch.addDataSub(subContainer_1);
	ISubRule sub_0 = new SubRule("MOEB_FIELD/TEX:A1E5F2AE3A552CFEE3F1E26563303839/TPM:A1E5F2AE3A552D02E3F1E26563303839", 0, 14, false, (IDCCoreVar)vars[0], false, "Var_Diagnosis1_2", null, 0, false);
	subContainer_1.addSubInstruction(sub_0);
	
	ISubRule sub_1 = new SubRule("MOEB_FIELD/TLC:A1E5FB53C5136C8FC96FE43534333938/TPM:A1E5FB53C5136C95C96FE43534333938/WID:A1E5FB53C5136C9FC96FE43534333938/TLC:A1E607E100954F40F6D1B63961313936/TPM:A1E607E100954F44F6D1B63961313936/WID:A1E607E100954F48F6D1B63961313936/IDB:A1E607E101C73F91F6D1B63961313936", 0, 14, false, (IDCCoreVar)vars[0], false, "Var_Diagnosis1", null, 0, false);
	subContainer_1.addSubInstruction(sub_1);
	
	ISubRule sub_2 = new SubRule("MOEB_FIELD/TEX:A1E5FB53C5136CB7C96FE43534333938/TPM:A1E5FB53C5136CBDC96FE43534333938", 0, 14, false, (IDCCoreVar)vars[2], false, "Var_Diagnosis2_2", null, 0, false);
	subContainer_1.addSubInstruction(sub_2);
	
	ISubRule sub_3 = new SubRule("MOEB_FIELD/TLC:A1E5EC78F6B1DBAFF8D5B73764643364/TPM:A1E5EC78F6B1DBB8F8D5B73764643364/WID:A1E5EC78F6B1DBB3F8D5B73764643364/TLC:A1E607E159BFB1F0F6D1B63961313936/TPM:A1E607E159BFB1F4F6D1B63961313936/WID:A1E607E159BFB1F8F6D1B63961313936/IDB:A1E607E15B364C61F6D1B63961313936", 0, 14, false, (IDCCoreVar)vars[2], false, "Var_Diagnosis2", null, 0, false);
	subContainer_1.addSubInstruction(sub_3);
	
	ISubRule sub_4 = new SubRule("MOEB_FIELD/TEX:A1E5EC78F791B4A5F8D5B73764643364/TPM:A1E5EC78F791B4A9F8D5B73764643364", 0, 12, false, (IDCCoreVar)vars[3], false, "Var_Problem2_2", null, 0, false);
	subContainer_1.addSubInstruction(sub_4);
	
	ISubRule sub_5 = new SubRule("MOEB_FIELD/TLC:A1E5FB53C401AE6FC96FE43534333938/TPM:A1E5FB53C401AE75C96FE43534333938/WID:A1E5FB53C401AE7FC96FE43534333938/TLC:A1E607E174179F40F6D1B63961313936/TPM:A1E607E17417C650F6D1B63961313936/WID:A1E607E17417C654F6D1B63961313936/IDB:A1E607E175A62E81F6D1B63961313936", 0, 12, false, (IDCCoreVar)vars[3], false, "Var_Problem2", null, 0, false);
	subContainer_1.addSubInstruction(sub_5);
	
	ISubRule sub_6 = new SubRule("MOEB_FIELD/TEX:A1E5FB53C401AE97C96FE43534333938/TPM:A1E5FB53C401AE9DC96FE43534333938", 0, 12, false, (IDCCoreVar)vars[1], false, "Var_Problem1_2", null, 0, false);
	subContainer_1.addSubInstruction(sub_6);
	


		return stepBatch;
	}

}
