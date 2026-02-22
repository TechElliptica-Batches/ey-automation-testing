package stepdef;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import tests.TestCaseBase;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Hooks {


    @Before
    public static void setup(){
        try{
            String env = System.getProperty("env");
            String browser = System.getProperty("browser");
            System.out.println("loading " + env+ ".properties file");
            System.out.println("browser : "  +browser + " loading.");

            File fl =new File(System.getProperty("user.dir")+ "/config/"+env+".properties");
            Properties prop = new Properties();
            prop.load(new FileInputStream(fl));
            String url = prop.getProperty("url");
            System.out.println(browser);
            System.out.println(url);
            TestCaseBase.openBrowser(browser);
            TestCaseBase.openUrl(url);
        }catch (Exception e){

        }
    }

    @After
    public static void teardown(){
        TestCaseBase.driver.close();
        TestCaseBase.driver = null;
    }



}
