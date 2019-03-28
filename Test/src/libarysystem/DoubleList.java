package libarysystem;

public class DoubleList<T> extends Books{
	
	class Node {
		private T value;
		private Node prev;
		private Node next;
	    private int data;
	    public Node() {
	    	this.prev = null;
	    	this.next = null;
	    	this.data = 0;
	    }
		public Node(int data) {
			this.data = data;
		}
	}
	
	private Node head;
	private Node tail;
	private int num;
	private int length;

	public DoubleList() {
		length = 0;
		head = new Node();
		tail = new Node();
		head.next = tail;
		tail.prev = head;
		head.data = 0;
	}

	public boolean isEmpty() {
		return num == 0;
	}

	public int getNum() {
		return num;
	}

	//取得指定位置结点元素
	public int getData(int pos) {
		Node preNode=head;
        int count=0;
        while(count!=pos) {
            preNode=preNode.next;
            ++count;
        }
        return preNode.data;
    }
	
	// 在头结点前插入
	public boolean insertAtStart(T item) {
		if (isEmpty()) {
			head.value = item;
			head.prev = null;
			head.next = tail;
			num++;
			return true;
		} else {
			Node newNode = new Node();
			newNode.value = item;
			newNode.prev = null;
			newNode.next = head;

			head.prev = newNode;
			head = newNode;
			num++;
			return true;
		}
	}

	// 在尾结点后插入
	public boolean insertAtEnd(T item) {
		if (isEmpty()) {
			tail.value = item;
			num++;
			return true;
		} else {
			Node newNode = new Node();
			newNode.value = item;
			newNode.prev = tail.prev;
			newNode.next = tail;

			tail.prev.next = newNode;
			tail.prev = newNode;
			num++;
			return true;
		}
	}

	// 在给定位置后插入
	public boolean insertAtPos(int pos, T item) {
		if (pos > num)
			return false;
		/*
		 * 找到要插入的位置，位置是1到size
		 */
		Node pNode = head;
		for (int i = 0; i < pos - 1; i++) {
			pNode = pNode.next;
		}

		Node qNode = pNode.next;

		Node newNode = new Node();
		newNode.value = item;
		newNode.next = qNode;
		newNode.prev = pNode;

		// 将原始节点链接到新节点
		pNode.next = newNode;
		qNode.prev = newNode;

		num++;
		return true;
	}

	// 删除给定位置的元素
	public boolean deleteItem(int pos) {
		if (pos > num)
			return false;
		if (isEmpty())
			return false;
		// 找到要删除的位置
		if (pos == 1) {
			Node pNode = head.next;
			head.next = null;
			head = pNode;
			num--;
			return true;
		}
		if (pos == num) {
			Node tarNode = head;
			for (int i = 0; i < pos - 1; i++) {
				tarNode = tarNode.next;
			}
			tarNode.next = null;
			num--;
			return true;
		}

		Node tarNode = head;
		for (int i = 0; i < pos - 1; i++) {
			tarNode = tarNode.next;
		}
		Node preNode = tarNode.prev;
		Node nextNode = tarNode.next;
		preNode.next = nextNode;
		nextNode.prev = preNode;
		tarNode.next = null;
		tarNode.prev = null;

		return true;
	}

	// 返回链表元素个数
	public int Size() {
		return length;
	}

	// 选择排序
	public void selectSort() {
		for (Node p = head; p.next != null; p = p.next) {
			for (Node q = p.next; q != null; q = q.next) {
				if ((int) p.value > (int) q.value) {
					T temp = p.value;
					p.value = q.value;
					q.value = temp;
				}
			}
		}
	}

	// 冒泡排序
	public void bubbleSort() {
		for (Node p = head; p.next != null; p = p.next) {
			for (Node q = head; q.next != null; q = q.next) {
				if ((int) q.value > (int) q.next.value) {
					T temp = q.value;
					q.value = q.next.value;
					q.next.value = temp;
				}
			}
		}
	}

	public void printList() {
		Node n = head;
		while (n.next != null) {
			System.out.print(n.value + " ");
			n = n.next;
		}
		System.out.println();
	}

	public void printReverseList() {
		Node n = tail.prev;
		while (n != null) {
			System.out.print(n.value + " ");
			n = n.prev;
		}
		System.out.println();
	}
}
