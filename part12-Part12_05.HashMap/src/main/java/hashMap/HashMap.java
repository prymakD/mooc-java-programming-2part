package hashMap;

import java.util.ArrayList;
import java.util.List;

public class HashMap<K, V> {

    private List<Pair<K, V>>[] values;
    private int firstFreeIndex;

    public HashMap() {
        this.values = new List[32];
        this.firstFreeIndex = 0;
    }

    public V get(K key) {
        int hashValue = Math.abs(key.hashCode() % this.values.length);
        if (this.values[hashValue] == null) {
            return null;
        }

        List<Pair<K, V>> valuesAtIndex = this.values[hashValue];

        for (int i = 0; i < valuesAtIndex.size(); i++) {
            if (valuesAtIndex.get(i).getKey().equals(key)) {
                return valuesAtIndex.get(i).getValue();
            }
        }

        return null;
    }

// old not SRP method
//    public void add(K key, V value) {
//        int hashValue = Math.abs(key.hashCode() % values.length);
//        if (values[hashValue] == null) {
//           values[hashValue] = new ArrayList<>();
//        }
//        
//        List<Pair<K,V>> valuesAtIndex = values[hashValue];
//        
//        int index = -1;
//        
//        for (int i = 0; i < valuesAtIndex.size(); i++ ) {
//            if (valuesAtIndex.get(i).getKey().equals(key)) {
//                index = i;
//                break;
//            }
//        }
//        
//        if (index < 0) {
//            valuesAtIndex.add(new Pair<>(key, value));
//            this.firstFreeIndex++;
//        } else {
//            valuesAtIndex.get(index).setValue(value);
//        }
//    }
    /*
    The method first calculates the hash value for the key, and uses it to determine the suitable index in the internal array. 
    If there is no value in that index, we create a list into that index. After this the method goes through the list at the index, and looks for a key-value pair whose key matches the key of the key-value pair to be added. 
    If the matching key is found, the value related to it is updated to match the new value. Otherwise the method adds a new key-value pair in the list — 
    in which case the number of stored values is also incremented by one.
     */
    public void add(K key, V value) {
        List<Pair<K, V>> valuesAtIndex = getListBasedOnKey(key);
        int index = getIndexOfKey(valuesAtIndex, key);

        if (index < 0) {
            valuesAtIndex.add(new Pair<>(key, value));
            this.firstFreeIndex++;
        } else {
            valuesAtIndex.get(index).setValue(value);
        }

        if (1.0 * this.firstFreeIndex / this.values.length > 0.75) {
            grow();
        }
    }

    public V remove(K key) {
        List<Pair<K, V>> valuesAtIndex = getListBasedOnKey(key);
        if (valuesAtIndex.size() == 0) {
            return null;
        }

        int index = getIndexOfKey(valuesAtIndex, key);
        if (index < 0) {
            return null;
        }

        Pair<K, V> pair = valuesAtIndex.get(index);
        valuesAtIndex.remove(pair);
        return pair.getValue();
    }

    private void copy(List<Pair<K, V>>[] newArray, int fromIdx) {
        for (int i = 0; i < this.values[fromIdx].size(); i++) {
            Pair<K, V> value = this.values[fromIdx].get(i);

            int hashValue = Math.abs(value.getKey().hashCode() % newArray.length);
            if (newArray[hashValue] == null) {
                newArray[hashValue] = new ArrayList<>();
            }

            newArray[hashValue].add(value);
        }
    }

    private void grow() {
        List<Pair<K, V>>[] newValues = new List[this.values.length * 2];

        for (int i = 0; i < this.values.length; i++) {
            copy(newValues, i);
        }

        this.values = newValues;
    }

    private List<Pair<K, V>> getListBasedOnKey(K key) {
        int hashValue = Math.abs(key.hashCode() % values.length);
        if (values[hashValue] == null) {
            values[hashValue] = new ArrayList<>();
        }

        return values[hashValue];
    }

    private int getIndexOfKey(List<Pair<K, V>> myList, K key) {
        for (int i = 0; i < myList.size(); i++) {
            if (myList.get(i).getKey().equals(key)) {
                return i;
            }
        }

        return -1;
    }
}
