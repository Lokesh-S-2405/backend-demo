import java.util.Scanner;

public class StringSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner scan=new Scanner(System.in);
       System.out.println("enter the no of word");
       int N=scan.nextInt();
       String[] string=new String[N];
       for (int i = 0; i < string.length; i++) {
		string[i]=scan.next();
	}
    String[] sorted= bubbleSort(string);
    String[] insertion=insertionSort(string);
    for (int i = 0; i < sorted.length; i++) {
		System.out.print(sorted[i]+" ");
	}
    System.out.println();
    for (int i = 0; i < insertion.length; i++) {
		System.out.print(insertion[i]+" ");
	}
    scan.close();
	}

	private static String[] insertionSort(String[] string) {
		// TODO Auto-generated method stub
		for (int i = 1; i < string.length; i++) {
			String s=string[i];
			int j=i-1;
			while(j>=0 && string[j].compareTo(s)>0) {
			 string[j+1]=string[j];
			 j--;
			}
			string[j+1]=s;
		}
		return string;
	}

	private static String[] bubbleSort(String[] string) {
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

}
