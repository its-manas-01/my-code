#include<iostream>
class A
{
    public:
        int a,b,c;
        int get()
        {
            std::cout<<"Enter two number:-"<<std::endl;
            std::cin>>a>>b;
        }
        void sum()
        {
            c=a+b;
            std::cout<<"The answer is:-"<<c<<std::endl;
        }
};
int main()
{
    A ob[5];
    for(int i=0;i<5;i++)
    {
        ob[i].get();
        ob[i].sum();
    }
    return 0;
}
