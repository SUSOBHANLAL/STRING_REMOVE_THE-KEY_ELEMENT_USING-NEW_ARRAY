package practice1;

public class susobhan {
	public static void main(String[] args){
		
		String str  = "aabcc";
		int arr2[] = new int[3];
		
		//char c='a'; 
		int j =0;
		
		char ch ='c';
		int n = str.length();
		for(int  i= 0;i<n;i++) {
			char c = str.charAt(i);
			if(c!=ch) {
				arr2[j]=c;
				j++;
				
				
			}
		}
		for(int i=0;i<arr2.length;i++) {
			System.out.print((char)(arr2[i])+" ");// i have use type-casting hare 
			
			
			
		}
		
	}

}
