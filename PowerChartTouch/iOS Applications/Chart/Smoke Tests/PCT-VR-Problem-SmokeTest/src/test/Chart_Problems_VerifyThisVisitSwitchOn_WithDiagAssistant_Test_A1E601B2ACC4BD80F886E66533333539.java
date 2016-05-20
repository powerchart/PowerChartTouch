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
public class Chart_Problems_VerifyThisVisitSwitchOn_WithDiagAssistant_Test_A1E601B2ACC4BD80F886E66533333539 extends LTTestScript  {

    static ProtoAdapterHandler pa = new ProtoAdapterHandler();
    static {           
        pa.addPA("com.ibm.rational.test.lt.datacorrelation.execution.protocol.core.CoreProtoAdapter", "coreAdapter");
pa.addPA("com.ibm.rational.test.lt.execution.moeb.dc.MoebDataAdapter", "com.ibm.rational.test.lt.execution.moeb.action.MoebStepBatchAction");
    }
	
	
	
    
    
	
	public Chart_Problems_VerifyThisVisitSwitchOn_WithDiagAssistant_Test_A1E601B2ACC4BD80F886E66533333539(IContainer container, String invocationId) {
		super(container, "Chart_Problems_VerifyThisVisitSwitchOn_WithDiagAssistant", invocationId, "A1E601B2ACC4BD80F886E66533333539");
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
	        	this.add(applicationContext_1(this));
			this.addFinally(new EndMoebStepBatchAction(this));

	    } catch (Throwable e) {
		     log("Test Execution: Chart_Problems_VerifyThisVisitSwitchOn_WithDiagAssistant_Test_A1E601B2ACC4BD80F886E66533333539 ",e);
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
												  "PowerChart",
												  "A1E5EA2AE8E07BA0F48EB36166393661",
												  "{\"imagePrerequisites\":[\"UIButton\"],\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"uid\":\"A1E601B2D93ED940F886E66533333539\",\"isWeb\":false,\"description\":\"Verify that <img data=\\\"{&quot;annids&quot;:[&quot;A1E601B2D9436D20F886E66533333539&quot;],&quot;aspectRatioTolerance&quot;:20,&quot;threshold&quot;:80}\\\"\\/><b>Image<\\/b> matches on <b>Button<\\/b> to the right of Label <b>'This Visit'<\\/b>\",\"id\":\"1\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVPUIObject\",\"application_uid\":\"2D1DC2D1DEB758FD884CB3B7930832CD\",\"timeout\":0,\"retry\":false,\"object\":{\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UIButton\",\"locator\":{\"parameter\":{\"name\":\"objectId\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TUIObject\",\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"name\":\"text\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"This Visit\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\"}},\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceLocator\",\"type\":\"LRight\"}},\"vpExpression\":{\"expression\":\"getImage\",\"parameter\":{\"imageReferences\":{\"references\":[{\"base64Image\":\"iVBORw0KGgoAAAANSUhEUgAAABcAAAAXCAIAAABvSEP3AAAEeElEQVR4nDVU+1NTVxC+\\/5U\\/15l2+te0Y\\/tD1Y4iVtRSH2MZmSpIKgKCAh0EwhskRh6CwURqIEAMkRggiUC47\\/P4untuvXNyc+89e3b3+\\/bbtaChfKkl6CEItQvUgRPgGNgHNgOsCGSAQ6Ci8EXDAQLQpSBdyFNoQQct13bojxbdPKAKZI\\/RM7N2s62\\/bXCm9cVS41D294mP17umHw7ND6d235Z9CuMoQPjQtIQUgSUktIarYAO7IWKJ4m89yZ7pdCpbOKkeiNA\\/lPjoI1cTM+t7LWPp68+XBt8Wa2D7I1eaDJQlTIbHGrsemrpe3hrJvjliOAQRXpVyjgIQkP0Qe8BEAQ1PZh5MvNsJUIvMoKy6NFnYaO6ebJ9c3xQ4AMq2MruuWz+i3QrRIeGDj5WBrQA3+pL3JnPklHgMw9CisEdALJ5sH369r9nuxGRHmQahTKay1zvHl0vEAYc9kmz8hRyFuDqY7lyp0HFCw14S+WpT+7NDn6NVXb5HMMsBLrUNf3++44\\/4Ri3k3LTZOvYFRZr9hHMPJ9OHmpK1dgXuDMyNrm0Tfv31vCu4XgStc3Hvp971+GeuMVdXSyW5LoGpfUs883g+R2ZWpqYbYiN5nxPWirePFbtwDFJCTmLZNjCFWXxpX4QupbBcdBu65grkZfzf8q1\\/Xh8YIiDZC4EnL7UAmb16bCp9+XlmssQeIy9SSpZJaJN9yUVD78KrKqzYdOrvxBalx8A1hIan2ZoclXzcHVr97kJXX1bUTRghhJIh27LefGLw2sDKQE5YrUMLA2v7B5GuScF0GRrJogLcHs99c3ngWZ7bghlRIUserFxIm2yah9N92cB6MLI8mCqTCnz2IlnXZKrkqWRSrsSLZxomOrZQ5UwcKBvaJVBSK2o\\/R6N5KNW\\/6Vt9iY3YTLZivMhQ0JYJqHxDbdNU+czV6UdbLDw6Ri6oCX2pRCQfhRv9i2MFaS3u2LefJkqCESlFyBV1VihYlJ+Bm6Mfvm0afZrnnqA6MyuaLX1D3GY1bOyeSzuwSh6utA5u1eAYUk17c5xIL3cnc2d\\/7enZUFFnRcs3fUcKnspWGx+PU2WswxADs6mueNIxhdShRz\\/KiOTwiRDF82cvdPa8t08iKWgqkPCMix2AxDKXq9VovtDhfNVrbn+2+smpmB7UAX1TVJSpfHhtZOOXrpVHL7d3Dk+5dIGjlCKPRaB1fvf+9GbBZYBWJNPR1e2LjxOpU34mURADvuJKFwzHRRGpSQQBR9gF4nu41Lv0suDVDUaL6PDMfOx4VTgfm31TcGxDihfNAcn9cmJebTNo6LX\\/ff1c++xw9qRkOFJK8JQ69pRnxu2L1Z0LbfG\\/ZnIfAra2o878ephoSh6gZfRda\\/98Mvv5izGQRELoWtKQ6oQ8v\\/cd\\/cFGy\\/T2Dw+m7o9lxpazme3Ser68mq92LxYvdi9efPKqdyFfqLlRixihChpmluP6UWnpQZiMKOxaBX3LxTv9yfOtgz\\/e7v75Xt+fL1YSeTvvoCr\\/F4QbEtGKG0q5\\/wETx5mGS+5POAAAAABJRU5ErkJggg==\",\"id\":\"11\",\"annotationId\":\"A1E601B2D9436D20F886E66533333539\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceImageReference\"}],\"aspectRatioTolerance\":100,\"threshold\":80,\"id\":\"10\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceImageReferences\"},\"name\":\"image\",\"id\":\"9\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TImage\"},\"name\":\"image\",\"expType\":\"getter\",\"id\":\"8\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceSimpleExpression\",\"translatedName\":\"Image\",\"operator\":\"TEquals\"}},{\"uid\":\"A1E601A27387ACE3F886E66533333539\",\"isWeb\":false,\"description\":\"Verify that <b>Is on<\\/b> equals <b>true<\\/b> on <b>Switch<\\/b> to the right of Label whose <b>Text<\\/b> contains <b>This Visit<\\/b>\",\"id\":\"12\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVPUIObject\",\"application_uid\":\"2D1DC2D1DEB758FD884CB3B7930832CD\",\"timeout\":0,\"retry\":false,\"object\":{\"id\":\"13\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UISwitch\",\"locator\":{\"parameter\":{\"name\":\"objectId\",\"id\":\"15\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TUIObject\",\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"name\":\"text\",\"id\":\"18\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"This Visit\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"17\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TContains\"},\"id\":\"16\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\"}},\"id\":\"14\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceLocator\",\"type\":\"LRight\"}},\"vpExpression\":{\"expression\":\"isOn\",\"parameter\":{\"name\":\"on\",\"id\":\"20\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TBoolean\",\"value\":\"true\"},\"name\":\"on\",\"expType\":\"getter\",\"id\":\"19\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceSimpleExpression\",\"translatedName\":\"Is on\",\"operator\":\"TEquals\"}}],\"timeout\":10}",
												  null,
												  null,
												  "<default>");



		return stepBatch;
	}

}
