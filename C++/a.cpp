//#include <stdio.h>
//#include <string.h>
//#include <math.h>
//#include <stdlib.h>
//
//int main() 
//{
//	
//    char s[100];
//    scanf("%[^\n]%*c",&s);
//  	printf("Hello world");
//    printf("%[^\n]%c",s);
//    /* Enter your code here. Read input from STDIN. Print output to STDOUT */    
//    return 0;
//}
#include <assert.h>
#include <ctype.h>
#include <limits.h>
#include <math.h>
#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int bubble_sort(int [],int );
int main()
{
    int n=5,a[n],i,min,max=0;
    for(i=0;i<n;i++)
    {
        scanf("%d",&a[i]);
    }
    a[n]=bubble_sort(a,n);
    for(i=0;i<4;i++)
    {
        min=min+a[i];
    }
    for(i=1;i<=4;i++)
    {
        max=max+a[i];
        // printf(" %d\n",max);
    }
    printf("%d",min);
    printf("\t%d",max);
    return 0;
}
int bubble_sort(int a[],int n)
{
    int i,j,temp;
    for(i=0;i<n-1;i++)
    {
        for (j=0; j<n-1-i; j++) 
        {
            if(a[j]>a[j+1])
            {
                temp=a[j];
                a[j]=a[j+1];
                a[j+1]=temp;
            }
        }
    }
    return a[n];
}
