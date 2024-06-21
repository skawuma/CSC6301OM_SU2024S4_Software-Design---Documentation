# Bubble sort in Python
def bubbleSort(a):
# loop to access each array element
 for i in range (len(a)):
# loop to compare array elements
   for j in range(0, len(a)-i-1):
# compare two adjacent elements
    if a[j] > a[j+1]:
# swapping elements if elements not in order
      a[j+1], a[j] = a[j], a[j+1]
   for k in range(len(a)-1, len(a) -(i+2),-1):
    # if  (k==0):
    #     break
    if (a[k] < a[k-1]) :
        print("Error at i =", i)
        break


if __name__ == "__main__":
     arr = [64, 34, 25, 12, 22, 11, 90]
     
     bubbleSort(arr)

     print("Sorted array:")
     for i in range(len(arr)):
        print("%d" % arr[i], end=" ")