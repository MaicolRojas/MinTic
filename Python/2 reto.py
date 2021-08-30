
m = "ADGB"
s = "CBJI"
d = "CCEAJIGFGACCAGGIDDEIEGII"
re = ""
h = 0
z= 0
puntoM = 0
puntoS = 0
ca = len(d)

while z <= ca:
    for i in range(len(d)):
        caracter = d[i]

        if m[h] == caracter:
            print(i)
            puntoM += 1
        elif s[h] == caracter:
            puntoS +=1



        if puntoM > puntoS:
            re = re + "M"
        elif puntoS > puntoM:
            re = re + "S"
        elif puntoS == puntoM:
            re = re + "D"

    print(re)

    h+=1
    z+=1
print(re)
"""cadena = "¡Hola, mundo!"
for indice in range(len(cadena)):
    caracter = cadena[indice]
    print(caracter)"""