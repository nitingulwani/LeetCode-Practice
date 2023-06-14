public class levelorder {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null) return ans;
        Queue<TreeNode> q = new LinkedList<>();

        q.add(root);

        while(!q.isEmpty()){
            int count = q.size();
            List<Integer> sublist = new ArrayList<>();
            for(int i = 0; i<count; i++){
                TreeNode node = q.poll();
                sublist.add(node.val);
                if(node.left!=null){
                    q.add(node.left);
                }
                if(node.right!=null){
                    q.add(node.right);
                }
            }
            ans.add(sublist);
        }
        return ans;
    }
}