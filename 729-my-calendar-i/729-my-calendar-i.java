class MyCalendar {
        private int[][] arr;
        private int size;

        public MyCalendar() {
            arr = new int[1000][2];
            size = 0;
        }

        public boolean book(int start, int end) {
            if (size == 0) {
                arr[0] = new int[]{start, end};
                size++;
                return true;
            }
            //the largest 'start' value among all numbers less than the booking 'end'
            int s = find(end);
            if (s >= 0 && arr[s][1] > start) return false;
            size++;
            merge(start, end, s);
            return true;
        }

        private void merge(int start, int end, int s) {
            for (int i = size - 1; i > s + 1; i--) {
                arr[i] = arr[i - 1];
            }
            arr[s + 1] = new int[]{start, end};
        }

        private int find(int target) {
            int l = 0, r = size - 1;
            int res = -1;
            while (l <= r) {
                int mid = l + (r - l) / 2;
                if (arr[mid][0] < target) {
                    res = mid;
                    l = mid + 1;
                } else {
                    r = mid - 1;
                }
            }
            return res;
        }

    }
/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */