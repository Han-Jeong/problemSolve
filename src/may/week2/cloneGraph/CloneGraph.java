package may.week2.cloneGraph;

import java.util.HashMap;
import java.util.Map;

public class CloneGraph {
    public static Node cloneGraph(Node node) {
        if (node == null) {
            return null;
        }
        HashMap<Integer, Node> nodeMap = new HashMap<>();
        Node saveNode = node;
        Node newlyconnectNode = new Node(node.val);
        nodeMap.put(newlyconnectNode.val, newlyconnectNode);
        Node resultNode = newlyconnectNode;

        while (validateQuitLoop(node, saveNode)) {
            if (node.neighbors.isEmpty()) {
                newlyconnectNode = connectCopyNode(saveNode.val, nodeMap.get(node.val), nodeMap);
                System.out.println("index : " + saveNode.val + " [" + node.val + "]");
                saveNode.neighbors.remove(node);
                node = saveNode;
            }
            else{
                if (saveNode != node) {
                    connectCopyNode(saveNode.val, newlyconnectNode, nodeMap);
                    System.out.println("index : " + saveNode.val + " [" + node.val + "]");
                    saveNode.neighbors.remove(node);
                }
                saveNode = node;
                node = node.neighbors.get(0);
                newlyconnectNode = connectCopyNode(node.val, newlyconnectNode, nodeMap);
                System.out.println("index : " + node.val + " [" + saveNode.val + "]");
                node.neighbors.remove(saveNode);
            }
        }
        return resultNode;
    }

    private static boolean validateQuitLoop(Node currentNode, Node saveNode) {
        if (currentNode.neighbors.isEmpty() && saveNode.neighbors.isEmpty()) {
            return false;
        }
        return true;
    }

    private static Node connectCopyNode(int val, Node copyNode, HashMap<Integer, Node> nodeMap) {
        if (!nodeMap.containsKey(val)) {
            Node insertNode = new Node(val);
            nodeMap.put(val, insertNode);
        }
        Node findNode = nodeMap.get(val);
        findNode.neighbors.add(copyNode);
        return findNode;
    }
}
