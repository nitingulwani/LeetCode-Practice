public class btpreorder94 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        helper(root, res);
        return res;
    }

    public void helper(TreeNode root, List<Integer> res) {
        if (root != null) {
            helper(root.left, res);
            res.add(root.val);
            helper(root.right, res);
        }
    }
}

// class Solution{
//      List<Integer> list = new ArrayList<>();
//     public void dfs(TreeNode root, List<Integer> list){
//         if(node == null){
//             return;
//         }
//         dfs(root.left, list);
//         list.add(root.val);
//         dfs(root.right, list);
        
//     }
//     public List<Integer> preorderTraversal(TreeNode root) {
//         dfs(root, list);
//         return list;

//  }
// }
