#include"iostream"
class A
{
    public:
        int a,b;
        void get(int x,int y)
        {
            a=x;
            b=y;
        }
        void display()
        {
            std::cout<<a<<"\t"<<b<<std::endl;
        }
        void operator--();
};
void A::operator--()
{
    a--;
    b--;
}
int main()
{
    A ob;
    int a,b;
    std::cout<<"Enter two value:-"<<std::endl;
    std::cin>>a>>b;
    ob.get(a,b);
    --ob;
    ob.display();
    return 0;
}