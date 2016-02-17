import math
def ffactorial(n):
  if n==0:
    return 1
  else:
    return n*ffactorial(n-1)

# test
# val =input("Enter an angle: ")

#result = ffactorial(val)
#print(result)
def ccos(angle):
  i=0
  result = 0.0
  tmp = 0
  arad = angle*(3.14159/180) #from school? 
  while i < 20 :
    tmp =  (arad**(i*2) / ffactorial(i*2))
    if i % 2 == 1:
      result -= tmp
    else:
      result += tmp
    i+=1
    #print(result)

  return result

angle =input("Enter an angle: ")
print(ccos(angle))
print(math.cos(angle))
print(math.cos(angle*(3.14159/180)))

