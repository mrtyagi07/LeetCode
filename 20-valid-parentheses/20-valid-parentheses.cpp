const isValid = (s) => {
    const map = {
        '(':')',
        '{':'}',
        '[':']',        
    }
    let stack = []
    for (let c of s) {
        if (c in map){ 
            stack.push(c)
        } else if (map[stack.pop()] !== c) {
            return false
        }
    }
    return !stack.length
};




// function isValid(s, r = /\(\)|\[\]|\{\}/g) {
//     while (s.match(r)) s = s.replace(r, '')
//     return !s
// }