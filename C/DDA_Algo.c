// #include"graphics.h"
// #include"math.h"
// #include"stdio.h"
// #include"conio.h"
// void main()
// {
//     int gd = DETECT,gm,i;
// }
#include <stdio.h>
#include <graphics.h>

void drawLineDDA(int x1, int y1, int x2, int y2) {
    int dx = x2 - x1;
    int dy = y2 - y1;
    int steps = abs(dx) > abs(dy) ? abs(dx) : abs(dy);

    float xIncrement = (float)dx / steps;
    float yIncrement = (float)dy / steps;

    float x = x1, y = y1;

    for (int i = 0; i <= steps; i++) {
        putpixel(round(x), round(y), WHITE);
        x += xIncrement;
        y += yIncrement;
    }
}

int main() {
    int gd = DETECT, gm;
    initgraph(&gd, &gm, NULL);

    int x1 = 50, y1 = 50;
    int x2 = 300, y2 = 200;

    drawLineDDA(x1, y1, x2, y2);

    getch();
    closegraph();
    return 0;
}
