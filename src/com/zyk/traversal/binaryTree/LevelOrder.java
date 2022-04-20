package com.zyk.traversal.binaryTree;

import com.zyk.traversal.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class LevelOrder {
    /**
     *
     * @param root TreeNode类
     * @return int整型ArrayList<ArrayList<>>
     */
    static ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();

    public static ArrayList<ArrayList<Integer>> levelOrder (TreeNode root) {
        if(root == null){
            return res;
        }
        count(root,0);
        System.out.println(res);
        return res;
    }

    public static void count(TreeNode node, int level){
        System.out.println(res.size()+"  "+level);
        /**
         * 一层一个arraylist
         * 数组下标从0开始，0为第一个list，即二叉树的第一层
         * 如果层次和res的现有size一样
         */
        if(level == res.size()){
            res.add(new ArrayList<Integer>());
        }

        ArrayList<Integer> list = res.get(level);
        list.add(node.val);

        if(node.left != null){
            count(node.left, level+1);
        }

        if(node.right != null){
            count(node.right, level+1);
        }

    }
    static ArrayList<ArrayList<Integer>> res2 = new ArrayList<ArrayList<Integer>>();
    public static ArrayList<ArrayList<Integer>> levelOrder2 (TreeNode root){
        Queue<TreeNode> queue = new LinkedList<>();
        if (root==null){
            return new ArrayList();
        }
        queue.add(root);
        ArrayList ROOT = new ArrayList();
        ROOT.add(root.val);
        res2.add(ROOT);
        int i = 0;
        //ArrayList<Integer> list = new ArrayList<>();
        while (queue.size()>0){
            ArrayList<Integer> list = new ArrayList<>();
            if (queue.peek().left!=null){
                queue.add(root.left);
                list.add(root.left.val);
            }
            if (queue.peek().right!=null){
                queue.add(root.right);
                list.add(root.right.val);
            }
            queue.remove();
            root = queue.peek();
            if (list.size() !=0)
            res2.add(list);
        }
        System.out.println(res2);
        return res2;
    }

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode();
        TreeNode treeNode2 = new TreeNode();
        TreeNode treeNode3 = new TreeNode();
        TreeNode treeNode4 = new TreeNode();
        TreeNode treeNode5 = new TreeNode();

        treeNode.val =1;
        treeNode2.val =2;
        treeNode3.val =3;
        treeNode4.val =4;
        treeNode5.val =5;

        treeNode.left = treeNode2;
        treeNode.right = treeNode3;
        treeNode3.left = treeNode4;
        treeNode3.right = treeNode5;
        levelOrder(treeNode);
    }
}
