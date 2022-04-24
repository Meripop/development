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
