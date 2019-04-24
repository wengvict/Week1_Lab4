import java.util.Scanner;

public class SquaresAndCubes {

	public static void main(String[] args) {
		char keepPlaying = 0;
		int userNum;
		String f = "%-10s %-10s %-10s %n";
		Scanner scan = new Scanner(System.in);	
		
		System.out.println("Learn your squares and cubes!");	
		
		int j = 0;
		while (keepPlaying == 'y' || keepPlaying == 'Y' || j == 0) {
			
			System.out.print("\n" + "Enter an integer: ");
			userNum = scan.nextInt();
			
			System.out.printf(f , "Number" , "Squared" , "Cubed");
			System.out.printf(f, "=======" , "=======", "=======");
			
			int fillerNum = 1;
			for (int i = 0; fillerNum <= userNum; i++) {
				
				System.out.printf(f, fillerNum, numSquared(fillerNum), numCubed(fillerNum));
				fillerNum++;
			}
			System.out.print("Continue? (y/n) ");
			keepPlaying = scan.next().charAt(0);
			++j;
		}
		System.out.println("Bye!");
		scan.close();
	}
	public static int numSquared (int num) {
			return num * num;
	}
	
	public static int numCubed (int num) {
		return num * num * num;
	} 

}
