package Selenium;

public class TestConcatination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String before_xpath="//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/table/tbody/tr[";
		String after_xpath="]/td[2]";
		int i = 2;
		System.out.println(before_xpath+i+after_xpath);

	}

}
