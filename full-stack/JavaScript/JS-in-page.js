//JavaScript html-hez csatolasa:
1. Nem javasolt:

<body onload="alert('Helllooo');"> //onloaddal rakok bele JS kodot
	<h1>Hello</h1>
</body>

2. body-ban hivjuk meg a JS-et es adunk rögtön funkciót

<body>
    <h1>Hello</h1>

    <script type="text/javascript">
      alert("Hellloo")é
    </script>
</body>



3. Javasolt: body-ban scriptel csatlakozatatuk egy JS fájlt
	 mindig a kód végére érdemes rakni

//index.html:
<body>
    <h1>Hello</h1>
    <script src="index.js" charset="utf-8"></script>
</body>

//index.js:
alert("Hellooo");
