class Solution {
public:
    static inline const std::array<std::string, 26> morse{
        ".-", "-...", "-.-.", "-..",".","..-.","--.","....", 
        "..",".---","-.-",".-..","--","-.","---",".--.","--.-",
        ".-.","...", "-", "..-","...-",".--","-..-","-.--","--..",
    };
    
    int uniqueMorseRepresentations(std::vector<std::string>& words) {
        std::unordered_set<std::string> transformations{};
        for (const auto& word : words) {
            std::string transf{};
            for (const auto c : word) 
                transf += morse[c - 'a'];
            transformations.insert(std::move(transf));
        }
        return static_cast<int>(transformations.size());
    }
};