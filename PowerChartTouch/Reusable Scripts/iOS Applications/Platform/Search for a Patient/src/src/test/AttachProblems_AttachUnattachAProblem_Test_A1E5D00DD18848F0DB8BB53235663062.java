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
public class AttachProblems_AttachUnattachAProblem_Test_A1E5D00DD18848F0DB8BB53235663062 extends LTTestScript  {

    static ProtoAdapterHandler pa = new ProtoAdapterHandler();
    static {           
        pa.addPA("com.ibm.rational.test.lt.execution.moeb.dc.MoebDataAdapter", "com.ibm.rational.test.lt.execution.moeb.action.MoebStepBatchAction");
pa.addPA("com.ibm.rational.test.lt.datacorrelation.execution.protocol.core.CoreProtoAdapter", "coreAdapter");
    }
	
	private DataVar[] vars = new DataVar[1];
	
    
    
	
	public AttachProblems_AttachUnattachAProblem_Test_A1E5D00DD18848F0DB8BB53235663062(IContainer container, String invocationId) {
		super(container, "AttachProblems_AttachUnattachAProblem", invocationId, "A1E5D00DD18848F0DB8BB53235663062");
		setArmEnabled(false);
		stopAtYourConvenience=false;
		
	}

    public void execute() {
    	try {
			
	    		
	
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
		     log("Test Execution: AttachProblems_AttachUnattachAProblem_Test_A1E5D00DD18848F0DB8BB53235663062 ",e);
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

	VariableAction vc = new VariableAction(parent, "", "A1E5CC4793A77E1ED9E8B43733386336");	
			vars[0] = new DataVar("Var_ProblemA", null, IDataArea.VIRTUALUSER, "WARNING", false, false);

		
	vc.add(vars);
	return vc;
	
}
	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_1(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Ambulatory - Click on the item containing Label 'Var_ProblemA' in Table view below Navigation bar whose Title is Attach",
												  "A1E5D00DDB097313DB8BB53235663062",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"uid\":\"A1E5D00DDB097313DB8BB53235663062\",\"id\":\"1\",\"application_uid\":\"13043AA08BFCB50828961CB156759298\",\"thinktime\":2000,\"to_overriden\":false,\"isWeb\":false,\"description\":\"Think <i>2,000<\\/i> ms\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"preferredThinktime\":0,\"timeout\":0},{\"uid\":\"A1E5D00DDB097313DB8BB53235663062\",\"id\":\"2\",\"substitutionParameters\":[{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"name\":\"text\",\"value\":\"Var_ProblemA\",\"variableKey\":\"MOEB_FIELD\\/TPM:A1E5D0129866546EDB8BB53235663062\\/WID:A1E5D01298665473DB8BB53235663062\\/IDB:A1E5D0129A8CB6D1DB8BB53235663062\",\"type\":\"TString\"}],\"application_uid\":\"13043AA08BFCB50828961CB156759298\",\"to_overriden\":false,\"isWeb\":false,\"description\":\"Click on the item containing Label <b>'<subst key=\\\"MOEB_FIELD\\/TPM:A1E5D0129866546EDB8BB53235663062\\/WID:A1E5D01298665473DB8BB53235663062\\/IDB:A1E5D0129A8CB6D1DB8BB53235663062\\\">Var_ProblemA<\\/subst>'<\\/b> in Table view below Navigation bar whose <b>Title<\\/b> is <b>Attach<\\/b>\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"action\":{\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"parameters\":[{\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"name\":\"position\",\"value\":\"0\",\"type\":\"TInteger\"},{\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"name\":\"section\",\"value\":\"1\",\"type\":\"TInteger\"},{\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"name\":\"Object\",\"object\":{\"id\":\"8\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\",\"identifier\":{\"expression\":\"text\",\"id\":\"9\",\"parameter\":{\"$ref\":\"3\"},\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"name\":\"text\",\"operator\":\"TEquals\",\"expType\":\"getter\"}},\"type\":\"TUIObject\"},{\"id\":\"10\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"name\":\"_mode_\",\"value\":\"UITableView.ClickItem.GroupObject\",\"type\":\"TString\"}],\"type\":\"clickItem\"},\"object\":{\"id\":\"11\",\"locator\":{\"id\":\"12\",\"parameter\":{\"id\":\"13\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"name\":\"objectId\",\"object\":{\"id\":\"14\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UINavigationBar\",\"identifier\":{\"expression\":\"topItem.title\",\"id\":\"15\",\"parameter\":{\"id\":\"16\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"name\":\"title\",\"value\":\"Attach\",\"type\":\"TString\"},\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"name\":\"title\",\"operator\":\"TEquals\",\"expType\":\"field\"}},\"type\":\"TUIObject\"},\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceLocator\",\"type\":\"LUnder\"},\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UITableView\"},\"skipScrollingIniOSDF\":false,\"timeout\":0,\"sync_policy\":\"DEFAULT\"}],\"timeout\":10,\"variables\":[{\"id\":\"17\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"Var_ProblemA\",\"key\":\"MOEB_FIELD\\/TPM:A1E5D0129866546EDB8BB53235663062\\/WID:A1E5D01298665473DB8BB53235663062\\/IDB:A1E5D0129A8CB6D1DB8BB53235663062\"}]}",
												  null,
												  null,
												  "<default>");
		IDataSub subContainer_1 = new DataSub();
		stepBatch.addDataSub(subContainer_1);
	ISubRule sub_0 = new SubRule("MOEB_FIELD/TPM:A1E5D0129866546EDB8BB53235663062/WID:A1E5D01298665473DB8BB53235663062/IDB:A1E5D0129A8CB6D1DB8BB53235663062", 0, 12, false, (IDCCoreVar)vars[0], false, "Var_ProblemA", null, 0, false);
	subContainer_1.addSubInstruction(sub_0);
	


		return stepBatch;
	}

}
