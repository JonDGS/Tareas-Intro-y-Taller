def calificar():
    valor = eval(input("Digite nota obtenida: "))
    if valor < 5:
        print ("Usted ha reprobado")
    if 5 < valor < 7:
        print ("Suspenso")
    if 7 < valor < 8.5:
        print ("Notable")
    if 8.5 < valor < 10:
        print ("Sobresaliente")
    if valor == 10:
        print ("Honor")
    if valor > 10:
        print ("Estupido deje de inventar la nota es en mod 10")
    if valor < 0:
        print ("Estupido la nota no puede ser negativa")
