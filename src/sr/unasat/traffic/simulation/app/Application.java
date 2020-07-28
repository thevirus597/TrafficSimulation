package sr.unasat.traffic.simulation.app;

import sr.unasat.traffic.simulation.entities.Voertuig;
import sr.unasat.traffic.simulation.services.PriorityQueue;
import sr.unasat.traffic.simulation.services.Stack;

public class Application {
    public static void main(String[] args) {
//        String[] array = {"Auto1L", "Auto2L", "Auto3L", "Auto4L", "Politie met sirene", "Auto1R", "Auto2R", "Auto3R", "Auto4R", "Brandweer met sirene", "Brandweer zonder sirene"};
        Voertuig[] voertuigs = new Voertuig[11];
        voertuigs[0] = new Voertuig(3, "Auto1L");
        voertuigs[1] = new Voertuig(4, "Auto2L");
        voertuigs[2] = new Voertuig(5, "Auto3L");
        voertuigs[3] = new Voertuig(6, "Auto4L");
        voertuigs[4] = new Voertuig(1, "Politie met sirene");
        voertuigs[5] = new Voertuig(7, "Auto1R");
        voertuigs[6] = new Voertuig(8, "Auto2R");
        voertuigs[7] = new Voertuig(9, "Auto3R");
        voertuigs[8] = new Voertuig(10, "Auto4R");
        voertuigs[9] = new Voertuig(2, "Brandweer met sirene");
        voertuigs[10] = new Voertuig(11, "Brandweer zonder sirene");

        PriorityQueue priorityQueue = new PriorityQueue(11);
        Stack stack = new Stack(11);

        for (Voertuig voertuig : voertuigs) {
            priorityQueue.insert(voertuig);
        }
//        priorityQueue.printPriorityQueue();
//        System.out.println(Arrays.toString(priorityQueue.printPriorityQueue()));
//        System.out.println(simulationService.PeekMin());

        while (!priorityQueue.isEmpty()) {
            Voertuig voertuig = priorityQueue.remove();
            stack.push(voertuig.getNaam());
            System.out.println(voertuig.getNaam());
        }

        System.out.println();

        while (!stack.isEmpty()) {
            String item = stack.pop();
            System.out.println(item);
        }
    }
}

