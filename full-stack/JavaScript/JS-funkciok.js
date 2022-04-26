Már létező funkciók/függvény:

1. alert(); = felugó ablakba  írja ki amit a zárójelek közé írunk
2. prompt(); = felugró ablak beviteli mezővel és a zárójelek közé írt értékkel
3. console.log(); = konzolra írja ki amit a zárójelek közé írunk
4. length; = megadja szamban egy adott valtozo hosszusagat
var name="Anna";
name.length;
//eredmény: 4

5. slice(); = megadja a beirt index által megadott string értékét. Az index 0-tól kezdődik
var name="Anna";
name.slice(0,1);
//eredmény: A
name.slice(1,3);
//eredmény: nn
name.slice(-1);
//eredmény: a

6. toUpperCase(); = minden karaktert nagybetűs karakteré alakít
var name="Anna";
name.toUpperCase();
//eredmény: ANNA

8. toLowerCase(); =  minden karaktert kisbetűs karakteré alakít
var name="Anna";
name.toLowerCase();
//eredmény: anna


Új funkció írása:
//Írás:
function naMe(){
 //kod....
};
//meghívása:
naMe();

//Írás, nyílfüggvénnyel:
const szamol=()=>{
		//kod
	}

//Írás értékkel:
function iceCream(piece){
	var cost=piece*250;
 //kod....
};
//meghívása:
naMe(4);
//eredmény: cost=1000

//Írás bevitt(input) értékkel és visszatérési értékkel(output):
function iceCream(piece){
 //kod....
	return piece*250;
};
//meghívása:
naMe(4);
//eredmény: 1000
//A függvényt is bele rakhatjuk változóba:
var result=naMe(4);
//eredmény: result=1000

// button elemhez hozzá adom az addEventListener(,) methodot ami 2 értéket vár.
// Egy esemény típust ami itt a click(stringként kell megadni)
// és egy eseményt ami fusson le ha kattintunk, ami itt egy sajat funkcio
document.querySelector("button").addEventListener("click",clickEd);

function clickEd(){
  alert('klikkeltem');
}
//név nélküli funkcióval:
document.querySelector("button").addEventListener("click",function (){
  alert('klikkeltem');
});


//Higher Order Functions= funkcó ami inputba kap egy másik funkciót
//A calculatorNb fuggvénnyel meghívok két korábbi függvényt
function addNb(nb1,nb2){
	return nb1+nb2;
}
function subtractionNb(nb1,nb2){
	return nb1-nb2;
}
function divisionNb(nb1,nb2){
	return nb1/nb2;
}
function moduloNb(nb1,nb2){
	return nb1%nb2;
}
function multipleNb(nb1,nb2){
	return nb1*nb2;
}
function calculatorNb(nb1,nb2,operator){
	return operator(nb1,nb2);
}

//hang lejátszása
var audio = new Audio('sounds/tom-1.mp3');
audio.play();

//this-el kérdezek vissza, ha megtörtén(click) akkor csinalja az utána írtakat
for(var i=0;i<document.querySelectorAll(".bob").length;i++){
  document.querySelectorAll(".drum")[i].addEventListener("click",function (){
    this.style.color="white";
  });
}
