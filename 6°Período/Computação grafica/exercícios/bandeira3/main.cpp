#define GLUT_DISABLE_ATEXIT_HACK

/*
======== Teste OpenGL ==================
Nairon Neri Silva
Versão 1.0
Programa teste da configuração do GLUT
Desenha um quadrado vermelho na tela
========================================
*/

#include <windows.h>
#include <GL/glut.h>
#include <stdlib.h>

//Função callback para desenho
void desenha(void)
{
    //Inicializa o sistema de coordenadas
    glMatrixMode(GL_PROJECTION);
    glLoadIdentity();

    //Define os limites dos eixos x e y
    //Argumentos da função: void gluOrtho2D(GLdouble left, GLdouble right, GLdouble bottom, GLdouble top)
    gluOrtho2D (0.0f, 2600.0f, 0.0f, 1340.0f);

	//Limpa todos os pixels com a cor de fundo
	glClear(GL_COLOR_BUFFER_BIT);

	//Configura a cor como vermelho
    glColor3ub (0, 0, 255);

    // Desenha um quadrado preenchido com a cor corrente
      glBegin(GL_QUADS);
               glVertex2i(20,650);
               glVertex2i(20,500);
               glVertex2i(100,500);
               glVertex2i(100,650);


    glEnd();

    glColor3ub (255, 255, 255);


      glBegin(GL_QUADS);
               glVertex2i(100,650);
               glVertex2i(100,500);
               glVertex2i(180,500);
               glVertex2i(180,650);


    glEnd();

     glColor3ub (255, 0, 0);


      glBegin(GL_QUADS);
               glVertex2i(180,650);
               glVertex2i(180,500);
               glVertex2i(260,500);
               glVertex2i(260,650);


    glEnd();



     glColor3ub (0, 255, 0);


      glBegin(GL_QUADS);
               glVertex2i(670,650);
               glVertex2i(800,550);
               glVertex2i(1200,550);
               glVertex2i(1200,650);


    glEnd();


     glColor3ub (255, 255, 255);


      glBegin(GL_QUADS);
               glVertex2i(800,550);
               glVertex2i(800,450);
               glVertex2i(1200,450);
               glVertex2i(1200,550);


    glEnd();


        glColor3ub (255, 0, 0);


      glBegin(GL_QUADS);
               glVertex2i(800,450);
               glVertex2i(670,350);
               glVertex2i(1200,350);
               glVertex2i(1200,450);


    glEnd();



        glColor3ub (255, 0, 0);


      glBegin(GL_TRIANGLES);
               glVertex2i(150,170);
               glVertex2i(20,330);
               glVertex2i(20,50);



    glEnd();



       glColor3ub (255, 255, 255);


      glBegin(GL_QUADS);
               glVertex2i(20,330);
               glVertex2i(150,170);
               glVertex2i(640,170);
               glVertex2i(640,330);



    glEnd();



      glColor3ub (0, 0, 255);


      glBegin(GL_QUADS);
               glVertex2i(150,170);
               glVertex2i(20,50);
               glVertex2i(640,50);
               glVertex2i(640,170);



    glEnd();


/// grrrrreeeeeeciciciaa

     glColor3ub (0, 0, 255);


      glBegin(GL_QUADS);
               glVertex2i(10,1200);
               glVertex2i(10,900);
               glVertex2i(700,900);
               glVertex2i(700,1200);



    glEnd();


      glColor3ub (255, 255, 255);


      glBegin(GL_QUADS);
               glVertex2i(50,1200);
               glVertex2i(50,1100);
               glVertex2i(70,1100);
               glVertex2i(70,1200);



    glEnd();

      glColor3ub (255, 255, 255);


      glBegin(GL_QUADS);
               glVertex2i(10,1165);
               glVertex2i(10,1145);
               glVertex2i(120,1145);
               glVertex2i(120,1165);



    glEnd();






      glColor3ub (255, 255, 255);


      glBegin(GL_QUADS);
               glVertex2i(10,966);
               glVertex2i(10,933);
               glVertex2i(700,933);
               glVertex2i(700,966);



    glEnd();

      glColor3ub (255, 255, 255);


      glBegin(GL_QUADS);
               glVertex2i(10,1032);
               glVertex2i(10,999);
               glVertex2i(700,999);
               glVertex2i(700,1032);



    glEnd();


      glColor3ub (255, 255, 255);
      glBegin(GL_QUADS);
               glVertex2i(10,1098);
               glVertex2i(10,1065);
               glVertex2i(700,1065);
               glVertex2i(700,1098);





    glEnd();


      glColor3ub (255, 255, 255);
      glBegin(GL_QUADS);
               glVertex2i(120,1164);
               glVertex2i(120,1131);
               glVertex2i(700,1131);
               glVertex2i(700,1164);





    glEnd();




// EEEUEUEEUUUUUUAAAAAAAAAAA EEEEUUUUAUAAAAAAAAAAAAA



   glColor3ub (255, 0, 0);
      glBegin(GL_QUADS);
               glVertex2i(1310, 1200);
               glVertex2i(1310,900);
               glVertex2i(2000,900);
               glVertex2i(2000,1200);





    glEnd();


      glColor3ub (255, 255, 255);
      glBegin(GL_QUADS);
               glVertex2i(1310, 1177);
               glVertex2i(1310,1154);
               glVertex2i(2000,1154);
               glVertex2i(2000,1177);





    glEnd();


      glColor3ub (255, 255, 255);
      glBegin(GL_QUADS);
               glVertex2i(1310, 1131);
               glVertex2i(1310,1108);
               glVertex2i(2000,1108);
               glVertex2i(2000,1131);





    glEnd();



      glColor3ub (255, 255, 255);
      glBegin(GL_QUADS);
               glVertex2i(1310, 1085);
               glVertex2i(1310,1062);
               glVertex2i(2000,1062);
               glVertex2i(2000,1085);





    glEnd();


      glColor3ub (255, 255, 255);
      glBegin(GL_QUADS);
               glVertex2i(1310, 1039);
               glVertex2i(1310,1016);
               glVertex2i(2000,1016);
               glVertex2i(2000,1039);





    glEnd();



      glColor3ub (255, 255, 255);
      glBegin(GL_QUADS);
               glVertex2i(1310, 993);
               glVertex2i(1310,970);
               glVertex2i(2000,970);
               glVertex2i(2000,993);





    glEnd();


      glColor3ub (255, 255, 255);
      glBegin(GL_QUADS);
               glVertex2i(1310, 947);
               glVertex2i(1310,924);
               glVertex2i(2000,924);
               glVertex2i(2000,947);





    glEnd();


       glColor3ub (0, 0, 255);
      glBegin(GL_QUADS);
               glVertex2i(1310, 1200);
               glVertex2i(1310,1039);
               glVertex2i(1600,1039);
               glVertex2i(1600,1200);





    glEnd();



      glColor3ub (255, 255, 255);
      glPointSize(10.0);
      glBegin(GL_POINTS);
               glVertex2i(1320, 1190);
               glVertex2i(1380,1190);
               glVertex2i(1440,1190);
               glVertex2i(1500,1190);
               glVertex2i(1560,1190);

               glVertex2i(1350, 1170);
               glVertex2i(1410,1170);
               glVertex2i(1470,1170);
               glVertex2i(1530,1170);
               glVertex2i(1590,1170);

               glVertex2i(1320, 1150);
               glVertex2i(1380,1150);
               glVertex2i(1440,1150);
               glVertex2i(1500,1150);
               glVertex2i(1560,1150);

                glVertex2i(1350, 1130);
               glVertex2i(1410,1130);
               glVertex2i(1470,1130);
               glVertex2i(1530,1130);
               glVertex2i(1590,1130);


                glVertex2i(1320, 1110);
               glVertex2i(1380,1110);
               glVertex2i(1440,1110);
               glVertex2i(1500,1110);
               glVertex2i(1560,1110);

                 glVertex2i(1350, 1090);
               glVertex2i(1410,1090);
               glVertex2i(1470,1090);
               glVertex2i(1530,1090);
               glVertex2i(1590,1090);

               glVertex2i(1320, 1070);
               glVertex2i(1380,1070);
               glVertex2i(1440,1070);
               glVertex2i(1500,1070);
               glVertex2i(1560,1070);

               glVertex2i(1350, 1050);
               glVertex2i(1410,1050);
               glVertex2i(1470,1050);
               glVertex2i(1530,1050);
               glVertex2i(1590,1050);





    glEnd();

    // afrriiccaa

      glColor3ub (255, 255, 255);
      glBegin(GL_QUADS);
               glVertex2i(1400, 650);
               glVertex2i(1400,250);
               glVertex2i(2400,250);
               glVertex2i(2400,650);





    glEnd();



     glColor3ub (255, 255, 0);
      glBegin(GL_TRIANGLES);

               glVertex2i(1650, 450);

               glVertex2i(1400,550);

               glVertex2i(1400,350);






    glEnd();


      glColor3ub (0, 0, 0);
      glBegin(GL_TRIANGLES);

               glVertex2i(1600, 450);

               glVertex2i(1400,530);

               glVertex2i(1400,370);






    glEnd();


     glColor3ub (0, 255, 0);
      glBegin(GL_TRIANGLES);

               glVertex2i(1400, 650);
               glVertex2i(1400, 550);
               glVertex2i(1530, 650);






    glEnd();



    glColor3ub (0, 255, 0);
      glBegin(GL_TRIANGLES);

               glVertex2i(1400, 250);
               glVertex2i(1400, 350);
               glVertex2i(1530, 250);






    glEnd();



      glColor3ub (0,0,255);
      glBegin(GL_QUADS);

               glVertex2i(2400, 250);
               glVertex2i(2400, 370);
               glVertex2i(1900, 370);
               glVertex2i(1600, 250);






    glEnd();


       glColor3ub (255,0,0);
      glBegin(GL_QUADS);

               glVertex2i(2400, 650);
               glVertex2i(2400, 530);
               glVertex2i(1900, 530);
               glVertex2i(1600, 650);






    glEnd();




      glColor3ub (0,255,0);
      glBegin(GL_QUADS);

               glVertex2i(2400, 400);
               glVertex2i(2400, 500);
               glVertex2i(1900, 500);
               glVertex2i(1900, 400);






    glEnd();


     glColor3ub (0,255,0);
      glBegin(GL_TRIANGLES);

               glVertex2i(1650, 450);
               glVertex2i(1900, 500);
               glVertex2i(1900, 400);





    glEnd();




       glColor3ub (0,255,0);
      glBegin(GL_QUADS);

               glVertex2i(1650, 450);
               glVertex2i(1400,350);
               glVertex2i(1530, 250);
               glVertex2i(1900, 400);






    glEnd();



     glColor3ub (0,255,0);
      glBegin(GL_QUADS);

               glVertex2i(1650, 450);
               glVertex2i(1400,550);
               glVertex2i(1530, 650);
               glVertex2i(1900, 500);






    glEnd();






	//Habilita a execução de comandos OpenGL
	glFlush();
}

//Inicializa parâmetros
void init (void)
{
    // Configura a cor de fundo como preta
    glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
}

//Principal
int main(void)
{
    //Tipo de janela (single-buffered) e cores utilizados
	glutInitDisplayMode(GLUT_SINGLE | GLUT_RGB);

	//Configura o tamanho da janela
	glutInitWindowSize (2600, 1340);

	//Configura a posição inicial da janela
	glutInitWindowPosition (0, 0);

	//Configura a janela
	glutCreateWindow("Teste do OpenGL");

	//Chama a função desenha
	glutDisplayFunc(desenha);

	//Inicializa o programa
	init();

	//Habilita o loop (máquina de estados)
	glutMainLoop();
}
