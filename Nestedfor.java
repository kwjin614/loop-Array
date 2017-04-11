
public class Nestedfor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		
		for(i=2; i<=9; i++){
			for(j=1; j<=i-1; j++)
				System.out.printf("%d*%d=%2d ",i,j,i*j);
			
			
			System.out.println();
		}

	}

}
