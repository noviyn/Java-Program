public class Queue
{
	private Node front;
	private Node rear;
	
	public void Enqueue(int x)
	{
		Node nodebaru = new Node();
		nodebaru.setValue(x);
		
		if ( front == null)
		{
			front = nodebaru;
			rear = nodebaru;
		}
		else
		{
			nodebaru.setNext(rear);
			rear = nodebaru;
		}
	}
	public int Dequeue()
	{
		int get;
		get=front.getValue();
		if(front==null)
		{
			return -1;
		}
		else
		{
			Node lama = rear;
			while(lama.getNext() != front)
			{
				lama = lama.getNext();
			}
			front=lama;
			front.setNext(null);
		}
		return get;
	}
	public void GenerateBinary(int bit)
	{
		Enqueue("1");
		for(int i=0;i<n;i++)
		{
			Node temp= Dequeue();
			String s1=temp.getValue();
			System.out.print(s1+" ");
			String s2=s1;
			Enqueue(s1+"0");
			Enqueue(s1+"1");
		}
		System.out.println(" ");
	}
	public void Ngeprint()
	{
		Node lama = rear;
		while (lama != null)
		{
			System.out.println(lama.getValue()+" ");
			lama = lama.getNext();
		}
		System.out.println(" ");
	}
}