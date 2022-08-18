class Solution {
public:
    bool isValid(string s) {
        stack<char> temp;
        
        for(int i=0; i<s.size(); i++){
            if(temp.empty()){  
                temp.push(s[i]);     //pushing first element into stack
            }
            
            else if((temp.top() == '(' && s[i]==')') ||
                    (temp.top() == '[' && s[i]==']') ||
                    (temp.top() == '{' && s[i]=='}')){  
					// comparing the next element with the top element in stack
                temp.pop();  //if it is a pair then remove the element from stack
            }
            else
                temp.push(s[i]);  
        }
        
        if(temp.empty()){   // if all the pairs have been formed then return true
            return true;
        }
        return false;
    }
};
