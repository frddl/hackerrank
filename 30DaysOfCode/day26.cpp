#include <iostream>
using namespace std;

int main(int argc, const char* args[]){
    int actualDay, actualMonth, actualYear, expectedDay, expectedMonth, expectedYear;
    cin >> actualDay >> actualMonth >> actualYear >> expectedDay >> expectedMonth >> expectedYear;

    int fine = 0;

    if (expectedYear == actualYear)
        if (expectedMonth < actualMonth)
          fine = (actualMonth - expectedMonth) * 500;
        else if (expectedMonth == actualMonth && expectedDay < actualDay){
          fine = (actualDay - expectedDay) * 15;
        }
    else if (expectedYear < actualYear)
        fine = 10000;

    cout << fine << endl;
}
