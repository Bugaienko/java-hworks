// 1. Напишите функцию, которая в качестве аргументов получает два числа и возвращает массив чисел
// со значениями от большего числа к меньшему.
// 2. Напишите функцию, которая в качестве аргумента получает массив из чисел и возвращает объект со
// свойствами min, max, avg с соответствующими значениями по массиву.
// 3. Напишите функцию, которая в качестве аргументов получает слово и определяет, является ли оно палиндромом.
// Если да, функция возвращает true, в ином случае false.

// ======= Task1
const createArray = (n1, n2) => {
	const result = []
	const max = n1 >= n2 ? n1 : n2
	const min = max === n1 ? n2 : n1
	for (let i = max; i >= min; i--) {
		result.push(i)
	}
	return result
}

console.log(createArray(3, 7))
// (5)[7, 6, 5, 4, 3]


// ======= Task2
function minMaxObjCreate(arr) {
	if (arr.length >= 1) {
		let max = arr[0]
		let min = arr[0]
		let count = 1
		let sum = arr[0]
		for (let i = 1; i < arr.length; i++) {
			max = (arr[i] > max) ? arr[i] : max
			min = (arr[i] < min) ? arr[i] : min
			sum += arr[i]
			count++
		}
		return {
			max: max,
			min: min,
			avg: sum / count
		}
	} else return {}
}

const arr = [2, -5, 10, -2, 0, -5, 7]
console.log(minMaxObjCreate(arr))
// {max: 10, min: -5, avg: 1}


// ======= Task3
function isPalindrome(str) {
	str = str.replace(/[\s.,%]/g, '')
	return str.toLowerCase() === [...str].reverse().join('').toLowerCase()
}

console.log(isPalindrome('abA'))
// true
console.log(isPalindrome('red rum, sir, is murder'))
//true
console.log(isPalindrome("Don't nod"))
//false
console.log(isPalindrome('Able was I, ere I saw Elba'))
//true