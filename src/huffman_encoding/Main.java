package huffman_encoding;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {

        // input test (you can modify this)
        String text = "hello world";

        // step 1: count frequency of each character
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for(char c : text.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        // step 2: create priority queue (min heap)
        PriorityQueue<Huffman_Node> q = new PriorityQueue<>(frequencyMap.size(),new MyComparator());
        for(Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {

            Huffman_Node hn = new  Huffman_Node();
            hn.c = entry.getKey();
            hn.data = entry.getValue();
            hn.left = null;
            hn.right = null;
            q.add(hn);
        }

        // step 3: build huffman tree
        Huffman_Node root = null;
        while(q.size() > 1){

            Huffman_Node x = q.poll();
            Huffman_Node y = q.poll();

            Huffman_Node f = new Huffman_Node();
            f.data = x.data + y.data;
            f.c = '-';
            f.left = x;
            f.right = y;

            root = f;
            q.add(f);
        }

        // step 4: generate huffman codes
        Huffman_code hc = new  Huffman_code();
        Map<Character, String> huffmanCodes = new HashMap<>();
        hc.generateCodes(root, "", huffmanCodes);

        System.out.println("Huffman Codes:");
        for(Map.Entry<Character, String> entry : huffmanCodes.entrySet()) {
            System.out.print("'"+entry.getKey() + "': " + entry.getValue());
        }

        // step 5: encode the text
        String encoded = hc.encode(text, huffmanCodes);
        System.out.println("\nOriginal Text: " + text);
        System.out.println("Encoded String: " + encoded);

        // step 6: decode back
        String decoded = hc.decode(encoded,root);
        System.out.println("Decoded Text: " + decoded);
    }
}
