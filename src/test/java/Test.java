import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

@RunWith(Parameterized.class)
public class Test {
    MainPage objTest;
    WebDriver driver;
    private final String email;
    private final String name;
    private final String sex;
    private final int option;

    public Test(String email, String name, String sex, int option) {
        this.email = email;
        this.name = name;
        this.sex = sex;
        this.option = option;
    }

    @Parameterized.Parameters
    public static Object[][] getTest(){
        return new Object[][]{
                {"warcons8@gmail.com", "Максим", "Мужской", 0},
                {"warcons8@gmail.com", "Максим", "Мужской", 1},
                {"maks-max98@gmail.com", "Max", "Мужской", 2},
                {"gooll@mail.ru", "Оля", "Женский", 3},
                {"warcons8@gmail.com", "Максим", "Мужской",4},
                {"maks-max98@gmail.com", "Max", "Мужской", 5},
                {"gooll@mail.ru", "Оля", "Женский", 6},
                {"warcons8@gmail.com", "Максим", "Мужской", 7},
                {"maks-max98@gmail.com", "Max", "Мужской", 8},
                {"gooll@mail.ru", "Оля", "Женский", 9},
                {"warcons8@gmail.com", "Максим", "Мужской", 10},
                {"maks-max98@gmail.com", "Max", "Мужской", 11},
                {"gooll@mail.ru", "Оля", "Женский", 12},
        };
    }

    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("file:///C:/Users/bondu/Downloads/qa-test%20(1).html");
        objTest = new MainPage(driver);
        objTest.login();
    }

    @org.junit.Test
    public void setObjTest(){
        objTest.setEmailInput(email);
        objTest.setNameInput(name);
        objTest.setSexOptions(sex);
        testSwitch(option);
        String text = driver.findElement(By.xpath(".//table[@id='dateTable']/tbody/tr")).getText();
        List<WebElement> elements = driver.findElements(By.xpath(".//table[@id='dateTable']/tbody/tr"));
        Assert.assertTrue(elements.size()>0);
    }

    private void testSwitch(int option){
        switch (option){
            case (0):
                break;
            case (1):
                objTest.setOption11Input();
                objTest.setOption21Input();
                break;
            case (2):
                objTest.setOption11Input();
                objTest.setOption22Input();
                break;
            case (3):
                objTest.setOption11Input();
                objTest.setOption23Input();
                break;
            case (4):
                objTest.setOption12Input();
                objTest.setOption21Input();
                break;
            case (5):
                objTest.setOption12Input();
                objTest.setOption22Input();
                break;
            case (6):
                objTest.setOption12Input();
                objTest.setOption23Input();
                break;
            case (7):
                objTest.setOption11Input();
                objTest.setOption12Input();
                objTest.setOption21Input();
                break;
            case (8):
                objTest.setOption11Input();
                objTest.setOption12Input();
                objTest.setOption22Input();
                break;
            case (9):
                objTest.setOption11Input();
                objTest.setOption12Input();
                objTest.setOption23Input();
                break;
            case (10):
                objTest.setOption21Input();
                break;
            case (11):
                objTest.setOption22Input();
                break;
            case (12):
                objTest.setOption23Input();
                break;

        }
    }

    @After
    public void teardown(){
        driver.quit();
    }



}
