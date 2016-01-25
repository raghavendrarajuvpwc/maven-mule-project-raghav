package com.mulesoft.training;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mule.tck.junit4.FunctionalTestCase;

public class HelloMavenTest extends FunctionalTestCase {

    @Test
    public void mavenFlowReturnsHelloMaven() throws Exception {
        runFlowAndExpect("maven-porjectFlow", "Hello Maven");
    }
    
    @Test
    public void mavenFlowReturnsHelloMaven1() throws Exception {
    	String jsonData = "{ }";
        runFlowAndExpect("receiveFlights", jsonData);
    }
    
    
    @Override
    protected String getConfigFile() {
        return "maven-project.xml";
    }

}
