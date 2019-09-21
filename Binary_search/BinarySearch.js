let arr = [18, 27, 29, 38, 39, 42, 46, 49, 55, 66, 85, 86, 91, 99];
let searchEle = 46;

let left = 0, right = arr.length ;
let mid;

while (left <= right) {
    mid = (left + right) / 2;
    if(arr[mid] == searchEle) {
        console.log('Found');
        break;
    } else if (searchEle < arr[mid]) {
        right = mid -1;
    } else {
        left = mid + 1;
    }
}

if(left > right) {
    console.log('Not Found');
}