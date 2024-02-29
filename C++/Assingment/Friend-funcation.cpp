#include"iostream"
class B;
class A
{
    private:
        int a=2000;
    friend void C(A,B);
};
class B
{
    private:
        int b=1000;
    friend void C(A,B);
};
void C(A x,B y)
{
    int c;
    c=x.a+y.b;
    std::cout<<"The sum is:-"<<c<<std::endl;
}
int main()
{
    A ob;
    B ob1;
    C(ob,ob1);
    return 0;
}