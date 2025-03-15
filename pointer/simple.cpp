// OCSALY
// Pointers in practice
#include <array>
#include <iostream>
#include <vector>

using namespace std;

struct task{
    task* pNext;
    string description;
};

int main() {

    task item;
    item.description = "do someting";

    task* pTask = new task;
    pTask->description = "do something";
    //after using  the object you can delete by :
    delete pTask;
}
