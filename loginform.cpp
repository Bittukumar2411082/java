#include<iostream>
#include<fstream>
#include <limits>
using namespace std;
class temp{
string Username,Email,password;
string searchName,searchPass,searchEmail;
fstream file;
public:
void login(){
    cout<<"-------login-------"<<endl;
    cout<<"Enter your username:"<<endl; 
    getline(cin,searchName);
    cout<<"enter your password:"<<endl;
    getline(cin,searchPass);
    file.open("loginData.txt",ios::in);
    getline(file,Username,'*');
    getline(file,Email,'*');
    getline(file,password,'\n');
    while(!file.eof()){
        if(Username==searchName){
            if(password==searchPass){
                cout<<"\nAccount login succesfull....!";
                cout<<"\nusername:"<<Username<<endl;
                cout<<"\nEmail:"<<Email<<endl;
            }
            else{
                cout<<"password is incorrect...!";
            }
        }
          getline(file,Username,'*');
    getline(file,Email,'*');
    getline(file,password,'\n'); 
    }
    file.close();

}
void signup(){
cout<<"\nEnter your username:";
getline(cin,Username);
cout<<"\nEnter your Email address:";
getline(cin,Email);
cout<<"Enter your password:";
getline(cin,password);

file.open("loginData.txt",ios::out|ios::app);
file<<Username<<"*"<<Email<<"*"<<password<<endl;
file.close();
}
void forgotpassword()
{
    cout << "\nEnter your Username: ";
    getline(cin, searchName);

    cout << "\nEnter your Email address: ";
    getline(cin, searchEmail);

    file.open("loginData.txt", ios::in);

    while(getline(file, Username, '*'))
    {
        getline(file, Email, '*');
        getline(file, password, '\n');

        if(Username == searchName && Email == searchEmail)
        {
            cout << "\nAccount found!" << endl;
            cout << "Your password is: " << password << endl;
            file.close();
            return;
        }
    }

    cout << "\nAccount not found!" << endl;

    file.close();
}
};
int main(){
    temp obj;
    char choice;
    cout<<"\n1-login";
    cout<<"\n2-sign up";
    cout<<"\n3-Forgot password";
    cout<<"\n4-exit";
    cout<<"\n Enter your choice::";
    cin >> choice;
    cin.ignore(numeric_limits<streamsize>::max(), '\n');
    switch(choice){
        case '1':
        obj.login();
        break;
        case '2':
        obj.signup();
        break;
        case '3':
        obj.forgotpassword();
        break;
        case '4':
        return 0;
        break;
        default:
        cout<<"invalid selection";
    }
}