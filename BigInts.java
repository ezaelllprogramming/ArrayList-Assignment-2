import java.util.ArrayList;

public class BigInts {
    
    public static ArrayList<Integer> BigInt (String input1) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
		char[] digits = input1.toCharArray();
		for(int i = 0; i < digits.length; i++) {
            nums.add(Character.getNumericValue(digits[i]));
		}
        return nums;
    }
    
	public static void main(String[] args) {
	    ArrayList<Integer> a = new ArrayList<Integer>();
	    a = BigInt("135797531");
		System.out.println(a);
		System.out.println("+");
		ArrayList<Integer> b = new ArrayList<Integer>();
	    b = BigInt("975313579");
		System.out.println(b);
		System.out.println("=");
		
		ArrayList<Integer> c = new ArrayList<Integer>();
		
		int add1 = 0;
		
		if (b.size()< a.size()){
		    int diff = a.size()-b.size();
		    for (int j=0;j<diff;j++){
		        System.out.println(j);
		        b.add(0,0);
		    }
		}
		else if (a.size()< b.size()){
		   int diff = b.size()-a.size();
		   for (int j=0;j<diff;j++){
		        a.add(0,0);
		    }
		}
		for (int i=a.size()-1;i>=0;i--){
		    int sumab = a.get(i)+b.get(i) + add1;
		    if (sumab >=10){
		        c.add(0,sumab-10);
		        add1 = 1;
		    }
		    else{
		        c.add(0,sumab);
		        add1=0;
		    }
		}
		if (add1 ==1){
		    c.add(0,1);
		}
		System.out.println(c);
	}
}
