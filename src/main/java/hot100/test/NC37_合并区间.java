package hot100.test;

import java.util.*;

class Interval{
    int start;
    int end;
    Interval(){start = 0; end = 0;}
    Interval(int s, int e){start = s; end = e;}
}

public class NC37_合并区间 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Interval[] intervals = new Interval[n];
        for (int i = 0; i < n; i++){
            intervals[i] = new Interval(sc.nextInt(), sc.nextInt());
        }
    }

    public static ArrayList<Interval> merge(ArrayList<Interval> intervals) {
        ArrayList<Interval> list = new ArrayList<>();
        sort(intervals);
        for(int i = 0; i < intervals.size(); i++){
            int right = intervals.get(i).end;
            int left = intervals.get(i).start;
            while (i < intervals.size() - 1 && right >= intervals.get(i + 1).start){
                right = Math.max(intervals.get(i + 1).end, right);
                i++;
            }
            list.add(new Interval(left, right));
        }
        return list;
    }
    public static void sort(ArrayList<Interval> intervals){
        Collections.sort(intervals, new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                return o1.start - o2.start;
            }
        });
    }
}
