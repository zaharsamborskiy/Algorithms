package com.myst1k;

import java.util.*;

public class SearchInWidth {
    private static final Queue<String> queue = new ArrayDeque<>();
    private static final Set<String> valid = new HashSet<>();
    public static String searchFriend(Map<String, String[]> map) {
        queue.addAll(map.keySet());

        while (!queue.isEmpty()) {
            if (valid.contains(queue.peek())){
                queue.remove();
            }
            if (queue.peek() == null) break;
            if (isSeller(queue.peek())) {
                return queue.peek();
            } else {
                valid.add(queue.peek());
                for (Map.Entry<String, String[]> entry : map.entrySet()) {
                    for (int i = 0; i < entry.getValue().length; i++) {
                        if (!(valid.contains(entry.getValue()[i])) && !(queue.contains(entry.getValue()[i]))) {
                            queue.add(entry.getValue()[i]);
                        }
                    }
                }
            }
        }
        return "продавец не найден";
    }
    private static boolean isSeller(String name) {
        return name.startsWith("H");
    }
}
