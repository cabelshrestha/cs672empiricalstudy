package cs.unlv.edu.sample;

import cs.unlv.edu.common.Utils;

public class Sample3 {

	public enum Margin {
		TOP, RIGHT, BOTTOM, LEFT;
	}

	public static void main(String[] args) {

		Utils.print("All available margins:");

		for (Margin m : Margin.values()) {
			Utils.print(m.toString());
		}
	}

}
