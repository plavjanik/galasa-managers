/*
 * Copyright contributors to the Galasa project
 */
package dev.galasa.zos.internal.properties;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
//import org.powermock.api.mockito.PowerMockito;
//import org.powermock.core.classloader.annotations.PrepareForTest;
//import org.powermock.modules.junit4.PowerMockRunner;

import dev.galasa.framework.spi.ConfigurationPropertyStoreException;
import dev.galasa.framework.spi.IConfigurationPropertyStoreService;
import dev.galasa.framework.spi.cps.CpsProperties;
import dev.galasa.zos.ZosManagerException;

//@RunWith(PowerMockRunner.class)
//@PrepareForTest({ZosPropertiesSingleton.class, CpsProperties.class})
public class TestTSOCommandExtraBundle {
//    
//    @Mock
//    private IConfigurationPropertyStoreService configurationPropertyStoreServiceMock;
//    
//    private static final String DEFAULT_EXTRA_BUNDLE_TSO_COMMAND_MANAGER = "dev.galasa.zostsocommand.ssh.manager";
//    
//    private static final String BUNDLE_EXTRA_MANAGER = "some.different.manager";
//    
//    @Test
//    public void testConstructor() {
//        TSOCommandExtraBundle tsoCommandExtraBundle = new TSOCommandExtraBundle();
//        Assert.assertNotNull("Object was not created", tsoCommandExtraBundle);
//    }
//    
//    @Test
//    public void testValid() throws Exception {
//        Assert.assertEquals("Unexpected value returned from TSOCommandExtraBundle.get()", DEFAULT_EXTRA_BUNDLE_TSO_COMMAND_MANAGER, getProperty(null));
//        Assert.assertEquals("Unexpected value returned from TSOCommandExtraBundle.get()", BUNDLE_EXTRA_MANAGER, getProperty(BUNDLE_EXTRA_MANAGER));
//    }
//    
//    @Test
//    public void testException() throws Exception {
//        String expectedMessage = "Problem asking CPS for the zOS TSO Command Manager extra bundle name";
//        ZosManagerException expectedException = Assert.assertThrows("expected exception should be thrown", ZosManagerException.class, ()->{
//        	getProperty("ANY", true);
//        });
//    	Assert.assertEquals("exception should contain expected message", expectedMessage, expectedException.getMessage());
//    }
//
//    private String getProperty(String value) throws Exception {
//        return getProperty(value, false);
//    }
//    
//    private String getProperty(String value, boolean exception) throws Exception {
//        PowerMockito.spy(ZosPropertiesSingleton.class);
//        PowerMockito.doReturn(configurationPropertyStoreServiceMock).when(ZosPropertiesSingleton.class, "cps");
//        PowerMockito.spy(CpsProperties.class);
//        
//        if (!exception) {
//            PowerMockito.doReturn(value).when(CpsProperties.class, "getStringNulled", Mockito.any(), Mockito.anyString(), Mockito.anyString());
//        } else {
//            PowerMockito.doThrow(new ConfigurationPropertyStoreException()).when(CpsProperties.class, "getStringNulled", Mockito.any(), Mockito.anyString(), Mockito.anyString());
//        }
//        
//        return TSOCommandExtraBundle.get();
//    }
}
