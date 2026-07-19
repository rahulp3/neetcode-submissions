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
            dummy = new Node(currentNode.val);
            mp.put(currentNode, dummy);
            currentNode = currentNode.next;
        }

        currentNode = head;
        dummy = result;
        while(currentNode != null){
            dummy.next = mp.get(currentNode);
            dummy.next.random = mp.get(currentNode.random);
            dummy = dummy.next;
            currentNode = currentNode.next;
        }

        return result.next;

    }
}
