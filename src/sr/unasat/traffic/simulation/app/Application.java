package sr.unasat.traffic.simulation.app;

import sr.unasat.traffic.simulation.services.PriorityQueue;
import sr.unasat.traffic.simulation.services.Stack;

public class Application {
    public static void main(String[] args) {
        String[] array = {"Auto1L", "Auto2L", "Auto3L", "Auto4L", "Politie met sirene", "Auto1R", "Auto2R", "Auto3R", "Auto4R", "Brandweer met sirene", "Brandweer zonder sirene"};

        PriorityQueue priorityQueue = new PriorityQueue(11);
        Stack stack = new Stack(11);

        for (String item : array) {
            priorityQueue.insert(item);
        }
//        priorityQueue.printPriorityQueue();
//        System.out.println(Arrays.toString(priorityQueue.printPriorityQueue()));
//        System.out.println(simulationService.PeekMin());

        while (!priorityQueue.isEmpty()) {
            String item = priorityQueue.remove();
            stack.push(item);
            System.out.print(item + " ");
        }

        System.out.println();

        while (!stack.isEmpty()) {
            String item = stack.pop();
            System.out.print(item + " ");
        }
    }
}

