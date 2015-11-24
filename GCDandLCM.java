public class GCDandLCM {
   public static void main(String[] args) {
	   System.out.println(GCD(18,16));
	   System.out.println(LCM(18,16));
   }
   
   public static int GCD(int x, int y) {
	   
	   int r,a,b;
	   
	   if(x == y) {
		   return x;
	   }
	   
	   a = (x > y) ? x: y;
	   b = (x > y) ? y: x;
	   
	   r = b;
	   while(a % b != 0) {
		   r = a % b;
		   a = b;
		   b = r;
	   }
	   return r; 
   }
   
   
   public static int LCM(int x, int y) {
	   
	   if(x == y) {
		   return x;
	   }
	   
	   int a = (x > y) ? x: y;
	   
	   while( a % x != 0 || a % y != 0) {
		   a++;
	   }
	   
	   return a;
   }
   
}