# This is a python function that takes in a list of integers representing
# toy prices (prices) and a maximum amount a parent is able to spend (k) and will 
# return the maximum amount of toys a parent can purchase without surpassing
# the budget
# This is done in O(nlogn) time due to pythons .sort() method.

def maximumToys(prices, k):
  prices.sort()
  cart = 0
  numToys = 0
  for toys in prices:
    if cart + toys <= k:
      cart += toys
      numToys+=1
  return numToys
  
if __name__ == "__main__":
  daList = [9,3,4,8,3,5]
  print(maximumToys(daList,10)) # Returns 3, toys priced at 3, 3 & 4
