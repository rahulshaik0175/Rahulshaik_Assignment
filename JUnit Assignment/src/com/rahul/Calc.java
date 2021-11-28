//Question4
package com.rahul;

import java.util.stream.DoubleStream;

class Calc {
    static double add(double... operands) {
        return DoubleStream.of(operands).sum();
    }

	public static double add(int i, int j) {
		// TODO Auto-generated method stub
		return 0;
	}
}
