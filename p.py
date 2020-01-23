from __future__ import print_function

if __name__ == "__main__":
    list = [10,2,6,4,6,7]
    count=1

    for i in range(len(list)):
        for j in range(len(list)-1):
            if list[j]>list[j+1]:
                temp = list[j]
                list[j] = list[j+1]
                list[j+1] = temp
    print(*list)
    