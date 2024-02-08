public class kite_pattern {
    
	public static void main(String[] args) {

		for (int i = 1; i <= 6; i++) {
			// i= 1,2,3,4,5
			for (int j = 5; j >= i; j--) {

				System.out.print("   ");
			}
			for(int k =1;k<=i;k++) {
				System.out.print(" * ");
			}
			for(int l=2;l<=i;l++) {
				System.out.print(" * ");
			}
			for( int r = 5; r>=i;r--) {
				System.out.print("   ");
			}
			for(int t=5; t>=i;t--){
				System.out.print("   ");
			}
			//upside down pyramid starts from here
			for( int y=1;y<=i;y++) {
				System.out.print(" * ");
			}
			for(int u=2; u<=i; u++) {
				System.out.print(" * ");
			}
			
System.out.println();
			
		}
		
		for( int i=1;i<=5;i++) {
			
			for(int q=1; q<=i; q++ ) {
				
				System.out.print("   ");			
				}
			for(int w=5; w>=i;w--) {
				System.out.print(" * ");
			}
			for( int e = 4; e>=i;e-- ) {
				System.out.print(" * ");
			}
			//upside down pyramid starts from here
			for( int z=1;z<=i;z++) {
				System.out.print("   ");
			}
			for( int p=1;p<=i;p++) {
				System.out.print("   ");
			}
			//upside * from here
			for(int g=5;g>=i;g--) {
				System.out.print(" * ");
			}
			for(int h=4;h>=i;h--) {
				System.out.print(" * ");
			}
				
			System.out.println();
		}

	}
}
