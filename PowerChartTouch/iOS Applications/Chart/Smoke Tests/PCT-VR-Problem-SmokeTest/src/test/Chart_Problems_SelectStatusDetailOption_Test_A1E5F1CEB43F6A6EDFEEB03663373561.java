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
public class Chart_Problems_SelectStatusDetailOption_Test_A1E5F1CEB43F6A6EDFEEB03663373561 extends LTTestScript  {

    static ProtoAdapterHandler pa = new ProtoAdapterHandler();
    static {           
        pa.addPA("com.ibm.rational.test.lt.datacorrelation.execution.protocol.core.CoreProtoAdapter", "coreAdapter");
pa.addPA("com.ibm.rational.test.lt.execution.moeb.dc.MoebDataAdapter", "com.ibm.rational.test.lt.execution.moeb.action.MoebStepBatchAction");
    }
	private IDataCorrelationVar[] dcVars = DataCorrelationVar.getArrayDCVars(1);
	
	
    
    
	
	public Chart_Problems_SelectStatusDetailOption_Test_A1E5F1CEB43F6A6EDFEEB03663373561(IContainer container, String invocationId) {
		super(container, "Chart_Problems_SelectStatusDetailOption", invocationId, "A1E5F1CEB43F6A6EDFEEB03663373561");
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
			this.addFinally(new EndMoebStepBatchAction(this));

	    } catch (Throwable e) {
		     log("Test Execution: Chart_Problems_SelectStatusDetailOption_Test_A1E5F1CEB43F6A6EDFEEB03663373561 ",e);
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
		DatapoolAction dpAction = new DatapoolAction(parent, "A1E5FC0A0D087A02F33DB93666333631", "A1E5FC0A2EB6E9C0F33DB93666333631");
		Datapool dp = new Datapool(
				 "/A1E5FC0A0D087A02F33DB93666333631.datapool",
				 0,
				 true,
				 false,
				 Datapool.SEQUENTIAL,
				 null, 0);
		dp.addHarvestInstruction("Var_Status", dcVars[0], false);
		dpAction.setDatapool(dp);
		return dpAction;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_1(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "PowerChart - Click on the item containing Table view cell covering Label 'Var_Status' in Table view",
												  "A1E5EFA5D9426E87DFDEB06164623239",
												  "{\"variables\":[{\"id\":\"15\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"Var_Status\",\"key\":\"MOEB_FIELD\\/TPM:A1E5F049391144AED1C5B03731383837\\/WID:A1E5F049391144B3D1C5B03731383837\\/TLC:A1E5F0494B6B24E0D1C5B03731383837\\/TPM:A1E5F0494B6B24E4D1C5B03731383837\\/WID:A1E5F0494B6B24E8D1C5B03731383837\\/IDB:A1E5F049530259D1D1C5B03731383837\"}],\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"uid\":\"A1E5EFA5D9426E87DFDEB06164623239\",\"preferredThinktime\":0,\"thinktime\":1000,\"isWeb\":false,\"description\":\"Think <i>1,000<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"2D1DC2D1DEB758FD884CB3B7930832CD\",\"timeout\":0},{\"description\":\"Click on the item containing Table view cell covering Label <b>'<subst key=\\\"MOEB_FIELD\\/TPM:A1E5F049391144AED1C5B03731383837\\/WID:A1E5F049391144B3D1C5B03731383837\\/TLC:A1E5F0494B6B24E0D1C5B03731383837\\/TPM:A1E5F0494B6B24E4D1C5B03731383837\\/WID:A1E5F0494B6B24E8D1C5B03731383837\\/IDB:A1E5F049530259D1D1C5B03731383837\\\">Var_Status<\\/subst>'<\\/b> in Table view\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"2D1DC2D1DEB758FD884CB3B7930832CD\",\"timeout\":30,\"uid\":\"A1E5EFA5D9426E87DFDEB06164623239\",\"substitutionParameters\":[{\"name\":\"text\",\"variableKey\":\"MOEB_FIELD\\/TPM:A1E5F049391144AED1C5B03731383837\\/WID:A1E5F049391144B3D1C5B03731383837\\/TLC:A1E5F0494B6B24E0D1C5B03731383837\\/TPM:A1E5F0494B6B24E4D1C5B03731383837\\/WID:A1E5F0494B6B24E8D1C5B03731383837\\/IDB:A1E5F049530259D1D1C5B03731383837\",\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Var_Status\"}],\"isWeb\":false,\"action\":{\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"clickItem\",\"parameters\":[{\"name\":\"position\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TInteger\",\"value\":\"0\"},{\"name\":\"section\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TInteger\",\"value\":\"1\"},{\"name\":\"Object\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TUIObject\",\"object\":{\"id\":\"8\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UITableViewCell\",\"locator\":{\"parameter\":{\"name\":\"objectId\",\"id\":\"10\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TUIObject\",\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"$ref\":\"3\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"12\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"11\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\"}},\"id\":\"9\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceLocator\",\"type\":\"LCover\"}}},{\"name\":\"_mode_\",\"id\":\"13\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"UITableView.ClickItem.GroupObject\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"id\":\"14\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UITableView\"}}],\"timeout\":10}",
												  null,
												  null,
												  "<default>");
		IDataSub subContainer_1 = new DataSub();
		stepBatch.addDataSub(subContainer_1);
	ISubRule sub_0 = new SubRule("MOEB_FIELD/TPM:A1E5F049391144AED1C5B03731383837/WID:A1E5F049391144B3D1C5B03731383837/TLC:A1E5F0494B6B24E0D1C5B03731383837/TPM:A1E5F0494B6B24E4D1C5B03731383837/WID:A1E5F0494B6B24E8D1C5B03731383837/IDB:A1E5F049530259D1D1C5B03731383837", 0, 10, false, (IDCCoreVar)dcVars[0], false, "Var_Status", null, 0, false);
	subContainer_1.addSubInstruction(sub_0);
	


		return stepBatch;
	}

}
