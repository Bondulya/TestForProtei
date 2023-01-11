import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {
    private final WebDriver driver;


    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    private final By emailLoginInput = By.className("loginEmail");
    private final By passwordInput = By.className("loginPassword");
    private final By enterButton = By.xpath(".//div[@class='uk-form-row']/button[text()='Вход']");
    private final By emailInput = By.xpath(".//input[@id='dataEmail']");
    private final By nameInput = By.xpath(".//input[@id='dataName']");
    private final By sexOptions = By.xpath(".//select[@id='dataGender']");
    private final By option11Input = By.xpath(".//input[@id='dataCheck11']");
    private final By option12Input = By.xpath(".//input[@id='dataCheck12']");
    private final By option21Input = By.xpath(".//input[@id='dataSelect21']");
    private final By option22Input = By.xpath(".//input[@id='dataCheck22']");
    private final By option23Input = By.xpath(".//input[@id='dataCheck23']");

    public void login(){
        driver.findElement(emailLoginInput).sendKeys("test@protei.ru");
        driver.findElement(passwordInput).sendKeys("test");
        driver.findElement(enterButton).click();
    }

    public void setEmailInput(String email){
        driver.findElement(emailInput).sendKeys(email);
    }
    public void setNameInput(String name){
        driver.findElement(nameInput).sendKeys(name);
    }
    public void setSexOptions(String sex){
        driver.findElement(sexOptions).click();
        driver.findElement(By.xpath(".//select[@id=dataGender]/option[text()='"+sex+"']")).click();
    }
    public void setOption11Input(){
        driver.findElement(option11Input).click();
    }
    public void setOption12Input(){
        driver.findElement(option12Input).click();
    }
    public void setOption21Input(){
        driver.findElement(option21Input).click();
    }
    public void setOption22Input(){
        driver.findElement(option22Input).click();
    }
    public void setOption23Input(){
        driver.findElement(option23Input).click();
    }





}
