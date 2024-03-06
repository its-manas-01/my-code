#include"iostream"
class A
{
    public:
        int a;
        A(int x)
        {
            a=x;
        }
        A(A &p)
        {
            a=p.a;
        }
        void display()
        {
            std::cout<<a<<std::endl;
        }
};
int main()
{
    A ob1;
    A ob(5);
    0b1(ob);
    ob.display();
    ob1.display();
    return 0;
}
