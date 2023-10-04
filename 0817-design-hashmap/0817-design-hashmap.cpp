class MyHashMap {
public:
    vector<pair<int, int>> data;
    
    /** Initialize your data structure here. */
    MyHashMap() {
    }
    
    /** value will always be non-negative. */
    void put(int key, int value) {
        for (auto &entry : data) {
            if (entry.first == key) {
                entry.second = value;
                return;
            }
        }
        data.push_back(make_pair(key, value));
    }
    
    /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
    int get(int key) {
        for (const auto &entry : data) {
            if (entry.first == key) {
                return entry.second;
            }
        }
        return -1;
    }
    
    /** Removes the mapping of the specified value key if this map contains a mapping for the key */
    void remove(int key) {
        for (auto it = data.begin(); it != data.end(); ++it) {
            if (it->first == key) {
                data.erase(it);
                return;
            }
        }
    }
};
