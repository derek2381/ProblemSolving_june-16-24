// problem link
// https://leetcode.com/contest/weekly-contest-402/problems/count-pairs-that-form-a-complete-day-i/

class Solution {
public:
    int countCompleteDayPairs(vector<int>& hours) {
        long long int val = 0, n = hours.size();
        int count = 0;

        for(int i = 0; i < n;i++){
            for(int j = i + 1;j < n;j++){
                val = hours[i];

                val += hours[j];

                if(val%24 == 0){
                    count++;
                }
            }
        }

        return count;

    }
};
