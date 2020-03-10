package ikoala;

public class MainClass extends BaseClass {
	
	public static void main(String[] args) {
		
		launch();
		driver.get("https://www.ikoala.com.au/");
		
		PojoClass p =new PojoClass();
		
		
		click(p.getLogin());
		enter(p.getName(),"aravindswaami@gmail.com");
		enter(p.getPass(), "Aravind@123");
		click(p.getButton());
		enter(p.getSearch(),"love");
		click(p.getGo());
		enter(p.getSearch(),"sports");
		click(p.getGo());
		enter(p.getSearch(),"fashion");
		click(p.getGo());
	}
	
	

}
