package LeetCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class IntervalComparator implements Comparator<Interval> {
	public int compare(Interval i1, Interval i2) {
		return i1.start - i2.start;
	}
}

class Interval {
	int start;
	int end;
	
	Interval() {
		start = 0;
		end = 0;
	}
	
	Interval(int start, int end) {
		this.start = start;
		this.end = end;
	}
}

public class MergeIntervals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Interval> inputArr = new ArrayList<Interval>();

		Interval temp = new Interval(1, 3);
		inputArr.add(temp);
		temp = new Interval(2, 6);
		inputArr.add(temp);
		temp = new Interval(8, 10);
		inputArr.add(temp);
		temp = new Interval(15, 18);
		inputArr.add(temp);
		
		ArrayList<Interval> result = merge(inputArr);
		for(Interval i: result) {
			System.out.println(i.start + ", " + i.end);
		}
	}
	
	public static ArrayList<Interval> merge (ArrayList<Interval> intervals) {
		
		ArrayList<Interval> result = new ArrayList<Interval>();
		
		Collections.sort(intervals, new IntervalComparator());
	
		Interval prev = intervals.get(0);
		
		for (int i = 1; i < intervals.size(); i++) {
			Interval curr = intervals.get(i);
			
			if (curr.start < prev.end) {
				prev = new Interval(prev.start, Math.max(prev.end, curr.end));
			}
			else {
				result.add(prev);
				prev = curr;
			}
		}
		result.add(prev);
		
		return result;
	}

	
	
	
}

