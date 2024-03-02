#include"iostream"
template <typename T>
T cal(T x,T y)
{
   return(x+y);
}
int main()
{
    int b;
    b=cal<int>(10,20);
    std::cout<<b;
    return 0;
}