1. String: "name":
két string összefűzése

var name="Anna";
var message="Helloo";
....(message+" "+name);
//eredmény: "Helloo Anna"

2.  Boolean: true, false
3. Number: 0 1 2 3 4 5 6 7 8 9....
	- addition= összeadás: +
	- subtraction= kivonás: -
	- multiplication= szorzás: *
	- division=osztás: /
	- modulo= az osztás maradékát írja ki: %


var a=6;
a=a+1;
//a következő ugyanazt jelenti:
a++;
//eredmény: 7

a--;
//eredmény: 5

//ha önmagához akarunk hozzáadni vagy kivonni valamennyit akkor így is írhatjuk:
a+=2;
//eredmény: 8

a-=2;
//eredmény: 4

var b=7;
a+=b;
//eredmény: 13
-------
//a második sorban n egyenlo m ertékével és mühez hozzá adunk 1-et, a harmadik sorban mivel n értéke 5 lett, így 5-höz adunk még 1-et.
m=5;
n=m++;
n+=1;
//eredmény: 6
//Itt viszont a második sorban először az m-hez ad 1-et(++) majd utana teszi azt egyenlővé n értékével(a megvaltoztatott értéket olvassa ki m-ből), harmadik sorban ugyanúgy egyet ad az n-hez
m=5;
n=++m;
n+=1;
//eredmény: 7



Math.floor; =Lefelé kerekítés
var num=5.6456;
var numTwo=Math.floor(num);
//eredmény: numTwo=5
var numFour=-45.05;
var numThree=Math.floor(numFour);
//eredmény: numThree=-46


Math.ceil(); =Felfelé kerekítés

var num=5.6456;
var numTwo=Math.ceil(num);
//eredmény: numTwo=6
var numFour=-45.05;
var numThree=Math.ceil(numFour);
//eredmény: numThree=-45


Math.pow(x,y); = Hatványozás (x az y-odikon)
var num=5;
var numTwo=Math.pow(num,2);
//eredmény: numTwo=25
var numFour=-45.05;
var numThree=Math.floor(numFour);
//eredmény: -46


Math.round(); =Kerekítés egészre
var num=5.6456;
var numTwo=Math.floor(num);
//eredmény: numTwo=6


Math.random(); =Véletlen számot generál 0 és 1 között. 0 lehet, 1 nem
var numTwo=Math.random();
//eredmény: pl: numTwo=0.784846

//1 es 6 kozott akarunk random egész számot dobni akkor:
var randNum=Math.floor(6*numTwo)+1;


Math.sqrt(x); =Négyzetgyökvonás

Math.abs(x; =Abszolút érték

Math.PI; =3.141592653589793: Ez állandó!

.toFixed(2); = 2 tizedesjeggyel jeleníti meg az eredményt
