
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Warlock warlock1 = new Warlock("Vecna", "Halucination", 100, 100);
		Warlock warlock2 = new Warlock("Eleven", "Telekinesis", 100, 80);
		
		System.out.println("First Warlock's info" +"\n" +"Name: "  +warlock1.getName() +"\n" +"Power Type: "  +warlock1.getPowerType() +"\n" +"Strength: "  +warlock1.getPower() +"\n" +"Health: "  +warlock1.getHealth());
		System.out.println("Second Warlock's info" +"\n" +"Name: "  +warlock2.getName() +"\n" +"Power Type: "  +warlock2.getPowerType() +"\n" +"Strength: "  +warlock2.getPower() +"\n" +"Health: "  +warlock2.getHealth());	
	
	if(warlock1.getPower()>warlock2.getPower()) {
		System.out.println(warlock1.getName() +"is more powerfull than" +warlock2.getPower());
	}
	else if(warlock1.getPower()<warlock2.getPower()) {
		System.out.println(warlock2.getName() +"is more powerfull than" +warlock1.getPower());
	}
	else {
		System.out.println("There is no winner!");
	}
	}
}
