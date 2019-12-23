#ifndef asdfg
#define asdfg
struct BNode
	{
		char data; //数据域
		BNode* LChild;//左孩子指针
		BNode* RChild;//右孩子指针
	};
class BinaryLinkTree//二叉链表类
{
private:	

	
	BNode* root;//根指针
	BNode**  parentLinkArray;//用来存储双亲结点指针的动态数组
	int length;//存储双亲结点指针的动态数组的长度
	
public:
	BinaryLinkTree();//构造函数
    ~BinaryLinkTree();//析构函数
	void Init(void);//初始化函数:已完全二叉树的形式输入，不存在的结点输入‘，’；
		           //用户自己保证输入数据的正确性
      BNode* getroot()//获得根节点地址
	{
		return root;
	}
	void PreOrder(BNode *t);//先序遍历
	void InOrder(BNode *t);//中序遍历
	void PostOrder(BNode *t);//
 
	 
	
	
};

#endif

