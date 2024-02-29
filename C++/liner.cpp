#include "iostream"
int liner_search(int[],int );
int main()
{
    int n;
    std::cout<<"enter the quentity of number :-";
    std::cin>>n;
    int a[n],i;
    std::cout<<"\nenter the values:-";
    for(i=0;i<n;i++)
    {
       std::cin>>a[i];
    }
    liner_search(a,n);
}
int liner_search(int a[],int n)
{
    int key,i,z,flag=0;
    std::cout<<"\nenter the searching element :-";
    std::cin>>key;
    for(i=0;i<n;i++)
    {
        if(key==a[i])
        {
            flag=1;
            if(flag==1)
            {
                z=i;
            }
        }
    }
    if(flag==1)
    {
        std::cout<<"\nthe index of "<<key<<"is"<<z;
    }
    else 
    {
        std::cout<<"\nnot found";
    }
    return 0;
}