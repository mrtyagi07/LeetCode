/**
 * @param {string[]} strs
 * @return {string[][]}
 *
 * key point: 
 * prime multiply prime is unique, each char canbe represented by a prime
 * since [a-z] to  [0-25]
 * use `[charCodeAt() - 97]` to get unique index from the prime array
 * the prodcut can be set to the key name "prod"
 **/
    var groupAnagrams = function (strs) {
      const map = {};
      const primes = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101];
      strs.forEach(str => {
        let prod = str.split("").reduce((r, c) => r * primes[c.charCodeAt() - 97], 1);
        map[prod] ? map[prod].push(str) : map[prod] = [str];
      });
      return Object.values(map);
    };