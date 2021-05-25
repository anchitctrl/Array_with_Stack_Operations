class Solution {
    public List<String> buildArray(int[] target, int n) {
        Stack<Integer> stack=new Stack<>();
        List<String> list=new ArrayList<>();
        int t=0;
        for(int i=1;i<=n;i++){
            stack.push(i);
            list.add("Push");
            if(i!=target[t]){
                stack.pop();
                list.add("Pop");
            }
            else{
                if(t!=target.length-1){ 
                    t++;
                }
                else break;
            }
        }
        return list;
    }
}
