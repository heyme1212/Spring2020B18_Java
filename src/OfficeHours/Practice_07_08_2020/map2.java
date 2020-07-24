package OfficeHours.Practice_07_08_2020;

import java.util.Map;

public class map2 {
    /*
    Modify and return the given map as follows: if the key "a" has a value,
    set the key "b" to have that same value.
    In all cases remove the key "c", leaving the rest of the map unchanged.

    mapShare({"a": "aaa", "b": "bbb", "c": "ccc"}) → {"a": "aaa", "b": "aaa"}
    mapShare({"b": "xyz", "c": "ccc"}) → {"b": "xyz"}
    mapShare({"a": "aaa", "c": "meh", "d": "hi"}) → {"a": "aaa", "b": "aaa", "d": "hi"}
     */

    public Map<String, String> mapShare(Map<String, String> map) {
        map.remove("c");

        if(!map.containsKey("a")) return map;

        String a = map.get("a");

        if(!a.isEmpty()){

            map.put("b", a);

        }

        return map;

    }

    public Map<String, String> mapAB(Map<String, String> map) {

        if(map.containsKey("a") && map.containsKey("b")){

            String abValue = map.get("a") + map.get("b");
            map.put("ab", abValue);

        }

        return map;
    }

}
