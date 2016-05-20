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
public class ScheduleListView_VerifyPatientName_Test_A1E617FBBAEAD0EDF150B03164323461 extends LTTestScript  {

    static ProtoAdapterHandler pa = new ProtoAdapterHandler();
    static {           
        pa.addPA("com.ibm.rational.test.lt.datacorrelation.execution.protocol.core.CoreProtoAdapter", "coreAdapter");
pa.addPA("com.ibm.rational.test.lt.execution.moeb.dc.MoebDataAdapter", "com.ibm.rational.test.lt.execution.moeb.action.MoebStepBatchAction");
    }
	
	private DataVar[] vars = new DataVar[9];
	
    
    
	
	public ScheduleListView_VerifyPatientName_Test_A1E617FBBAEAD0EDF150B03164323461(IContainer container, String invocationId) {
		super(container, "ScheduleListView_VerifyPatientName", invocationId, "A1E617FBBAEAD0EDF150B03164323461");
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
		     log("Test Execution: ScheduleListView_VerifyPatientName_Test_A1E617FBBAEAD0EDF150B03164323461 ",e);
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

	VariableAction vc = new VariableAction(parent, "", "A1E5EC292DB48E2EE9C7B46130663164");	
			vars[0] = new DataVar("Var_Location_A", null, IDataArea.VIRTUALUSER, "INFO", false, false);

	
		vars[1] = new DataVar("Var_Patient_A", null, IDataArea.VIRTUALUSER, "INFO", false, false);

	
		vars[2] = new DataVar("Var_Visit_Type_A", null, IDataArea.VIRTUALUSER, "INFO", false, false);

	
		vars[3] = new DataVar("Var_Time_A", null, IDataArea.VIRTUALUSER, "INFO", false, false);

	
		vars[4] = new DataVar("Var_Schedule_Status", null, IDataArea.VIRTUALUSER, "INFO", false, false);

	
		vars[5] = new DataVar("Var_Time_B", null, IDataArea.VIRTUALUSER, "INFO", false, false);

	
		vars[6] = new DataVar("Var_Visit_Type_B", null, IDataArea.VIRTUALUSER, "INFO", false, false);

	
		vars[7] = new DataVar("Var_Patient_B", null, IDataArea.VIRTUALUSER, "INFO", false, false);

	
		vars[8] = new DataVar("Var_Location", null, IDataArea.VIRTUALUSER, "INFO", false, false);

		
	vc.add(vars);
	return vc;
	
}
	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_1(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "PowerChart",
												  "A1E5F009A919F253E23FB53838343764",
												  "{\"variables\":[{\"id\":\"34\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"Baseline East\",\"key\":\"MOEB_FIELD\\/TLC:A1E5F009A919F273E23FB53838343764\\/TPM:A1E5F009A919F27BE23FB53838343764\\/WID:A1E5F009A919F287E23FB53838343764\\/IDB:A1E5F009A919F293E23FB53838343764\"},{\"id\":\"35\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"Same Day\",\"key\":\"MOEB_FIELD\\/STL:A1E5F009A919F2B3E23FB53838343764\\/TPM:A1E5F009A919F2BBE23FB53838343764\\/WID:A1E5F009A919F2C7E23FB53838343764\\/IDB:A1E5F009A919F2D3E23FB53838343764\"},{\"id\":\"36\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"Patient_A\",\"key\":\"MOEB_FIELD\\/STL:A1E5F009A919F2B3E23FB53838343764\\/TPM:A1E5F009A919F2BBE23FB53838343764\\/WID:A1E5F009A919F2C7E23FB53838343764\\/TLC:A1E5F009A919F2F3E23FB53838343764\\/TPM:A1E5F009A919F2FBE23FB53838343764\\/WID:A1E5F009A919F307E23FB53838343764\\/IDB:A1E5F009A919F313E23FB53838343764\"},{\"id\":\"37\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"Patient_A\",\"key\":\"MOEB_FIELD\\/TEX:A1E5F009A919F333E23FB53838343764\\/TPM:A1E5F009A91A1963E23FB53838343764\"},{\"id\":\"38\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"Time_B\",\"key\":\"MOEB_FIELD\\/TLC:A1E5F009A91A67CDE23FB53838343764\\/TPM:A1E5F009A91A67D5E23FB53838343764\\/WID:A1E5F009A91A67E1E23FB53838343764\\/IDB:A1E5F009A91A67EDE23FB53838343764\"},{\"id\":\"39\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"Visit_Type_B\",\"key\":\"MOEB_FIELD\\/STL:A1E5F009A91A680DE23FB53838343764\\/TPM:A1E5F009A91A6815E23FB53838343764\\/WID:A1E5F009A91A6821E23FB53838343764\\/IDB:A1E5F009A91A682DE23FB53838343764\"},{\"id\":\"40\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"Patient_B\",\"key\":\"MOEB_FIELD\\/TEX:A1E5F009A91A684DE23FB53838343764\\/TPM:A1E5F009A91A6855E23FB53838343764\"}],\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"description\":\"Verify that <b>Text<\\/b> equals <b><subst key=\\\"MOEB_FIELD\\/TEX:A1E5F009A919F333E23FB53838343764\\/TPM:A1E5F009A91A1963E23FB53838343764\\\">Patient_A<\\/subst><\\/b> on <b>Label<\\/b> below Label <b>'<subst key=\\\"MOEB_FIELD\\/TLC:A1E5F009A919F273E23FB53838343764\\/TPM:A1E5F009A919F27BE23FB53838343764\\/WID:A1E5F009A919F287E23FB53838343764\\/IDB:A1E5F009A919F293E23FB53838343764\\\">Baseline East<\\/subst>'<\\/b> and above Label <b>'<subst key=\\\"MOEB_FIELD\\/STL:A1E5F009A919F2B3E23FB53838343764\\/TPM:A1E5F009A919F2BBE23FB53838343764\\/WID:A1E5F009A919F2C7E23FB53838343764\\/IDB:A1E5F009A919F2D3E23FB53838343764\\\">Same Day<\\/subst>'<\\/b> below Label <b>'<subst key=\\\"MOEB_FIELD\\/STL:A1E5F009A919F2B3E23FB53838343764\\/TPM:A1E5F009A919F2BBE23FB53838343764\\/WID:A1E5F009A919F2C7E23FB53838343764\\/TLC:A1E5F009A919F2F3E23FB53838343764\\/TPM:A1E5F009A919F2FBE23FB53838343764\\/WID:A1E5F009A919F307E23FB53838343764\\/IDB:A1E5F009A919F313E23FB53838343764\\\">Patient_A<\\/subst>'<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"2D1DC2D1DEB758FD884CB3B7930832CD\",\"timeout\":0,\"vpExpression\":{\"expression\":\"text\",\"parameter\":{\"$ref\":\"5\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"19\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceSimpleExpression\",\"translatedName\":\"Text\",\"operator\":\"TEquals\"},\"uid\":\"A1E5F009A919F263E23FB53838343764\",\"substitutionParameters\":[{\"name\":\"text\",\"variableKey\":\"MOEB_FIELD\\/TLC:A1E5F009A919F273E23FB53838343764\\/TPM:A1E5F009A919F27BE23FB53838343764\\/WID:A1E5F009A919F287E23FB53838343764\\/IDB:A1E5F009A919F293E23FB53838343764\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Baseline East\"},{\"name\":\"text\",\"variableKey\":\"MOEB_FIELD\\/STL:A1E5F009A919F2B3E23FB53838343764\\/TPM:A1E5F009A919F2BBE23FB53838343764\\/WID:A1E5F009A919F2C7E23FB53838343764\\/IDB:A1E5F009A919F2D3E23FB53838343764\",\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Same Day\"},{\"name\":\"text\",\"variableKey\":\"MOEB_FIELD\\/STL:A1E5F009A919F2B3E23FB53838343764\\/TPM:A1E5F009A919F2BBE23FB53838343764\\/WID:A1E5F009A919F2C7E23FB53838343764\\/TLC:A1E5F009A919F2F3E23FB53838343764\\/TPM:A1E5F009A919F2FBE23FB53838343764\\/WID:A1E5F009A919F307E23FB53838343764\\/IDB:A1E5F009A919F313E23FB53838343764\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Patient_A\"},{\"name\":\"text\",\"variableKey\":\"MOEB_FIELD\\/TEX:A1E5F009A919F333E23FB53838343764\\/TPM:A1E5F009A91A1963E23FB53838343764\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Patient_A\"}],\"isWeb\":false,\"id\":\"1\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVPUIObject\",\"retry\":false,\"object\":{\"secondaryLocator\":{\"parameter\":{\"name\":\"objectId\",\"id\":\"12\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TUIObject\",\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"$ref\":\"3\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"14\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"13\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\",\"locator\":{\"parameter\":{\"name\":\"objectId\",\"id\":\"16\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TUIObject\",\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"$ref\":\"4\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"18\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"17\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\"}},\"id\":\"15\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceLocator\",\"type\":\"LUnder\"}}},\"id\":\"11\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceLocator\",\"type\":\"LAbove\"},\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\",\"locator\":{\"parameter\":{\"name\":\"objectId\",\"id\":\"8\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TUIObject\",\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"$ref\":\"2\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"10\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"9\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\"}},\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceLocator\",\"type\":\"LUnder\"}}},{\"description\":\"Verify that <b>Text<\\/b> equals <b><subst key=\\\"MOEB_FIELD\\/TEX:A1E5F009A91A684DE23FB53838343764\\/TPM:A1E5F009A91A6855E23FB53838343764\\\">Patient_B<\\/subst><\\/b> on <b>Label<\\/b> to the left of Label <b>'<subst key=\\\"MOEB_FIELD\\/TLC:A1E5F009A91A67CDE23FB53838343764\\/TPM:A1E5F009A91A67D5E23FB53838343764\\/WID:A1E5F009A91A67E1E23FB53838343764\\/IDB:A1E5F009A91A67EDE23FB53838343764\\\">Time_B<\\/subst>'<\\/b> and above Label <b>'<subst key=\\\"MOEB_FIELD\\/STL:A1E5F009A91A680DE23FB53838343764\\/TPM:A1E5F009A91A6815E23FB53838343764\\/WID:A1E5F009A91A6821E23FB53838343764\\/IDB:A1E5F009A91A682DE23FB53838343764\\\">Visit_Type_B<\\/subst>'<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"2D1DC2D1DEB758FD884CB3B7930832CD\",\"timeout\":0,\"vpExpression\":{\"expression\":\"text\",\"parameter\":{\"$ref\":\"23\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"33\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceSimpleExpression\",\"translatedName\":\"Text\",\"operator\":\"TEquals\"},\"uid\":\"A1E5F009A91A67BDE23FB53838343764\",\"substitutionParameters\":[{\"name\":\"text\",\"variableKey\":\"MOEB_FIELD\\/TLC:A1E5F009A91A67CDE23FB53838343764\\/TPM:A1E5F009A91A67D5E23FB53838343764\\/WID:A1E5F009A91A67E1E23FB53838343764\\/IDB:A1E5F009A91A67EDE23FB53838343764\",\"id\":\"21\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Time_B\"},{\"name\":\"text\",\"variableKey\":\"MOEB_FIELD\\/STL:A1E5F009A91A680DE23FB53838343764\\/TPM:A1E5F009A91A6815E23FB53838343764\\/WID:A1E5F009A91A6821E23FB53838343764\\/IDB:A1E5F009A91A682DE23FB53838343764\",\"id\":\"22\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Visit_Type_B\"},{\"name\":\"text\",\"variableKey\":\"MOEB_FIELD\\/TEX:A1E5F009A91A684DE23FB53838343764\\/TPM:A1E5F009A91A6855E23FB53838343764\",\"id\":\"23\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Patient_B\"}],\"isWeb\":false,\"id\":\"20\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVPUIObject\",\"retry\":false,\"object\":{\"secondaryLocator\":{\"parameter\":{\"name\":\"objectId\",\"id\":\"30\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TUIObject\",\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"$ref\":\"22\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"32\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"31\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\"}},\"id\":\"29\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceLocator\",\"type\":\"LAbove\"},\"id\":\"24\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\",\"locator\":{\"parameter\":{\"name\":\"objectId\",\"id\":\"26\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TUIObject\",\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"$ref\":\"21\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"28\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"27\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\"}},\"id\":\"25\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceLocator\",\"type\":\"LLeft\"}}}],\"timeout\":10}",
												  null,
												  null,
												  "<default>");
		IDataSub subContainer_1 = new DataSub();
		stepBatch.addDataSub(subContainer_1);
	ISubRule sub_0 = new SubRule("MOEB_FIELD/TLC:A1E5F009A919F273E23FB53838343764/TPM:A1E5F009A919F27BE23FB53838343764/WID:A1E5F009A919F287E23FB53838343764/IDB:A1E5F009A919F293E23FB53838343764", 0, 13, false, (IDCCoreVar)vars[0], false, "Baseline East", null, 0, false);
	subContainer_1.addSubInstruction(sub_0);
	
