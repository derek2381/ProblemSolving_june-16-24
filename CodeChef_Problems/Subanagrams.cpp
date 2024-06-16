// problem link
// https://www.codechef.com/problems/SUBANAGR


#include <iostream>
#include <vector>
#include <map>
#include <algorithm>

using namespace std;

int main() {
	// your code goes here
	vector<map<char, int>> v;
	int n;
	cin >> n;

	while(n--){
	    string str;
	    cin >> str;
	    map<char, int> mp;

	    for(char i : str){
	        mp[i]++;
	    }

	    v.push_back(mp);
	}

	n = v.size();
	string res = "";
	auto it = v[0];

	for(auto i : it){
	    int val = i.second;
	    for(int j = 1;j < n;j++){
	        val = min(val, v[j][i.first]);
	    }

	    for(int j = 0;j < val;j++){
	        res += i.first;
	    }
	}

	if(res.length() == 0){
	    cout << "no such string";
	}else{
	    cout << res;
	}

	return 0;
}
