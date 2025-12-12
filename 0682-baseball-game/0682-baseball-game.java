class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer>temp=new Stack<>();
        for(String s:operations){
            if(s.equals("C")){
                if(temp.isEmpty()){
                    return -1;
                }
                temp.pop();
            }else if(s.equals("D")){
                if(temp.isEmpty()){
                    return -1;
                }
                temp.push(2*temp.peek());
            }else if(s.equals("+")){
                if(temp.isEmpty()){
                    return -1;
                }
                int a=temp.pop();
                int b=temp.peek();
                temp.push(a);
                temp.push(a+b);
            }else{
                temp.push(Integer.parseInt(s));
            }
        }
        int sum=0;
        while(!temp.isEmpty()){
            sum+=temp.pop();
        }
        return sum;
    }
}