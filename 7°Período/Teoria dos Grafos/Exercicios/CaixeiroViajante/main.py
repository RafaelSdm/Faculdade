import heapq
import itertools
import sys


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






def guloso_caixeiro_viajante(grafo, inicio):
    num = len(grafo)
    visitados = set([inicio])
    caminho = [inicio]

    # Inicializar as distâncias de todos os vértices como infinito, exceto a cidade inicial
    distancias = {c: sys.maxsize for c in grafo}
    distancias[inicio] = 0

    fila_prioridade = [(0, inicio)]

    while len(visitados) < num:
        _, atual = heapq.heappop(fila_prioridade)

        vertice = None
        distancia_minima = sys.maxsize

        for vizinho, distancia in grafo[atual].items():
            if vizinho not in visitados and distancia < distancia_minima:
                proxima_cidade = vizinho
                distancia_minima = distancia

        # Adicionar a cidade vizinha ao caminho e marcar como visitada
        caminho.append(vertice)
        visitados.add(vertice)

        # Atualizar a distância mínima do vértice vizinho
        distancias[vertice] = distancia_minima

        heapq.heappush(fila_prioridade, (distancia_minima, vertice))

    caminho.append(inicio)

    return caminho









def calcular_distancia(caminho, grafo):
    distancia_total = 0
    for i in range(len(caminho) - 1):
        cidade_atual = caminho[i]
        proxima_cidade = caminho[i + 1]
        distancia = grafo[cidade_atual][proxima_cidade]
        distancia_total += distancia
    # Adicionar a distância de volta à cidade inicial
    distancia_total += grafo[caminho[-1]][caminho[0]]
    return distancia_total

def forca_bruta_caixeiro_viajante(grafo):
    cidades = list(grafo.keys())
    melhor_distancia = float('inf')
    melhor_caminho = []

    for permutacao in itertools.permutations(cidades):
        distancia = calcular_distancia(permutacao, grafo)
        if distancia < melhor_distancia:
            melhor_distancia = distancia
            melhor_caminho = list(permutacao)

    melhor_caminho.append(melhor_caminho[0])
    return melhor_caminho



i = 0

while(i != 1):
    print('-----------------------------------------------')
    print('[1] - IMPLEMENTAR O ALGORITIMO GULOSO')
    print('[2] - IMPLEMENTAR O ALGORITIMO FORCA BRUTA')
    print('[0] - SAIR')
    print('------------------------------------------------')

    try:

        opcao = int(input('Informe a opção desejada:'))
    except:
        opcao = 999


    if(opcao == 1):
        print('Opcao de Guloso')
        caminho = str(input('Informe o caminho do arquivo:'))
        grafo = fazerGrafoComPeso(caminho)


        caminho = guloso_caixeiro_viajante(grafo, 'A')
        print(caminho)
        #print(grafo)



    elif(opcao == 2):
        print('Opcao algoritimo Forca bruta')
        caminho = str(input('Informe o nome do caminho'))
        grafo = fazerGrafoComPeso(caminho)


        caminho = forca_bruta_caixeiro_viajante(grafo)
        print(caminho)
        #print(grafo)
        #dijkstra(grafo, 'C', 'S')

    elif(opcao == 0):
        print('Voce saiu do programa!')
        i = 1

    else:
        print('Escolha uma opcao válida')







