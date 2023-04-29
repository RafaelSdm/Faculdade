def chamarGrafo(grafo):
    print('--------------------------------------------------------------------------')

    print(grafo)

    print('----------------------------------------------------------------------------------')


def algoritimo_Kanh(grafo):
    contador = {}


    for vertice in grafo:
        contador[vertice] = 0


    for vertice in grafo:

        for entrada in grafo[vertice]:
            contador[entrada] += 1


    lista_final = []

    verticeZeroGrau = []
    for vertice in grafo:

        if contador[vertice] == 0:
            verticeZeroGrau.append(vertice)

    while verticeZeroGrau:

        node = verticeZeroGrau.pop()

        lista_final.append(node)

        for vertice in grafo[node]:

            contador[vertice] -= 1
            if contador[vertice] == 0:

                verticeZeroGrau.append(vertice)

    return lista_final


grafo = {
    '0': ['1', '2', '3'],
    '1': ['2','6'],
    '2': ['5', '6'],
    '3': ['5'],
    '4': ['6','7'],
    '5': [],
    '6':[],
    '7':[]
}

grafo_ordenado = algoritimo_Kanh(grafo)
chamarGrafo(grafo_ordenado)
