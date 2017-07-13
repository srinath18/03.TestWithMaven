import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import com.fanniemae.payroll.dao.IQuery;
import com.fanniemae.payroll.dao.SalesTaxRepository;
import com.fanniemae.payroll.dao.ShoppingRepository;

public class SalesTaxListTest {

	@Test
	public void testIFNYExist() {
		SalesTaxRepository s = new SalesTaxRepository();
		ArrayList<String> taxList = s.findAll();

		boolean isNewYorkAvailable = false;
		for (String string : taxList) {
			isNewYorkAvailable = string.contains("NY");
			if (isNewYorkAvailable)
				break;
			System.out.println(string);
		}

		assertTrue(isNewYorkAvailable);
	}

	@Test
	public void testShoppingList() {
		IQuery <String> s = new ShoppingRepository();

		ArrayList<String> list = s.findAll();
		int size = list.size();
		assertTrue(size > 4);

	}

}
