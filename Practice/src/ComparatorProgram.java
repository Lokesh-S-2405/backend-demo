import java.util.Comparator;
import java.util.TreeSet;

class DescOrder implements Comparator<String>{
	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		
		return o2.length()-o1.length();
	}
	
}
public class ComparatorProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      DescOrder d=new DescOrder();
      TreeSet<String> t=new TreeSet<String>(d);
    
      t.add("bbb");
      t.add("adfds");
      t.add("aa");
      t.add("eeee");
      t.forEach(action->System.out.println(action));
	}

}
