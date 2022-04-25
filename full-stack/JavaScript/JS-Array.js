//Array/Lista:
//lista elemeinek számozása 0-tól kezdődik

//String lista:
var listaNev=["elem1","elem2","elem3"];

//Szám lista:
var listaNevKetto=[3,44,456];

//lista elemenek megnevezése index alapján:
var egyElem=listaNev[1];
//eredmény: egyElem="elem2"

//utolsó elem meghatározása:
var utolsoElem=listaNev[-1];

//megszámolja a lista elemeit
listaNev.length;
//eredmény: 3

//megnézi, hogy az adott elem benne van-e a listában
listaNev.includes["elem3"];
//eredmény: true
listaNev.includes["elem5"];
//eredmény: false

//lista végéhez fűzi az elemet
listaNev.push["elem44"];
//eredmény: listaNev=["elem1","elem2","elem3","elem44"];

//lista végéről levágja az utolsó elemet
listaNev.pop["elem44"];
//eredmény: listaNev=["elem1","elem2","elem3"];
