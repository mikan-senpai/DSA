#include <bits/stdc++.h>
using namespace std;

vector<int> missingNumbers(vector<int> arr, vector<int> brr) {
	
}

vector<int> inputVector(vector<int> arr, int length) {
	for (int i = 0; i < length; ++i)
	{
		int data;
		cin >> data;
		arr.push_back(data);
	}
	return arr ;
}

int main () {
	int n = 0 , m  = 0;
	cin >> n >> m;
	vector<int> arr;
	vector<int> brr ;
	inputVector(arr, n);
	inputVector(brr, m);
	missingNumbers(arr, brr);
}



