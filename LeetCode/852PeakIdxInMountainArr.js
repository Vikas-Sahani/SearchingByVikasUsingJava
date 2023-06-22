// 852. Peak Index in a Mountain Array =>
// https://leetcode.com/problems/peak-index-in-a-mountain-array/description/

// 162. Find Peak Element => has the same solution
// https://leetcode.com/problems/find-peak-element/description/

/**
 * @param {number[]} arr
 * @return {number}
 */
var peakIndexInMountainArray = function (arr) {
  let start = 0;
  let end = arr.length - 1;

  while (start < end) {
    let mid = Math.floor(start + (end - start) / 2);
    if (arr[mid] < arr[mid + 1]) {
      start = mid + 1;
    } else {
      end = mid; // all the left element of the array is smaller so it can be the posible answer.
    }
  }
  return start;
};
