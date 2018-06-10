def busqueda(num,lista):
    if isinstance(lista,list):
        return procesar(num,lista,len(lista)//2,len(lista),[])
    else:
        'No es un valor valido'
def procesar(num,lista,i,i2,new):
    if (not new == []) and len(new) == 2 and (new[0] == num or new[1] == num):
        return True
    elif (not new == []) and len(new) == 2 and new[0] != num and new[1] != num:
        return False
    elif lista[i] == num:
        return True
    elif lista[i] < num:
        return procesar(num,lista,int(i+(i*0.5)),i2,lista[i+1:i2])
    else:
        return procesar(num,lista,int(i-(i*0.50)),(i2*0)+i,lista[0:i])
    
