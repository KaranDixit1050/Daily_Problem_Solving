class mountainArray {
    public int longestMountain(int[] arr) {
        int n=arr.length;
        int ans=0;
        for(int i=1;i<n-1;i++){
            if(arr[i]>arr[i+1] && arr[i]>arr[i-1]){
                int j=i-1;
                while(j>0 && arr[j]>arr[j-1]){                   
                    j--;
                    ans=Math.max(ans,j-i+1);
                }
                while(i<n-1 && arr[i]>arr[i+1]){
                    i++;
                    ans=Math.max(ans,i-j+1);
                }
            }
        }
        return ans;
    } 
    public static void main(String[] args) {
        mountainArray solution = new mountainArray();
        int[] arr = {2, 1, 1, 5, 6, 2, 3, 1};
        System.out.println("Length of longest mountain: " + solution.longestMountain(arr)); // Output: 5
    }   
}
