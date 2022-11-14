//{ Driver Code Starts
//Initial Template for javascript


'use strict';

process.stdin.resume();
process.stdin.setEncoding('utf-8');

let inputString = '';
let currentLine = 0;

process.stdin.on('data', inputStdin => {
    inputString += inputStdin;
});

process.stdin.on('end', _ => {
    inputString = inputString.trim().split('\n').map(string => {
        return string.trim();
    });
    
    main();
});

function readLine() {
    return inputString[currentLine++];
}

function printList(res,n){
    let s="";
    for(let i=0;i<n;i++){
        s+=res[i];
        s+=" ";
    }
    console.log(s);
}


function main() {
    let t = parseInt(readLine());
    let i = 0;
    for(;i<t;i++)
    {
        let n = parseInt(readLine());
        let arr = new Array(n);
        let input_ar1 = readLine().split(' ').map(x=>parseInt(x));
        for(let i=0;i<n;i++){
            arr[i] = input_ar1[i];
        }
        let obj = new Solution();
        let res = obj.print2largest(arr, n);
        console.log(res);
        
    }
}// } Driver Code Ends




// } Driver Code Ends


//User function Template for javascript


/**
 * @param {number[]} arr
 * @param {number} n
 * @returns {number}
*/

class Solution{
    print2largest(arr,n){
    //   const max=Math.max(...arr);
    //  const index= arr.indexOf(max);
    //  arr[index]=-Infinity;
    //   // arr.splice(index,1);
    //   return Math.max(...arr,)
    
    
  let first_largest = 0;
  let second_largest = -1;

  for (let i = 0; i < n; i++) {
    if (arr[i] > arr[first_largest]) {
      second_largest = first_largest;
      first_largest = i;
    } else if (arr[i] < arr[first_largest]) {
      if (second_largest == -1 || arr[second_largest] < arr[i]) second_largest = i;
    }
  }
  if(second_largest===-1)
  return second_largest;

  return arr[second_largest];
      
    }
}

