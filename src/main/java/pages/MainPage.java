package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage {

    @FindBy(tagName = "input", id = "OriginLocation_Combobox")
    private WebElement searchFieldFrom = driver.findElement(By.xpath(".//input[@id='OriginLocation_Combobox']"));
    private WebElement searchFieldTo = driver.findElement(By.xpath(".//input[@id='DestinationLocation_Combobox']"));
    private WebElement oneWayRadioButton = driver.findElement(By.xpath(".//label[text()='One-way']"));
    private WebElement returnRadioButton = driver.findElement(By.xpath(".//label[text()='Return']"));
    private WebElement calendarDepartureDate = driver.findElement(By.xpath(".//[@id='DepartureDate_Datepicker']"));
    private WebElement calendarReturneDate = driver.findElement(By.xpath(".//[@id='ReturnDate_Datepicker']"));
    private WebElement searchButton = driver.findElement(By.xpath(".//button[@type='submit' and text()='Search']"));


}
