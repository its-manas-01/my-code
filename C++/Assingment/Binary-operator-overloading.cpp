#include"iostream"
class A
{
    public:
        int a;
        void get(int x)
        {
            a=x;
        }
        void display()
        {
            std::cout<<"The answer is:-"<<a<<std::endl;
        }
        A operator+ (A);      
};
A A::operator+ (A p)
{
    A b;
    b.a=a+p.a;
    return b;
}
int main()
{
    A ob,ob1,ob2;
    int a;
    std::cout<<"Enter a value:-"<<std::endl;
    std::cin>>a;
    ob.get(a);
    std::cout<<"Enter a value:-"<<std::endl;
    std::cin>>a;
    ob1.get(a);
    ob2=ob+ob1;
    ob2.display();
    return 0;
}
