import java.util.Scanner;

public class StringProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner scan=new Scanner(System.in);
 System.out.print("Input:");
 String str=scan.nextLine();
 String string=removeDuplicate(str);
 String evenPos=uppercaseEvenPos(string);
 
 System.out.println(string);
 System.out.println(evenPos);
 scan.close();
	}

	private static String uppercaseEvenPos(String string) {
		// TODO Auto-generated method stub
	String str="";
		for (int i = 0; i < string.length(); i++) {
			int c=string.charAt(i);
			if(i%2!=0 && (c>64 || c<91)) {
				str=str+(char)(c-32);
			}
			else
			{
				str=str+(char)c;
			}
		}
		return str;
	}

	private static String removeDuplicate(String str) {
		// TODO Auto-generated method stub
		int arr[]=new int[123];
		String string="";
		for (int i = 0; i < str.length(); i++) {
			arr[str.charAt(i)]++;
		}
		for (int i = 0; i < str.length(); i++) {
			if(arr[str.charAt(i)]==1) {
				string=string+str.charAt(i);
			}
		}
		return string;
	}

}
