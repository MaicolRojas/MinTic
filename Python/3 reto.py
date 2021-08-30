"""s = input("Ingrese la cadena: ")"""
s =  "D D D D T T T D A A T T T A A A U Y U U U"
n = s.split(" ")
c = 1
a = ""
b = ""
for i in range(len(n)):
    if i < len(n) -1 and n[i] == n[i+1]:
        c+=1
    else:
        a += " " + str(n[i])
        b += " " + str(c)
        c = 1
print(a)
print(b)

"""OTRA FORMA DE HACERLO """


import itertools
"""n = input("Ingrese la cadena: ")"""
n =  "D D D D T T T D A A T T T A A A U Y U U U"
s = n.split(" ")
l = [(e,len(list(g))) for (e,g) in itertools.groupby(s)]
a = [x for (x,y) in l]
b = [y for (x,y) in l]
print(' '.join(a))
print(" ".join(map(str, b)))
