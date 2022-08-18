var minSetSize = function(arr) {
    let res = [];
    for (let n of arr) {
        if (!res[n]) {
            res[n] = 1;
        } else {
            res[n] = res[n] + 1;
        }
    }
    res.sort((a, b) => b - a);
    let count =  arr.length;
    const half = parseInt(arr.length / 2);
    
    let i = 0;
    for (; i < res.length; i++) {
        count -= res[i];
        if ( count <= half) break;
    }
    
    return i + 1;
};
// var minSetSize = function (arr) {
//   const numFreq = {};
//   let count = 0;
//   for (let i = 0; i < arr.length; i++) numFreq[arr[i]] ? numFreq[arr[i]]++ : (numFreq[arr[i]] = 1);

//   const sortedIntegerFeq = Object.values(numFreq).sort((a, b) => b - a);

//   for (let i = 0; i < sortedIntegerFeq.length; i++) {
//     count += sortedIntegerFeq[i];
//     if (count >= arr.length / 2) return i + 1;
//   }
// };