const targetElem = document.querySelector('.target')
fetch("./monitor.html")
.then(res => res.text())
.then(data => {
    targetElem.innerHTML=data
})