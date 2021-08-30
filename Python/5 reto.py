#1
def clases(cadena):
    resultado = []
    for palabras in cadena:
        if palabras not in resultado:
            resultado.append(palabras)
    return resultado
#2
def mefaltandelaclase(cd1,cd2,cd3):
    resultado = []
    for i in range(len(cd2)):
        for j in range(len(cd1)):
            if cd3 == cd2[i] and i == cd1[j]:
                resultado.append(i)
    return resultado
#3
def notengo(cd1,cd2):
    resultado = []
    for i in cd1:
        if i not in cd2:
            resultado.append(i)
    return resultado
#4
def puedocambiar(cd1,cd2):
    resultado = 0
    for i in cd2:
        if i not in cd1:
            resultado += 1
    return resultado

print(clases(['dorada','plateada','normal','normal','normal','dorada','plateada','normal','normal','normal']))
print(mefaltandelaclase([1,3,6,8], ['dorada','plateada','normal','normal','normal','dorada','plateada','normal','normal','normal'], 'plateada'))
print(notengo([3,5,7,10,15,16],[4,10,5,8]))
print(puedocambiar([3,5,7,10,15,16],[4,10,5,8]))

print(mefaltandelaclase([15, 0, 10, 4, 3, 16, 14, 12],[1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],1))
print(puedocambiar([11, 6, 14, 10, 13, 4],[1, 6, 4, 12, 7, 14, 3]))