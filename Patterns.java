package GeeksForGeeksSolution;
import java.util.Scanner;
public class Patterns {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a Number : ");
	int num = sc.nextInt();
	for(int i=0;i<num;i++) {
		for(int j=0;j<num;j++) {
			System.out.print("*");
		}
		System.out.println();
	}
	//print another pattern-2
	for(int i=0;i<num;i++) {
		for(int j=0;j<=i;j++) {
			System.out.print("*");
		}
		System.out.println();
	}
	//print another pattern-3
	for(int i=0;i<num;i++) {
		for(int j=1;j<=i;j++) {
			System.out.print(j);
		}
		System.out.println();
	}
	//print another pattern-4
		for(int i=0;i<num;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		//print another pattern-5
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=num-i+1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		//print another pattern-6
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=num-i+1;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		//pyramid
		for(int i=0;i<num;i++) {
			for(int j=0;j<num-i-1;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<2*i+1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//pyramid up and down
		
		for(int i=0;i<num;i++){
		    for(int j=0;j<num-i;j++){
		        System.out.print(" ");
		    }
		    for(int j=0;j<2*i+1;j++){
		        System.out.print("*");
		    }
		  
		   
		    System.out.println();
		}
		for(int i=0;i<num;i++){
		     for(int j=0;j<i+1;j++){
		        System.out.print(" ");
		    }
		    for(int j=0;j<num-i-1;j++){
		        System.out.print("*");
		    }
		    for(int j=num-i-1;j>=0;j--){
		        System.out.print("*");
		    }
		    System.out.println();
		}
		
		//another pattern
for(int i=0;i<num;i++) {	
			for(int j=i;j>0;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=0;i<num;i++) {
			for(int j=0;j<num-i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		//print the pattern using 0 and 1 method
		
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=i;j++) {
				int sum=i+j;
				if(sum%2==0) {
					System.out.print(1);
				}
				else {
					System.out.print(0);
				}
			}
			System.out.println();
		}
		
		//number space number pattern
		
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			for(int j=1;j<=2*(num-i);j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		//next pattern print continuous number
		int nums=1;
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print((nums+=1)+" " );
			}
			System.out.println();
		}
		//print continuous character
		
		for(int i=0;i<num;i++) {
			for(char j='A';j<='A'+i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		for(int i=0;i<=num;i++) {
			for(char j='A';j<='A'+(num-i-1);j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		//using i show same char each 
      for(int i=0;i<num;i++) {
    	  char ch = (char)('A'+i);
    	  for(int j=0;j<=i;j++) {
    		  System.out.print(ch+" ");
    	  }
    	  System.out.println(" ");
      }
      //pyramid using character
     
    	        for (int i = 0; i < num; i++) {
    	            // Print leading spaces
    	            for (int j = 0; j < num - i - 1; j++) {
    	                System.out.print(" ");
    	            }

    	            // Print characters in pyramid shape
    	            char ch = 'A';
    	            for (int j = 0; j < 2 * i + 1; j++) {
    	                System.out.print(ch++);
    	            }

    	            // Move to the next line
    	            System.out.println();
    	        }
    	    }
    	

}





