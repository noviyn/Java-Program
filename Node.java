public class Node
{
	private String value;
	private Node next;
	
	public void setValue(int value)
	{
		this.value = value;
	}
	public int getValue()
	{
		return this.value;
	}
	public void setNext(Node next)
	{
		this.next = next;
	}
	public Node getNext()
	{
		return this.next;
	}
}