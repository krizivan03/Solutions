#!/usr/bin/env python3

# This python program contains two functions that return min and max
# values of a given list. First one is done O(n) time and the second one in O(3n/2)


def minMaxVal1(listNums):
    max = listNums[0]
    min = listNums[0]
    
    for score in scores:
        if score > max:
            max = score
        if score < min:
            min = score
    return max, min
    
def minMaxVal2(listNums):
    max = listNums[0]
    min = listNums[0]

    for i in range(0,len(listNums)-1, 2):
        j = i + 1
        if listNums[i]>listNums[j]:
            if listNums[i]>max:
                max = listNums[i]
        else:
            if listNums[j]<min:
                min = listNums[j]
    return max, min
    
if __name__ == '__main__':
  daList = [1,2,9,3,8,0,4,7]
  print(minMaxVal1(daList))
  print(minMaxVal2(daList))
