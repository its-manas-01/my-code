#include"iostream"
class A
{
    public:
        void display()
        {
            std::cout<<"Base class"<<std::endl;
        }
        virtual void show()
        {
            std::cout<<"Virtual Base class"<<std::endl;
        }
};
class B:public A
{
    public:
        void display()
        {
            std::cout<<"Derived class"<<std::endl;
        }
        void show()
        {
            std::cout<<"Virtual Derived class"<<std::endl;
        }
};
int main()
{
    A ob;
    B ob1;
    A*p;
    p=&ob;
    p->display();
    p->show();
    p=&ob1;
    p->display();
    p->show();
    return 0;
}