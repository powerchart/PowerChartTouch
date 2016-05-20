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

import com.ibm.rational.test.lt.datacorrelation.datapoolAction.Datapool;
import com.ibm.rational.test.lt.datacorrelation.datapoolAction.DatapoolAction;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.DataCorrelationVar;
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
import com.ibm.rational.test.lt.kernel.action.IContainer;
import com.ibm.rational.test.lt.kernel.action.impl.KThrow;
import com.ibm.rational.test.lt.kernel.services.*;
import com.ibm.rational.test.lt.kernel.services.RPTEventStructure;

@SuppressWarnings("all")
public class Chart_Problems_Search_SelectTermMatch_Test_A1E601A05349F626F886E66533333539 extends LTTestScript  {

    static ProtoAdapterHandler pa = new ProtoAdapterHandler();
    static {           
        pa.addPA("com.ibm.rational.test.lt.datacorrelation.execution.protocol.core.CoreProtoAdapter", "coreAdapter");
pa.addPA("com.ibm.rational.test.lt.execution.moeb.dc.MoebDataAdapter", "com.ibm.rational.test.lt.execution.moeb.action.MoebStepBatchAction");
    }
	private IDataCorrelationVar[] dcVars = DataCorrelationVar.getArrayDCVars(1);
	
	
    
    
	
