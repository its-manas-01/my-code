function addition() {
    echo "Enter two number:-"
    read a
    read b
    sum=$((a+b))
    echo "The sum is:-$sum"
}


echo "CALCULATOR"
echo "1.Addition\n2.Substraction\n3.Multiplaction\n4.Division"
echo "Enter your choice:-"
read option


case $option in 
    1)
        addition
        ;;
    *)
        echo "Invalid option"
        ;;
esac
