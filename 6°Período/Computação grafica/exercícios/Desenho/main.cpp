#define GLUT_DISABLE_ATEXIT_HACK
#include <windows.h>
#include <GL/glut.h>
#include <stdlib.h>
#include <stdio.h>

float windowSizeX = 800.0f, windowSizeY = 600.0f;
int r=255, g=0, b=0;
int posX, posY, posX1, posY1;
int contador =0;
int limparTela=0;
int seletor =0;
float tamanho= 1.0f;

//unsigned keyjob;

void keyboard(unsigned char key, int x, int y){

        switch(key){

        case 27:
            exit(0);
            break;

        case '1':
                r=255;
                g=0;
                b=0;
                printf("Cor vermelha selecionada\n");
                printf("--------------------------\n");
            break;

        case '2':
                r=0;
                g=255;
                b=0;
                printf("Cor verde selecionada\n");
                printf("--------------------------\n");
            break;

        case '3':
                r=0;
                g=0;
                b=255;
                printf("Cor azul selecionada\n");
                printf("--------------------------\n");
            break;

        case '4':
                r=0;
                g=0;
                b=0;
                printf("Cor preta selecionada\n");
                printf("--------------------------\n");
            break;

        case '5':
                r=255;
                g=255;
                b=0;
                printf("Cor amarela selecionada\n");
                printf("--------------------------\n");
            break;

        case '6':
                r=255;
                g=203;
                b=219;
                printf("Cor rosa selecionada\n");
                printf("--------------------------\n");
            break;

        case '7':
                r=255;
                g=140;
                b=0;
                printf("Cor laranja selecionada\n");
                printf("--------------------------\n");
            break;

        case '8':
                r=128;
                g=128;
                b=128;
                printf("Cor cinza selecionada\n");
                printf("--------------------------\n");
            break;

        case '9':
                r=150;
                g=75;
                b=0;
                printf("Cor marrom selecionada\n");
                printf("--------------------------\n");
            break;

        case '+':
            tamanho++;
            printf("tamanho + : %.2f\n",tamanho);
            printf("----------------\n");
            break;

        case '-':

            if(tamanho > 1){
                tamanho--;
                printf("tamanho- : %.2f\n",tamanho);
                printf("----------------\n");
            }
            break;

        case 'a':
            limparTela++;
            printf("Tela limpa!!\n");
            break;

        default:
            printf("Tecla incorreta!!\n");
            printf("-------------------\n");
    }
}


void mouse(int button, int state, int x, int y){

        y = windowSizeY - y;
        if (button == GLUT_LEFT_BUTTON) {
            if (state == GLUT_DOWN){
                posX = x;
                posY = y;
                if(contador >= 1){
                    contador = 0;
                    }else{
                        contador++;
                }

                if(contador ==1){
                        posX1 = x;
                        posY1 = y;
                    }else{
                        posX = x;
                        posY = y;
                }

            seletor++;

        }
    }

}

//Função callback para desenho
void desenha(void)
{
    //Inicializa o sistema de coordenadas
    glMatrixMode(GL_PROJECTION);
    glLoadIdentity();

    //Define os limites dos eixos x e y
    //Argumentos da função: void gluOrtho2D(GLdouble left, GLdouble right, GLdouble bottom, GLdouble top)
    gluOrtho2D (0.0f, windowSizeX, 0.0f, windowSizeY);

	//Limpa todos os pixels com a cor de fundo
	if(limparTela == 1){
        glClear(GL_COLOR_BUFFER_BIT);
        glBegin(GL_LINES);
        glVertex2i(0,0);
        glVertex2i(0,0);
        glEnd();
        limparTela = 0;

	}

    if(seletor > 0 ){
        glColor3ub(r, g, b);
        glLineWidth(tamanho);
        glBegin(GL_LINES);
        glVertex2i(posX1,posY1);
        glVertex2i(posX,posY);
        glEnd();
   }
    seletor = 0;

    glutPostRedisplay();

	//Habilita a execução de comandos OpenGL
	glFlush();
}


//Inicializa parâmetros
void init (void)
{
    // Configura a cor de fundo como branca
    glClearColor(1.0f, 1.0f, 1.0f, 1.0f);
}

//Principal
int main(void)
{
    //Tipo de janela (single-buffered) e cores utilizados
	glutInitDisplayMode(GLUT_SINGLE | GLUT_RGB);

	//Configura o tamanho da janela
	glutInitWindowSize (windowSizeX, windowSizeY);


	//Configura a posição inicial da janela
	glutInitWindowPosition (100, 100);

	//Configura a janela
	glutCreateWindow("Teste do OpenGL");

	//Chama a função desenha
	glutDisplayFunc(desenha);

	//Callback de teclas normais
	glutKeyboardFunc(keyboard);

	//Callback de teclas especiais
	//glutSpecialFunc(specialKeyboard);

	//Callback do Mouse
	glutMouseFunc(mouse);


	//Inicializa o programa
	init();

	//Habilita o loop (máquina de estados)
	glutMainLoop();

}
