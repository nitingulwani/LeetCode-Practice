public class btpostorder145 {
    List<Integer> list = new ArrayList<>();

    public void dfs(TreeNode root){
        if(root == null){
            return;
        }
        dfs(root.left);
        dfs(root.right);
        list.add(root.val);

    }
    public List<Integer> postorderTraversal(TreeNode root) {
     
        dfs(root);
    
        return list;

    }
}