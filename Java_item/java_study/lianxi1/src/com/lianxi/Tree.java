package com.lianxi;

/**
 * Created by admin on 2017/8/15.
 * 二叉树类
 */
public class Tree {
    private Node root;
    /**插入节点
     * @param value
     */
    public void insert(long value){
        Node newNode = new Node(value);
        Node current = root;
        Node parent;
        //root为空时，想啊等于第一次插入
        if (root == null){
          root = newNode;
          return;
        }else{
            while(true){
                parent = current;
                if (current.data >value){
                    current = current.leftChild;
                    if (current == null){
                        parent.leftChild = newNode;
                        return;

                    }
                }else {
                    current = current.rightChild;
                    if (current == null){
                        parent.rightChild=newNode;
                        return;
                    }

                }
            }

        }

    }
    /**查找节点
     * @param value
     */
    public void find(long value){

    }
     /**删除节点
      * @param value
      */
    public  void delete(long value){

    }


}
