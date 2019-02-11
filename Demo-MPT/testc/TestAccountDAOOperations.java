



import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.capgemini.beans.Account;
import com.capgemini.beans.Options;
import com.capgemini.dao.AccountDAO;
import com.capgemini.dao.AccountDAOImpl;





public class TestAccountDAOOperations {
	private AccountDAO daoRef;
	
    @Before
	public void setup(){
		
    	System.out.println("setting up dao object");
    	daoRef= new AccountDAOImpl();
    	
	}
	
	@Test
	public void test1() {
		// Assert.fail("Not yet implemented");
		System.out.println();
	}
	@Test
	public void test2()
	{
		
		
		//fail("not yet implemented")
		Account newAccount=new Account();
		newAccount.setId(13);
		newAccount.setBalance(5000);
		newAccount.setName("Subhash");
		boolean flag=daoRef.create(newAccount);
		assertTrue(flag);
		/*int id=newAccount.getId();
		boolean flag1=daoRef.delete(id);
		assertTrue(flag1);*/
		System.out.println();
		
		/*
		 *  -----------------this method is implemented for creating an account-----------------
		 * 
		 */
		/*Account newAccount1=new Account();
		newAccount1.setId(13);
		newAccount1.setBalance(5000);
		newAccount1.setName("Subhash");
		boolean flag1=daoRef.create(newAccount1);
		assertFalse(flag1);
		*/
		System.out.println();
	}
	
	/*@Test
	public void test3(){
		Account newAccount1=new Account();
		int id=newAccount1.getId();
		boolean flag1=daoRef.delete(id);
		assertTrue(flag1);
		
		System.out.println();
	}*/
	
	@Test
	public void test4()
	{
		Options option1 = null;
		List<Account> flag1=daoRef.sortAccountDetails(option1.byName);
		assertTrue(flag1!=null);
		List<Account> flag2=daoRef.sortAccountDetails(option1.byId);
		assertTrue(flag2!=null);
		
		System.out.println();
	}
	
	@Test
	public void test5()
	{
		Account a=daoRef.findById(2);
		assertTrue(a.getName().equals("Suhas"));
		
	}
	
	
	@After
	public void cleanup(){
		System.out.println("Cleaning up dao object");
		daoRef=null;
		System.out.println();
	}
}
  