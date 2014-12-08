package cs.unlv.edu.sample;

import cs.unlv.edu.common.Utils;

public class Sample3 {

    public static final String TOP = "TOP";
    public static final String RIGHT = "RIGHT";
    public static final String BOTTOM = "BOTTOM";
    public static final String LEFT = "LEFT";

    public static void main(String[] args) {

        Utils.print("All available margins:");

        Utils.print(Sample3.TOP);
        Utils.print(Sample3.RIGHT);
        Utils.print(Sample3.BOTTOM);
        Utils.print(Sample3.LEFT);
    }

}
