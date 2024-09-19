public class BinNode {
    private int element;
    private BinNode left;
    private BinNode right;
    public BinNode(){}//Por defecto
    public BinNode(int element,BinNode left,BinNode right){
        this.element=element;
        this.left=left;
        this.right=right;
    }
    public int getElement() {
        return element;
    }
    public void setElement(int element) {
        this.element = element;
    }
    public BinNode getLeft() {
        return left;
    }
    public void setLeft(BinNode left) {
        this.left = left;
    }
    public BinNode getRight() {
        return right;
    }
    public void setRight(BinNode right) {
        this.right = right;
    }
    //Metodos-------------(Completarlos)
    //~~~~(Los return estan para que no de error.. Pero retornan otra cosa)
    public void incersion(){
    }
    public int busqueda(){
        return(0);
    }
    public void eliminacion(){
        
    }
    public void printInOrder(){//Desordenado(Como lo cargue)
        if(left !=null){
            left.printInOrder();
        }
        System.out.println(element);
        if(right != null){
            right.printInOrder();
        }
    }
    public void printPreOrder(){//Mayor amenor
        System.out.println(element);//El nodo en el que estoy
        if(left != null){//El menor que el nodo en el que estoy
            left.printPreOrder();
        }
        if(right != null){//El mayor que el nodo en el que estoy
            right.printPreOrder();
        }
    }
    public void printPostOrder(){//Menor a mayor
        if(left != null){//El menor que el nodo en el que estoy
            left.printPostOrder();
        }
        if(right != null){//El mayor que el nodo en el que estoy
            right.printPostOrder();
        }
        System.out.println(element);//El nodo en el que estoy
    }
    public static int size(BinNode t){
        if(t == null){
            return(0);
        }else{
            return 1 + size(t.left)+size(t.right);
        }
    }
    public static int height(BinNode t){
        if(t == null){
            return(-1);
        }else{
            return 1 + Math.max(height(t.left),height(t.right));
        }
    }
    public BinNode duplicate(){
        BinNode root=new BinNode(element, null, null);
        if(left != null){
            root.left = left.duplicate();
        }
        if(right != null){
            root.right = right.duplicate();
        }
        return(root);
    }

}
