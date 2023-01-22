package com.amazon.qa.Utils;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GenericFunctions 
{
	public static WebDriver driver;
	public static WebDriverWait WDWait;
	public static Select select;
	public static Actions act;

//-----------------------------WebElements Handling-------------------	
	//Send keys to textBox
	public static void sendKeysOnWebElement(WebElement element, String text)
	{
		element.click();
		element.clear();
		element.sendKeys(text);
	}

	//isDisplayed webElement
	public static boolean isDisplayed(WebElement element)
	{
		return element.isDisplayed();
		
	}
	
	//isEnabled webElement
	public static boolean isEnabled(WebElement element)
	{
		return element.isEnabled();
		
	}
	
	//isSelected webElement
	public static boolean isSelected(WebElement element)
	{
		return element.isSelected();
		
	}
	
	//getAttributes
	public static String getAttributes(WebElement element, String s1)
	{
		return element.getAttribute(s1);
		
	}
	
	//getCSSValue
	public static String getCssValues(WebElement element, String s1)
	{
		return element.getCssValue(s1);
		
	}
	
		
//-----------------------------Select : Handling DropDowns-------------------	
	//SelectByVisibleText
	public static void selectByVisibleText(WebElement element, String text)
	{
		select = new Select(element);
		select.selectByVisibleText(text);
		
	}
	
	//SelectByIndex
	public static void selectByIndex(WebElement element, int index)
	{
		select = new Select(element);
		select.selectByIndex(index); 
		
	}
	
	//SelectByValue
	public static void selectByValue(WebElement element, String name)
	{
		select = new Select(element);
		select.selectByValue(name); 
		
	}
	
	//DeSelectByValue
	public static void deSelectByValue(WebElement element, String name)
	{
		select = new Select(element);
		select.deselectByValue(name); 
		
	}
	
	//DeSelectByIndex
	public static void deSelectByIndex(WebElement element, int index)
	{
		select = new Select(element);
		select.deselectByIndex(index);
		
	}
	
	//DeSelectByVisibleText
	public static void deSelectByVisibleText(WebElement element, String text)
	{
		select = new Select(element);
		select.deselectByVisibleText(text);
		
	}
	//DeSelectAll
	public static void deSelectAll(WebElement element)
	{
		select = new Select(element);
		select.deselectAll();
		
	}
	
		
//-----------------------------Handling Alerts-------------------	
	//Accept Alert
	public static void acceptAlert(WebDriver driver)
	{
		driver.switchTo().alert().accept();
		
	}

	//Dismiss Alert
	public static void dismissAlert(WebDriver driver)
	{
		driver.switchTo().alert().dismiss();
		
	}
	
	//Get Alert text
	public static String getAlertText(WebDriver driver)
	{
		String AlertText = null;
		AlertText = driver.switchTo().alert().getText();
		return AlertText;
		
	}
//-----------------------------Actions : KeyBoard and Mouse Events-------------------	
	//Mouse hover and click(Left Click)
	public static void mouseHovreAndClick(WebElement element)
	{
		act = new Actions(driver);
		act.moveToElement(element).click().build().perform();
		
	}
	
	//Mouse ContextClick(Right Click)
	public static void mouseContextClick(WebElement element)
	{
		act = new Actions(driver);
		act.moveToElement(element).contextClick().build().perform();		
	}
	
	//Mouse DragAndDrop
	public static void mouseDragAndDrop(WebElement SrcElement, WebElement DestElement)
	{
		act = new Actions(driver);
		act.dragAndDrop(SrcElement, DestElement).build().perform();		
	}
	
	//Mouse ClickAndHold release
	public static void mouseClickAndHoldRelease(WebElement SrcElement, WebElement DestElement)
	{
		act = new Actions(driver);
		act.clickAndHold(SrcElement).moveToElement(DestElement).release().build().perform();		
	}
	
	//KeyBoard events : KeyUp
	public static void keyUps(String keys)
	{
		act = new Actions(driver);
		act.keyUp(keys).build().perform();
	}
	
	//KeyBoard events : KeyUp
	public static void keyUpTarget(WebElement target,String keys)
	{
		act = new Actions(driver);
		act.keyUp(target, keys);		
	}
	
	//KeyBoard events : KeyDown
	public static void keyDowns(String keys)
	{
		act = new Actions(driver);
		act.keyDown(keys).build().perform();
	}
	
	//KeyBoard events : KeyDown
	public static void keyDowns(WebElement target, String keys)
	{
		act = new Actions(driver);
		act.keyDown(target, keys).build().perform();
	}
	
//-----------------------------getWindowHandle------------------
	//To Handle current window(Parent Window)
	public String parentWindowHandle()
	{
		return driver.getWindowHandle();
	}
	
	//To Handle current window(Child Window)
	public Set<String> childWindowHandle()
	{
		return driver.getWindowHandles();
	}
	
	
	
}
