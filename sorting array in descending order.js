function sortDescending(arr) {
    arr.sort(function(a, b) {
        return b - a; 
    });
}
const myArray = [4,4,4,9,9,8,3,2,1,];
sortDescending(myArray);

console.log(myArray);
