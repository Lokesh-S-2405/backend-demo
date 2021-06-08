import java.util.Scanner;

public class StringSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
	       System.out.println("enter the no of word");
	       int N=scan.nextInt();
	       String[] string=new String[N];
	       for (int i = 0; i < string.length; i++) {
			string[i]=scan.next();
		}
	       System.out.println("Enter the string to find");
	       String search=scan.next();
	       String[] string1=sortString(string);
	       System.out.println("After sorted");
	       for (int i = 0; i < string1.length; i++) {
			System.out.print(string1[i]+" ");
		}
	       System.out.println();
	       int count=binarySearch(string1,search);
	       if(count==-1) {
	    	   System.out.println("No search string");
	       }else {
	    	   System.out.println(count);
	       }
	       scan.close();
	}

	private static String[] sortString(String[] string) {
		// TODO Auto-generated method stub
		
			// TODO Auto-generated method stub
			for (int i = 0; i < string.length; i++) {
				for (int j = i+1; j < string.length; j++) {
					if(string[i].compareTo(string[j])>0) {
						String str=string[i];
						string[i]=string[j];
						string[j]=str;
					}
				}
			}
			return string;
	}

	private static int binarySearch(String[] string1,String search) {
		// TODO Auto-generated method stub
		int leftIndex=0;
		int rightIndex=string1.length-1;
		while(leftIndex<=rightIndex) {
			int mid=(leftIndex+rightIndex)/2;
			int res=search.compareTo(string1[mid]);
			if(res==0) {
				return mid;
			}
			if(res<0) {
				rightIndex=mid-1;
			}else {
				leftIndex=mid+1;
			}
		}
		return -1;
	}

}
