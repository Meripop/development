jQuery egy JavaScript könyvtár amiben funkciók vannak előre megírva, hogy nekünk  egyszerűbb legyen.

JS: document.querySelector("h1");
jQuery: $("h1");
jQuery: $("h1.className");


Lelehet tölteni az egész kkönyvtárat vagy belinkelni a html bodyjaba mint a js-t.
A js elé kell berakni.

Rakhatjuk a html head részébe is de akkor a js fájlba bele kell írni, hogy csak akkor csinálja meg ha betöltött az egész oldal:(pl szinezze pirosra a h1 szövegét)

$(document).ready(function(){
	$("h1").css("color","red");

});


jQuery Effect Methods:

//ha egy érték van a zárójelben akkor "get value"=értékét várom
//ha kettő érték van akkor "set value"=értéket állítok be
JS:document.querySelectorAll("button");
jQuery: $("button");

CSS manipulálása, elmegadjuk, hogy a css-en belül mit akarunk változtatni, utána pedig, hogy mire
$("h1").css("color","red");

//megtudjuk kérdezni tőle, hogy mi az adott properti értéke(konzolra kiírvs itt):
console.log($("button").css("color"));

//klassz hozzáadása:
$("button").addClass("big-Txt");

//klassz elvétele:
$("button").removeClass("big-Txt");

//több klassz hozzáadása:
$("button").addClass("big-Txt margin-Wide");

//megnézi, hogy a klassz hozzá van-e adva:
$("button").hasClass("big-Txt");
//eredmény: true vagy false




Szöveg manipulálása(összes h1 szövegét):
$("h1").text("Helllo");

//így a stílusára is hatással lehet lenni
$("h1").html("<em>Hello</em>");



Atributumok(img-src,a-href) manipulálása:
//érték lekérése:
$("img").attr("src");
$("h2").attr("class");

//érték megváltoztatása(összes img-nek):
$("img").attr("src","images/picture1.png");


Esemény hozzáadása:
$("h1").click(function(){
	$("h1").css("color","yellow");
});



//barmelyik gomb megnyomásakor a h1 szövege legyenpiros
JS:
for(var i=0;i<5;i++){
  document.querySelectorAll("button")[i].addEventListener("click",function (){
    document.querySelector("h1").style.color="red";
  });
}

jQuery:
$("button").click(function(){
	$("h1").css("color","red");
});


//input get, megtudjuk melyik billentyűt nyomtuk le
$("input").keypress(function(event){
	console.log(event.key);
});

//bármelyik billentyű megnyomásakor a h1-be kiírjuk a karaktert amit lenyomtunk:
$(document).keydown(function(event){
	$("h1").text(event.key);
});

//on funkciónál megadhatom, hogy mit figyeljen, itt a kattintást a h1-en
$("h1").on("mouseover",function(){
	$("h1").css("color","red");
});

//h1 elé berak egy új gomb elemet
$("h1").before("<button>New button</button>");
});
//eredmény: <button>New button</button><h1>Bye</h1>

//h1 után berak egy új gomb elemet
$("h1").after("<button>New button</button>");
});
//eredmény: <h1>Bye</h1><button>New button</button>

//h1-en belül elé rak egy új gomb elemet
$("h1").prepend("<button>New button</button>");
});
//eredmény: <h1><button>New button</button>Bye</h1>

//h1-en belül a záró tag elé rak egy új gomb elemet
$("h1").append("<button>New button</button>");
});
//eredmény: <h1>Bye<button>New button</button></h1>

//összes h1-et törli
$("h1").remove();
});

//gombra kattintáskor eltünteti h1-et, kijön a flowból és minden feljebb ugrik ami alatta van
$("button").on("click",function(){
	$("h1").hide();
});

//gombra kattintáskor láthatóvá teszi ha nem látszik
$("button").on("click",function(){
	$("h1").show();
});

//gombra kattintáskor eltünteti h1-et ha látszik és láthatóvá teszi ha nem látszik
$("button").on("click",function(){
	$("h1").toggle();
});

Hasonlóak:
.fadeOut();
.fadeIn();
.fadeToggle();

.slideDown();
.slideUp();
.slideToggle();

//Animáció manipulálása
$("button").on("click",function(){
	$("h1").animate({opacity:0.5,margin:"20%"});
});


//Több funkció hozzárendelése
$("button").on("click",function(){
	$("h1").slideUp().slideDown().animate({opacity:0.5"});
});
