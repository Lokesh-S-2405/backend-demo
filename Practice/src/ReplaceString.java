import java.util.Scanner;

public class ReplaceString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner scan=new Scanner(System.in);
      System.out.print("Input:");
      String string=scan.nextLine();
      string=replaceChar(string);
      System.out.println(string);
      scan.close();
	}

	private static String replaceChar(String string) {
		// TODO Auto-generated method stub
		int c=0;
		String str="";
		for (int i = 0; i < string.length(); i++) {
			c=string.charAt(i);
			if(c>65 && c<91) {
				str+=(char)(c+32);
			}else
			if(c>96 && c<123) {
				str+=(char)(c-32);
			}else {
				str+=(char)c;
			}
		}
		return str;
	}

}
