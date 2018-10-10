package de.hpi.bpt.scylla.test.plugin_loader;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import de.hpi.bpt.scylla.SimulationTest;

public class PluginNotClearedRegressionTests extends SimulationTest{
	
	//TODO later use other test files, when existent
	@Test
	public void testFreshInstance() {
		assertNotNull(CallTestPlugin.getInstance());
		assertFalse(CallTestPlugin.getInstance().called);
		runSimpleSimulation(
				"BatchTestGlobalConfiguration.xml", 
				"ModelSimple.bpmn", 
				"BatchTestSimulationConfiguration.xml");
		assertFalse(CallTestPlugin.getInstance().called);
	}

	@Override
	protected String getFolderName() {return "BatchPlugin";}
	


}
