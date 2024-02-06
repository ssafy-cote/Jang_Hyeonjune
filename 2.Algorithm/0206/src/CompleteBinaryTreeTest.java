
public class CompleteBinaryTreeTest {

	public static void main(String[] args) {
		CompleteBinaryTree<Character> tree1 = new CompleteBinaryTree<>(10);
		for (int i = 0; i < 10; i++) {
			tree1.add((char)(65+i));
		}
		
		tree1.bfs();
	}
	
}
