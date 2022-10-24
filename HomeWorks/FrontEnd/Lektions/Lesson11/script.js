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
