import java.util.Iterator;
import java.util.NoSuchElementException;

public class LinkedList<E> implements Iterable<E> {
	
	int length = 0;
	Node<E>[] lastModifiedNode;
	Node<E> first;
	Node<E> last;
	
	public class Node<E>{
		protected E value;
		protected Node next;
		
		
		public E getValue() {
			return value;
		}
		public Node getNext() {
			return next;
		}
		public String toString() {
			return value.toString();
			
		}
		
	}
	
	protected Node<E> getNewNode(){
		Node<E> node = new Node<E>();
		lastModifiedNode = new Node[] {node};
		
		return node;
	}
	
	public Node<E> appendLast(E value) {
		Node node = getNewNode();
		node.value=value;
		
		if(last!=null) {
			last.next=node;
			last = node;
		}
		if(first==null) {
			first = node;
		}
		length++;
		return node;
	}
	
	public Node<E> appendFirst(E value){
		Node node = getNewNode();
		node.value = value;
		node.next = first;
		first = node;
		
		if(length == 0) {
			last = node;
		}
		length++;
		return node;
	}
	
	public Node<E> insert(int index,E value){
		Node<E> node = getNewNode();
		
		if(index<0 || index > length)
		{
			throw new IllegalArgumentException("Invalid index for insertion");
		}
		else if(index == length)
		{
			return appendLast(value);
		}
		else if(index == 0) {
			return appendFirst(value);
		}
		else
		{
			Node<E> result = first;
			
			while(index>1) {
				index--;
				result = result.next;
				
			}
			node.value = value;
			node.next= result.next;
			result.next = node;
			
			length++;
			return node;
		}
		
		
	}
	
	public E findAtIndex(int index)
	{
		Node<E> result = (Node<E>) first;
		
		while(index>=0) {
			if(result == null) {
				throw new NoSuchElementException();
				
			}
			else if(index==0) {
				return result.value;
			}
			else {
				index--;
				result = result.next;
				
			}
			
		
		}
		return result.value;
		
	}
	
	
	
	public Node<E> removeFirst(){
		if(length == 0) {
			throw new NoSuchElementException();
		}
		Node<E> origFirst = first;
		
		first = first.next;
		length--;
		
		if(length ==0) {
			last = null;
		}
		return origFirst;
	}
	
	protected Node<E> removeAtIndex(int index)
	{
		if(index>=length || index<0) {
			throw new NoSuchElementException();
		}
		if(index == 0) {
			Node<E> nodeRemoved = first;
			removeFirst();
			return nodeRemoved; 	
		}
		Node justBeforeit = first;
		
		while(--index > 0) {
			justBeforeit = justBeforeit.next;
		}
		
		Node<E> nodeRemoved = justBeforeit.next;
		if(justBeforeit.next == last) {
			last = justBeforeit;
		}
		justBeforeit.next = justBeforeit.next.next;
		
		length--;
		return nodeRemoved;
	}
	
	
	public int getLength() {
		return length;
	}
	
	public Node<E> getFirst(){
		if(length == 0) {
			throw new NoSuchElementException();
		}
		return first;
	}
	public Node<E> getLast(){
		if(length==0) {
			throw new NoSuchElementException();
		}
		return last;
	}
	
	
	protected class ListIterator implements Iterator<E>{
		protected Node<E> nextNode = first;
		protected Node<E> currentNode = null;
		protected Node<E> prevNode =null;
		
		
		public E next() {
			if(!hasNext()) {
//				System.exit(length);
				throw new IllegalStateException();
			}
			prevNode=currentNode;
			currentNode = nextNode;
			nextNode = nextNode.next;
			
			return currentNode.value;
		}
		
		public boolean hasNext() {
			if(nextNode == null) {
				return false;
			}else {
				return true;
			}
		}
		
	}
	
	@Override
	public Iterator<E> iterator(){
		return new ListIterator();
	}
	
	
	public static void main(String[] args) {
		LinkedList<Integer> anotherList = new LinkedList<>();
		
		anotherList.appendFirst(4);
		anotherList.appendFirst(5);
		anotherList.appendLast(9);
		anotherList.appendFirst(3);
		anotherList.appendLast(8);
		anotherList.appendFirst(2);
		anotherList.appendLast(7);
		anotherList.insert(3, 99);
		System.out.println("Now blast ");
		
		for(Integer x:anotherList) {
			System.out.println(x);
		}
		
		System.out.println("First element "+anotherList.getFirst());
		System.out.println("Last Elemenrt "+anotherList.getLast());
		
		System.out.println("Length "+anotherList.getLength());
		
		System.out.println("Element at index 3 is "+anotherList.findAtIndex(3));
	}

}
