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

import com.ibm.rational.test.lt.datacorrelation.execution.proto.ProtoAdapterHandler;
import com.ibm.rational.test.lt.execution.core.impl.LTTestScript;
import com.ibm.rational.test.lt.execution.moeb.action.EndMoebStepBatchAction;
import com.ibm.rational.test.lt.execution.moeb.action.MoebStepBatchAction;
import com.ibm.rational.test.lt.execution.moeb.services.*;
import com.ibm.rational.test.lt.kernel.action.IContainer;
import com.ibm.rational.test.lt.kernel.action.impl.KThrow;
import com.ibm.rational.test.lt.kernel.services.*;
import com.ibm.rational.test.lt.kernel.services.RPTEventStructure;

@SuppressWarnings("all")
public class LogOutIPad_Test_A1E5CEA2F23B6335EF33B53761343863 extends LTTestScript  {

    static ProtoAdapterHandler pa = new ProtoAdapterHandler();
    static {           
        pa.addPA("com.ibm.rational.test.lt.execution.moeb.dc.MoebDataAdapter", "com.ibm.rational.test.lt.execution.moeb.action.MoebStepBatchAction");
pa.addPA("com.ibm.rational.test.lt.datacorrelation.execution.protocol.core.CoreProtoAdapter", "coreAdapter");
    }
	
	
	
    
    
	
	public LogOutIPad_Test_A1E5CEA2F23B6335EF33B53761343863(IContainer container, String invocationId) {
		super(container, "Log out iPad", invocationId, "A1E5CEA2F23B6335EF33B53761343863");
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
	        	this.add(applicationContext_1(this));
	this.add(applicationContext_2(this));
	this.add(applicationContext_3(this));
			this.addFinally(new EndMoebStepBatchAction(this));

	    } catch (Throwable e) {
		     log("Test Execution: LogOutIPad_Test_A1E5CEA2F23B6335EF33B53761343863 ",e);
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
	
		// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_1(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Ambulatory - Click on Button to the left of TabBar button 'Review'",
												  "A1E5B64B45ECD73EC6ADB13063653333",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"uid\":\"A1E5B64B45ECD73EC6ADB13063653333\",\"id\":\"1\",\"application_uid\":\"13043AA08BFCB50828961CB156759298\",\"thinktime\":8000,\"to_overriden\":false,\"isWeb\":false,\"description\":\"Think <i>8,000<\\/i> ms\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"preferredThinktime\":0,\"timeout\":0},{\"uid\":\"A1E5B64B45ECD73EC6ADB13063653333\",\"id\":\"2\",\"application_uid\":\"13043AA08BFCB50828961CB156759298\",\"to_overriden\":false,\"isWeb\":false,\"description\":\"Click on <b>Button<\\/b> to the left of TabBar button <b>'Review'<\\/b>\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"parameters\":[],\"type\":\"click\"},\"object\":{\"id\":\"4\",\"locator\":{\"id\":\"5\",\"parameter\":{\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"name\":\"objectId\",\"object\":{\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UITabBarButton\",\"identifier\":{\"expression\":\"innerTittle\",\"id\":\"8\",\"parameter\":{\"id\":\"9\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"name\":\"currentTitle\",\"value\":\"Review\",\"type\":\"TString\"},\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"name\":\"currentTitle\",\"operator\":\"TEquals\",\"expType\":\"staticGetter\"}},\"type\":\"TUIObject\"},\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceLocator\",\"type\":\"LLeft\"},\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UIButton\"},\"skipScrollingIniOSDF\":false,\"timeout\":0,\"sync_policy\":\"SYNC-WITH-NEXT-STEP\"}],\"timeout\":10}",
												  null,
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_2(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Ambulatory - Click on Button whose Class name is UIButton to the left of Button 'Patient'",
												  "A1E5B64B45FB3528C6ADB13063653333",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"uid\":\"A1E5B64B45FB3528C6ADB13063653333\",\"id\":\"1\",\"application_uid\":\"13043AA08BFCB50828961CB156759298\",\"thinktime\":2000,\"to_overriden\":false,\"isWeb\":false,\"description\":\"Think <i>2,000<\\/i> ms\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"preferredThinktime\":0,\"timeout\":0},{\"uid\":\"A1E5B64B45FB3528C6ADB13063653333\",\"id\":\"2\",\"application_uid\":\"13043AA08BFCB50828961CB156759298\",\"to_overriden\":false,\"isWeb\":false,\"description\":\"Click on <b>Button<\\/b> whose <b>Class name<\\/b> is <b>UIButton<\\/b> to the left of Button <b>'Patient'<\\/b>\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"parameters\":[],\"type\":\"click\"},\"object\":{\"id\":\"4\",\"locator\":{\"id\":\"7\",\"parameter\":{\"id\":\"8\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"name\":\"objectId\",\"object\":{\"id\":\"9\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UIButton\",\"identifier\":{\"expression\":\"currentTitle\",\"id\":\"10\",\"parameter\":{\"id\":\"11\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"name\":\"currentTitle\",\"value\":\"Patient\",\"type\":\"TString\"},\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"name\":\"currentTitle\",\"operator\":\"TEquals\",\"expType\":\"getter\"}},\"type\":\"TUIObject\"},\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceLocator\",\"type\":\"LLeft\"},\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UIButton\",\"identifier\":{\"expression\":\"getTrueClassName\",\"id\":\"5\",\"parameter\":{\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"name\":\"trueClass\",\"value\":\"UIButton\",\"type\":\"TString\"},\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"name\":\"trueClass\",\"operator\":\"TEquals\",\"expType\":\"staticGetter\"}},\"skipScrollingIniOSDF\":false,\"timeout\":0,\"sync_policy\":\"DEFAULT\"}],\"timeout\":10}",
												  null,
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_3(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Ambulatory - Click on the item containing Label 'Log Out' located at position 58080 in Table view",
												  "A1E5B64B4604A4A8C6ADB13063653333",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"uid\":\"A1E5B64B4604A4A8C6ADB13063653333\",\"id\":\"1\",\"application_uid\":\"13043AA08BFCB50828961CB156759298\",\"thinktime\":2000,\"to_overriden\":false,\"isWeb\":false,\"description\":\"Think <i>2,000<\\/i> ms\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"preferredThinktime\":0,\"timeout\":0},{\"uid\":\"A1E5B64B4604A4A8C6ADB13063653333\",\"id\":\"2\",\"application_uid\":\"13043AA08BFCB50828961CB156759298\",\"to_overriden\":false,\"isWeb\":false,\"description\":\"Click on the item containing Label <b>'Log Out'<\\/b> located at position 58080 in Table view\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"parameters\":[{\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"name\":\"position\",\"value\":\"5\",\"type\":\"TInteger\"},{\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"name\":\"section\",\"value\":\"2\",\"type\":\"TInteger\"},{\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"name\":\"Object\",\"object\":{\"id\":\"7\",\"locator\":{\"id\":\"10\",\"parameter\":{\"id\":\"11\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"name\":\"index\",\"value\":\"58080\",\"type\":\"TInteger\"},\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceLocator\",\"type\":\"LPosition\"},\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\",\"identifier\":{\"expression\":\"text\",\"id\":\"8\",\"parameter\":{\"id\":\"9\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"name\":\"text\",\"value\":\"Log Out\",\"type\":\"TString\"},\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"name\":\"text\",\"operator\":\"TEquals\",\"expType\":\"getter\"}},\"type\":\"TUIObject\"},{\"id\":\"12\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"name\":\"_mode_\",\"value\":\"UITableView.ClickItem.GroupObject\",\"type\":\"TString\"}],\"type\":\"clickItem\"},\"object\":{\"id\":\"13\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UITableView\"},\"skipScrollingIniOSDF\":false,\"timeout\":0,\"sync_policy\":\"SYNC-WITH-NEXT-STEP\"}],\"timeout\":10}",
												  null,
												  null,
												  "<default>");



		return stepBatch;
	}

}
