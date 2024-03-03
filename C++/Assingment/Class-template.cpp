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
            std::cout<<"The sum is:-"<<d<<std::endl;;
        }
};
int main()
{
    A<int>ob;
    int a,b,c;
    std::cout<<"Enter three value:-"<<std::endl;
    std::cin>>a>>b>>c;
    ob.get(a,b,c);
    ob.cal();
    return 0;
}