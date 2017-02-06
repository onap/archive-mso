/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 14 09:34:29 GMT 2016
 */

package org.openecomp.mso.adapters.network.async.client;

import org.junit.Test;
import static org.junit.Assert.*;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class DeleteNetworkNotificationESTest extends DeleteNetworkNotificationESTestscaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DeleteNetworkNotification deleteNetworkNotification0 = new DeleteNetworkNotification();
      deleteNetworkNotification0.completed = true;
      boolean boolean0 = deleteNetworkNotification0.isCompleted();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DeleteNetworkNotification deleteNetworkNotification0 = new DeleteNetworkNotification();
      deleteNetworkNotification0.messageId = "";
      String string0 = deleteNetworkNotification0.getMessageId();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DeleteNetworkNotification deleteNetworkNotification0 = new DeleteNetworkNotification();
      MsoExceptionCategory msoExceptionCategory0 = MsoExceptionCategory.IO;
      deleteNetworkNotification0.setException(msoExceptionCategory0);
      MsoExceptionCategory msoExceptionCategory1 = deleteNetworkNotification0.getException();
      assertEquals(MsoExceptionCategory.IO, msoExceptionCategory1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DeleteNetworkNotification deleteNetworkNotification0 = new DeleteNetworkNotification();
      deleteNetworkNotification0.setErrorMessage("");
      String string0 = deleteNetworkNotification0.getErrorMessage();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DeleteNetworkNotification deleteNetworkNotification0 = new DeleteNetworkNotification();
      deleteNetworkNotification0.setMessageId("doA");
      String string0 = deleteNetworkNotification0.getMessageId();
      assertEquals("doA", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DeleteNetworkNotification deleteNetworkNotification0 = new DeleteNetworkNotification();
      deleteNetworkNotification0.setErrorMessage("aZ");
      String string0 = deleteNetworkNotification0.getErrorMessage();
      assertEquals("aZ", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DeleteNetworkNotification deleteNetworkNotification0 = new DeleteNetworkNotification();
      String string0 = deleteNetworkNotification0.getErrorMessage();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DeleteNetworkNotification deleteNetworkNotification0 = new DeleteNetworkNotification();
      boolean boolean0 = deleteNetworkNotification0.isCompleted();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DeleteNetworkNotification deleteNetworkNotification0 = new DeleteNetworkNotification();
      deleteNetworkNotification0.setNetworkDeleted((Boolean) null);
      assertFalse(deleteNetworkNotification0.isCompleted());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DeleteNetworkNotification deleteNetworkNotification0 = new DeleteNetworkNotification();
      Boolean boolean0 = deleteNetworkNotification0.isNetworkDeleted();
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DeleteNetworkNotification deleteNetworkNotification0 = new DeleteNetworkNotification();
      deleteNetworkNotification0.setCompleted(false);
      assertFalse(deleteNetworkNotification0.isCompleted());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DeleteNetworkNotification deleteNetworkNotification0 = new DeleteNetworkNotification();
      deleteNetworkNotification0.getException();
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DeleteNetworkNotification deleteNetworkNotification0 = new DeleteNetworkNotification();
      String string0 = deleteNetworkNotification0.getMessageId();
      assertNull(string0);
  }
}