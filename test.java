import java.util.Scanner;
class test {
	public static  void main(Strings[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter a value");
		int num=sc.nextInt();
		boolean isPrime=true;
		for(int i=2;i<num;i++) {
			if(num %i==0) {
				isPrime=false;
				break;
			}
		}
		if(isPrime)
		{
		    System.out.println(num+"is a prime number");
		}
		else {
			System.out.println(num+"is not a prime number");
		    
		}
		}
	}