arr = [ 99, 12, -8, 12, 34, 110, 0, 121, 66, -110]

for i in range(0,len(arr)):
    for j in range(i+1 ,len(arr)):
        if(arr[i] < arr[j]):   
            temp = arr[i]
            arr[i]=arr[j]
            arr[j]= temp
            
for i in range(0, len(arr)):
    print(arr[i], end= " ")
            
        
