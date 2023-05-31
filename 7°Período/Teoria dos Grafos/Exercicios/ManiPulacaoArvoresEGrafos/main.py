
from collections import defaultdict





"""
grafo = {
    '50': ['40', '60'],
    '40': ['30', '45', '50'],
    '60': ['55', '70', '50'],
    '30': ['40'],
    '55': ['60'],
    '45': ['40'],
    '70': ['60']
}
"""

def pre_ordem(grafo, vertice):
    pilha = [vertice]  # Inicializa a pilha com o vértice raiz
    visitados = set()  # Mantém um conjunto de nós visitados

    while pilha:
        atual = pilha.pop()  # Remove o último vértice da pilha

        if atual not in visitados:
            print(atual)  # Imprime o vértice atual
            visitados.add(atual)

            vizinhos = grafo.get(atual, [])  # Obtém os vizinhos do vértice atual

            # Empilha os vizinhos na ordem inversa para manter a ordem correta de pré-ordem
            for vizinho in reversed(vizinhos):
                pilha.append(vizinho)




"""
grafo = {
    50: [40, 60],
    40: [30, 45, 50],
    60: [55, 70, 50],
    30: [40],
    55: [60],
    45: [40],
    70: [60]
}

"""
def pos_ordem(grafo, vertice):
    visitados = set()  # Mantém um conjunto de nós visitados

    def dfs(v):
        visitados.add(v)

        vizinhos = grafo.get(v, [])
        for vizinho in vizinhos:
            if vizinho not in visitados:
                dfs(vizinho)

        print(v)  # Imprime o vértice atual após visitar todos os vizinhos

    print("Pós-Ordem:")
    dfs(vertice)


#pos_ordem(grafo, 50)

def fazerGrafoComPeso(caminhoArquivo):
    grafo = {}

    with open(r'{}'.format(caminhoArquivo), 'r') as arquivo:
        # Ler cada linha do arquivo
        for linha in arquivo:
            # Remover espaços em branco e quebras de linha
            linha = linha.strip()

            # Verificar se a linha não está vazia
            if linha:
                # Dividir a linha em partes separadas por ':'
                origem, destinos = linha.split(':')

                # Remover o caractere ';' do final da string de destinos
                destinos = destinos.rstrip(';')

                # Verificar se a origem já existe no dicionário
                if origem not in grafo:
                    grafo[origem] = {}

                # Dividir os destinos separados por vírgula
                destinos = destinos.split(',')

                # Percorrer os destinos
                for destino in destinos:
                    # Dividir o destino em chave e valor
                    chave, valor = destino.split('=')

                    # Converter o valor para inteiro
                    valor = int(valor)

                    # Adicionar a aresta ao dicionário do grafo
                    grafo[origem][chave] = valor

    # Exibir o dicionário do grafo
    #print(grafo)

    return grafo


def fazerGrafoSemPeso(caminhoArquivo1):
    grafo = {}
    # Abrir o arquivo
    with open(r'{}'.format(caminhoArquivo1), 'r') as arquivo:
        # Ler cada linha do arquivo
        for linha in arquivo:
            # Remover espaços em branco e quebras de linha
            linha = linha.strip()

            # Verificar se a linha não está vazia
            if linha:
                # Dividir a linha em partes separadas por ':'
                origem, destinos = linha.split(':')

                # Converter o nó de origem em inteiro
                origem = str(origem)

                # Dividir os destinos separados por vírgula e remover o ponto e vírgula
                destinos = destinos.rstrip(';').split(',')

                # Converter os destinos em uma lista de inteiros
                destinos = [str(destino) for destino in destinos]

                # Adicionar as arestas ao dicionário
                grafo[origem] = destinos

                # Exibir o dicionário do grafo
        #print(grafo)

        return grafo






def pre_ordem(grafo, vertice):
    pilha = [vertice]  # Inicializa a pilha com o vértice raiz
    visitados = set()  # Mantém um conjunto de nós visitados

    while pilha:
        atual = pilha.pop()  # Remove o último vértice da pilha

        if atual not in visitados:
            print(atual)  # Imprime o vértice atual
            visitados.add(atual)

            vizinhos = grafo.get(atual, [])  # Obtém os vizinhos do vértice atual

            # Empilha os vizinhos na ordem inversa para manter a ordem correta de pré-ordem
            for vizinho in reversed(vizinhos):
                pilha.append(vizinho)






def remocaoVerice(vertice, grafo):
    if vertice in grafo:
        # Remove o vértice do grafo
        del grafo[vertice]

        # Remove o vértice de todas as listas de adjacência
        for lista_adjacencia in grafo.values():
            if vertice in lista_adjacencia:
                lista_adjacencia.remove(vertice)

    return grafo

