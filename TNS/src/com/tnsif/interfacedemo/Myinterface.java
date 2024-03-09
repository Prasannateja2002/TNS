//nested interface:

package com.tnsif.interfacedemo;

public interface Myinterface {

		// Outter interface

			 void calculatearea();
			 
			 // nested(inner ) interface
			 
			 interface Myinnerinterface{
				 int id=20;    // data member
				 
				 void print();
			 }


}
