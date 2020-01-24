def swap_case(s):
    z = list(s) # change String to list
    
    for i in range(len(z)): # iterate through new list
        if z[i].islower(): # if lower case
            z[i]= z[i].capitalize() # capitalize
        else: z[i]= z[i].lower() # otherwise lowercase

    return "".join(z) # finally join together and return

if __name__ == "__main__":
        print(swap_case("Hello World"))

