#include"iostream"
template<class T>
void show(T a,T b)
{
    std::cout<<"A"<<a<<"\t"<<"B"<<b<<std::endl;
}
int main()
{
    int p=10,q=20;
    char m='a',n='b';
    float s=10.45,f=12.45;
    show(p,q);
    show(m,n);
    show(s,f);
}


