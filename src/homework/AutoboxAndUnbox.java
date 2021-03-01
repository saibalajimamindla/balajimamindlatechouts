package homework;

import java.io.*;
import java.util.*;

class AutoboxAndUnbox {
	public static void main(String[] args) {
		// unboxing the object
		
		Byte b = new Byte((byte) 10);

		int b1 = b;

		System.out.println("Value of i: " + b);
		System.out.println("Value of i1: " + b1);
		

		Short s = new Short((short) 10);
		short s1 = s;

		System.out.println("Value of i: " + s);
		System.out.println("Value of i1: " + s1);
		Integer i = new Integer(10);

		int i1 = i;

		System.out.println("Value of i: " + i);
		System.out.println("Value of i1: " + i1);

		Long l = new Long(10);

		long l1 = l;

		System.out.println("Value of i: " + l);
		System.out.println("Value of i1: " + l1);

		Float f = new Float(10);

		float f1 = l;

		System.out.println("Value of i: " + f);
		System.out.println("Value of i1: " + f1);

		Double d = new Double(10);

		double d1 = l;

		System.out.println("Value of i: " + d);
		System.out.println("Value of i1: " + d1);

		Character gfg = new Character('a');

		char ch = gfg;
		System.out.println("Value of ch: " + ch);
		System.out.println("Value of gfg: " + gfg);
		
		
		
		
		
		
		
		Byte by = (byte) 10;

		int by1 = b;

		System.out.println("Value of i: " + by);
		System.out.println("Value of i1: " + by1);
		

		Short sh = (short) 10;
		short sh1 = s;

		System.out.println("Value of i: " + sh);
		System.out.println("Value of i1: " + sh1);
		
		Integer in = 10;

		int in1 = i;

		System.out.println("Value of i: " + in);
		System.out.println("Value of i1: " + in1);

		Long lo = (long) 10;

		long lo1 = l;

		System.out.println("Value of i: " + lo);
		System.out.println("Value of i1: " + lo1);

		Float fl = (float) 10;

		float fl1 = l;

		System.out.println("Value of i: " + fl);
		System.out.println("Value of i1: " + fl1);

		Double dou = 10.0;

		double do1 = l;

		System.out.println("Value of i: " + dou);
		System.out.println("Value of i1: " + do1);

		Character cha ='a';

		char cha1 = gfg;
		System.out.println("Value of ch: " + cha);
		System.out.println("Value of gfg: " + cha1);

	}
}