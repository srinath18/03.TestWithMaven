import static org.junit.Assert.*;

import org.junit.Test;

import com.fanniemae.payroll.dao.CarRepository;

public class CarTest {

	@Test
	public void testSizeFor5Items() {

		CarRepository carRep = new CarRepository();
		
		int size = carRep.findMaps().size();
		assertTrue ("size is:" + size, size ==8);
		
	}

}
