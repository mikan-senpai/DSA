// C++ program to find all subsets of given set. Any
// repeated subset is considered only once in the output
#include <bits/stdc++.h>
using namespace std;

// Utility function to split the string using a delim. Refer -
// http://stackoverflow.com/questions/236129/split-a-string-in-c
vector<string> split(const string &s, char delim)
{
	vector<string> elems;
	stringstream ss(s);
	string item;
	while (getline(ss, item, delim))
		elems.push_back(item);

	return elems;
}

// Function to find all subsets of given set. Any repeated
// subset is considered only once in the output
int printPowerSet(int arr[], int n)
{
	vector<string> list;    

	/* Run counter i from 000..0 to 111..1*/
	for (int i = 0; i < (int) pow(2, n); i++)
	{
		string subset = "";

		// consider each element in the set
		for (int j = 0; j < n; j++)
		{
			// Check if jth bit in the i is set. If the bit
			// is set, we consider jth element from set
			if ((i & (1 << j)) != 0)
				subset += to_string(arr[j]) + "|";
		}

		// if subset is encountered for the first time
		// If we use set<string>, we can directly insert
		if (find(list.begin(), list.end(), subset) == list.end())
			list.push_back(subset);
	}

	// consider every subset
	for (string subset : list)
	{
		// split the subset and print its elements
		vector<string> arr = split(subset, '|');
		for (string str: arr)
			cout << str << " ";
		cout << endl;
	}
}

// Driver code
int main()
{
	int arr[] = { "A","B","C" };
	int n = sizeof(arr)/sizeof(arr[0]);

	printPowerSet(arr, n);

	return 0;
}
