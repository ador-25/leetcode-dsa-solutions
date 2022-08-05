class Solution {
    public int[] plusOne(int[] digits) {
        ArrayList<Integer> num= new ArrayList<>();
        int carry=1;
        for(int i=digits.length-1;i>=0;i--){
            int temp=carry+digits[i];
            if(temp<10){
                carry=0;
                num.add(temp);
            }
            else {
                num.add(0);
            }
        }
        if(carry==1)
            num.add(1);

        Collections.reverse(num);
        return num.stream().mapToInt(Integer::intValue).toArray();
    }
}