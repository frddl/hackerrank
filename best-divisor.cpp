#include<iostream>
using namespace std;

int s(int a, int r = 0){
    while (a > 0) {
        r += a % 10;
        a /= 10;
    }
    return r;
}

int main(){
    int n, max = 0;
    cin >> n;
    
    for (int i = 1; i <= n/2; i++)
        if (n % i == 0)
            max = (s(i) > s(max) || (s(i) == s(max) && i < max)) ? i : max;
    
    cout << ((s(n) > s(max) || (s(n) == s(max) && n < max)) ? n : max) << endl;
}
