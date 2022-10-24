// First level: 1. Треугольник. Напишите цикл,  выводит такой треугольник:
// #
// ##
// ###
// ####
// #####
// ######
// #######


// FizzBuzz. Напишите программу, которая выводит через console.log все числа от 1 до 100, с двумя исключениями.
// Для чисел, нацело делящихся на 3, она должна выводить ‘Fizz’, а для чисел, делящихся на 5 (но не на 3) – ‘Buzz’.
// Когда сумеете – исправьте её так, чтобы она выводила «FizzBuzz» для всех чисел, которые делятся и на 3 и на 5.


// Получите перевернутую версию массива, без использования метода reverse.

for (let i=1; i<8; i++){
	let result =''
	for (let y = 1; y<=i; y++){
		result += '#'
	}
	console.log(result)
}

for (let i = 1; i <= 100; i++) {
	if (i % 3 === 0) {
		if (i % 5 === 0) {
			console.log('FizzBuss')
			continue
		}
		console.log('Fizz')
	} else if (i % 5 === 0) {
		console.log('Buzz')
	} else {
		console.log(i)
	}
}

const arr = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
const arrReverse = []

for (let i = arr.length - 1; i >= 0; i--) {
	arrReverse[arr.length - 1 - i] = arr[i]
}
console.log(arrReverse)