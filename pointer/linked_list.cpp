// OCSALY
// Pointers in practice

#include <iostream>
#include <string>

using namespace std;


struct task {
    task* pNext;
    string description;
};
task *pHead = nullptr;
task *pCurrent = nullptr;

void queue_task(const string &name){
    task *pTask = new task;
    pTask->description = name;
    pTask->pNext = nullptr;
    if (nullptr == pHead) {
        pHead = pTask;
        pCurrent = pTask;
    }else{
        pCurrent->pNext = pTask;
        pCurrent = pTask;
    }

}

int main() {

    queue_task("remove old wallpaper");
    queue_task("fill holes");
    queue_task("size walls");
    queue_task("hang new wallpapers");

}