	public Chart_Problems_Search_SelectTermMatch_Test_A1E601A05349F626F886E66533333539(IContainer container, String invocationId) {
		super(container, "Chart_Problems_Search&SelectTermMatch", invocationId, "A1E601A05349F626F886E66533333539");
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
	        	this.add(datapool_1(this));
	this.add(applicationContext_1(this));
	this.add(applicationContext_2(this));
			this.addFinally(new EndMoebStepBatchAction(this));

	    } catch (Throwable e) {
		     log("Test Execution: Chart_Problems_Search_SelectTermMatch_Test_A1E601A05349F626F886E66533333539 ",e);
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
	
	
	private DatapoolAction datapool_1(IContainer parent) {
		DatapoolAction dpAction = new DatapoolAction(parent, "A1E601A0861FB980F886E66533333539", "A1E601A105DB7650F886E66533333539");
		Datapool dp = new Datapool(
				 "/A1E601A0861FB980F886E66533333539.datapool",
				 0,
				 true,
				 false,
				 Datapool.SEQUENTIAL,
				 null, 0);
		dp.addHarvestInstruction("Var_SelectCondition", dcVars[0], false);
		dpAction.setDatapool(dp);
		return dpAction;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_1(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "PowerChart - Enter text 'Var_TermMatchSearch' in Text field whose Placeholder is Search",
												  "A1E607D08545E083F6D1B63961313936",
												  "{\"variables\":[{\"id\":\"8\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"Var_TermMatchSearch\",\"key\":\"MOEB_FIELD\\/TPM:A1E607D095A5EC90F6D1B63961313936\"}],\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"uid\":\"A1E607D08545E083F6D1B63961313936\",\"preferredThinktime\":0,\"thinktime\":93295,\"isWeb\":false,\"description\":\"Think <i>93,295<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"2D1DC2D1DEB758FD884CB3B7930832CD\",\"timeout\":0},{\"description\":\"Enter text '<b><subst key=\\\"MOEB_FIELD\\/TPM:A1E607D095A5EC90F6D1B63961313936\\\">Var_TermMatchSearch<\\/subst><\\/b>' in <b>Text field<\\/b> whose <b>Placeholder<\\/b> is <b>Search<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"2D1DC2D1DEB758FD884CB3B7930832CD\",\"timeout\":0,\"uid\":\"A1E607D08545E083F6D1B63961313936\",\"substitutionParameters\":[{\"name\":\"text\",\"variableKey\":\"MOEB_FIELD\\/TPM:A1E607D095A5EC90F6D1B63961313936\",\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Var_TermMatchSearch\"}],\"isWeb\":false,\"action\":{\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"enterText\",\"parameters\":[{\"$ref\":\"3\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"expression\":\"placeholder\",\"parameter\":{\"name\":\"placeholder\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Search\"},\"name\":\"placeholder\",\"expType\":\"getter\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UITextField\"}}],\"timeout\":10}",
												  null,
												  null,
												  "<default>");
		IDataSub subContainer_1 = new DataSub();
		stepBatch.addDataSub(subContainer_1);
	ISubRule sub_0 = new SubRule("MOEB_FIELD/TPM:A1E607D095A5EC90F6D1B63961313936", 0, 19, false, (IDCCoreVar)dcVars[0], false, "Var_TermMatchSearch_4", null, 0, false);
	subContainer_1.addSubInstruction(sub_0);
	


		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_2(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "PowerChart - Click on the item containing Label 'Var_SelectTermMatch' contained in Table view below Text field whose Placeholder is Search in Table view",
												  "A1E607D0C0B099D3F6D1B63961313936",
												  "{\"variables\":[{\"id\":\"20\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"Var_SelectTermMatch\",\"key\":\"MOEB_FIELD\\/TPM:A1E607D0CF8AC93EF6D1B63961313936\\/WID:A1E607D0CF8AC943F6D1B63961313936\\/IDB:A1E607D0D23A7FE1F6D1B63961313936\"}],\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"uid\":\"A1E607D0C0B099D3F6D1B63961313936\",\"preferredThinktime\":0,\"thinktime\":93295,\"isWeb\":false,\"description\":\"Think <i>93,295<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"2D1DC2D1DEB758FD884CB3B7930832CD\",\"timeout\":0},{\"description\":\"Click on the item containing Label <b>'<subst key=\\\"MOEB_FIELD\\/TPM:A1E607D0CF8AC93EF6D1B63961313936\\/WID:A1E607D0CF8AC943F6D1B63961313936\\/IDB:A1E607D0D23A7FE1F6D1B63961313936\\\">Var_SelectTermMatch<\\/subst>'<\\/b> contained in Table view below Text field whose <b>Placeholder<\\/b> is <b>Search<\\/b> in Table view\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"2D1DC2D1DEB758FD884CB3B7930832CD\",\"timeout\":0,\"uid\":\"A1E607D0C0B099D3F6D1B63961313936\",\"substitutionParameters\":[{\"name\":\"text\",\"variableKey\":\"MOEB_FIELD\\/TPM:A1E607D0CF8AC93EF6D1B63961313936\\/WID:A1E607D0CF8AC943F6D1B63961313936\\/IDB:A1E607D0D23A7FE1F6D1B63961313936\",\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Var_SelectTermMatch\"}],\"isWeb\":false,\"action\":{\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"clickItem\",\"parameters\":[{\"name\":\"position\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TInteger\",\"value\":\"0\"},{\"name\":\"section\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TInteger\",\"value\":\"1\"},{\"name\":\"Object\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TUIObject\",\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"$ref\":\"3\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"9\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"8\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\",\"locator\":{\"parameter\":{\"name\":\"objectId\",\"id\":\"11\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TUIObject\",\"object\":{\"id\":\"12\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UITableView\",\"locator\":{\"parameter\":{\"name\":\"objectId\",\"id\":\"14\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TUIObject\",\"object\":{\"identifier\":{\"expression\":\"placeholder\",\"parameter\":{\"name\":\"placeholder\",\"id\":\"17\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Search\"},\"name\":\"placeholder\",\"expType\":\"getter\",\"id\":\"16\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"15\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UITextField\"}},\"id\":\"13\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceLocator\",\"type\":\"LUnder\"}}},\"id\":\"10\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceLocator\",\"type\":\"LContained\"}}},{\"name\":\"_mode_\",\"id\":\"18\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"UITableView.ClickItem.GroupObject\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"id\":\"19\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UITableView\"}}],\"timeout\":10}",
												  null,
												  null,
												  "<default>");
		IDataSub subContainer_2 = new DataSub();
		stepBatch.addDataSub(subContainer_2);
	ISubRule sub_1 = new SubRule("MOEB_FIELD/TPM:A1E607D0CF8AC93EF6D1B63961313936/WID:A1E607D0CF8AC943F6D1B63961313936/IDB:A1E607D0D23A7FE1F6D1B63961313936", 0, 19, false, (IDCCoreVar)dcVars[0], false, "Var_SelectTermMatch", null, 0, false);
	subContainer_2.addSubInstruction(sub_1);
	


		return stepBatch;
	}

}
