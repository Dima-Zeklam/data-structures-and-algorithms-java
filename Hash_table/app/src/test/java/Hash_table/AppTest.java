/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Hash_table;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test void leftJoinTest() {
        HashTable<String, String> Hash1 = new HashTable<>();
        HashTable<String, String> Hash2 = new HashTable<>();
        Hash1.add("fond", "enamored");
        Hash1.add("wrath", "anger");
        Hash1.add("diligent", "employed");
        Hash1.add("outfit", "garb");
        Hash1.add("guide", "usher");

        Hash2.add("fond", "averse");
        Hash2.add("wrath", "delight");
        Hash2.add("diligent", "idle");
        Hash2.add("guide", "follow");
        Hash2.add("flow", "jam");
        ArrayList<ArrayList<String>> list =Hash1.leftJoin(Hash1,Hash2);
        assertEquals("[[diligent, employed, idle], [wrath, anger, delight]," +
                " [fond, enamored, averse], [guide, usher, follow], [outfit, garb, null]]", list);
    }
}
