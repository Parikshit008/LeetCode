package DSA_LeetCode2;

import java.util.PriorityQueue;

import org.junit.Test;

public class KthLeastElement {
	
	@Test
    public void btest1(){
        int[] nums = {3,16,4,8,5,12};
        int k=3;
        kthSmallest(nums, k);
    }

    public int kthSmallest(int[] nums, int k){
        int ans =0;
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->b-a);
        for(int i=0;i<k;i++){
            pq.add(nums[i]);
        }
        for(int i=k;i<nums.length;i++){
            if(nums[i] < pq.peek()){
                pq.poll();
                pq.add(nums[i]);
            }
        }
        ans = pq.peek();
        return ans;
    }}
