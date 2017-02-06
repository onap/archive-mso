/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 14 09:10:46 GMT 2016
 */

package org.openecomp.mso.adapters.vnfrest;

import org.junit.Test;
import static org.junit.Assert.*;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class VfRequestCommonESTest extends VfRequestCommonESTestscaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CreateVolumeGroupRequest createVolumeGroupRequest0 = new CreateVolumeGroupRequest();
      Boolean boolean0 = Boolean.TRUE;
      createVolumeGroupRequest0.setSkipAAI(boolean0);
      Boolean boolean1 = createVolumeGroupRequest0.getSkipAAI();
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DeleteVfModuleRequest deleteVfModuleRequest0 = new DeleteVfModuleRequest();
      deleteVfModuleRequest0.setNotificationUrl("ghhl_5");
      String string0 = deleteVfModuleRequest0.getNotificationUrl();
      assertEquals("ghhl_5", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DeleteVolumeGroupRequest deleteVolumeGroupRequest0 = new DeleteVolumeGroupRequest();
      deleteVolumeGroupRequest0.setNotificationUrl("");
      String string0 = deleteVolumeGroupRequest0.getNotificationUrl();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      DeleteVfModuleRequest deleteVfModuleRequest0 = new DeleteVfModuleRequest();
      deleteVfModuleRequest0.setNotificationUrl("");
      boolean boolean0 = deleteVfModuleRequest0.isSynchronous();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      DeleteVolumeGroupRequest deleteVolumeGroupRequest0 = new DeleteVolumeGroupRequest();
      boolean boolean0 = deleteVolumeGroupRequest0.isSynchronous();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      CreateVolumeGroupRequest createVolumeGroupRequest0 = new CreateVolumeGroupRequest();
      Boolean boolean0 = createVolumeGroupRequest0.getSkipAAI();
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      DeleteVfModuleRequest deleteVfModuleRequest0 = new DeleteVfModuleRequest();
      String string0 = deleteVfModuleRequest0.getNotificationUrl();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      DeleteVfModuleRequest deleteVfModuleRequest0 = new DeleteVfModuleRequest();
      deleteVfModuleRequest0.setNotificationUrl("ghhl_5");
      boolean boolean0 = deleteVfModuleRequest0.isSynchronous();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      CreateVolumeGroupRequest createVolumeGroupRequest0 = new CreateVolumeGroupRequest();
      Boolean boolean0 = new Boolean("");
      createVolumeGroupRequest0.setSkipAAI(boolean0);
      Boolean boolean1 = createVolumeGroupRequest0.getSkipAAI();
      assertFalse(boolean1);
  }
}