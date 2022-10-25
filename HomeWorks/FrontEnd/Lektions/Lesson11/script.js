const person = {
	name: 'Gor',
	age: 24,
}

// const obj = {}

// const obj2 = new Object()

// const product = {
// 	name: 'Apple',
// 	price: 15
// }
// const product2 = {
// 	name: 'Banana',
// 	price: 10
// }
// const product3 = {
// 	name: 'Potato',
// 	price: 5
// }
// console.log(product, product2, product3)

person.last_name = 'Petrov'
person.age = 25
console.log(person)

const fruits = [
	{name: 'Apple', price: 15},
	{name: 'Banana', price: 10},
	{name: 'Potato', price: 5},
	{name: 'fruit1', price: 11},
	{name: 'fruit2', price: 34},
]

// for (let fruit of fruits){
// 	if (fruit.price >= 10) {
// 		console.log(fruit.name)
// 	}
// }
//
// const expFruits = fruits.filter(fruit => {
// 	return fruit.price >= 10
// })
// console.log(expFruits)

// const  keys = Object.keys(person)
// console.log(keys)

// for (let key of Object.keys(person)) {
// 	console.log(person[key])
// }

// Object.values(person)

// for (let  [key, values] of Object.entries(person)){
// 	console.log(key)
// 	console.log(values)
// }

// for (let key in fruits){
// 	console.log(`${fruits[key].name} coast ${fruits[key].price}`)
// }

let sum = 0
for (let fruit of fruits) {
	sum += fruit.price
}
console.log(`Сумма равна: ${sum}`)

const sum1 = fruits.reduce((acc, fruit) => {
	return acc += fruit.price
}, 0)
console.log(sum1)


const [fruit1, ...fruit2] = fruits
console.log(fruit1)
console.log(fruit2)

// let str = 'abc'
// let [one, two] = str
// str = 'ggg'
// console.log(one, two)

//=====================
// const SALE = 0.8
//
// for (let fruit of fruits) {
// 	let {name, price} = fruit
// 	// console.log(name, price)
// 	// console.log('fruit', fruit)
// 	console.log(`${name} со скидкой стоит ${price * SALE}`)
// }
//
// const  number = +prompt('Enter number')
// alert(number ** 2)

// function promptNumber() {
// 	let number = +prompt('Enter number')
// 	// if (number % 2 === 0) {
// 	// 	alert("ДА")
// 	// } else {
// 	// 	alert("НЕТ")
// 	// }
// 	const answer = (number % 2 === 0) ? 'YES' : 'NO'
// 	alert(answer)
// }
//
// promptNumber()
// promptNumber()

// function maxPrint(n1, n2) {
// 	const number = (n1 > n2) ? n1 : n2
// 	console.log(number)
// }
//
// maxPrint(5, 12)

const power = (number, n) => {
	return number ** n
}

console.log(power(7,3))

// Function declaration - можно вызвать в коде до объявления
function isEvent (n) {
	return n % 2 === 0
}

// Function expression - можно вызвать в коде только после объявления
const isEven = (n) => {
  return (n % 2 === 0)
}

// console.log(isEven(12))
// console.log(isEven(13))

// const fruits = [
// 	{name: 'Apple', price: 15},
// 	{name: 'Banana', price: 10},
// 	{name: 'Potato', price: 5},
// 	{name: 'fruit1', price: 11},
// 	{name: 'fruit2', price: 34},
// ]

const saleFruits = fruits.map(fruit => {
	return {
		name: fruit.name,
		prise: fruit.price * 0.8
	}
})

console.log(saleFruits)

const toArray = (n) => {
  const result = []
	if (n >= 0 ){
		for (let i = 0; i <= n; i++) {
			result.push(i)
		}
	} else {
		for (let i = 0; i >= n; i--) {
			result.push(i)
		}
	}

	return result
}

console.log(toArray(5))
console.log(toArray(-5))