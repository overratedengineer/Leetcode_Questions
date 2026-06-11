class Solution {
    public String predictPartyVictory(String s) {
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        char arr[] = s.toCharArray();
        int i=0;
        for(char j:arr){
            if(j=='R'){
              q1.add(i);
            } else {
            q2.add(i);
            }
            i++;
        }
        i++;
        while(!q1.isEmpty() && !q2.isEmpty()){
            int ri=q1.remove();
            int di=q2.remove();
            if(ri<di){
                q1.add(i);
            } else {
                q2.add(i);
            }
            i++;
        }
        if(!q1.isEmpty()){
            return "Radiant";
        } else {
            return "Dire";
        }
    }
}