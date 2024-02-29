#include<iostream>
class A
{
    public:
        int a;
        void get()
        {
            std::cout<<"Enter a value:-"<<std::endl;
            std::cin>>a;
        }
};
class B
{
    public:
        int b;
        void get1()
        {
            std::cout<<"Enter another value:-"<<std::endl;
            std::cin>>b;
        }
};
class C:public A,public B
{
    public:
        int c;
        void cal()
        {
            get();
            get1();
            c=a+b;
            std::cout<<"The sum is:-"<<c<<std::endl;
        }
};
int main()
{
    C ob;
    ob.cal();
    return 0;
}