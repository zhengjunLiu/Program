#ifndef asdfg
#define asdfg
struct BNode
	{
		char data; //������
		BNode* LChild;//����ָ��
		BNode* RChild;//�Һ���ָ��
	};
class BinaryLinkTree//����������
{
private:	

	
	BNode* root;//��ָ��
	BNode**  parentLinkArray;//�����洢˫�׽��ָ��Ķ�̬����
	int length;//�洢˫�׽��ָ��Ķ�̬����ĳ���
	
public:
	BinaryLinkTree();//���캯��
    ~BinaryLinkTree();//��������
	void Init(void);//��ʼ������:����ȫ����������ʽ���룬�����ڵĽ�����롮������
		           //�û��Լ���֤�������ݵ���ȷ��
      BNode* getroot()//��ø��ڵ��ַ
	{
		return root;
	}
	void PreOrder(BNode *t);//�������
	void InOrder(BNode *t);//�������
	void PostOrder(BNode *t);//
 
	 
	
	
};

#endif

