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
        int cal()
        {
            return(a+b);
        }
};
int main()
{
    A ob;
    int a,b;
    std::cout<<"Enter two number"<<std::endl;
    std::cin>>a>>b;
    ob.get(a,b);
    a=ob.cal();
    std::cout<<"The sum is:-"<<a<<std::endl;
    return 0;
}