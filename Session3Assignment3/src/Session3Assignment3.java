import java.util.Scanner;

public class Session3Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,temp;
		int arr[]=new int[10];
		Scanner name = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int lenght=name.nextInt();
		System.out.println("Enter elements into array");
		for(i=0;i<lenght;i++){
			arr[i]=name.nextInt();			
		}
		j=i-1;
		i=0;
		while(i<j){
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
		System.out.println("Reverse of array");
		for(i=0;i<lenght;i++){
			System.out.println(arr[i]+" ");
		}
	}

}
