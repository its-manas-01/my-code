#include <iostream>
class A{
private:
	int x, y;

public:
	A(int x1, int y1)
	{
		x = x1;
		y = y1;
	}
	A(const A& p1)
	{
		x = p1.x;
		y = p1.y;
	}
	int getX() { return x; }
	int getY() { return y; }
};
int main()
{
	A p1(10, 15);
	A p2 = p1;
	std::cout << "p1.x = " << p1.getX()<< ", p1.y = " << p1.getY()<<std::endl;
	std::cout << "p2.x = " << p2.getX()<< ", p2.y = " << p2.getY()<<std::endl;
	return 0;
}
