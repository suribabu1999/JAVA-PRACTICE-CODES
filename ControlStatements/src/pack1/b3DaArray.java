package pack1;

public class b3DaArray {
public static void main(String[] args) {
	int a[][][]= new int [3][3][4];
	
	for(int i=0; i<2 ;i++)
		for(int j=0; j<3; j++)
			for(int k=0; k<4; k++)
				a[i][j][k]= i*j*k;
				
				
				for(int i=0; i<2 ;i++) {
					for(int j=0; j<3; j++) {
						for(int k=0; k<4; k++) 
							System.out.print(a[i][j][k]+" ");
							System.out.println();
							
						}  
						System.out.println();
			}
		}


}
