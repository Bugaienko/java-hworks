
const table = document.getElementById('table')

const newTask = () => {
	const all = document.querySelectorAll(".cell")
	all.forEach((cell) => {
		cell.classList.remove('active');
		cell.classList.remove('horse')
	})
}

const movies = [
	[2, 1],
	[2, -1],
	[1, 2],
	[1, -2],
	[-2, 1],
	[-2, -1],
	[-1, 2],
	[-1, -2]
]

const addHorse = (cellId) => {
	const cell = document.getElementById(cellId)
	cell.classList.add('horse')

}

const checkResult = (x, y) => {
	if ( 1 <= x && x <= 8 && 1 <= y && y <= 8 ) {
		const cellId = x * 10 + y
		console.log("True", cellId)
		addHorse(cellId);
	} else {
		console.log("False")
	}
}

const knightsMoves = (cellId) => {
	const targetNum = parseInt(cellId);
	let digit1 = Math.trunc(targetNum / 10)
	let  digit2 = targetNum % 10

	movies.forEach((mov) => {
		console.log("mov", mov)
		const x = digit1 + mov[0]
		const y = digit2 + mov[1]
		checkResult(x, y)
	})

}

const clickHandler = (e) => {
	newTask();
	const targetId = e.target.id
	// console.log(targetId)
	document.getElementById(targetId).classList.add('active')
	knightsMoves(targetId);
}

table.addEventListener('click', clickHandler);