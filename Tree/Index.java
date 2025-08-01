class Index {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, -1, -1, -1, 3, -1, -1 };

        Build b = new Build();
        Node root = b.buildNode(arr);

        b.preOrder(root);
        System.out.println("--------------");
        b.postOrder(root);
        System.out.println("--------------");
        b.inOrder(root);

    }
}