import re

i = 0


def tabelaToken(expressao):
    print(expressao)

    expressao_parte = expressao.split()
    resultadoFinal = []
    print(expressao_parte)
    j = 0

    while(j < len(expressao_parte)):
        #print(expressao_parte[j])
        result = re.findall(r'\d+|[()+*/-\u2013]', expressao_parte[j])
        #print(result)
        d = 0
        while(d < len(result)):
            resultadoFinal.append(result[d])
            d = d + 1
        #resultadoFinal.append(result)

        j = j + 1

    #result = re.findall(r'\d+|[()+*/-\u2013]', expressao_parte)

    print(resultadoFinal)

    v = 0
    print('Token | Simbolo')
    while(v < len(resultadoFinal)):


        #print(resultadoFinal[v].isnumeric())
        if(resultadoFinal[v] == '+' ):
            print('{} | Simbolo operacao soma'.format(resultadoFinal[v]))
        elif(resultadoFinal[v] == '(' or resultadoFinal[v] == ')'):
            print('{} | Simbolo operacao diferenca'.format(resultadoFinal[v]))
        elif(resultadoFinal[v] == '/' ):
            print('{} | Simbolo operacao divisao'.format(resultadoFinal[v]))
        elif(resultadoFinal[v] == '*'):
            print('{} | Simbolo operacao multiplicacao'.format(resultadoFinal[v]))
        elif(resultadoFinal[v].isnumeric() == True):
            print('{} | Simbolo de numerador'.format(resultadoFinal[v]))

        else:
            print('{} | Simbolo operacao subtracao'.format(resultadoFinal[v]))

        v = v + 1




while (i != 3):
    print('------------------------------')
    print('[1] - Gerar tabela de token')
    print('[2] - Gerar codigo da gramática')
    print('[3] - Sair')
    print('------------------------------')




    opcao = int(input("Informe a opcao desejada"))

    if(opcao == 1):
        print('Tabela de token')
        expressao = str(input('Informe a expressao matematica'))

        tabelaToken(expressao)

    elif(opcao == 2):
        print('tabela de gramatica')

    elif(opcao == 3):
        print('Sair')
        i = 1
    else:
        print('Informe uma opcao correta')
