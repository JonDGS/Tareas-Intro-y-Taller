class BusquedaBinaria():
    def __init__(self, lista):
        self.lista = lista
    def busqueda_con_slicing(self, n):
        if self.lista == []:
            return False
        elif isinstance(self.lista[len(self.lista)//2],list):
            self.lista = self.lista[len(self.lista)//2]
            return self.busqueda_con_slicing(n)
        elif self.lista[len(self.lista)//2] == n:
            return True
        elif self.lista[len(self.lista)//2] < n:
            self.lista = self.lista[(len(self.lista)//2)+1:]
            return self.busqueda_con_slicing(n)
        else:
            self.lista = self.lista[:(len(self.lista)//2)]
            return self.busqueda_con_slicing(n)
                        
        
        
        
