/**
 * @param {string[]} arr
 * @return {number}
 */
var maxLength = function(arr) {
    const set = new Set(['']);
    let max = 0;
    let str;
    
    for(let i = 0; i < arr.length; i++) {
        const values = [...set.values()];
        
        for(let j = 0; j < values.length; j++) {     
            str = `${values[j]}${arr[i]}`;
            set.add(str);
            let newStr = [...new Set(str).values()].join('');
            
            if (str === newStr) {
                max = Math.max(str.length, max);    
            }            
        }
    }
    
    return max;
};