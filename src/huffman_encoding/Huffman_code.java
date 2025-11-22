package huffman_encoding;

import java.util.Map;

public class Huffman_code {

    // recursive function to generate huffman codes
    public static void generateCodes(Huffman_Node root, String code, Map<Character,String> huffmanCodes) {
        if(root == null) return;

        // if leaf node
        if(root.left == null && root.right == null){
            huffmanCodes.put(root.c,code);
            return;
        }

        generateCodes(root.left, code+"0",huffmanCodes);
        generateCodes(root.right, code+"1",huffmanCodes);
    }

    // encode a given string using huffman codes
    public static String encode(String text, Map<Character,String> huffmanCodes) {
        StringBuilder sb = new StringBuilder();
        for(char c : text.toCharArray()){
            sb.append(huffmanCodes.get(c));
        }
        return sb.toString();
    }

    // decode an encoded binary string
    public static String decode(String encodedStr, Huffman_Node root) {
        StringBuilder decoded = new StringBuilder();
        Huffman_Node current = root;

        for(int i = 0; i < encodedStr.length(); i++){
            current = (encodedStr.charAt(i) == '0') ? current.left : current.right;

            // if leaf node reached
            if(current.left == null && current.right == null){
                decoded.append(current.c);
                current = root;
            }
        }
        return decoded.toString();
    }
}
