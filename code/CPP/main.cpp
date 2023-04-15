#include "homework.cpp"

int main(){
    double a,b;
    cout << "Enter First Number : ";
    cin >> a;
    cout << "Enter Second Number : ";
    cin >> b;
    cout << "The Greatest Common Divisor of " << a << " and " << b << " is " << gcd(a,b)<< endl;
    main();
    return 0;
}