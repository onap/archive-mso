/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 14 09:05:55 GMT 2016
 */

package org.openecomp.mso.adapters.nwrest;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;

import org.openecomp.mso.entity.MsoRequest;
import org.openecomp.mso.openstack.beans.Subnet;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class CreateNetworkRequestESTest extends CreateNetworkRequestESTestscaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CreateNetworkRequest createNetworkRequest0 = new CreateNetworkRequest();
      createNetworkRequest0.setTenantId("gTN<#W#q}?BdTz");
      String string0 = createNetworkRequest0.getTenantId();
      assertEquals("gTN<#W#q}?BdTz", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CreateNetworkRequest createNetworkRequest0 = new CreateNetworkRequest();
      LinkedList<Subnet> linkedList0 = new LinkedList<Subnet>();
      Subnet subnet0 = new Subnet();
      linkedList0.add(0, subnet0);
      createNetworkRequest0.setSubnets(linkedList0);
      List<Subnet> list0 = createNetworkRequest0.getSubnets();
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CreateNetworkRequest createNetworkRequest0 = new CreateNetworkRequest();
      ProviderVlanNetwork providerVlanNetwork0 = new ProviderVlanNetwork("", (List<Integer>) null);
      createNetworkRequest0.setProviderVlanNetwork(providerVlanNetwork0);
      ProviderVlanNetwork providerVlanNetwork1 = createNetworkRequest0.getProviderVlanNetwork();
      assertSame(providerVlanNetwork1, providerVlanNetwork0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CreateNetworkRequest createNetworkRequest0 = new CreateNetworkRequest();
      createNetworkRequest0.setNetworkTypeVersion("Zt;$+0,06");
      String string0 = createNetworkRequest0.getNetworkTypeVersion();
      assertEquals("Zt;$+0,06", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CreateNetworkRequest createNetworkRequest0 = new CreateNetworkRequest();
      createNetworkRequest0.setNetworkTypeVersion("");
      String string0 = createNetworkRequest0.getNetworkTypeVersion();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CreateNetworkRequest createNetworkRequest0 = new CreateNetworkRequest();
      createNetworkRequest0.setNetworkType("+34spiczRb5|Z");
      String string0 = createNetworkRequest0.getNetworkType();
      assertEquals("+34spiczRb5|Z", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CreateNetworkRequest createNetworkRequest0 = new CreateNetworkRequest();
      createNetworkRequest0.setNetworkType("");
      String string0 = createNetworkRequest0.getNetworkType();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CreateNetworkRequest createNetworkRequest0 = new CreateNetworkRequest();
      createNetworkRequest0.setNetworkParams((Map<String, String>) null);
      Map<String, String> map0 = createNetworkRequest0.getNetworkParams();
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CreateNetworkRequest createNetworkRequest0 = new CreateNetworkRequest();
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      createNetworkRequest0.setNetworkParams(hashMap0);
      hashMap0.put("B]gM^ `p!", "Subnet [subnetName=");
      Map<String, String> map0 = createNetworkRequest0.getNetworkParams();
      assertEquals(1, map0.size());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CreateNetworkRequest createNetworkRequest0 = new CreateNetworkRequest();
      createNetworkRequest0.setNetworkName("5rW0L[ye %khIOB;(P");
      String string0 = createNetworkRequest0.getNetworkName();
      assertEquals("5rW0L[ye %khIOB;(P", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CreateNetworkRequest createNetworkRequest0 = new CreateNetworkRequest();
      createNetworkRequest0.setNetworkName("");
      String string0 = createNetworkRequest0.getNetworkName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CreateNetworkRequest createNetworkRequest0 = new CreateNetworkRequest();
      createNetworkRequest0.setNetworkId("");
      String string0 = createNetworkRequest0.getNetworkId();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CreateNetworkRequest createNetworkRequest0 = new CreateNetworkRequest();
      createNetworkRequest0.setFailIfExists((Boolean) null);
      Boolean boolean0 = createNetworkRequest0.getFailIfExists();
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CreateNetworkRequest createNetworkRequest0 = new CreateNetworkRequest();
      ContrailNetwork contrailNetwork0 = new ContrailNetwork((String) null, (String) null, (List<String>) null, (List<String>) null, (List<String>) null);
      createNetworkRequest0.setContrailNetwork(contrailNetwork0);
      ContrailNetwork contrailNetwork1 = createNetworkRequest0.getContrailNetwork();
      assertNull(contrailNetwork1.getShared());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CreateNetworkRequest createNetworkRequest0 = new CreateNetworkRequest();
      createNetworkRequest0.setCloudSiteId("5ISVyjyr^WpJF");
      String string0 = createNetworkRequest0.getCloudSiteId();
      assertEquals("5ISVyjyr^WpJF", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CreateNetworkRequest createNetworkRequest0 = new CreateNetworkRequest();
      createNetworkRequest0.setCloudSiteId("");
      String string0 = createNetworkRequest0.getCloudSiteId();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CreateNetworkRequest createNetworkRequest0 = new CreateNetworkRequest();
      createNetworkRequest0.setBackout((Boolean) null);
      Boolean boolean0 = createNetworkRequest0.getBackout();
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CreateNetworkRequest createNetworkRequest0 = new CreateNetworkRequest();
      Boolean boolean0 = createNetworkRequest0.getSkipAAI();
      createNetworkRequest0.setBackout(boolean0);
      Boolean boolean1 = createNetworkRequest0.getBackout();
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CreateNetworkRequest createNetworkRequest0 = new CreateNetworkRequest();
      // Undeclared exception!
      try { 
        createNetworkRequest0.setNetworkTechnology("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No enum constant org.openecomp.mso.adapters.nwrest.NetworkTechnology.
         //
         verifyException("java.lang.Enum", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      CreateNetworkRequest createNetworkRequest0 = new CreateNetworkRequest();
      String string0 = createNetworkRequest0.getNetworkType();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      CreateNetworkRequest createNetworkRequest0 = new CreateNetworkRequest();
      String string0 = createNetworkRequest0.getNetworkTechnology();
      assertEquals("NEUTRON", string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      CreateNetworkRequest createNetworkRequest0 = new CreateNetworkRequest();
      Boolean boolean0 = createNetworkRequest0.getFailIfExists();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      CreateNetworkRequest createNetworkRequest0 = new CreateNetworkRequest();
      ProviderVlanNetwork providerVlanNetwork0 = createNetworkRequest0.getProviderVlanNetwork();
      assertNull(providerVlanNetwork0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      CreateNetworkRequest createNetworkRequest0 = new CreateNetworkRequest();
      MsoRequest msoRequest0 = createNetworkRequest0.getMsoRequest();
      assertNull(msoRequest0.getServiceInstanceId());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      CreateNetworkRequest createNetworkRequest0 = new CreateNetworkRequest();
      String string0 = createNetworkRequest0.getNetworkName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      CreateNetworkRequest createNetworkRequest0 = new CreateNetworkRequest();
      String string0 = createNetworkRequest0.getNetworkId();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      CreateNetworkRequest createNetworkRequest0 = new CreateNetworkRequest();
      List<Subnet> list0 = createNetworkRequest0.getSubnets();
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      CreateNetworkRequest createNetworkRequest0 = new CreateNetworkRequest();
      String string0 = createNetworkRequest0.getNetworkTypeVersion();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      CreateNetworkRequest createNetworkRequest0 = new CreateNetworkRequest();
      boolean boolean0 = createNetworkRequest0.isContrailRequest();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      CreateNetworkRequest createNetworkRequest0 = new CreateNetworkRequest();
      Map<String, String> map0 = createNetworkRequest0.getNetworkParams();
      createNetworkRequest0.setNetworkParams(map0);
      assertNull(createNetworkRequest0.getNetworkName());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      CreateNetworkRequest createNetworkRequest0 = new CreateNetworkRequest();
      createNetworkRequest0.setTenantId("");
      String string0 = createNetworkRequest0.getTenantId();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      CreateNetworkRequest createNetworkRequest0 = new CreateNetworkRequest();
      LinkedList<Subnet> linkedList0 = new LinkedList<Subnet>();
      createNetworkRequest0.setSubnets(linkedList0);
      List<Subnet> list0 = createNetworkRequest0.getSubnets();
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      CreateNetworkRequest createNetworkRequest0 = new CreateNetworkRequest();
      ContrailNetwork contrailNetwork0 = createNetworkRequest0.getContrailNetwork();
      assertNull(contrailNetwork0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      CreateNetworkRequest createNetworkRequest0 = new CreateNetworkRequest();
      Boolean boolean0 = Boolean.valueOf(true);
      createNetworkRequest0.setFailIfExists(boolean0);
      Boolean boolean1 = createNetworkRequest0.getFailIfExists();
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      CreateNetworkRequest createNetworkRequest0 = new CreateNetworkRequest();
      String string0 = createNetworkRequest0.getTenantId();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      CreateNetworkRequest createNetworkRequest0 = new CreateNetworkRequest();
      String string0 = createNetworkRequest0.getCloudSiteId();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      CreateNetworkRequest createNetworkRequest0 = new CreateNetworkRequest();
      createNetworkRequest0.setNetworkId(", allocationPools=");
      String string0 = createNetworkRequest0.getNetworkId();
      assertEquals(", allocationPools=", string0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      CreateNetworkRequest createNetworkRequest0 = new CreateNetworkRequest();
      // Undeclared exception!
      try { 
        createNetworkRequest0.setNetworkTechnology((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Name is null
         //
         verifyException("java.lang.Enum", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      CreateNetworkRequest createNetworkRequest0 = new CreateNetworkRequest();
      createNetworkRequest0.setMsoRequest((MsoRequest) null);
      MsoRequest msoRequest0 = createNetworkRequest0.getMsoRequest();
      assertNull(msoRequest0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      CreateNetworkRequest createNetworkRequest0 = new CreateNetworkRequest();
      Boolean boolean0 = createNetworkRequest0.getBackout();
      assertTrue(boolean0);
  }
}