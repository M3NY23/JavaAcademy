package com.iterator.iterator;

import com.iterator.math.Operation;

public class OperationIterator implements Iterator {
    
    private Operation[] operationList;
    private int position;

    public OperationIterator(Operation[] operationList) {
        this.operationList = operationList;
        this.position = 0;
    }

    @Override
    public Object next() {
        return this.operationList[this.position];
    }

    @Override
    public boolean hasNext() {
        return (this.position < this.operationList.length 
            && this.position != 0);
    }

}

interface Iterator
{
    
    boolean hasNext();
    Object next();
}
 