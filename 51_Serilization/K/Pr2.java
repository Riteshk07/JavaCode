class Y {
	public static void main (String [] args){
		int [] arr = {2,8,9,2,4};
		int len = arr.length-1;
		int [] ans = new int [len+1];
		int n = 0;
		int i = len;
		while(len >= 0){
			if (arr[len] != 2){
				ans[i]=arr[len];
				i--;
			}else{
				ans[n]= 1;
				n++;
			}
			len--;
		}
		for (int t : ans){
			System.out.print(t+" ");
		}
	}
}