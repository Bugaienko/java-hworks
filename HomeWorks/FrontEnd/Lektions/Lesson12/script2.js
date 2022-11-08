const minus = document.querySelector('.minus')
const plus = document.querySelector('.plus')
const result = document.querySelector('.result')

function increment() {
	result.innerText = +result.innerText + 1
}

function decrement() {
	result.innerText = +result.innerText - 1
	// console.log(result.innerText)
}

// minus.onclick = decrement
minus.addEventListener('click', decrement)
plus.addEventListener('click', function (){
	result.innerText = +result.innerText + 1
})

// result.addEventListener('change', function () {
// 	console.log("CHANGE")
// 	if (result.innerText === '-10') {
// 		console.log('IF !!!')
// 		minus.removeEventListener('click', decrement)
// 	}
// })

const inp = document.querySelector('input')
const par = document.querySelector('p')
inp.addEventListener('keyup', function (event) {
	par.innerText = event.target.value
})

const myDiv = document.getElementById('div2')
// function minus () {
// 	console.log('Minus')
// }


function minus2() {
	console.log('Minus')
}
function plus2() {
	console.log('Plus')
}

const but1 = document.createElement('button')
const but2 = document.createElement('button')
but1.innerHTML = 'Minus'
but2.innerHTML = "Plus"
but1.addEventListener('click', minus2)
but2.addEventListener('click', () => {
	console.log('PLUS')
})
myDiv.appendChild(but1)
myDiv.appendChild(but2)

