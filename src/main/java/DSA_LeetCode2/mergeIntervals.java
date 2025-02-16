package DSA_LeetCode2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class mergeIntervals {
	public static int[][] mergeIntervals(int[][] intervals){
		// initialise 2-d list to capture the merged intervals
		ArrayList<List<Integer>> lists = new ArrayList<>();
		// sort the array so that events that are happening simultaneously / closer can stay adjacent
		Arrays.sort(intervals, (a,b)->a[0]-b[0]);
		//(a,b)->a[0]-b[0] - sort based on the start times (ascending)
		//(a,b)->a[1]-b[1] - sort based on the end times (ascending)
		//(a,b)->b[0]-a[0] - sort based on the start times (descending)
		//(a,b)->b[1]-a[1] - sort based on the end times (descending)
		int startTime= intervals[0][0]; //1
		int endTime= intervals[0][1]; // 3
		for (int i=1;i<intervals.length;i++){
		if(intervals[i][0]<=endTime){ // startTimeOfCurrMeeting<= endTimeOfPrevMeeting
		endTime=intervals[i][1]; // 6
		}else {
		lists.add(Arrays.asList(startTime, endTime));
		startTime=intervals[i][0];
		endTime=intervals[i][1];
		}
		}
		lists.add(Arrays.asList(startTime, endTime));
		int[][] output= new int[lists.size()][2];
		for (int i=0;i<lists.size();i++){
		output[i][0]=lists.get(i).get(0); // start time
		output[i][1]=lists.get(i).get(1); // end time
		}
		return output;

		}


		public static void main(String[] args) {
		int[][] intervals= {{8,10},{15,18},{1,3},{2,6}};
		//int[][] intervals= {{8,10},{9,12},{11,13},{12,16}};
		int[][] mergedIntervals = mergeIntervals(intervals);
		System.out.println(Arrays.deepToString(mergedIntervals));
		}


}

