package main.java;
import java.util.*;

public class AlienDictionary {

    public static class Vertex {
        char id;
        int degree;
        List<Vertex> destList;

        public Vertex(char c) {
            this.id = c;
            destList = new ArrayList<>();
            degree = 0;
        }
    }

    public String alienOrder(String[] words) {

        HashMap<Character, Vertex> map = new HashMap<>();

        if(words.length ==1) {
            return words[0];
        }

        for(int i=0; i < words.length -1; i++) {
            for (int j = i; j< words.length; j++) {

                char[] src = words[i].toCharArray();
                char[] dest = words[j].toCharArray();

                int l = 0;
                while(l < Math.max(src.length, dest.length)){

                    if(l < src.length && map.get(src[l]) == null) {
                        map.put(src[l], new Vertex(src[l]));
                    }

                    if(l < dest.length && map.get(dest[l]) == null) {
                        map.put(dest[l], new Vertex(dest[l]));
                    }
                    l++;
                }

                int k = 0;
                boolean found = false;
                while(k < Math.min(src.length, dest.length) && !found) {

                    if(src[k] != dest[k] && !found) {
                        if(map.get(dest[k]).destList.contains(map.get(src[k]))) {
                            return "";
                        }

                        if(!map.get(src[k]).destList.contains(map.get(dest[k]))) {
                            map.get(src[k]).destList.add(map.get(dest[k]));
                            map.get(dest[k]).degree = map.get(dest[k]).degree + 1;
                        }
                        found = true;
                    }
                    k++;
                }

                if(dest.length > src.length && !found) {
                    if(map.get(dest[k]).destList.contains(map.get(src[k-1]))) {
                        return "";
                    }

                    if(!map.get(src[k-1]).destList.contains(map.get(dest[k]))) {
                        map.get(src[k-1]).destList.add(map.get(dest[k]));
                        map.get(dest[k]).degree = map.get(dest[k]).degree + 1;
                    }
                } else if (src.length > dest.length && !found) {
                    return "";
                }
            }
        }

        StringBuilder sb = new StringBuilder();

        boolean haveZeroes = true;
        while(haveZeroes & !map.isEmpty()) {

            Vertex current = null;

            for(Vertex vertex : map.values()) {
                if(vertex.degree ==0) {
                    current = vertex;
                    break;
                }
            }

            if(current == null) {
                haveZeroes = false;
                continue;
            }

            map.remove(current.id);
            for (Vertex vertex : current.destList) {
                vertex.degree = vertex.degree - 1;
            }

            sb.append(current.id);
        }

        if(!haveZeroes && !map.isEmpty()) {
            return "";
        }
        return sb.toString();
    }
}
