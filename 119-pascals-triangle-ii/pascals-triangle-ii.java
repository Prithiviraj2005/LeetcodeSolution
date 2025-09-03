class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> pascal=new ArrayList();
        for(int i=0;i<=rowIndex;i++){
            List<Integer> Index=new ArrayList();
            for(int j=0;j<=i;j++){
                if(j==0 || j==i){
                    Index.add(1);
                }
                else{
                    List<Integer> previous=pascal.get(i-1);
                    Index.add(previous.get(j)+previous.get(j-1));
                }
            }
             pascal.add(Index);
        }
        return pascal.get(rowIndex);
    }
}