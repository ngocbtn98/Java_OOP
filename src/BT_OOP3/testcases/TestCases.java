package BT_OOP3.testcases;

import BT_OOP3.common.BaseTest;

public class TestCases extends BaseTest {
    public void login() {
        System.out.println("Navigate to https://cms.anhtester.com/login");
        System.out.println("Enter email: admin@example.com");
        System.out.println("Enter password: 123456");
        System.out.println("Click login button");
    }

    public void testLogin() {
        createDriver();
        login();
        closeDriver("firefox");
    }

    public void testAddCategory() {
        createDriver();
        login();
        System.out.println("Click menu Products");
        System.out.println("Click menu Category");
        System.out.println("Click Add New Category button");
        System.out.println("Enter form data to add new category");
        System.out.println("Click Save button");
        closeDriver("firefox");
    }

    public static void main(String[] args) {
        TestCases testCases = new TestCases();
        testCases.testLogin();
        System.out.println("===============================");
        testCases.testAddCategory();
    }
}
