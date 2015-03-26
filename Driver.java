
public class Driver 
{
	public static void main(String[] args) 
	{
		BinaryTree bt = new BinaryTree();
		bt.add(2);
		bt.add(5);
		bt.add(7);
		bt.add(1);
		bt.add(0);
		bt.add(3);
		bt.add(9);
		bt.add(4);
		bt.add(8);
		bt.add(6);
		System.out.println("***** In Order *****");
		bt.displayInOrder(bt.returnRoot());
		System.out.println("********************");
		System.out.println();
		System.out.println("***** Post Order *****");
		bt.displayPostOrder(bt.returnRoot());
		System.out.println("********************");
	}
}
