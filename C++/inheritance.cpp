#include"iostream"
class A
{
    public:
        int a;

        void get()
        {
            std::cout<<"Enter first value:-"<<std::endl;
            std::cin>>a;
        }
};
class B
{
    public:
        int b;
        void get2()
        {
            std::cout<<"Enter second number:-"<<std::endl;
            std::cin>>b;
        }
};
class C:public A,public B
{
    public:
        int c;
        void get3()
        {
            std::cout<<"Enter the last value"<<std::endl;
            std::cin>>c;
        }
};
class D:public C
{
    public:
        int d;
        void cal()
        {
            d=(a>b)?(a>c?a:c):(b>c?b:c);
            std::cout<<d;
        }
};
int main()
{
    
    D ob3;
    ob3.get();
    ob3.get2();
    ob3.get3();
    ob3.cal();
    return 0;
}