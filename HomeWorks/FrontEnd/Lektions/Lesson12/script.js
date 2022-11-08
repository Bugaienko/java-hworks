// DOM
// Document object model
// const paragraphElement = document.querySelector('p')
// const paragraphElement2 = document.querySelector('.secondP')
// paragraphElement.innerText = "Goodbye"
// paragraphElement2.innerHTML = '<h1>Hello</h1>'
// console.log(paragraphElement)
//
// const paragraphs = document.querySelectorAll('p')
// // console.log(paragraphs)
//
// paragraphs.forEach((p) => {
// 	// p.innerHTML += '!!!'
// 	p.innerText += '!!!'
// })

document.querySelector('main').innerHTML += 'Я главный элемент'

const link = document.querySelector('a')
link.innerText = 'Yandex'
// link.href = 'http://ya.ru'
link.setAttribute('href', 'https://google.de')
console.log(link.getAttribute('href'))
//
// // const images = document.querySelectorAll('img:nth-child(-n + 8)')
// const images = document.querySelectorAll('.imgClass:nth-child(-n+8)')
// console.log(images)
// images.forEach((i) => {
// 	i.setAttribute('src', 'https://lumpics.ru/wp-content/uploads/2020/05/kak-dobavit-dokument-v-gugl-dokumenty.png')
// })

const links = document.querySelectorAll('a')
const arrayLinks = []
links.forEach(link => {
	// arrayLinks.push(link.getAttribute('href')) // оба работают
	arrayLinks.push(link.href)
})
console.log(arrayLinks)

const div1 = document.createElement('div', {

})
const img1 = document.createElement('img')
img1.setAttribute('src', 'https://lumpics.ru/wp-content/uploads/2020/05/kak-dobavit-dokument-v-gugl-dokumenty.png')
div1.appendChild(img1)
div1.setAttribute('class', 'myDiv')
console.log(div1)

document.body.appendChild(div1)

const arr2 = ['1', '2', '3', '4', '5']
// for (let el of arr2) {
// 	let par1 = document.createElement('p')
// 	par1.innerText = el
// 	document.getElementById('root').appendChild(par1)
// }
// работают аналогично

arr2.forEach(el => {
	const par1 = document.createElement('p')
	par1.innerText = el
	document.getElementById('root').appendChild(par1)
})

const pizzas = [
	{
		"id": 0,
		"imageUrl": "https://dodopizza.azureedge.net/static/Img/Products/f035c7f46c0844069722f2bb3ee9f113_584x584.jpeg",
		"name": "Пепперони Фреш с перцем",
		"types": [
			0,
			1
		],
		"sizes": [
			26,
			30,
			40
		],
		"price": 803,
		"category": 4,
		"rating": 4
	},
	{
		"id": 1,
		"imageUrl": "https://dodopizza.azureedge.net/static/Img/Products/Pizza/ru-RU/2ffc31bb-132c-4c99-b894-53f7107a1441.jpg",
		"name": "Сырная",
		"types": [
			0
		],
		"sizes": [
			26,
			40
		],
		"price": 245,
		"category": 5,
		"rating": 6
	},
	{
		"id": 2,
		"imageUrl": "https://dodopizza.azureedge.net/static/Img/Products/Pizza/ru-RU/6652fec1-04df-49d8-8744-232f1032c44b.jpg",
		"name": "Цыпленок барбекю",
		"types": [
			0
		],
		"sizes": [
			26,
			40
		],
		"price": 295,
		"category": 3,
		"rating": 4
	},
	{
		"id": 3,
		"imageUrl": "https://dodopizza.azureedge.net/static/Img/Products/Pizza/ru-RU/af553bf5-3887-4501-b88e-8f0f55229429.jpg",
		"name": "Кисло-сладкий цыпленок",
		"types": [
			1
		],
		"sizes": [
			26,
			30,
			40
		],
		"price": 275,
		"category": 1,
		"rating": 2
	},
	{
		"id": 4,
		"imageUrl": "https://dodopizza.azureedge.net/static/Img/Products/Pizza/ru-RU/b750f576-4a83-48e6-a283-5a8efb68c35d.jpg",
		"name": "Чизбургер-пицца",
		"types": [
			0,
			1
		],
		"sizes": [
			26,
			30,
			40
		],
		"price": 415,
		"category": 2,
		"rating": 8
	},
	{
		"id": 5,
		"imageUrl": "https://dodopizza.azureedge.net/static/Img/Products/Pizza/ru-RU/1e1a6e80-b3ba-4a44-b6b9-beae5b1fbf27.jpg",
		"name": "Крэйзи пепперони",
		"types": [
			0
		],
		"sizes": [
			30,
			40
		],
		"price": 580,
		"category": 4,
		"rating": 2
	},
	{
		"id": 6,
		"imageUrl": "https://dodopizza.azureedge.net/static/Img/Products/Pizza/ru-RU/d2e337e9-e07a-4199-9cc1-501cc44cb8f8.jpg",
		"name": "Пепперони",
		"types": [
			0,
			1
		],
		"sizes": [
			26,
			30,
			40
		],
		"price": 675,
		"category": 1,
		"rating": 9
	},
	{
		"id": 7,
		"imageUrl": "https://dodopizza.azureedge.net/static/Img/Products/Pizza/ru-RU/d48003cd-902c-420d-9f28-92d9dc5f73b4.jpg",
		"name": "Маргарита",
		"types": [
			0,
			1
		],
		"sizes": [
			26,
			30,
			40
		],
		"price": 450,
		"category": 4,
		"rating": 10
	},
	{
		"id": 8,
		"imageUrl": "https://dodopizza.azureedge.net/static/Img/Products/Pizza/ru-RU/ec29465e-606b-4a04-a03e-da3940d37e0e.jpg",
		"name": "Четыре сезона",
		"types": [
			0,
			1
		],
		"sizes": [
			26,
			30,
			40
		],
		"price": 395,
		"category": 5,
		"rating": 10
	},
	{
		"id": 9,
		"imageUrl": "https://dodopizza.azureedge.net/static/Img/Products/Pizza/ru-RU/30367198-f3bd-44ed-9314-6f717960da07.jpg",
		"name": "Овощи и грибы 🌱",
		"types": [
			0,
			1
		],
		"sizes": [
			26,
			30,
			40
		],
		"price": 285,
		"category": 2,
		"rating": 7
	}
]

const root = document.getElementById('root')

pizzas.forEach(pizza => {
	const div = document.createElement('div')

	const name = document.createElement('h3')
	name.innerText = pizza.name
	div.appendChild(name)

	const price = document.createElement('p')
	price.innerText = pizza.price
	div.appendChild(price)

	const img = document.createElement('img')
	img.setAttribute('src', pizza.imageUrl)
	div.appendChild(img)

	root.appendChild(div)
})