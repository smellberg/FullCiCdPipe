# Inlämningsrapport

Information
OBS!!! Ändra absolut inte på rubrikerna i denna fil!!!!

## Inledning

### Beskriv kort uppgiften om att skapa och testa en mockad Java-klass.

Denna uppgift introducerar konceptet att skapa och testa en mockad Person-CRUD-klass i Java. 
Studenterna kommer att använda interfaces och mock-verktyg som Mockito för att utveckla tester för en ännu ej komplett klass. 
Syftet är att förstå hur man kan testa delar av en applikation innan hela funktionaliteten är implementerad.

--- Skriv ovanför och ta inte bort denna raden ---

### Vilka var dina initiala tankar om användning av interfaces och mockning?

Min första tanke var att det verkar vara ett bra sätt att testa kod och funktioner utan att påverka den riktiga koden.
Jag tyckte också att det verkar vara ett strukturerat sätt då man kan testa funktioner var för sig.
Då blir det enklare att förstå problemet när man inte tittar på helheten hela tiden.

--- Skriv ovanför och ta inte bort denna raden ---

## Planering och genomförande

### Hur planerade du att utveckla och testa den mockade klassen?

Jag planerade att lägga olika testfall i de metoder som redan fanns.
Först ville jag bara skapa tester som fungerade för att sedan se hur jag kan förbättra dem.

--- Skriv ovanför och ta inte bort denna raden ---

### Vilka steg tog du för att implementera och testa mockningen?

Det första jag gjorde var att lägga till setUp-logiken för mocking.
Sedan lade jag till testfall i de metoder som redan fanns.
Därefter städade jag upp i koden, tex lade jag skapande av testpersoner i en egen metod, först låg det i varje metod.

--- Skriv ovanför och ta inte bort denna raden ---

## Utmaningar och lösningar

### Vilka var de största utmaningarna med mockning och enhetstester?

Den största utmaningen är att förstå hur det fungerar i praktiken.
Jag har inte riktigt förstått det ännu så jag behöver lära mig mer om det.

--- Skriv ovanför och ta inte bort denna raden ---

### Hur löste du problemen med att skapa och använda mockade objekt?

Några exempel: 
I setUp-metoden använde jag mock(PersonCrud.class) för att skapa ett mockobjekt.
Jag lade till en egen metod för att skapa testpersoner.
i testAddPerson-metoden använde jag doNothing() för att det inte ska göras något när 
jag anropar annat än det jag vill testa.
Jag provade ven att lägga till texter för att se vad som hände med mina tester, jag lät några vara kvar i koden.


--- Skriv ovanför och ta inte bort denna raden ---

## Reflektion och utvärdering

### Reflektera över din inlärning gällande interfaces och mockning i Java.

Jag hängde inte med på lektionerna så bra pga sjukdom, jag tappade tråden.
Men sedan har jag kollat på videos i efterhand och även läst på.
Då fick jag bättre förståelse när jag satt i lugn och ro.
Men jag känner att jag har en hel del mer att lära för att jag ska förstå hur jag använder mocking i praktiken.

--- Skriv ovanför och ta inte bort denna raden ---

### Hur kan du förbättra dina färdigheter i mockning och enhetstester framöver?

Genom att glöra fler tester/övnigskod och försöka få en förståelse för hur det verkligen fungerar,
själva tillvägagångssättet alltså. Just nu ser jag bara IntelliJ men inte bortom det.

--- Skriv ovanför och ta inte bort denna raden ---
