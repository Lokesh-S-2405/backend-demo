

public class Demo {
  
	public static void main(String[] args) {
		   
		// TODO Auto-generated method stub
//      String string="Wings of fire";
//       char c='i';
//      int  a=(char) (c+1);
//      System.out.println(a);
//     
//  		// TODO Auto-generated method stub
//  		String str="";
//  		int c=0;
//  		for (int i = 0; i < string.length(); i++) {
//  			c=string.charAt(i);
//  			if(i%2!=0 && (c>96 && c<123)) {
//  				str=str+(char)(c-32);
//  			}else {
//  				str=str+(char)c;
//  			}
//  	
//  				
//  			
//  		}
//  		System.out.println(str);
////  		return null;
//  	}
//		
//		for (int i = 0; i<5; i++) {
//			for (int j = 0; j < 5; j++) {
//				System.out.print("*");
//			}
//			System.out.println(" ");
//		}
		 
		/*      ---*                 i(row)      k(space)    j(*)
		 *      --***                1           3            1 
		 *      -*****               2           2            3
		 *                           3           1            5 
		 *                          (i<=3)      (3-i+1)      (2*i-1)     
		 *     1 2 3
		 *     2 3 1
		 *          5-2*i
		 */
		for (int i = 1; i<=3; i++) {
			for (int k = 1; k <= 3-i+1; k++) {
				System.out.print(" ");
			}
			for (int j = 1; j <=2*i-1; j++) {
				if(i!=1 && (j==1||j==(2*i)-1)) {
				System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println(" ");
		}
		for (int i = 1; i<=2; i++) {
			for (int k = 1; k <= i+1; k++) {
				System.out.print(" ");
			}
			for (int j = 1; j <=5-(2*i); j++) {
				
				if((j==1||j==5-(2*i)) && i!=2) {
				System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println(" ");
		}
//		for (int i = 1; i<=3; i++) {
//			for (int k = 1; k <= 3-i+1; k++) {
//				System.out.print(" ");
//			}
//			for (int j = 1; j <=2*i-1; j++)
//			{
//				if(i==1 ||i==3 || j==1||j==(2*i)-1)
//				{
//				System.out.print("*");
//				}
//				else
//				{
//					System.out.print(" ");
//				}
//			}
//			System.out.println(" ");
//		}
//		
	}
}
