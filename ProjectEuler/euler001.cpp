#include<iostream>
using namespace std;

long long c(long long n, int t){
	return (t + (n - 1) / t * t) *((n - 1) / t) / 2;
}

int main(){
	int t;
	cin >> t;
	while (t--){
		long long n;
		cin >> n;
		cout << c(n, 3) + c(n, 5) - c(n, 15) << endl;
	}
	return 0;
}
