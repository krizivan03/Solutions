#include <stdio.h>
//This is a C program that sorts "myArray" utilizing Bubble Sort Algorithm

int main()
{
    int myArray[]={9,7,5,3,2,6,3,7,10,2,5,2};
    int temp;
    
    for (int j = 0; j < sizeof(myArray)/4; j++){//Outer loop iterates dependant of size of array
        for (int i = 0; i < sizeof(myArray)/4-1; i++){//inner loop iterates through the array bubbling the largest int to the end
            int j=i+1;
            if (myArray[i]>myArray[j]){
                temp=myArray[i];
                myArray[i]=myArray[j];
                myArray[j]=temp;
                //3,6,5,9,8
            }
        }
    }
    //Prints Sorted Array
    for (int i = 0; i < sizeof(myArray)/4; i++){
        printf("%d\n",myArray[i]);
    }
    return 0;
}
