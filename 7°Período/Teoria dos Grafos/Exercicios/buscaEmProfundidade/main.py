grafo = { 0: [1, 2],
1: [0,3, 4],
2: [0,5,6],
3: [1,7,8],
4: [1,9,10],
5: [2,11,12],
6: [2,13,14],
7: [3,15,16],
8: [3,17,18],
9: [4,19,20],
10:[4,21,22],
11: [5,23,24],
12:[5,25,26],
13:[6,27,28],
14:[6],
15:[7],
16:[7],
17:[8],
18:[8],
19:[9],
20:[9],
21:[10],
22:[10],
23:[11],
24:[11],
25:[12],
26:[12],
27:[13],
28:[13,29,30],
29:[28],
30:[28,31,32],
31: [30],
32: [30]



}


# Função que realiza a busca em profundidade
def busca_em_profundidade(grafo, vertice_inicial, vertice_procurado, visitados):
    # Adiciona o vértice atual aos visitados
    visitados.append(vertice_inicial)
    print("Vertice visistado: {}".format(vertice_inicial))

    # Verifica se encontramos o vértice procurado
    if vertice_inicial == vertice_procurado:
        return visitados

    for adjacente in grafo[vertice_inicial]:
        if adjacente not in visitados:
            resultado = busca_em_profundidade(grafo, adjacente, vertice_procurado, visitados)
            # Se encontrarmos o vértice procurado, retornamos o caminho percorrido
            if resultado is not None:
                return resultado

    return None

vertice_inicial = 0
vertice_procurado = 31
visitados = []
resultado = busca_em_profundidade(grafo, vertice_inicial, vertice_procurado, visitados)

if resultado is not None:
    print(f"Caminho do vértice {vertice_inicial} ao vértice {vertice_procurado}: {resultado}")
else:
    print(f"Não foi possível encontrar um caminho do vértice {vertice_inicial} ao vértice {vertice_procurado}.")