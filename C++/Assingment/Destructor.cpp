#include"iostream"
class A
{
    public:
        A()
        {
            std::cout<<"constructor"<<std::endl;
        }
        ~A()
        {
            std::cout<<"Destructor"<<std::endl;
        }
};
int main()
{
    A ob;
    return 0;
}