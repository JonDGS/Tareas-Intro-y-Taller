def matrices(m1,m2):
	if isinstance(m1,list) and isinstance(m2,list):
		multiplicar(m1,m2,0,0,0,0,[])
	else:
		'No es una matriz'
def multiplicar(m1,m2,i,i2,i3,suma,new):
	if len(m1) == i:
		print(new)
	elif len(m2) == i2 and len(m2[0]) == i3+1:
		return multiplicar(m1,m2,i+1,0,0,0,new+[[suma]])
	elif len(m2) == i2:
		return multiplicar(m1,m2,i,0,i3+1,0,new+[[suma]])
	else:
		return multiplicar(m1,m2,i,i2+1,i3,suma + m1[i][i2]*m2[i2][i3],new)
