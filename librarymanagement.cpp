#include<iostream>
#include<fstream>
using namespace std;
class temp{
string id,name,author,search;
fstream file;
public:
void showbook(){
file.open("librarydata.txt",ios::in);
    cout<<"\n\n"<<endl;
    cout<<"\t\t  Book id \t\t\t\t Book name \t\t\t\t author's name"<<endl;
    while(getline(file,id,'*')&&
    getline(file,name,'*')&&
    getline(file,author,'\n')){
    cout<<"\t\t "<<id<<" \t\t\t\t "<<name<<" \t\t\t\t "<<author<<endl;
 
    }
    file.close();
}
void extractbook(){
    showbook();
    cout<<"extract book search:";
    getline(cin,search);
    file.open("librarydata.txt",ios::in); 
     cout<<"\n\n"<<endl;
    cout<<"\t\t  Book id \t\t\t\t Book name \t\t\t\t author's name"<<endl;
     while(getline(file,id,'*')&&
    getline(file,name,'*')&&
    getline(file,author,'\n')){
        if(search==id){
            cout<<"\t\t "<<id<<" \t\t\t\t "<<name<<" \t\t\t\t "<<author<<endl;
            cout<<"book extract successfull...!"<<endl;
        }
    }
    file.close();

}
void addbook(){
    cout<<"enter your id:"<<endl;
    getline(cin,id);
    cout<<"enter your name:"<<endl;
    getline(cin,name);
    cout<<"enter your author:"<<endl;
    getline(cin,author);
    file.open("librarydata.txt",ios::out|ios::app);
    file<<id<<"*"<<name<<"*"<<author<<endl;
    file.close();
}
};
int main(){
    temp obj;
    char choice;
    cout<<"-------------------------"<<endl;
    cout<<"1-show all books"<<endl;
     cout<<"2-extract books"<<endl;
     cout<<"3-add books(ADMIN)"<<endl;
     cout<<"4-exit"<<endl;
      cout<<"-------------------------"<<endl;
     cout<<"enter your choice"<<endl;
     cin>>choice;
    switch (choice)
    {
    case '1':
        cin.ignore();
        obj.showbook();
        break;
    case '2':
      cin.ignore();
    obj.extractbook();
    break;
    case '3':
      cin.ignore();
    obj.addbook();
    break;
    case '4':
    return 0;
    break;
    default:
    cout<<"invalid choice!"<<endl;
    }
}