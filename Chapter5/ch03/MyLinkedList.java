package ch03;

public class MyLinkedList {

	private MyListNode head;	//ù ��° element ��ü�� head
	int count;	//element ����
	
	public MyLinkedList()
	{
		head = null;
		count = 0;
	}
	
	public MyListNode addElement(String data)
	{
		MyListNode newNode;	//���ο� ��� ����
		
		if(head == null) {  //�� ó���� ��
			newNode = new MyListNode(data);
			head = newNode;
		}
		else {
			newNode = new MyListNode(data);
			MyListNode temp = head;	//head���� �˻� ����
			while(temp.next != null)  //�� �ڷ� ����  
				temp = temp.next;
			temp.next = newNode;
		}
		
		count++;
		
		return newNode;
	}
	
	public MyListNode insertElement(int position, String data )
	{
		int i;
		MyListNode tempNode = head;
		MyListNode preNode = null;
		
		MyListNode newNode = new MyListNode(data);
		
		if(position < 0 || position > count) {
			System.out.println("�߰��� ��ġ �����Դϴ�. ���� ����Ʈ�� ������ " + count +"�� �Դϴ�.");
			return null;
		}
		
		if(position == 0){  //�� ������ ���� ���
			newNode.next = head;	//newNode�� next�� ������ head�� ����Ŵ
			head = newNode;	//newNode�� head�� ��
		}
		else{	//�߰��� ���� ���
			for(i=0; i<position; i++){
				preNode = tempNode;
				tempNode = tempNode.next;
			}
			
			newNode.next = preNode.next;
			preNode.next = newNode;
		}
		
		count++;
		
		return newNode;
	}
	
	public MyListNode removeElement(int position)
	{
		int i;
		MyListNode tempNode = head;
		MyListNode preNode = null;
		
		if(position >= count){
			System.out.println("������ ��ġ �����Դϴ�. ���� ����Ʈ�� ������ " + count +"�� �Դϴ�.");
			return null;
		}
		
		if(position == 0){  //�� ���� �����ϴ� ���
			head = tempNode.next;
		}
		else{	//�߰��� element�� �����ϴ� ���
			for(i=0; i<position; i++){
				preNode = tempNode;
				tempNode = tempNode.next;
			}
			
			preNode.next = tempNode.next;
		}
		
		count--;
		System.out.println(position + "��° �׸� �����Ǿ����ϴ�.");
		
		return tempNode;
	}
	
	public String getElement(int position)
	{
		int i;
		MyListNode tempNode = head;
		
		if(position >= count ){
			System.out.println("�˻� ��ġ �����Դϴ�. ���� ����Ʈ�� ������ " + count +"�� �Դϴ�.");
			return new String("error");
		}
		
		if(position == 0){  //�� ���� ���
			return head.getData();
		}
		
		for(i=0; i<position; i++){
			tempNode = tempNode.next;
		}
		
		return tempNode.getData();
	}

	public MyListNode getNode(int position)
	{
		int i;
		MyListNode tempNode = head;
		
		if(position >= count ){
			System.out.println("�˻� ��ġ �����Դϴ�. ���� ����Ʈ�� ������ " + count +"�� �Դϴ�.");
			return null;
		}
		
		if(position == 0){  //�� ���� ���
			return head;
		}
		
		for(i=0; i<position; i++){
			tempNode = tempNode.next;
		}

		return tempNode;
	}

	public void removeAll()
	{
		head = null;
		count = 0;
	}
	
	public int getSize()
	{
		return count;
	}
	
	public void printAll()
	{
		if(count == 0){
			System.out.println("����� ������ �����ϴ�.");
			return;
		}
		
		MyListNode temp = head;
		while(temp != null){
			System.out.print(temp.getData());
			temp = temp.next;
			if(temp!=null){
				System.out.print("->");
			}
		}
		System.out.println("");
	}
	
	public boolean isEmpty()
	{
		if(head == null) return true;
		else return false;
	}

}
