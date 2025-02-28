#include <stdio.h>
#include <conio.h>
long int fact(int number)
{
    if (number == 0 || number == 1)
    {
        return 1;
    }
    else
    {
        return (number * fact(number - 1));
    }
}
    int main()
    {
        int number;
        printf("Enter a number:");
        scanf("%d", &number);
    
    if (number < 0)

    {
        printf("negative number");
    }
    else
    {
        printf("Factorial of %d = %ld", number, fact(number));
    }
    return 0;
}

