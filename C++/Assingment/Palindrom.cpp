#include<iostream>
int main()
{
    int a,reminder,original,n;
    std::cout<<"Enter the number:-"<<std::endl;
    std::cin>>a;
    original=a;
    while (a!='\0')
    {
        reminder=a%10;
        n=n*10+reminder;
        a=a/10;
    }
    if (original==n)
    {
        std::cout<<original<<"is palindrom"<<std::endl;
    }
    else
    {
        std::cout<<original<<"is not plaindrom"<<std::endl;
    }
    return 0;
}