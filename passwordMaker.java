package passwordGenerator;
import java.util.Scanner;
import java.util.Random;
public class passwordMaker {

		
	public static void main(String[] args) {
		
	while(true) {
		System.out.println("How long do you want your password to be?");

	
		
		String upper= "QWERTYUIOPASDFGHJKLZXCVBNM";
		String lower= "qwertyuiopasdfghjklzxcvbnm";
		String num= "1234567890";
		String specialChars= "!@#$%^&*()){}<>";
		
		String combination=upper+lower+specialChars+num;

		Scanner input=new Scanner(System.in);
		int len =input.nextInt();
		
		char[] password=new char[len];
		Random r=new Random();
	
		
	
		
		for(int i=0;i<len;i++) {
			password[i]=combination.charAt(r.nextInt(combination.length()));
					
		}

		
	
		
		System.out.println("Genreated password is: "+new String(password));
		int i = 0;
		i++;
		}
	}
	}

	


	


    //	for(int i=0;i<len;i++) {
	//password[i]=combination.charAt(r.nextInt(combination.length()));
	
    
    