class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        HashMap<Character,Integer> amap=new HashMap<>();
        HashMap<Character,Integer> bmap=new HashMap<>();
    
    for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        if(amap.containsKey(ch)){
            int freq=amap.get(ch);
            amap.put(ch,freq+1);
        }
        else amap.put(ch,1);
    }
    for(int i=0;i<t.length();i++){
        char ha=t.charAt(i);
        if(!amap.containsKey(ha)) return false;
        
        if(bmap.containsKey(ha)){
            int freq=bmap.get(ha);
            bmap.put(ha,freq+1);
        }
        else bmap.put(ha,1);
            

    }

     for(char ele: bmap.keySet()){
        if(amap.containsKey(ele)){
            int afreq=amap.get(ele);
            int bfreq=bmap.get(ele);
            if(afreq!=bfreq){
                return false;
            }
        }
     }
return true;
    }
}