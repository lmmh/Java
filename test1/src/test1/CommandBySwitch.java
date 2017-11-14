package test1;
import java.util.Scanner;
public class CommandBySwitch {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("1-×¢²á²Ù×÷£¬2-µÇÂ¼²Ù×÷£¬0-ÍË³ö");
		int num = scan.nextInt();
        switch(num){
        case 1:
        	System.out.println("×¢²á²Ù×÷£¡");
        	break;
        case 2:
        	System.out.println("µÇÂ¼²Ù×÷£¡");
        	break;
        case 0:
        	System.out.println("ÍË³ö£¡");
        	break;
        default:
        	System.out.println("Î´ÖªÖ¸Áî£¡");
        }
        
	}

}