	ISubRule sub_1 = new SubRule("MOEB_FIELD/STL:A1E5F009A919F2B3E23FB53838343764/TPM:A1E5F009A919F2BBE23FB53838343764/WID:A1E5F009A919F2C7E23FB53838343764/IDB:A1E5F009A919F2D3E23FB53838343764", 0, 8, false, (IDCCoreVar)vars[2], false, "Same Day", null, 0, false);
	subContainer_1.addSubInstruction(sub_1);
	
	ISubRule sub_2 = new SubRule("MOEB_FIELD/STL:A1E5F009A919F2B3E23FB53838343764/TPM:A1E5F009A919F2BBE23FB53838343764/WID:A1E5F009A919F2C7E23FB53838343764/TLC:A1E5F009A919F2F3E23FB53838343764/TPM:A1E5F009A919F2FBE23FB53838343764/WID:A1E5F009A919F307E23FB53838343764/IDB:A1E5F009A919F313E23FB53838343764", 0, 9, false, (IDCCoreVar)vars[1], false, "Patient_A", null, 0, false);
	subContainer_1.addSubInstruction(sub_2);
	
	ISubRule sub_3 = new SubRule("MOEB_FIELD/TEX:A1E5F009A919F333E23FB53838343764/TPM:A1E5F009A91A1963E23FB53838343764", 0, 9, false, (IDCCoreVar)vars[1], false, "Patient_A_2", null, 0, false);
	subContainer_1.addSubInstruction(sub_3);
	
