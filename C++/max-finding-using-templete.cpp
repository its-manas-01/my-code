#include"iostream"
// #include"template.h"
template <class T>
class A
{
    public:
        T a;
        void get()
        {
            std::cout<<"Enter a number:-"<<std::endl;
            std::cin>>a;
        }
};
class B
{
    public:
        T b;
        void get1()
        {
            std::cout<<"Enter another number:-"<<std::endl;
            std::cin>>b;
        }
};
class C:public A,public B
{
    public:
        T c;
        void get2()
        {
            std::cout<<"Enter the last number:-"<<std::endl;
            std::cin>>c;
        }
};
class D:public C
{
    public: 
        T d;
        void cal()
        {
            get();
            get1();
            get2();
            d=(a>b)?(a>c?a:c):(b>c?b:c);
            std::cout<<"The max is "<<d<<std::endl;
        }
};
int main()
{
    D <int> ob;
    ob.cal();
    return 0;
}
