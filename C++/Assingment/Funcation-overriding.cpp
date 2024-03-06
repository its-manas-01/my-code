#include"iostream"
class A
{
    public:
        void display()
        {
            std::cout<<"Base class"<<std::endl;
        }
};
class B:public A
{
    public:
        void display()
        {
            std::cout<<"Derived class"<<std::endl;
        }
};
int main()
{
    B ob;
    ob.display();
}