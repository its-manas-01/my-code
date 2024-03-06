#include <iostream>
class A{
    private:
        int a, b;
    public:
        void get(int x, int y)
        {
            a = x;
            b = y;
        }
        void display()
        {
            std::cout<<"a="<<a<<std::endl;
            std::cout<<"b="<<b<<std::endl;
        }
};
int main()
{
	A obj;
	obj.get(10, 20);
	obj.display();
	return 0;
}
