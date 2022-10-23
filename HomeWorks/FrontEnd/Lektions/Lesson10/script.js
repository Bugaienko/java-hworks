// Arrays, cycles

const fruits = ['apple', 'banana', 'peach']
fruits.push('plum') // добавляет в конец
fruits.unshift('dragonfruit') // добавляет в начало

console.log(fruits)

// console.log(fruits[0])
//
//
// console.log(fruits)
// console.log(fruits.length)
// fruits[10] = 'orange'
// console.log(fruits, fruits.length)
//
// // const fruits2 = fruits
// // fruits2[0] = 'gffff'
// // console.log(fruits, fruits2) // оба поменялись
//
// // Добавление в массив
// fruits.push('plum') // добавляет в конец
// fruits.unshift('dragonfruit') // добавляет в начало
// console.log(fruits)
// const result = fruits.push('fruit_x')
// console.log(result, fruits)
//
// // Удаление элементов
// fruits.pop() //убирает последний
// const deleted = fruits.pop() //убирает последний. возвращает значение
// fruits.shift() //убирает первый. возвращает значение
//
// let newFruits = fruits.slice(1, 3)
// fruits.splice(0, 3) // с какого индекса удалить, сколько эл удалить
// console.log(fruits, 'fruits')
// console.log(newFruits, 'new Fruits')

// let number1 = prompt("Введите первое число")
// let number2 = prompt("Введите второе число")
// let number3 = prompt("Введите третье число")
// const array = []
// array.push(+number1)
// array.push(+number2)
// array.push(+number3)
// console.log(array)
// array.splice(-1, 0, 3, 4) // добавит пере последним элементом цифры 3,4
//

const arr1 = [1, 4, 2, 5, 3]
// const arr2 = []
// for (let i=0; i< arr1.length; i++) {
// 	arr2.push(arr1[i]**2)
// }
// arr1.forEach(el => arr2.push(el**2))
const arr2 = arr1.map(x => x ** 2)
console.log(arr2)

arr1.map(value => {
	if (value % 2 === 0) {
		console.log(value)
	}
})

// for (let fruit of fruits) {
// 	console.log(fruit)
// }

// fruits.forEach((fruit, index, arr) => {
// 	console.log(fruit)
// 	console.log(index)
// 	console.log(arr)
// })

// const str = fruits.join(" | ")
// console.log(str)
//
// const newFruits = str.split(" | ")
// console.log(newFruits)
//
// const rev = fruits.reverse() // реверсирует список
// console.log(rev)
//
// console.log(arr1, 'arr1')
// console.log(arr1.sort((a, b) => a < b ? 1 : -1))
// // console.log(arr1.sort((a, b) => a - b)) // тоже сортирует
// console.log(arr1, 'arr1')// sort меняет массив

// const powNumber = arr1.map((element, index, list) => {
// 	return element ** 3
// })
// console.log(powNumber, 'powNumber')
//
// const eventNumbers = arr1.filter(num => num % 2 === 0)
// console.log(eventNumbers, 'eventNumbers')
// console.log(arr1, 'arr1')
//
// const result = arr1.reduce((acc, currentValue) => {
// 	return acc + currentValue
// }, 0)
// console.log(result, 'result')

const numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
for (let i = numbers.length + 1; i >= 0; i -= 2) {
	console.log(numbers[i])
}

console.log(numbers, 'numbers')
const result = numbers.reduce((acc, current) => {
	if (current % 2 === 0) {
		return acc + current
	} else return acc
}, 0)
console.log(result, 'result')