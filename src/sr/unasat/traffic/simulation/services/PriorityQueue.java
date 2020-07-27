package sr.unasat.traffic.simulation.services;

public class PriorityQueue {
    private int maxSize;
    private String[] queArray;
    private int nItems;
    private int front;
    private int rear;

    public PriorityQueue(int maxSize) // constructor
    {
        this.maxSize = maxSize;
        queArray = new String[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    public void insert(String item) // put item at rear of queue
    {
        int currentItemIndex;
        if (nItems == 0) // if no items,
        {
            queArray[nItems++] = item; // insert at 0
        } else {
            for (currentItemIndex = nItems - 1; currentItemIndex >= 0; currentItemIndex--) { // start at end,
                if (item == "Politie met sirene") {
                    queArray[currentItemIndex + 1] = queArray[currentItemIndex];
                } else if (item == "Brandweer met sirene") {
                    queArray[currentItemIndex + 1] = queArray[currentItemIndex];
                } else {
                    break;
                }
            }
            queArray[currentItemIndex + 1] = item;
            nItems++;
        }
    }

    public void printPriorityQueue() {
        for (int i = 0; i < nItems; i++) {
            System.out.print(queArray[i] + " ");
        }
    }

    public String remove() // remove minimum item
    {
        String temp = queArray[front];//3 // get value and incr front
        queArray[front] = null;//3 removed
        if (front + 1 == maxSize) { // deal with wraparound
            front = 0;
        } else {
            front++;
        }
        nItems--;// one less item
        return temp;
    }

    public String peekFront() { // peek at front of queue
        return queArray[front];
    }

    public boolean isEmpty() { // true if queue is empty
        return (nItems == 0);
    }

    public boolean isFull() { // true if queue is full
        return (nItems == maxSize);
    }

    public int size() // number of items in queue
    {
        return nItems;
    }
}
