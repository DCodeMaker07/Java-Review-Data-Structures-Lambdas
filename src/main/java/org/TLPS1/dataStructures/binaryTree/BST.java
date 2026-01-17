package org.TLPS1.dataStructures.binaryTree;

public class BST implements IBST<Employee>{

    private Employee value;

    private BST left, right;

    private BST father;

    @Override
    public boolean isTreeEmpty() {
        return value == null;
    }

    @Override
    public boolean isLeaf() {
        return value != null && left == null && right == null;
    }

    private void insertImpl(Employee empl, BST father) {
        if(value == null){
            this.value = empl;
            this.father = father;
        } else {
            if(empl.compareTo(value) < 0){
                if(left == null) left = new BST();
                left.insertImpl(empl, this);
            } else if(empl.compareTo(value) > 0) {
                if(right == null) right = new BST();
                right.insertImpl(empl, this);
            } else {
                throw new RuntimeException("Duplicated value is not allowed");
            }
        }
    }

    @Override
    public void insert(Employee empl) {
        insertImpl(empl, null);
    }

    @Override
    public boolean exists(int id) {

        if(value != null){
            if(id == value.getId()){
                return true;
            } else if(id < value.getId() && left != null){
                return left.exists(id);
            } else if(id > value.getId() && right != null) {
                return right.exists(id);
            }else {
                return false;
            }
        }else {
            return false;
        }

    }

    @Override
    public Employee get(int id) {
        if(value != null){
            if(id == value.getId()){
                return value;
            } else if(id < value.getId() && left != null ) {
                return left.get(id);
            } else if(id > value.getId() && right != null) {
                return right.get(id);
            } else {
                return null;
            }
        }else {
            return null;
        }
    }

    private void preOrderImpl(String prefix) {
        if(value != null){
            System.out.println(prefix + value);
            if(left != null) left.preOrderImpl(prefix + "  ");
            if(right != null) right.preOrderImpl(prefix + "  ");
        }
    }

    @Override
    public void preOrder() {
        preOrderImpl("");
    }

    private void inOrderImpl(String prefix) {
        if(value != null){
            if(left != null) left.inOrderImpl(prefix + "  ");
            System.out.println(prefix + value);
            if(right != null) right.inOrderImpl(prefix + "  ");
        }
    }

    @Override
    public void inOrder() {
        inOrderImpl("");
    }

    private void postOrderImpl(String prefix) {
        if(value != null){
            if(left != null) left.postOrderImpl(prefix + "  ");
            if(right != null) right.postOrderImpl(prefix + "  ");
            System.out.println(prefix + value);
        }
    }

    @Override
    public void postOrder() {
        postOrderImpl("");
    }

    private BST minimunValue(){
        if(left != null && !left.isTreeEmpty()){
            return left.minimunValue();
        } else {
            return this;
        }
    }

    private void deleteImpl(int id) {
        if(left != null && right != null) {
            // Delete with 2 child.
            BST minimun = right.minimunValue();
            this.value = minimun.value;
            right.delete(minimun.value.getId());
        } else if (left != null || right != null) {
            // Delete with 1 child.
            BST subst = left != null ? left : right;
            this.value = subst.value;
            this.left = subst.left;
            this.right = subst.right;
        } else {
            // Delete with 0 child.
            if(father != null) {
                if(this == father.left) father.left = null;
                if(this == father.right) father.right = null;
                father = null;
            }
            value = null;
        }
    }

    @Override
    public void delete(int id) {
        if(value != null){
            if(id == value.getId()){
                // delete value
                deleteImpl(id);
            } else if (id < value.getId() && left != null ) {
                left.delete(id);
            } else if (id > value.getId() && right != null) {
                right.delete(id);
            }
        }
    }
}
