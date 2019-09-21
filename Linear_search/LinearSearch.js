let arr = [5, 10, 15, 8, 27, 19, 55, 22, 37];
let targetEle = 28;
let found = false;

arr.forEach((data) => {
    if(data == targetEle) {
        console.log("Found");
        found = true;
    }
});

if(!found) {
    console.log("Not found");
}