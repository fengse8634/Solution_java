public class Solution {
    public void merge(int A[], int m, int B[], int n) {
        int end = m+n-1;
        for(int i=end,ia=m-1,ib=n-1;ib>=0;i--){
            //ia may be shorter than ib
            if(ia >=0 && A[ia]>=B[ib])
                A[i] = A[ia--];
            else A[i] = B[ib--];
        }
    }
}