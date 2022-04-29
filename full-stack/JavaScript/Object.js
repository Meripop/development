
// egy változóba több értéket adunk meg:, itt mindig meg kell adni a nevét a propertinek:
var teacher1={
  name:"Anne",
  age:22,
  subjects: ["Mathematics","Biology"],
  workStart: 2021
}

//érék hívása:
alert("Hello "+ teacher1.name+"!");
//eredmény: Hello Anne!


//Constructor Function
//ahhoz, hogy ne kelljen újra leírni az egész kódot egy új teacher object létrehozásakor
//egy funkciót hozunk létre amit nagybetűvel kell kezdeni:
function Teacher(name,age,subjects,workStart){
  this.name=name;
  this.age=age;
  this.subjects=subjects;
  this.workStart=workStart;
}

//Új object létrehozása ezzel:
var teacher2= new Teacher("Sasa",34,["Sport","English"],1999);

//Method-nak hívjuk azt a funkciót ami egy object funkciója:
var teacher1={
  name:"Anne",
  age:22,
  subjects: ["Mathematics","Biology"],
  workStart: 2021
  learn: function(){
    alert("Good morning");
    goToClass();
  }
}

function Teacher(name,age,subjects,workStart){
  this.name=name;
  this.age=age;
  this.subjects=subjects;
  this.workStart=workStart;
  this.learn: function(){
    alert("Good morning");
    goToClass();
  }
}

//érték hívása:
teacher1.learn();
