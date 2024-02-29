#include<iostream>
class A
{
    public:
        std::string model_name;
        int avg_speed;
        float length;
        void model_in()
        {
            std::cout<<"Enter the model name:-";
            std::cin>>model_name;
        }
        void model_out()
        {
            std::cout<<model_name;
        }
        void speed_in()
        {
            std::cout<<"Enter the milage of this model:-";
            std::cin>>avg_speed;
        }
        void speed_out()
        {
            std::cout<<avg_speed;
        }
        void length_in()
        {
            std::cout<<"Enter the length of this model:-";
            std::cin>>length;
        }
        void length_out()
        {
            std::cout<<length;
        }
};
int main()
{
    A ob ;
    ob.model_in();
    ob.speed_in();
    ob.length_in();
    ob.model_out();
    ob.speed_out();
    ob.length_out();
    return 0;
}
