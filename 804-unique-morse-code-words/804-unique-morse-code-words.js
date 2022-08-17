var uniqueMorseRepresentations = function(words) {
    const morseCode = { a: ".-", b: "-...", c: "-.-.", d: "-..", e: ".", f: "..-.", g: "--.", h: "....", i: "..", j: ".---", k: "-.-", l: ".-..", m: "--", n: "-.", o: "---", p: ".--.", q: "--.-", r: ".-.", s: "...", t: "-", u: "..-", v: "...-", w: ".--", x: "-..-", y: "-.--", z: "--.." }
    
 let str = words.join(' ')               // This will  be O(m)
 let i = 0
 let map = {}
 let s = ''
 while(i < str.length){              // This will be be O(n) where n will be total length of all string
     if(str[i] == ' '){
         map[s] ? map[s]++ : map[s]=1
         s = ''
         i++
     } else{
         s += morseCode[str[i]]
         i++
     }
 }
 map[s] ? map[s]++ : map[s]=1 

 
 return Object.keys(map).length  //Worst case this will be also O(m) if all codes are unique
};