#include <bits/stdc++.h>
using namespace std;

int hurdleRace(int k, vector<int> height) {
	maxEl = INT_MIN;
	for (int i = 0 ; i < heigth.size(); i++) {
		if ( maxEl < height[i] ){
			maxEl = height[i];
		}
	}
	if (k<maxEl)
	{
		return (maxEl-k);
	}
	return 0;
}


int main(int argc, char const *argv[])
{

	return 0;
}