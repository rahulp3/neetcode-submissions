/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        HashMap<Node, Node> mp = new HashMap<>();
        Node result = new Node(-1);
        Node dummy = result;
        Node currentNode = head;

        while(currentNode != null){
            dummy.next = new Node(currentNode.val);
            dummy = dummy.next;
            mp.put(currentNode, dummy);
            currentNode = currentNode.next;
        }

        currentNode = head;
        dummy = result.next;
        while(currentNode != null){
            dummy.random = mp.get(currentNode.random);
            dummy = dummy.next;
            currentNode = currentNode.next;
        }

        return result.next;

    }
}
