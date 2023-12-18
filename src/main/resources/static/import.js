const targetElem = document.querySelector('.target')
fetch('./stationsmonitorTAB.html')
.then(res => res.text())
.then(data => {
    targetElem.innerHTML=data
})