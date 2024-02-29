#include<iostream>
#include<math.h>
class A
{
    public:
        int a,b,add,sub,multi,div,power;
        int get()
        {
            std::cout <<"Enter two number:-"<<std::endl;
            std::cin>>a>>b;
            return a,b;
        }
        void sum()
        {
            add=a+b;
            std::cout<<"The sum is:-"<<add<<std::endl;
        }
        void substraction()
        {  
            sub=a-b;
            std::cout<<"The substraction is:-"<<sub<<std::endl;
		}
        void multiple()
        {
            multi=a*b;
            std::cout<<"The multiple is:-"<<multi<<std::endl;
        }
        void divide()
        {
            div=a/b;
            std::cout<<"The divide is:-"<<div<<std::endl;
        }
        void powerfinder()
        {
            power=pow(a,b);
            std::cout<<"The answer is:-"<<power<<std::endl;
        }
        int gets()
        {
            std::cout<<"Enter the value:-"<<std::endl;
            std::cin>>a;
        }
        void squreroot()
        {
            b=sqrt(a);
            std::cout<<"the root is:-"<<b<<std::endl;
        }
};
int main()
{
    int a;
    A ob;
    std::cout<<"1.Addition\n2.Substraction\n3.Multiplaction\n4.Divide\n5.power"<<std::endl;
    std::cout<<"Enter your chioce"<<std::endl;
    std::cin>>a;
    switch (a)
    {
    case 1:
        ob.get();
        ob.sum();
        break;
    case 2:
        ob.get();
        ob.substraction();
        break;
    case 3:
        ob.get();
        ob.multiple();
        break;
    case 4:
        ob.get();
        ob.divide();
        break;
    case 5:
    	ob.get();
        ob.powerfinder();
        break;
    case 6:
        ob.gets();
        ob.squreroot();
        break;
    default:
        std::cout<<"Invalid option!!!";
        exit(0);
    }
    return 0;
}
