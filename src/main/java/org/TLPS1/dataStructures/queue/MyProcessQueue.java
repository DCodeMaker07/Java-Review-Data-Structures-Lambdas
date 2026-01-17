package org.TLPS1.dataStructures.queue;

public class MyProcessQueue implements ProcessQueue {

    private class ProcessNode {
        public Work work;
        public ProcessNode next = null;

        public ProcessNode(Work work) {
            this.work = work;
        }

        @Override
        public String toString() {
            return "ProcessNode{" +
                    "work=" + work +
                    ", next=" + next +
                    '}';
        }
    }

    private ProcessNode head, last;

    @Override
    public void enqueue(Work work) {
        ProcessNode newNode = new ProcessNode(work);
        if (head == null) {
            head = newNode;
        } else {
            last.next = newNode;
        }
        last = newNode;
    }

    @Override
    public void delete() {
        if(head != null) {
            ProcessNode deleted = head;
            head = head.next;
            deleted.next = null;

            if(head == null) {
                last = null;
            }
        }
    }

    @Override
    public Work get() {
        if(head == null) {
            return null;
        } else {
            return head.work;
        }
    }

    @Override
    public String toString() {
        return "MyProcessQueue{" +
                "head=" + head +
                ", last=" + last +
                '}';
    }
}
