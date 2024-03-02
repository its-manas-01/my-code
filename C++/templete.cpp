#include<iostream>
template <class T>
class A
{
    public:
        T a,b,c,d;
        void get(T x,T y,T z)
        {
            a=x;
            b=y;
            c=z;
        }
        void cal()
        {
            d=a+b+c;
            std::cout<<d;
        }
};
int main()
{
    A<int>ob;
    ob.get(10,20,50);
    ob.cal();
    return 0;
}