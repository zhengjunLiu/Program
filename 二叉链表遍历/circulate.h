#ifndef asdfg
#include"binaiylinktree.h"
#endif 
class circulate
{
	BNode **data;
	int front,real;
	int length;
	const int INIlength;
	const int Increment;
	int CURRENT;
public:
	circulate(int newINIlength=100,int newIncrement=10);
	void display();
	void EnteQueue(BNode *);
	void deleQueue(BNode *&);
    bool Empty();	

};