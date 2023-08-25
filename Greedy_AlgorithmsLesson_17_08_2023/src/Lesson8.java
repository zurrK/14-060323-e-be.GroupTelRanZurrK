import java.util.*;
public class Lesson8 {
    public static void main(String[] args) {
        List<Integer> tasks = Arrays.asList(3, 2, 1, 4, 5, 1, 3);
        int maxTime = 10;
        List<Integer> resolved = taskSelction(tasks, maxTime);
        System.out.println(resolved);
    }

    static List<Integer> taskSelction(List<Integer> tasks, int maxTime) {
        List<Integer> result = new ArrayList<>();
        int resultTime = 0;

        LinkedList<Integer> sortedTasks = new LinkedList<>(tasks);

        Collections.sort(tasks);
        while (resultTime < maxTime && maxTime - resultTime >= sortedTasks.peek()) {
            int taskTime = sortedTasks.pop();
            result.add(taskTime);
            resultTime = resultTime + taskTime;

        }
        return result;
    }

}

