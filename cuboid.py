# cuboid function
# prints a list of all possible coordinates
# given by  on a 3D grid where the sum of  is not equal to n
def cuboid(x,y,z,n):  
    list = []
    for i in range(x+1):
      for j in range (y+1):
        for k in range(z+1):
          if i+j+k != n:
            list.append([i,j,k])
    print(str(list))

if __name__ == "__main__":
    cuboid(5,5,3,2)