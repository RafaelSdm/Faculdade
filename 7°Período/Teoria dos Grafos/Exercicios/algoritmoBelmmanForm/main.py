def bellman_ford(grafo, inicial, final):
    distancias = {}
    predecessores = {}
    pesos = {}

    for vertice in grafo:
        distancias[vertice] = float("inf")
        predecessores[vertice] = None

    distancias[inicial] = 0

    for u in grafo:
        for v in grafo[u]:
            pesos[(u, v)] = grafo[u][v]

    for i in range(len(grafo) - 1):
        for u in grafo:
            for v in grafo[u]:
                if distancias[v] > distancias[u] + pesos[(u, v)]:
                    distancias[v] = distancias[u] + pesos[(u, v)]
                    predecessores[v] = u

    for u in grafo:
        for v in grafo[u]:
            if distancias[v] > distancias[u] + pesos[(u, v)]:
                raise ValueError("O grafo contém ciclo negativo")

    caminho = []
    vertice = final
    while vertice is not None:
        caminho.insert(0, vertice)
        vertice = predecessores[vertice]

    if caminho[0] != inicial:
        return None

    return caminho



grafo = {
    'A': {'G': 10, 'B': 6, 'F': 10},
    'B': {'C': 5, 'F': 3, 'G': 7},
    'C': {'A': 2, 'F': 15},
    'D': {'B': 5, 'C': 5},
    'E': {'C': 2, 'D': 2},
    'F': {'E': 2},
    'G': {'E': 2, 'F': 5}
}

inicial = 'A'
final = 'G'
caminho = bellman_ford(grafo, inicial, final)

if caminho is None:
    print('Nao existe caminho para esses vertices')
else:
    print('Caminho mais curto de {} - {} : {}'.format(inicial, final, caminho))
