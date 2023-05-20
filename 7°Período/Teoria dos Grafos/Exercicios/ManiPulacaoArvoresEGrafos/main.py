

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
                origem = int(origem)

                # Dividir os destinos separados por vírgula e remover o ponto e vírgula
                destinos = destinos.rstrip(';').split(',')

                # Converter os destinos em uma lista de inteiros
                destinos = [int(destino) for destino in destinos]

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







i = 1
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
        caminho = str(input(r'Informe o caminho do arquvo: (Ex: C:\arquivo.txt)'))
        grafo = fazerGrafoSemPeso(caminho)
        primeira_chave = next(iter(grafo))

        grafo = fazerGrafoSemPeso(caminho)
        print('Grafo escolhido:')

        pre_ordem(grafo, primeira_chave)
        print(grafo)


    elif opcao == 2:
        print('pos ordem')
        caminho = str(input(r'Informe o caminho do arquivo: (Ex: C:\arquivo.txt)'))
        grafo = fazerGrafoSemPeso(caminho)
        primeira_chave = next(iter(grafo))


        print('Primeira chave: {}'.format(primeira_chave))
        print('Grafo escolhido: {}'.format(grafo))

        pos_ordem(grafo, primeira_chave)


    elif opcao == 3:
        print('in ordem')

        caminho = str(input(r'Informe o caminho do arquivo: (Ex: C:\arquivo.txt)'))
        grafo = fazerGrafoSemPeso(caminho)
        primeira_chave = next(iter(grafo))

        chaves_ordenadas = sorted(grafo.keys())

        print("Chaves ordenadas:")
        for chave in chaves_ordenadas:
            print(chave)



    elif opcao == 4:
        print('remocao de vertice')

    elif opcao == 5:
        print('fusao')

    elif opcao == 6:
        print('contracao do vertice')

    elif opcao == 7:
        print('contracao da aresta')

    elif opcao == 8:
        print('ordenacao topologica')

    elif opcao ==9:
        print('Dijsktra')

    elif opcao == 10:
        print('Bellman ford')

    elif opcao == 0:
        print('Saiu do programa')
        i = 0

    else:
        print('Informe uma opcao novamente!')





