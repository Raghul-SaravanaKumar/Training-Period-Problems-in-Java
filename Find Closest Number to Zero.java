class Solution {

    public int findClosestNumber(int[] nums) {

        int answer = nums[0];

        for(int num : nums) {

            if(Math.abs(num) < Math.abs(answer) ||
              (Math.abs(num) == Math.abs(answer) && num > answer)) {

                answer = num;
            }
        }

        return answer;
    }
}
