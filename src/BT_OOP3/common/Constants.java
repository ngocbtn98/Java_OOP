package BT_OOP3.common;

public class Constants {
     public static String BROWSER = "Firefox";
     public static boolean REPORT = true;
     public static boolean HEADLESS = true;

    public static String getBROWSER() {
        return BROWSER;
    }

    public static void setBROWSER(String BROWSER) {
        Constants.BROWSER = BROWSER;
    }

    public static boolean isREPORT() {
        return REPORT;
    }

    public static void setREPORT(boolean REPORT) {
        Constants.REPORT = REPORT;
    }

    public static boolean isHEADLESS() {
        return HEADLESS;
    }

    public static void setHEADLESS(boolean HEADLESS) {
        Constants.HEADLESS = HEADLESS;
    }
}
