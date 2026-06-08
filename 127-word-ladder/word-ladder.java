class Solution {
    
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {       
        Set<String> s = new HashSet<>();
        Set<String> s2 = new HashSet<>();
        Queue<Pair> q = new LinkedList<>();
        for(int i=0;i<wordList.size();i++){
            s.add(wordList.get(i));
        }
        q.add(new Pair(beginWord,1));
     if (!s.contains(endWord)) return 0;
       return  bfs(endWord,s,s2,q);
    }
    public static int bfs(String endWord, Set<String> s, Set<String> s2, Queue<Pair> q){

        while(!q.isEmpty()){
        Pair curr = q.remove();
        String x = curr.s;
        int t = curr.i;
        // if(x.equals(endWord)){
        //     return t;
        // }
        s2.add(x);
        for(int i =0;i<x.length();i++){
            char[] wordChars = x.toCharArray();
            for(char j ='a';j<='z';j++){
               if (wordChars[i] == j) continue;
                wordChars[i] = j;
                String newWord = new String(wordChars);
               if(newWord.equals(endWord)){
                return t+1;
               }
               if (s.contains(newWord)) {
                 q.add(new Pair(newWord, t + 1));
                 s.remove(newWord);
                }
            }
        }
    }
    return 0;
    }
}

class Pair{
    String s;
    int i ;
    public Pair(String s1 , int i1 ){
          this.s  = s1;
          this.i =i1;
    }
}