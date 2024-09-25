public class BinTree {
    private BinNode root;

    public BinTree() {
        this.root = null;
    }// Por defecto

    public BinTree(int element) {
        root = new BinNode(element);
    }

    public BinNode getRoot() {
        return root;
    }

    public void setRoot(BinNode root) {
        this.root = root;
    }

    // Metodos-------------(Completarlos)
    // ~~~~(Los return estan para que no de error.. Pero retornan otra cosa)
    public int size() {
        return (BinNode.size(root));
    }

    public int height() {
        return (BinNode.height(root));
    }

    public void printPreOrder() {
        if (root != null) {
            root.PreOrder();
        } // Una forma rara de poner un if
    }

    public void printInOrder() {
        if (root != null)
            root.InOrder();// Otra forma rara de poner un if (sin "{}")
    }

    public void printPostOrder() {
        if (root != null)
            root.PostOrder();
    }// Forma mas rara...

    public void makeEmpty() {
        root = null;
    }

    public boolean isEmpty() {
        return (root == null);
    }

    public void merge(int elemnt, BinTree t1, BinTree t2) {
        if ((t1.root == t2.root) && (t1.root != null)) {
            System.out.println("error");
        }
        root = new BinNode(elemnt, t1.root, t2.root);
        if (this != t1) {
            t1.root = null;
        }
        if (this != t2) {
            t2.root = null;
        }
    }
}
