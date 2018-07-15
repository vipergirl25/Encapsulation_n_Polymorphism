package _01_introduction_to_encapsulation;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EncapsulateTheDataTest {
	EncapsulateTheData e = new EncapsulateTheData();

	@Test
	void test() {
		try {
			e.setItemsReceived(-1);
			fail("boo");
		}catch(IndexOutOfBoundsException e) {
			e.printStackTrace();
			assertTrue(true);
		}
		try {
			e.setDegreesTurned(-1.0f);
			fail("boo");
		}catch(IndexOutOfBoundsException e) {
			e.printStackTrace();
			assertTrue(true);
		}
		try {
			e.setNomenclature("");
			fail("boo");
		}catch(IndexOutOfBoundsException e) {
			e.printStackTrace();
			assertTrue(true);
		}
		try {
			e.setMemberObj("hi");
			fail("boo");
		}catch(IndexOutOfBoundsException e) {
			e.printStackTrace();
			assertTrue(true);
		}
	}
	

}
