/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 14 09:26:04 GMT 2016
 */

package org.openecomp.mso.adapters.tenantrest;

import org.junit.Test;
import static org.junit.Assert.*;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class RollbackTenantRequestESTest extends RollbackTenantRequestESTestscaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      RollbackTenantRequest rollbackTenantRequest0 = new RollbackTenantRequest();
      TenantRollback tenantRollback0 = new TenantRollback();
      rollbackTenantRequest0.setTenantRollback(tenantRollback0);
      tenantRollback0.setTenantCreated(true);
      TenantRollback tenantRollback1 = rollbackTenantRequest0.getTenantRollback();
      assertTrue(tenantRollback1.getTenantCreated());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      RollbackTenantRequest rollbackTenantRequest0 = new RollbackTenantRequest();
      TenantRollback tenantRollback0 = new TenantRollback();
      rollbackTenantRequest0.setTenantRollback(tenantRollback0);
      TenantRollback tenantRollback1 = rollbackTenantRequest0.getTenantRollback();
      assertSame(tenantRollback1, tenantRollback0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      RollbackTenantRequest rollbackTenantRequest0 = new RollbackTenantRequest();
      TenantRollback tenantRollback0 = rollbackTenantRequest0.getTenantRollback();
      assertNull(tenantRollback0);
  }
}