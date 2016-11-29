#include <map>
#include <set>
#include <list>
#include <cmath>
#include <ctime>
#include <deque>
#include <queue>
#include <stack>
#include <string>
#include <bitset>
#include <cstdio>
#include <limits>
#include <vector>
#include <climits>
#include <cstring>
#include <cstdlib>
#include <fstream>
#include <numeric>
#include <sstream>
#include <iostream>
#include <algorithm>
#include <unordered_map>

using namespace std;

int main(){
    int t;
    cin >> t;
    for(int a0 = 0; a0 < t; a0++){
        long k;
        cin >> k;
        long long a = 1, b = 2, sum = 2;
        while (true){
            long long c = (3 * b) + (2 * a);
            if (c >= k)
                break;
            sum += c;
            a += (2 * b);
            b = c;
        }
  
        cout << sum << endl;
    }
}
