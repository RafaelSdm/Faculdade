def encontra_minimo(vertices, distancias):
    indice_minimo = 0
    menor_distancia = distancias[0]
    for i in range(len(distancias)):
        if distancias[i] < menor_distancia:
            menor_distancia = distancias[i]
            indice_minimo = i
    vertice_minimo = vertices[indice_minimo]
    return indice_minimo, vertice_minimo

def dijkstra(grafo, origem, destino=None):
    # Inicialização das distâncias e antecessores
    distancias = {}
    predecessores = {}
    for vertice in grafo:
        distancias[vertice] = float('inf')
        predecessores[vertice] = None
    distancias[origem] = 0

    # Conjuntos de vértices visitados e não visitados
    visitados = set()
    nao_visitados = set(grafo.keys())

    while nao_visitados:
        # Escolha do vértice com menor distância
        vertice_atual = None
        for vertice in nao_visitados:
            if vertice_atual is None:
                vertice_atual = vertice
            elif distancias[vertice] < distancias[vertice_atual]:
                vertice_atual = vertice


        nao_visitados.remove(vertice_atual)
        visitados.add(vertice_atual)

        for vizinho, peso in grafo[vertice_atual].items():
            if vizinho in visitados:
                continue
            nova_distancia = distancias[vertice_atual] + peso
            if nova_distancia < distancias[vizinho]:
                distancias[vizinho] = nova_distancia
                predecessores[vizinho] = vertice_atual

    if destino is not None:
        caminho = []
        vertice = destino
        while vertice is not None:
            caminho.append(vertice)
            vertice = predecessores[vertice]
        caminho.reverse()

        if distancias[destino] == float('inf'):
            return 'Não possui caminho'
        else:
            return distancias[destino], caminho
    else:
        return distancias, predecessores



grafo = {
    'A': {'E': 2},
    'B': {'C': 2},
    'C': {'A': 4, 'E': 3},
    'D': {'B': 7, 'C': 5},
    'E': {}
}

distancias, predecessores = dijkstra(grafo, "A")

print(distancias)
print(predecessores)

distancia, caminho = dijkstra(grafo, "A", "E")


print('Valor da distancia: {} - Caminho: {}'.format(distancia, caminho))
