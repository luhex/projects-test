package cn.gds.junit;

import junit.framework.TestCase;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestCalcuate extends TestCase{
	Calcuate cal;
	
	@Before
	public void setUp() throws Exception{
		// TODO Auto-generated method stub
       cal = new Calcuate();
	}
	
	@Test
	public void testAdd() {
		// TODO Auto-generated method stub
       int rel = cal.add(12,23);
      assertEquals("�ӷ�������",rel,34);
	}
	
	@Test
	public void testMinus(){
		int rel = cal.minus(23, 12);
		assertEquals("����������", rel,12);
		
	}
	
	@Test(timeout=200)
	public void testMul(){
		try{
			Thread.sleep(300);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		int rel = cal.divide(20, 10);
		
		assertEquals("����������",rel,2);
	}
	
	
}
