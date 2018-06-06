


public class Practice{
	
	public static void main(String args[]){
	
	String sy= "syesssssssdmohdsoban";
	int l=sy.length();
	int c=0;

	for(int i=0;i<l;i++){
		if(sy.charAt(i)=='s'){
		c++;}
	}
	
	System.out.println(c);
	
	
	
	
}}





/*import java.util.Arrays;
import java.util.Scanner;

public class Practice{
	public static void main(String args[]){
int[] arr1 = new int[]{0,1,2,11,22,31,111};

for(int i=arr1[0];i<=arr1.length;i++){
	
	
	int result=arr1[i]*2;
	if(result%10==2){System.out.println("result"+result);}
	else{System.out.println(result);}
	
}
	}
	}
/*import java.util.Scanner;

public class Practice{
	
	
	public static void main(String args[]){
		
		System.out.println("Enter the number: \n");
		Scanner s= new Scanner(System.in);
		
		 System.out.print("Enter Starting Number : ");
int start=s.nextInt();
System.out.print("Enter Ending Number : ");
int end=s.nextInt();
System.out.print("Prime Numbers Between " + start + " and " +end+ " is :\n");

int i;

		for(i=start; i<end; i++){
			int count = 0;
			
			for(int j=2;j<i;j++)
			{if(i%j == 0){
				
				
				count++;
				break;
			
				
				
			}
			
		}
			if(count==0){System.out.println(i+"yes ");}
		
			if(count==1){System.out.println(i+"not ");}
		
	}
		
	}
}

*/
