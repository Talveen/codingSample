/*
package hackerrank.demo.test;
    Created By: Talveen Rakhra
    Created On: 13-06-2021
    Question URL:
    Time Taken:
    Complexity:



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AutoCompleteTrie {

        public class TrieNode {
        Map<Character, TrieNode> children;
        char c;
        boolean isWord;

        public TrieNode(char c) {
            this.c = c;
            children = new HashMap<>();
        }

        public TrieNode() {
            children = new HashMap<>();
        }

        public void insert(String word) {
            if (word == null || word.isEmpty())
                return;
            char firstChar = word.charAt(0);
            TrieNode child = children.get(firstChar);
            if (child == null) {
                child = new TrieNode(firstChar);
                children.put(firstChar, child);
            }

            if (word.length() > 1)
                child.insert(word.substring(1));
            else
                child.isWord = true;
        }

    }

    TrieNode root;

    public AutoCompleteTrie(List<String> words) {
        root = new TrieNode();
        for (String word : words)
            root.insert(word);

    }

    public boolean find(String prefix, boolean exact) {
        TrieNode lastNode = root;
        for (char c : prefix.toCharArray()) {
            lastNode = lastNode.children.get(c);
            if (lastNode == null)
                return false;
        }
        return !exact || lastNode.isWord;
    }

    public boolean find(String prefix) {
        return find(prefix, false);
    }

    public void 212suggestHelper(TrieNode root, List<String> list, StringBuffer curr) {
        if (root.isWord) {
            list.add(curr.toString());
        }

        if (root.children == null || root.children.isEmpty())
            return;

        for (TrieNode child : root.children.values()) {
            suggestHelper(child, list, curr.append(child.c));
            curr.setLength(curr.length() - 1);
        }
    }

    public void suggest(String prefix) {
        List<String> list = new ArrayList<>();
        TrieNode lastNode = root;
        StringBuffer curr = new StringBuffer();
        int i =2;
        String prefixSubstr = prefix.substring(0,i);
        while(!prefix.equals(prefixSubstr)){
            for (char c : prefixSubstr.toCharArray()) {
                lastNode = lastNode.children.get(c);
                if (lastNode == null)
                    System.out.println("");
                curr.append(c);
            }
            suggestHelper(lastNode, list, curr);
            System.out.println(list.toString());
            prefixSubstr=prefix.substring(0,i++);
            list.clear();
            lastNode=root;
        }

    }


    public static void main(String[] args) {
        List<String> words = List.of("hello", "dog", "hell", "cat", "a", "hel","help","helps","helping", "helpzilla");
        AutoCompleteTrie trie = new AutoCompleteTrie(words);
        trie.suggest("help");
    }
}
*/
