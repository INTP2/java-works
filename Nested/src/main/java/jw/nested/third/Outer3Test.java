package jw.nested.third;

import comparison.Outer3;
import comparison.Outer3.Inner3;

public class Outer3Test extends Outer3 {

	public static void main(String[] args) {
		Outer3 foo = new Outer3();
		Outer3.Inner3 foo2 = foo.new Inner3();

	}

}
