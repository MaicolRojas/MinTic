"""l = {"Rodrigo": 2155029, "Sebastian": 3290180, "Camilo": 4271313, "Marisol": 2964688}
d = "Marisol Sebastian Ana Camilo"
a = d.split(' ')
n = 0
h = ""
for b in a:
    if (b in l):
        n += l[b]
        h += b + " "
print(n)
print(h)"""

"""Plataforma"""
import json

l = '{"Rodrigo": 2155029, "Sebastian": 3290180, "Camilo": 4271313, "Marisol": 2964688}'
l = json.loads(l)

d = "Marisol Sebastian Ana Camilo"
a = d.split(' ')
n = 0
h = ""

for b in a:
    if (b in l):
        n += l[b]
        h += b + " "
print(n)
print(h)

