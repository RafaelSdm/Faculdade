def bellman_ford(grafo, inicial, final):
    n = len(grafo)
    distancias = {}
    for v in grafo:
        distancias[v] = float("inf")
    predecessores = {v: None for v in grafo}
    distancias[inicial] = 0
    pesos = {}

    for u in grafo:
        for v in grafo[u]:
            pesos[(u, v)] = grafo[u][v]

    for i in range(n - 1):
        for u in grafo:
            for v in grafo[u]:
                if distancias[v] > distancias[u] + pesos[(u, v)]:
                    distancias[v] = distancias[u] + pesos[(u, v)]
                    predecessores[v] = u

    for u in grafo:
        for v in grafo[u]:
            if distancias[v] > distancias[u] + pesos[(u, v)]:
                raise ValueError("O grafo contém ciclo negativo")

    return construir_caminho(predecessores, inicial, final)


def construir_caminho(predecessores, inicial, final):
    caminho = []
    v = final
    while v is not None:
        caminho.insert(0, v)
        v = predecessores[v]
    if caminho[0] != inicial:
        return None
    return caminho


# exemplo de uso
grafo = {
    'A': {'G': 10, 'B': 6, 'F':10},
    'B': {'C': 5, 'F':3, 'G':7},
    'C': {'A':2, 'F': 15},
    'D': {'B': 5, 'C':5},
    'E': {'C':2, 'D':2},
    'F': {'E':2},
    'G':{'E':2, 'F':5}
}
inicial = 'A'
final = 'G'
caminho = bellman_ford(grafo, inicial, final)
if caminho is None:
    print('Não há caminho de {} para {}'.format(inicial, final))
else:
    print('Caminho mais curto de {} até {}: {}'.format(inicial, final, caminho))





