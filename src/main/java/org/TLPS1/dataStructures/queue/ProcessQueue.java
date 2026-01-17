package org.TLPS1.dataStructures.queue;

public interface ProcessQueue {

    void enqueue(Work work);

    void delete();

    Work get();

}
