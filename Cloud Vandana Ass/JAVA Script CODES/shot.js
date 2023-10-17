const readline = require('readline');

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

rl.question('Enter a list of numbers separated by spaces: ', (input) => {
    
    const array = input.split(' ').map(Number);

    
    if (isValidArray(array)) {
        
        array.sort((a, b) => b - a);

        
        console.log(' The  descending order of given array is :', array);
    } else {
        console.log('Invalid input.');
    }

    rl.close(); 
});

function isValidArray(arr) {
    
    return Array.isArray(arr) && arr.length > 0 && arr.every(value => !isNaN(value));
}
