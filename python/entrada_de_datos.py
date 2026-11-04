def doblar(numero):
    resultado = numero * 2
    return resultado

def triplica(valor):
    resultado = valor ** 3
    return resultado

def pedir_numero():
    texto = input("Introduce un numero: ")
    numero = float(texto)
    return numero

print('Empieza el programa')

num_usuario = pedir_numero()

resultado_doble = doblar(num_usuario)
resultado_triple = triplica(num_usuario)

print("El doble es:", resultado_doble)
print("El triple es:", resultado_triple)