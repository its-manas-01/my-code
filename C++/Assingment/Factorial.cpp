#include<iostream>
int main()
{
    int a,f=1;
    std::cout<<"Enter the number:-"<<std::endl;
    std::cin>>a;
    while(a>0)
    {
        f*=a;
        a--;
    }
    std::cout<<"The factorial is :-"<<f<<std::endl;
    return 0;
}