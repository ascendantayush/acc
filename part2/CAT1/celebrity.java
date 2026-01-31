class Solution {
    public int celebrity(int mat[][]) {
        // code here
        Stack<Integer> st = new Stack<>();
        for(int i = 0 ; i< mat.length ; i++){
                st.push(i);
        }
        
        while(st.size() > 1){
            int a = st.pop();
            int b =  st.pop();
            
            if(mat[a][b]==1){
                st.push(b);
            }else if(mat[a][b] == 0){
                st.push(a);
            }
        }
        
        int c = st.pop();
        
        
        for(int i =0 ; i < mat.length ; i++){
            if(i !=c){
                if(mat[c][i] ==1 || mat[i][c]==0){
                    return -1;
                }
            }
        }
        
        return c;
    }
}
