import java.util.ArrayList;

class Goldbach {
    
     public static ArrayList<Integer> prime( ArrayList<Integer> nums ) {
         int size = nums.size() + 1;
         int lastnums = nums.get(nums.size()-1);
         
         for(int i = 0; i < lastnums; i++) {
            if(i < nums.size()) {
                int p = nums.get(i);
                if(p < size) {
                    for(int j = p; j <= size; j++){
                        if(j > p) {
                            if(j % p == 0) {
                                nums.remove((Integer) j);
                            }
                        } 
                    }
                }
            }
         }
         return nums;
    }
    
    public static void main (String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        int n = 100;
        for(int i = 2; i <= n; i++) {
            nums.add(i);
        }
        //System.out.println("List of primes: " + 
        prime(nums);//);
        int nom = 68;
        int i = 0;
        boolean next = true;
        while(next) {
            int diff = nom - nums.get(i);   
            if(nums.contains(diff)) {
                System.out.println(nums.get(i) + " + " + diff + " = " + nom);
                next = false;
            }
            i++;
        }
    }
    
    
}
