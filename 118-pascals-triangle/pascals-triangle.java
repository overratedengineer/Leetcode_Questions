class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> al = new ArrayList<>();
        for(int i=0;i<numRows;i++){
            al.add(new ArrayList<>());
        }
         al.get(0).add(1);
         if(numRows==1){
            return al;
         }
         al.get(1).add(1);
         al.get(1).add(1);
         if(numRows==2){
            return al;
         }

        for(int i=2;i<numRows;i++){
           // step 1 = inset 1 at begining
            al.get(i).add(1);
            if(al.get(i).size()<numRows){
               for(int j=1;j<al.get(i-1).size();j++){
                int s = al.get(i-1).get(j)+al.get(i-1).get(j-1);
                al.get(i).add(s);
               }
            }
            al.get(i).add(1);
        }
        return al;
    }
}