/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 14 09:25:22 GMT 2016
 */

package org.openecomp.mso.adapters.tenantrest;

import org.junit.Test;
import static org.junit.Assert.*;

import org.openecomp.mso.openstack.exceptions.MsoExceptionCategory;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class TenantExceptionResponseESTest extends TenantExceptionResponseESTestscaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MsoExceptionCategory msoExceptionCategory0 = MsoExceptionCategory.OPENSTACK;
      TenantExceptionResponse tenantExceptionResponse0 = new TenantExceptionResponse((String) null, msoExceptionCategory0, true);
      Boolean boolean0 = tenantExceptionResponse0.getRolledBack();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TenantExceptionResponse tenantExceptionResponse0 = new TenantExceptionResponse("sxH3DHvAo$");
      String string0 = tenantExceptionResponse0.getMessage();
      assertEquals("sxH3DHvAo$", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MsoExceptionCategory msoExceptionCategory0 = MsoExceptionCategory.OPENSTACK;
      TenantExceptionResponse tenantExceptionResponse0 = new TenantExceptionResponse((String) null, msoExceptionCategory0, true);
      MsoExceptionCategory msoExceptionCategory1 = tenantExceptionResponse0.getCategory();
      assertSame(msoExceptionCategory0, msoExceptionCategory1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      TenantExceptionResponse tenantExceptionResponse0 = new TenantExceptionResponse("");
      tenantExceptionResponse0.setMessage("1LGUz =Y?.wyJ");
      assertNull(tenantExceptionResponse0.getCategory());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TenantExceptionResponse tenantExceptionResponse0 = new TenantExceptionResponse("");
      Boolean boolean0 = tenantExceptionResponse0.getRolledBack();
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      TenantExceptionResponse tenantExceptionResponse0 = new TenantExceptionResponse("");
      tenantExceptionResponse0.setCategory((MsoExceptionCategory) null);
      assertEquals("", tenantExceptionResponse0.getMessage());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      TenantExceptionResponse tenantExceptionResponse0 = new TenantExceptionResponse();
      String string0 = tenantExceptionResponse0.getMessage();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      TenantExceptionResponse tenantExceptionResponse0 = new TenantExceptionResponse("");
      String string0 = tenantExceptionResponse0.getMessage();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MsoExceptionCategory msoExceptionCategory0 = MsoExceptionCategory.INTERNAL;
      TenantExceptionResponse tenantExceptionResponse0 = new TenantExceptionResponse("", msoExceptionCategory0, false);
      Boolean boolean0 = tenantExceptionResponse0.getRolledBack();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      TenantExceptionResponse tenantExceptionResponse0 = new TenantExceptionResponse("");
      tenantExceptionResponse0.setRolledBack((Boolean) null);
      assertNull(tenantExceptionResponse0.getCategory());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      TenantExceptionResponse tenantExceptionResponse0 = new TenantExceptionResponse("");
      tenantExceptionResponse0.getCategory();
  }
}