"""
def remove_no(node, valor):
    if node is None:
        return None
    if valor < node.valor:
        node.esquerda = remove_no(node.esquerda, valor)
    elif valor > node.valor:
        node.direita = remove_no(node.direita, valor)
    else:
        if node.esquerda is None:
            return node.direita
        elif node.direita is None:
            return node.esquerda

        min_node = encontra_min_node(node.direita)
        node.valor = min_node.valor
        node.direita = remove_no(node.direita, min_node.valor)

    return node
"""

def encontrar_min_node(node):
    while node['esquerda'] is not None:
        node = node['esquerda']
    return node

def remover_no(node, valor):
    if node is None:
        return None
    if valor < node[valor]:
        node['esquerda'] = remover_no(node['esquerda'], valor)
    elif valor > node['valor']:
        node['direita'] = remover_no(node['direita'], valor)
    else:
        if node['esquerda'] is None:
            return node['direita']
        elif node['direita'] is None:
            return node['esquerda']
        min_node = encontrar_min_node(node['direita'])
        node['valor'] = min_node['valor']
        node['direita'] = remover_no(node['direita'], min_node['valor'])



    return node






def fusao(v1, v2, grafo):

    contadorNormal = 0
    contadorNovoVertice = 0
    #print('Novo vertice recebe = {} {} '.format(v1, v2))
    novoVertice = str(v1) + str(v2)
    print(novoVertice)

    #print(grafo[v1])
    #aux = grafo[v1]
    #aux2 = grafo[v2]

    contador = 1
    f = 0
    g =0
    d = 0

    auxTop = grafo[v1] + grafo[v2]
    print(auxTop)
    #print('O novo grafo v1 + v2 {}'.format(auxTop))


    #print('testando grafo passado pela funcao-----------------')

    #print('Fusao do v1 com v2: {} = {} '.format(novoVertice, auxTop))
    #grafo[novoVertice] = auxTop


    #print(grafo)

    del grafo[v1]
    del grafo[v2]

    #print(grafo)

    grafo[novoVertice] = auxTop

    #print(grafo)
    #print(grafo)


    for verticeX in grafo:
        #print(grafo[verticeX])
        f = 0
        g =0
        while(f < len(grafo[verticeX])):
           # print(grafo[verticeX][f])
            if(grafo[verticeX][f] == v1):
                grafo[verticeX][f] = novoVertice


            f = f + 1


        while(g < len(grafo[verticeX])):
            if(grafo[verticeX][g] == v2):
                grafo[verticeX][g] = novoVertice
            g = g + 1


    #grafo[novoVertice].remove(novoVertice)
    #print(grafo[novoVertice])

    #grafo[14] = 1,2,3,


    d =0
    while(d < len(grafo[novoVertice])):
        print(grafo[novoVertice][d])

        if(str(grafo[novoVertice][d]) == str(novoVertice)):
            contadorNovoVertice = contadorNovoVertice + 1
        else:
            contadorNormal = contadorNormal + 1
        d = d + 1

    b = 0
    if(contadorNovoVertice > contadorNormal):
        remocao = contadorNovoVertice - contadorNormal

        while(b < remocao):
            grafo[novoVertice].remove(novoVertice)
            #print("ihull")
            b = b + 1
    else:
        grafo[novoVertice].remove(novoVertice)




    print('Contador normal de vertice: {} | contador do novo vertice: {} '.format(contadorNormal, contadorNovoVertice))

    return grafo




def contracaoVertice(v1,v2, grafo):
    grafo = fusao(v1,v2, grafo);
    for v1, lista in grafo.items():
        grafo[v1] = list(set(lista))

    for v2, lista in grafo.items():
        grafo[v2] = list(set(lista))

    return grafo



