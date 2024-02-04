def one_loop(l: list) -> bool:
   # print(l)
    leng = len(l)
   # print(leng)
    for i in range(leng):
        
        test = l[i]
        j = i+1;
        while j < leng:
            
            if test == l[j]:
                print("True")
                return True
            j += 1
        
    print("False")
    return False
    

if __name__ == "__main__":
    one_loop([1,2,3,4]);