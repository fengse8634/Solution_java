public class Solution {
    public int firstMissingPositive(int[] A) {
        for(int i=0;i<A.length;i++){
        	//we only place it to the right position
        	//When the number is positive
        	//The number is not in the right position
        	//The target position also must not have the number already(if there are two identical number)
        	//The target position is within the valid range
            if(A[i]>0 && A[i]!=i+1 && A[i] <= A.length &&(A[A[i]-1]!=A[i])){
                int temp = A[A[i]-1];
                A[A[i]-1] =  A[i];
                A[i]=temp;
                i--;
            }
        }
        for(int i=0;i<A.length;i++){
            if(A[i]!=i+1)   return i+1;
        }
        //if not in these array, then array's number +1;
        return A.length+1;
    }
}