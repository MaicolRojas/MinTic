nota  = int(input("Digite la nota: "));
por1 = nota * 2 + 4;
por2 = (nota + por1 )/5

print(nota,por1,por2)

if por2 > 20 and por2 < 30:
    print("Pertenece al grupo 2")
elif por2 > 30 and por2 < 50:
    print("Pertenece al grupo 3")
elif por2 > 50 :
    print("Pertenece al grupo 4")
else:
    print("Pertenece al grupo uno")