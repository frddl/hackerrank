#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
#include <array>
using namespace std;


int main(){
    int n;
    cin >> n;
    vector<int> a(n);
    for (int a_i = 0;a_i < n;a_i++)
       cin >> a[a_i];
    
    sort(a.begin(), a.end()); 
    
    if (a[n-1] - a[n-2] > a[1] - a[0])
        cout << a[n-2] - a[0] << endl;
    else 
        cout << a[n-1] - a[1] << endl;
    
    return 0;
}
