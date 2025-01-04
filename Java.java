// search word 
/*
 class TrieNode {
    public char val;
    public boolean isWord; 
    public TrieNode[] children = new TrieNode[26];
    public TrieNode() {}
    TrieNode(char c){
        TrieNode node = new TrieNode();
        node.val = c;
    }
}

public class Trie {
    private TrieNode root;
    public Trie() {
        root = new TrieNode();
        root.val = ' ';
    }

    public void insert(String word) {
        TrieNode ws = root;
        for(int i = 0; i < word.length(); i++){
            char c = word.charAt(i);
            if(ws.children[c - 'a'] == null){
                ws.children[c - 'a'] = new TrieNode(c);
            }
            ws = ws.children[c - 'a'];
        }
        ws.isWord = true;
    }

    public boolean search(String word) {
        TrieNode ws = root; 
        for(int i = 0; i < word.length(); i++){
            char c = word.charAt(i);
            if(ws.children[c - 'a'] == null) return false;
            ws = ws.children[c - 'a'];
        }
        return ws.isWord;
    }

}
 */

 // Remove word
 /*
      public boolean delete(String word) {
        if (word == null || word.length() == 0) {
            return false;
        }
        
        // All nodes below 'deleteBelow' and on the path starting with 'deleteChar' (including itself) will be deleted if needed
        TrieNode deleteBelow = null;
        char deleteChar = '\0';
        
        // Search to ensure word is present
        TrieNode parent = root;
        for (int i = 0; i < word.length(); i++) {
            char cur = word.charAt(i);
            
            TrieNode child = parent.children.get(cur); // Check if having a TrieNode associated with 'cur'
            if (child == null) { // null if 'word' is way too long or its prefix doesn't appear in the Trie
                return false;
            }
            
            if (parent.children.size() > 1 || parent.isEndOfWord) { // Update 'deleteBelow' and 'deleteChar'
                deleteBelow = parent;
                deleteChar = cur;
            }
            
            parent = child;
        }
        
        if (!parent.isEndOfWord) { // word isn't in trie
            return false;
        }
        
        if (parent.children.isEmpty()) {
            deleteBelow.children.remove(deleteChar);
        } else {
            parent.isEndOfWord = false; // Delete word by mark it as not the end of a word
        }
        
        return true;
    }
  */

  