def contracao_aresta(v1, v2, grafo):

    #print(grafo[v1])

    novo_vertice =  str(v1) + str(v2);

    j = 0
    i = 0
    #print(novo_vertice)
    #print('grafo de v1')
    #print(grafo[v1])

    for graf in grafo[v1]:
        #grafo[v1].remove(v2)
        #print(graf)
        if(graf == v2):
            #print('dado a lista do grafo: {} vai ser removido o {}'.format(grafo[v1], v2))
            grafo[v1].remove(v2)


    #print('grafo v2: {}'.format(grafo[v2]))




    while(i < len(grafo[v1])):
        #print('Numero do grafo: {}'.format(grafo[v2][j]))

        if(grafo[v1][j] == v2):
            grafo[v1].remove(v2)

        i = i + 1


    while(j < len(grafo[v2])):
        #print('Numero do grafo: {}'.format(grafo[v2][j]))

        if(grafo[v2][j] == v1):
            grafo[v2].remove(v1)

        j = j + 1

    for graf1 in grafo[v2]:
       #print('tamanho do grafo 2: {}'.format(len(grafo[v2])))
        if(graf1 == v1):
            #print('dado a lista do grafo: {} vai ser removido o {}'.format(grafo[v2], v1))

            grafo[v2].remove(v1)






    #print(graf1)
    #grafo[v1].remove(v2)
    #grafo[v2].remove(v1)
    juntar_vertices = grafo[v1] + grafo[v2]

    #print('lista dos novo vertice: {}' .format(juntar_vertices))



    grafo[novo_vertice] = juntar_vertices


    #print('vertices juntados: {}'.format(juntar_vertices))


    #print(grafo)
    #print("---------------------------")
    for vertices in juntar_vertices:
        #print('Teste de for: {}'.format(vertices))

        if vertices != novo_vertice:
            grafo[vertices].append(novo_vertice)
            try:
                grafo[vertices].remove(v1)
            except:
                print('nao foi possivel excluir')

            try:
                grafo[vertices].remove(v2)
                print("removido com sucesso")
            except:
                print('nao foi possivel excluir')
            #print(grafo[vertices])



    del grafo[v1]
    del grafo[v2]

    return grafo




def algoritmo_Kahn(grafo):
    contador = defaultdict(int)

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






def dfs(graph, node, visited):
    if node not in visited:
        visited.append(node)
        for n in graph[node]:
            dfs(graph,n, visited)
    return visited

def remove_vertex(graph, vertex):
    if vertex in graph:
        graph.pop(vertex)
    for v in graph:
        if vertex in graph[v]:
            graph[v].remove(vertex)
    return graph





def dfs(grafo, nó, visitados):
    if nó not in visitados:
        visitados.append(nó)
        for n in grafo[nó]:
            dfs(grafo,n, visitados)
    return visitados

def encontrar_próximo_maior(grafo, vértice):

    vertices =  []
    #vertices_maiores = []



    vértices = [int(v) for v in grafo.keys()]
    """
    for vertice in grafo:
        vertices.append(vertice)

    for v in vertices:
        if int(v) > int(vertice):
            vertices_maiores.append(v)
    """
    vertices_maiores = [v for v in vértices if v > int(vértice)]
    if vertices_maiores:
        return str(min(vertices_maiores))
    else:
        return None

def remover_vértice(grafo, vértice):
    próximo_maior = encontrar_próximo_maior(grafo, vértice)
    if próximo_maior:
        if vértice in grafo:
            for v in grafo[vértice]:
                if v not in grafo[próximo_maior]:
                    grafo[próximo_maior].append(v)
                    if v in grafo:
                        grafo[v].append(próximo_maior)
            grafo.pop(vértice)
        for v in grafo:
            if vértice in grafo[v]:
                grafo[v].remove(vértice)
    return grafo

















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






