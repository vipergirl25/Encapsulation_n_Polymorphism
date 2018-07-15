package _01_introduction_to_encapsulation;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

/*
 * Encapsulation is a way of protecting the data in a class from being
 * unintentionally altered from another class.
 * 
 * To encapsulate a member variable, follow these three steps:
 * 
 * 1. Make the member variable private (or protected)
 * 
 * 2. Make a getter and setter method (accessor and mutator) for the variable.
 * 
 * 3. Add restrictions to the setter method so the member variable cannot be 
 * 	  adversely altered
 * 
 * */


public class EncapsulateTheData extends Exception {
	//1. Encapsulate the member variables.
	//   Add restrictions to the setters according to the comment.
	
	//2. Create a new JUnit Test case and write tests to verify that 
	//   the member variables' getters and setters are working
	
	private int itemsReceived; //must not be negative. All negative arguments get set to 0.
	private float degreesTurned; //must be locked between 0.0 and 360.0 inclusive.
	private String nomenclature = " "; //must not be set to a blank string. Blank Strings get set to a space
	private Object memberObj; //can be any object type except String. Strings get turned into objects.
	public int getItemsReceived() {
		return itemsReceived;
	}

	public void setItemsReceived(int itemsReceived) throws IndexOutOfBoundsException{
		if(itemsReceived<0) {
			itemsReceived = 0;
			throw new IndexOutOfBoundsException();
		}
		this.itemsReceived = itemsReceived;
	}

	public float getDegreesTurned() {
		return degreesTurned;
	}

	public void setDegreesTurned(float degreesTurned) throws IndexOutOfBoundsException {
		if(degreesTurned<0.0 || degreesTurned>360.0) {
			degreesTurned = 0;
			throw new IndexOutOfBoundsException();
		}
		this.degreesTurned = degreesTurned;
	}

	public String getNomenclature() {
		return nomenclature;
	}

	public void setNomenclature(String nomenclature) throws IndexOutOfBoundsException {
		if(nomenclature.equals("") ) {
			nomenclature =  " ";
			throw new IndexOutOfBoundsException();
		}
		this.nomenclature = nomenclature;
	}

	public Object getMemberObj() {
		return memberObj;
	}

	public void setMemberObj(Object memberObj) throws IndexOutOfBoundsException {
		if(memberObj instanceof String) {
			Object obj = new Object();
			memberObj = obj;
			throw new IndexOutOfBoundsException();
		}
		this.memberObj = memberObj;
	}
}
