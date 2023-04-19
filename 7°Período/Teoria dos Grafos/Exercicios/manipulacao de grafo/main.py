def chamarGrafo(grafo):
    print("Grafo pos fusao")
    #print("--------------------------------------------------------------------------------------------")
    print(grafo)
    print("--------------------------------------------------------------------------------------------")











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


def acharCaminho(v1, v2, grafo):
    visitados_vertices = set()
    caminhos = []



    def novoCaminho(no, adicionaCaminho):
        visitados_vertices.add(no)
        if no == v2:
            adicionaCaminho.append(no)
            caminhos.append(adicionaCaminho)
        else:
            for vizinho in grafo[no]:
                if vizinho not in visitados_vertices:
                    novoCaminho(vizinho, adicionaCaminho + [no])
        visitados_vertices.remove(no)

    novoCaminho(v1, [])
    return caminhos


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











grafo = {
    '1': ['2', '3', '6', '7'],
    '2': ['1', '3', '4', '5'],
    '3': ['1', '2', '4', '5', '6', '7'],
    '4': ['2', '3', '9', '10'],
    '5': ['2', '3', '7', '8', '10'],
    '6': ['1', '3', '7'],
    '7': ['1', '3', '5', '6', '8'],
    '8': ['5', '7', '10'],
    '9': ['4', '10'],
    '10': ['4', '5', '8', '9']
}



print('Grafo antes da fusao')

print(grafo)




#-------------------------------------------------------------------

# SEGUE ABAIXO COMO DEVE SER FEITA AS CHAMADAS DAS FUNCOES DE PARA A
# MODIFICAÇÃO DO GRAFO.

#----------------------------------------------------------------------

#grafo = fusao("1", "7", grafo)
#chamarGrafo(grafo)

#grafo = contracaoVertice("1", "7", grafo)
#chamarGrafo(grafo)


#grafo = contracao_aresta("1", "7", grafo);
#chamarGrafo(grafo)


#lista = acharCaminho("1", "7", grafo);
#chamarGrafo(lista)




# contracao da aresta = OK
# Fusao do vertice  = OK
# Contracao do vertice = OK
# CAMINHO = FEITO