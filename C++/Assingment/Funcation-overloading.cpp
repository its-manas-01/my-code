#include<iostream>
class A 
{
    public:
        int a,b,c,d;
        void get(int x)
        {
           a=x; 
        }
        void get(int x,int y)
        {
            b=x;
            c=y;
        }
        int cal()
        {
            d=(a>b)?(a>c?a:c):(b>c?b:c);
            return d;
        }
};
int main()
{
    A ob;
    int a,b;
    std::cout<<"Enter the first value:-"<<std::endl;
    std::cin>>a;
    ob.get(a);
    std::cout<<"Enter another two values:-"<<std::endl;
    std::cin>>a>>b;
    ob.get(a,b);
    a=ob.cal();
    std::cout<<"The maximum number is:-"<<a<<std::endl;
    return 0;
}