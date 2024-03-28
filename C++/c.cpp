#include"iostream"
template <typename T,class M>
class A
{
    public:
    M a,b;
    T get()
    {
        std::cout<<"Enter two number:-"<<std::endl;
        std::cin>>a>>b;
    }
    T cal(T x,T y)
    {
        std::cout<<x+y<<std::endl;
    }
};
int main()
{
    A ob;
    ob.get<int>();
    ob.cal<int>()
    return 0;
}