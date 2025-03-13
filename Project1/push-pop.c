#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
#define MAXSIZE 5
int stack[MAXSIZE],data,top=-1;
void push();
void pop();
void display();
void main()
{
    int choice;
    start:
    printf("*** stack operation ***\n");
    printf("1:push operation\n");
    printf("2:pop operation\n");
    printf("3:display\n");
    printf("4:exit\n");
    printf("enter your choice=");
    scanf("%d",&choice);
    switch(choice)
    {
    case 1:push();
    break;
    case 2:pop();
    break;
    case 3:display();
    break;
    case 4:exit(0);
    break;
    default:printf("invalid choice!!! try again  ***");
    break;
    }
    goto start;
    getch();
}
    void push()
    {
        if(top==MAXSIZE-1)
        {
            printf("stack overload\n");
        }
        else{
            printf("enter data=");
            scanf("%d",&data);
            top++;
            stack[top]=data;
        }
    }
    void pop()
    {
        if (top==-1)
        {
            printf("data overflow\n");
        }
        else
        {
            data=stack[top];
            printf("popped data=%d \n ",data);
            top--;
        }
    }
    void display()
    {
        int i;
        printf("the content of the stack:");
        if (top==-1)
        {
            printf("stack is empty\n");
        }
        else
        {
            for(i=0;i<=top;i++)
            {
                printf("%d\n",stack[i]);
            }
        }
    }

