package com.orkva.leetcode.problems;

import java.util.HashMap;
import java.util.Objects;

/**
 * 981. Time Based Key-Value Store
 *
 * @date 2019/09/30 09:52
 * @version Medium
 */
public class No981 {

    /**
     * Create a timebased key-value store class TimeMap, that supports two operations.
     *
     * 1. set(string key, string value, int timestamp)
     *
     *   - Stores the key and value, along with the given timestamp.
     *
     * 2. get(string key, int timestamp)
     *
     *   - Returns a value such that set(key, value, timestamp_prev) was called previously, with timestamp_prev <= timestamp.
     *   - If there are multiple such values, it returns the one with the largest timestamp_prev.
     *   - If there are no values, it returns the empty string ("").
     *
     * Example 1:
     *
     * Input: inputs = ["TimeMap","set","get","get","set","get","get"], inputs = [[],["foo","bar",1],["foo",1],["foo",3],["foo","bar2",4],["foo",4],["foo",5]]
     * Output: [null,null,"bar","bar",null,"bar2","bar2"]
     * Explanation:
     * TimeMap kv;
     * kv.set("foo", "bar", 1); // store the key "foo" and value "bar" along with timestamp = 1
     * kv.get("foo", 1);  // output "bar"
     * kv.get("foo", 3); // output "bar" since there is no value corresponding to foo at timestamp 3 and timestamp 2, then the only value is at timestamp 1 ie "bar"
     * kv.set("foo", "bar2", 4);
     * kv.get("foo", 4); // output "bar2"
     * kv.get("foo", 5); //output "bar2"
     *
     * Example 2:
     *
     * Input: inputs = ["TimeMap","set","set","get","get","get","get","get"], inputs = [[],["love","high",10],["love","low",20],["love",5],["love",10],["love",15],["love",20],["love",25]]
     * Output: [null,null,null,"","high","high","low","low"]
     *
     *
     * Note:
     *
     *   1. All key/value strings are lowercase.
     *   2. All key/value strings have length in the range [1, 100]
     *   3. The timestamps for all TimeMap.set operations are strictly increasing.
     *   4. 1 <= timestamp <= 10^7
     *   5. TimeMap.set and TimeMap.get functions will be called a total of 120000 times (combined) per test case.
     */
    public static class TimeMap {
        // TODO: 2019/10/8
        private Node[] map = new Node[120000];

        public TimeMap() {

        }

        public void set(String key, String value, int timestamp) {
            int n = key.hashCode() & (map.length - 1);
            Node newNode = new Node(key, value, timestamp);
            if (map[n] == null) {
                map[n] = newNode;
            } else if (map[n].equals(newNode)) {

            } else {

            }
        }

        public String get(String key, int timestamp) {
            return null;
        }

        class Node {
            final String key;
            final String value;
            final int timestamp;
            Node next;
            Node sub;

            public Node(String key, String value, int timestamp) {
                this.key = key;
                this.value = value;
                this.timestamp = timestamp;
            }

            public Node addSubNode(Node node) {
                Node root = this;
                if (root.timestamp >= node.timestamp) {
                    Node prev = root;
                    Node curr = root.sub;
                    while (curr != null) {
                        if (curr.timestamp < node.timestamp) {

                        }
                        curr = curr.sub;
                    }
                }
                return root;
            }

            @Override
            public boolean equals(Object o) {
                if (this == o) {
                    return true;
                }
                if (o == null || getClass() != o.getClass()) {
                    return false;
                }
                Node node = (Node) o;
                return key.equals(node.key);
            }

            @Override
            public int hashCode() {
                return Objects.hash(key);
            }
        }
    }

}
