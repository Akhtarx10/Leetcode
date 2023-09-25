class Solution {
public:
    int romanToInt(string s) {
        // Create a map to store the values of Roman numerals
        map<char, int> romanMap;

        // Initialize the map with Roman numeral values
        romanMap['I'] = 1;
        romanMap['V'] = 5;
        romanMap['X'] = 10;
        romanMap['L'] = 50;
        romanMap['C'] = 100;
        romanMap['D'] = 500;
        romanMap['M'] = 1000;

        int result = romanMap[s.back()]; // Initialize the result with the last character value

        // Iterate through the string from right to left
        for (int i = s.length() - 2; i >= 0; i--) {
            if (romanMap[s[i]] < romanMap[s[i + 1]]) {
                result -= romanMap[s[i]]; // Subtract if the current character is smaller
            } else {
                result += romanMap[s[i]]; // Add if the current character is greater or equal
            }
        }
        return result;
    }
};