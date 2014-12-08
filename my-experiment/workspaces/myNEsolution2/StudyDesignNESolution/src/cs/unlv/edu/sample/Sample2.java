package cs.unlv.edu.sample;

import cs.unlv.edu.common.Utils;

public class Sample2 {

    public static final int OFF = 0;
    public static final int ON = 1;

    /*
     * Similar type of switch usage might be useful for the tasks.
     */
    public String turnSwitch(int action) {

        String result = "";

        switch (action) {
            case ON:
                result = "Switch turned on";
                break;
            case OFF:
                result = "Switch turned off";
                break;
            }

        return result;
    }

    public static void main(String[] args) {

        Sample2 obj = new Sample2();

        Utils.print(obj.turnSwitch(Sample2.OFF));
        Utils.print(obj.turnSwitch(Sample2.ON));
    }
}
