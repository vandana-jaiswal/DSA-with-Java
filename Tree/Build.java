class Build {
    static int id = -1;

    static Node buildNode(int[] arr) {
        id++;
        if (arr[id] == -1) {
            return null;
        }

        Node newNode = new Node(arr[id]);
        newNode.left = buildNode(arr);
        newNode.right = buildNode(arr);
        return newNode;
    }

    static void preOrder(Node root) {
        if (root == null) {
            return;
        }

        System.out.println(root.data);
        preOrder(root.left);
        preOrder(root.right);
    }

    static void postOrder(Node root) {
        if (root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.data);
    }

    static void inOrder(Node root) {
        if (root == null) {
            return;
        }

        inOrder(root.left);
        System.out.println(root.data);
        inOrder(root.right);
    }
}
