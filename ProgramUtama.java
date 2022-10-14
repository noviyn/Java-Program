public class ProgramUtama
{
	public static void main (String[] args)
	{
		Queue Q1 = new Queue();
		System.out.println("Memasukkan Nilai");
		Q1.Enqueue(5);
		Q1.Enqueue(4);
		Q1.Enqueue(3);
		Q1.Enqueue(2);
		Q1.Enqueue(1);
		Q1.Ngeprint();
		Q1.Dequeue();
		Q1.Ngeprint();
	}
}