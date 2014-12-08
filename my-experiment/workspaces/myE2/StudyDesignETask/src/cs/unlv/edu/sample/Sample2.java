package cs.unlv.edu.sample;

import cs.unlv.edu.common.Utils;

public class Sample2 {

    public enum Switch {
        OFF, ON;
    }

    /*
     * Similar type of switch usage might be useful for the tasks.
     */
    public String turnSwitch(Switch action) {

        String result = "";

        switch (action) {
            case OFF:
                result = "Switch turned off";
                break;
            case ON:
                result = "Switch turned on";
                break;
            }

        return result;
    }

    public static void main(String[] args) {
        
        Sample2 obj = new Sample2();

        Utils.print(obj.turnSwitch(Switch.OFF));
        Utils.print(obj.turnSwitch(Switch.ON));
    }
}
