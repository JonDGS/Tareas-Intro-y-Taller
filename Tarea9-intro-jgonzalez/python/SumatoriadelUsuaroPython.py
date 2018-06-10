class xD():
    def __init__(self):
        self.n = -1
        self.suma = 0
    def generar(self):
        while self.n != 0:
            self.n = eval(input('Ingrese: '))
            print(self.n)
            self.suma += self.n
            print(self.suma)
        print(self.suma)
        
        
