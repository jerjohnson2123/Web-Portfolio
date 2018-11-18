import java.util.Scanner;
import java.util.Calendar;

public class Program
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		People p1 = new People();
		p1.setName(sc.nextLine());
		p1.setAge(sc.nextInt());
		p1.setHobby(sc.next());
		
		int birthYear = Calendar.getInstance().get(Calendar.YEAR) - p1.getAge();
		
		System.out.println("Your name is " + p1.getName() + ".");
		System.out.println("I know your name now! \n");
		System.out.println("I bet I know how old you are too.");
		
		switch(birthYear){
		    case 1983:
		        	System.out.println("You are " + p1.getAge() + " years old, " + "born in " + birthYear + ", ");
		    break;
		    case 1984:
		        	System.out.println("You are " + p1.getAge() + " years old, " + "born in " + birthYear + ", ");
		    break;
		    case 1985:
		        	System.out.println("You are " + p1.getAge() + " years old, " + "born in " + birthYear + ", ");
		    break;
		    case 1986:
		        	System.out.println("You are " + p1.getAge() + " years old, " + "born in " + birthYear + ", ");
		    break;
		    case 1987:
		        	System.out.println("You are " + p1.getAge() + " years old, " + "born in " + birthYear + ", ");
		    break;
		    case 1988:
		        	System.out.println("You are " + p1.getAge() + " years old, " + "born in " + birthYear + ", ");
		    break;
		    case 1989:
		       	    System.out.println("You are " + p1.getAge() + " years old, " + "born in " + birthYear + ", ");
		    break;
		    case 1990:
		        	System.out.println("You are " + p1.getAge() + " years old, " + "born in " + birthYear + ", ");
		    break;
		    case 1991:
		        	System.out.println("You are " + p1.getAge() + " years old, " + "born in " + birthYear + ", ");
		    break;
		    case 1992:
		        	System.out.println("You are " + p1.getAge() + " years old, " + "born in " + birthYear + ", ");
		    break;
		    case 1993:
		        	System.out.println("You are " + p1.getAge() + " years old, " + "born in " + birthYear + ", ");
		    break;
		    case 1994:
		        	System.out.println("You are " + p1.getAge() + " years old, " + "born in " + birthYear + ", ");
		    break;
		    case 1995:
		        	System.out.println("You are " + p1.getAge() + " years old, " + "born in " + birthYear + ", ");
		    break;
		    case 1996:
		        	System.out.println("You are " + p1.getAge() + " years old, " + "born in " + birthYear + ", ");
		    break;
		    case 1997:
		        	System.out.println("You are " + p1.getAge() + " years old, " + "born in " + birthYear + ", ");
		    break;
		    case 1998:
		        	System.out.println("You are " + p1.getAge() + " years old, " + "born in " + birthYear + ", ");
		    break;
		    case 1999:
		        	System.out.println("You are " + p1.getAge() + " years old, " + "born in " + birthYear + ", ");
		    break;
		    default:
		        System.out.println("unknonw");
		}
	
		System.out.println("and your favorite hobby is " + p1.getHobby() + ".\n");
		
		People p2 = new People();
		p2.setName(sc.next());
		p2.setAge(sc.nextInt());
		
		int ageDifferenceP1 = p1.getAge() - p2.getAge();
		int ageDifferenceP2 = p2.getAge() - p1.getAge();
		
		if(p1.getAge() > p2.getAge()){
	    	System.out.println(p2.getName() + " is " + p2.getAge() + " years old, " + "and you are " + ageDifferenceP1 + " year(s) older than " + p2.getName() + ".");
		} else if (p1.getAge() < p2.getAge()){
		    System.out.println(p2.getName() + " is " + p2.getAge() + " years old, " + "and you are " + ageDifferenceP2 + " year(s) younger than " + p2.getName() + ".");
		} else if (p1.getAge() == p2.getAge()){
		    System.out.println("You and " + p2.getName() + " are the same age.");
		} else {
		    System.out.println("Enter a valid age.");
		}
	}
}

public class People{
    private String name;
    private int age = 0;
    private String hobby;
    
    public String getName(){
        return name;
    }
    
    public void setName(String n){
        this.name = n;
    }
    
    public int getAge(){
        return age;
    }
    
    public void setAge(int a){
        this.age = a;
    }
    
    public String getHobby(){
        return hobby;
    }
    
    public void setHobby(String h){
        this.hobby = h;
    }
}