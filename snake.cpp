#include<iostream>
#include<conio.h>
#include<windows.h>
using namespace std;
enum direction{stop=0,left,right,up,down};
direction dir;
bool gameover;
const int height=20;
const int width=20;
int headX,headY,fruitX,fruitY,score;
int tail_len;
int tailx[100],taily[100];
void setup(){
gameover=false;
dir=stop;
headX=width/2;
headY=height/2;
fruitX=rand()%width;
fruitY=rand()%height;
score=0;

}
void draw(){
system("cls");
//upper border
cout<<"\t\t";
for(int i=0;i<width-8;i++){
    cout<<"||";
}
cout<<endl;
//snake,fruit,space,and sideborder
for(int i=0; i<height;i++){
    for(int j=0;j<width;j++){
if(j==0){
    cout<<"\t\t||";
}
if(i==headY&&j==headX){
    cout<<"O";
}
else if(i==fruitY&&j==fruitX){
    cout<<"*";
}
else{
    bool print=false;
    //tail
    for(int k=0;k<tail_len;k++){
if(tailx[k]==j&&taily[k]==i){
    cout<<"O";
    print =true;
    }
}
//space
if(!print){
    cout<<" ";
    }
}
//right border
if(j==width-1){
    cout<<"||";
}
cout<<endl;  
}
//lower border
cout<<"\t\t";
for(int i=0;i<width-8;i++){
    cout<<"||";
}
cout<<endl;
cout<<"\t\t";
}
void input(){

}
void logic(){

}

int main(){
    char start;
    cout<<"\t-----------------------------------"<<endl;
    cout<<"\t\t:snake game:"<<endl;
    cout<<"\t-----------------------------------"<<endl;
    cout<<"\tpress 's' to start game:";
    cin>>start;
    if(start=='s'){
       setup();
       while(!gameover){
        draw();
        input();
        logic();
        sleep(30);
        system("cls");
       }
    }

}