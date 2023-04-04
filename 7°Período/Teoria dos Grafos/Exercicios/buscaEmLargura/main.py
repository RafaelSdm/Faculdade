grafo = { 0: [1, 2],
          1: [0,3, 4],
          2:[0, 5,6],
          3:[1, 7,8],
          4: [1,9,10],
          5: [2,11,12],
          6: [2,13,14],
          7:[3,15,16],
          8:[3,17,18],
          9:[4,19,20],
          10:[4,21,22],
          11:[5,23,24],
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
          31:[30],
          32:[30]

           }


def buscaEmLargura(grafo, inicio, destino):
    visitados = []
    fila = [inicio]

    # loop para percorrer a fila
    while fila:
        # remove o primeiro nó da fila
        no = fila.pop(0)
        print("Visitando vertice {} " .format(no))

        if no not in visitados:
            visitados.append(no)
            print("Vertice visitado: {}".format(no))
            print("Adicionado na fila: {}".format(visitados))

            if no == destino:
                print("Achou o vertice!")
                return visitados

            for vizinho in grafo[no]:
                fila.append(vizinho)


    return None

inicio = 0
destino = 6
caminho = buscaEmLargura(grafo, inicio, destino)

if caminho:
    print('Caminho encontrado:', caminho)
else:
    print('Caminho não encontrado')