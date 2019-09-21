let arr = [15, 25, 27, 29, 34, 35, 37, 39, 45, 48, 49, 50, 51, 52, 58, 60, 65, 68, 69, 70, 75];
let searchEle = 50;

let left = 0, right = arr.length;
let mid1, mid2;

while(left <= right) {
    mid1 = Math.floor(left + (right - left ) /3);
    mid2 = Math.floor(right - (right - left ) /3);
    //console.log("l : " + left + " mid1 : " + mid1 + " mid2 : " + mid2 + " r : " + right);

    if(searchEle == arr[mid1]) {
        console.log("Found at mid1");
        break;
    } else if (searchEle == arr[mid2]) {
        console.log("Found at mid2");
        break;
    } else if (searchEle < arr[mid1]) {
        right = mid1 -1;
    } else if (searchEle > arr[mid2]) {
        left = right + 1;
    } else {
        left = mid1 + 1;
        right = mid2 - 1;
    }            
}
if(left > right) {
    console.log("Not Found");
}