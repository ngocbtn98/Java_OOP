package BT_OOP3.common;

import static BT_OOP3.common.Constants.*;

public class BaseTest{
    // ham hien thi thong tin
    public void createDriver() {
        System.out.println("Browser: " + Constants.getBROWSER());
        System.out.println("Report: " + Constants.isREPORT());
        System.out.println("Headless: " + Constants.isHEADLESS());
    }
    // ham co truyen tham so
    public void closeDriver(String browser) {
        System.out.println("Closed browser: " + browser);
    }

}