i = 1
contador_grafo_arvore = 0;
grafoarvore = ''
while(i != 0):

    print('------------------------------------------')
    print('[0]  Sair do programa')
    print('[1]  Impressão em Pré-ordem')
    print('[2]  Impressão em Pós-ordem')
    print('[3]  Impressão Em ordem')
    print('[4]  Remoção de um vértice')
    print('[5]  Fusão de vértice')
    print('[6]  Contração de um vértice')
    print('[7]  Contração de uma aresta')
    print('[8]  Ordenação topológica (Kanh)')
    print('[9]  Caminho mínimo (Dijkstra)')
    print('[10] Caminho mínimo (Bellman-Ford)')

    print('-----------------------------------------')
    opcao = int(input('O que o senhor felipe deseja fazer?'))


    if opcao == 1:
        print('pre ordem')
        if(contador_grafo_arvore == 0):
            caminho = str(input(r'Informe o caminho do arquvo: (Ex: C:\arquivo.txt)'))
            grafoarvore = fazerGrafoSemPeso(caminho)
            contador_grafo_arvore = contador_grafo_arvore + 1
        else:
            grafoarvore = grafoarvore

        print('Grafo escolhido:')
        primeira_chave = next(iter(grafoarvore))
        pre_ordem(grafoarvore, primeira_chave)
        #print(grafoarvore)


    elif opcao == 2:
        print('pos ordem')

        if(contador_grafo_arvore ==0):

            caminho = str(input(r'Informe o caminho do arquivo: (Ex: C:\arquivo.txt)'))
            contador_grafo_arvore = contador_grafo_arvore + 1
            grafoarvore = fazerGrafoSemPeso(caminho)
        else:
            grafoarvore = grafoarvore

        primeira_chave = next(iter(grafoarvore))

        print('Primeira chave: {}'.format(primeira_chave))
        print('Grafo escolhido: {}'.format(grafoarvore))

        pos_ordem(grafoarvore, primeira_chave)


    elif opcao == 3:
        print('Em ordem')

        if(contador_grafo_arvore == 0):

            caminho = str(input(r'Informe o caminho do arquivo: (Ex: C:\arquivo.txt)'))
            grafoarvore = fazerGrafoSemPeso(caminho)
            contador_grafo_arvore = contador_grafo_arvore + 1
        #primeira_chave = next(iter(grafo))

        chaves_ordenadas = sorted(grafoarvore.keys())

        print("Chaves ordenadas:")
        for chave in chaves_ordenadas:
            print(chave)



    elif opcao == 4:
        print('remocao de vertice')
        if(contador_grafo_arvore ==0):

            caminho = str(input(r'Informe o caminho do arquivo: (Ex: C:\arquivo.txt)'))
            contador_grafo_arvore = contador_grafo_arvore + 1

            grafoarvore = fazerGrafoSemPeso(caminho)
        else:
            grafoarvore = grafoarvore

        remove = str(input('Informe qual vertice vai ser removido:'))
        grafoarvore = remover_vértice(grafoarvore, remove)
        print(grafoarvore)
        #grafo = remove_vertice(grafo,45)


        print(grafoarvore)

    elif opcao == 5:
        print('fusao')
        caminho = str(input(r'Informe o caminho do arquivo: (Ex: C:\arquivo.txt)'))
        v1 = str(input('Informe o vertice 1:'))
        v2 = str(input('Informe o vertice 2:'))
        grafo = fazerGrafoSemPeso(caminho)
        grafo = fusao(v1, v2, grafo)
        print(grafo)

    elif opcao == 6:
        print('contracao do vertice')
        caminho = str(input(r'Informe o caminho do arquivo: (Ex: C:\arquivo.txt)'))
        v1 = str(input('Informe o caminho de v1:'))
        v2 = str(input('Informe o caminho de v2:'))
        grafo = fazerGrafoSemPeso(caminho)
        grafo = contracaoVertice(v1, v2, grafo)
        print(grafo)

    elif opcao == 7:
        print('contracao da aresta')
        caminho = str(input(r'Informe o caminho do arquivo: (Ex: C:\arquivo.txt)'))
        grafo = fazerGrafoSemPeso(caminho)
        v1 = str(input('Informe o valor de v1:'))
        v2 = str(input('Informe o valor de v2:'))
        grafo = contracao_aresta(v1, v2, grafo)
        print(grafo)

    elif opcao == 8:
        print('ordenacao topologica')
        caminho = str(input(r'Informe o caminho do arquivo: (Ex: C:\arquivo.txt)'))
        #grafo = fazerGrafoSemPeso(caminho)

        grafo = {
            'A': ['B', 'C', 'D'],
            'B': ['C', 'D'],
            'C': ['A'],
            'D': ['C', 'S'],
            'S': ['A', 'B']

        }
        grafo = algoritmo_Kahn(grafo)
        print(grafo)

    elif opcao ==9:
        print('Dijsktra')
        caminho = str(input(r'Informe o caminho do arquivo: (Ex: C:\arquivo.txt)'))
        grafo = fazerGrafoComPeso(caminho)
        #distancias, predecessores = dijkstra(grafo, "A")
        distancias, predecessores = dijkstra(grafo, "A")

        print(distancias)
        print(predecessores)
        v1 = str(input('Informe o vertice de saida:'))
        v2 = str(input('Informe o vertice de chegada:'))
        distancia, caminho = dijkstra(grafo, v1, v2)

        print('Valor da distancia: {} - Caminho: {}'.format(distancia, caminho))


    elif opcao == 10:
        print('Bellman ford')
        caminho = str(input(r'Informe o caminho do arquivo: (Ex: C:\arquivo.txt)'))
        v1 = str(input('Informe o caminho de saida: '))
        v2 = str(input('Informe o caminho de chegada: '))
        grafo = fazerGrafoComPeso(caminho)

        grafo = bellman_ford(grafo,v1, v2)
        print(grafo)


    elif opcao == 0:
        print('Saiu do programa')
        i = 0

    else:
        print('Informe uma opcao novamente!')






