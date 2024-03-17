echo "Enter a value"
read a

flag=0
i=2

while [ "$i" -le "$((a/2))" ]
do
    if [ "$((a%i))" -eq 0 ]; then
        flag=1
        break
    fi
    ((i++))
done

if [ "$flag " -eq 0 ]; then
    echo "$a is prime number"
else 
    echo "$a is not prime number"
fi