	ISubRule sub_4 = new SubRule("MOEB_FIELD/TLC:A1E5F009A91A67CDE23FB53838343764/TPM:A1E5F009A91A67D5E23FB53838343764/WID:A1E5F009A91A67E1E23FB53838343764/IDB:A1E5F009A91A67EDE23FB53838343764", 0, 6, false, (IDCCoreVar)vars[5], false, "Time_B", null, 0, false);
	subContainer_1.addSubInstruction(sub_4);
	
	ISubRule sub_5 = new SubRule("MOEB_FIELD/STL:A1E5F009A91A680DE23FB53838343764/TPM:A1E5F009A91A6815E23FB53838343764/WID:A1E5F009A91A6821E23FB53838343764/IDB:A1E5F009A91A682DE23FB53838343764", 0, 12, false, (IDCCoreVar)vars[6], false, "Visit_Type_B", null, 0, false);
	subContainer_1.addSubInstruction(sub_5);
	
	ISubRule sub_6 = new SubRule("MOEB_FIELD/TEX:A1E5F009A91A684DE23FB53838343764/TPM:A1E5F009A91A6855E23FB53838343764", 0, 9, false, (IDCCoreVar)vars[7], false, "Patient_B_2", null, 0, false);
	subContainer_1.addSubInstruction(sub_6);
	


		return stepBatch;
	}

}
