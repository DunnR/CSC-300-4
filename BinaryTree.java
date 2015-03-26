
public class BinaryTree 
{
	private Node root;
	
	public BinaryTree()
	{
		this.root = null;
	}
	
	public void displayInOrder(Node root)
	{
		if(root != null)
		{
			displayInOrder(root.getLeftNode());
			System.out.println(" In order: " + root.getPayload());
			displayInOrder(root.getRightNode());
		}
	}
	
	public void displayPostOrder(Node root)
	{
		if(root != null)
		{
			displayPostOrder(root.getLeftNode());
			displayPostOrder(root.getRightNode());
			System.out.println(" Post Order: " + root.getPayload());
		}
	}
	
	public void add(int value)
	{
		Node theNode = new Node(value);
		if(this.root == null)
		{
			this.root = theNode;
		}
		else
		{
			this.root.addNode(theNode);
		}
	}
	
	public Node returnRoot()
	{
		return this.root;
	}

	
}
