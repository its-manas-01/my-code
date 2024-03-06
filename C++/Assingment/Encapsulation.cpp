#include"iostream"
class  A
{
    private:
        int age;
        void show()
        {
            std::cout<<"Database"<<std::endl;
        }
    public:
        std::string name;
        void display( int a)
        {
            show();
            age=a;
            std::cout<<age<<std::endl;
        }
};
int main()
{
    A ob;
    std:: string a;
    std::cout<<"Enter your name:-"<<std::endl;
    std::cin>>a;
    int b;
    std::cout<<"Enter your age:-"<<std::endl;
    std::cin>>b;
    ob.name=a;
    ob.display(b);
    std::cout<<ob.name<<std::endl;
    return 0;
}