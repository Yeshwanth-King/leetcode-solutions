/**
 * @param {Array} arr
 * @param {number} size
 * @return {Array}
 */
var chunk = function (arr, size) {
    newArr = [];
    // for(let i = 0; i < arr.length; i = i+size -1){

    // }
    let i = 0;
    let size1 = size
    while (i < arr.length) {
        const temparr = [];
        for (let j = i; j < size1; j++) {
            if(arr[j] == null) break;
            temparr.push(arr[j]);
        }
        newArr.push(temparr);
        i = i + size;
        size1 += size
    }
    return newArr;
};
