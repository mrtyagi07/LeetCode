/**
 * @param {number[][]} img1
 * @param {number[][]} img2
 * @return {number}
 */
var largestOverlap = function (img1, img2) {
  let meta1 = meta(img1), meta2 = meta(img2)
  let atMost = Math.min(meta1.total, meta2.total), max = 0
  try{
    for (let moves = 0; moves < img1.length * 2 - 1; moves++) {
      for (let x = 0; x <= Math.min(moves, img1.length - 1); x++) {
        let y = moves - x
        testy(x, y)
        if (x) testy(-x, y)
  
        function testy(x, y) {
          test(x, y)
          if (y) test(x, -y)
        }
      }
    }
    return max
  }catch(e){ return e}
  

  // img1[a][b] to match img2[a+x][b+y]
  function test(x, y) {
    let overlap = getOverLap(x, y)
    // console.log(`-------(${x},${y}),${overlap}------`)
    if (overlap === atMost) throw atMost
    if (max < overlap) max = overlap
  }

  function getOverLap(x, y) {
    let rtn = 0
    for (let i = Math.max(meta1.top, meta2.top - y); i <= Math.min(meta1.bottom, meta2.bottom - y); i++) {
      for (let j = Math.max(meta1.left, meta2.left - x); j <= Math.min(meta1.right, meta2.right - x); j++) {
        // console.log([i, j, , i + y, j + x, , img1[i][j], img2[i + y][j + x]])
        if (img1[i][j] && img2[i + y][j + x]) rtn++
      }
    }
    return rtn
  }

  function meta(img = [[]]) {
    let top = 0, left = 0, bottom = img.length - 1, right = img[0].length
    for (; top < img.length; top++) {
      if (!isEmptyRow(top)) break
    }
    for (; bottom >= 0; bottom--) {
      if (!isEmptyRow(bottom)) break
    }
    for (; left < img[0].length; left++) {
      if (!isEmptyColumn(left)) break
    }
    for (; right >= 0; right--) {
      if (!isEmptyColumn(right)) break
    }
    let total = 0
    for (let i = top; i <= bottom; i++) {
      for (let j = left; j <= right; j++) {
        total += img[i][j]
      }
    }

    return {
      top, left, bottom, right, img, total
    }
    function isEmptyRow(id) {
      for (let i = 0; i < img[id].length; i++) {
        if (img[id][i]) return false
      }
      return true
    }

    function isEmptyColumn(id) {
      for (let i = 0; i < img.length; i++) {
        if (img[i][id]) return false
      }
      return true
    }
  }

};