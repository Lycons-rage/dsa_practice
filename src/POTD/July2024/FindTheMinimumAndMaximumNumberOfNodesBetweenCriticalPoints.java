//package POTD.July2024;
//
//import java.util.Arrays;
//
//class ListNode {
//    int val;
//    ListNode next;
//
//    ListNode() {}
//    ListNode(int val) { this.val = val; }
//    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//}
//
//public class FindTheMinimumAndMaximumNumberOfNodesBetweenCriticalPoints {
//    public static void main(String[] args) {
//        ListNode head = new ListNode(1);
//        head.next = new ListNode(3);
//        head.next.next = new ListNode(2);
//        head.next.next.next = new ListNode(2);
//        head.next.next.next.next = new ListNode(3);
//        head.next.next.next.next.next = new ListNode(2);
//        head.next.next.next.next.next.next = new ListNode(2);
//        head.next.next.next.next.next.next.next = new ListNode(2);
//        head.next.next.next.next.next.next.next.next = new ListNode(7);
//
//        ListNode temp = head;
//        while(temp!=null){
//            System.out.print(temp.val+" -> ");
//            temp = temp.next;
//        }
//
//        System.out.println("\n"+Arrays.toString(nodesBetweenCriticalPoints(head)));
//    }
//
//    private static int[] nodesBetweenCriticalPoints(ListNode head) {
//        if (head == null || head.next == null || head.next.next == null) {
//            return new int[]{-1, -1};
//        }
//
//        List<Integer> criticalPoints = new ArrayList<>();
//        ListNode prev = head;
//        ListNode curr = head.next;
//        int position = 1;
//
//        while (curr.next != null) {
//            if ((curr.val > prev.val && curr.val > curr.next.val) ||
//                    (curr.val < prev.val && curr.val < curr.next.val)) {
//                criticalPoints.add(position);
//            }
//            prev = curr;
//            curr = curr.next;
//            position++;
//        }
//
//        if (criticalPoints.size() < 2) {
//            return new int[]{-1, -1};
//        }
//
//        int minDistance = Integer.MAX_VALUE;
//        int maxDistance = criticalPoints.get(criticalPoints.size() - 1) - criticalPoints.get(0);
//
//        for (int i = 1; i < criticalPoints.size(); i++) {
//            minDistance = Math.min(minDistance, criticalPoints.get(i) - criticalPoints.get(i - 1));
//        }
//
//        return new int[]{minDistance, maxDistance};
//    }
//}
