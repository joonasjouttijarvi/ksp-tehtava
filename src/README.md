## Tehtävä 10. Refaktorointi

### Koodin toimintalogiikka

Pelin tarkoituksena oli yksinkertainen kivi,sakset, paperi peli jossa kaksi pelaajaa pelaa peliä
ja voittaja ratkaistaan pelaajien valintojen perusteella. Pelaajat valitsevat vuorotellen
kiven, sakset tai paperin ja voittaja ratkaistaan kun toinen pelaajista voittaa kolme kertaa.

### Koodin ongelmat

- Koodissa oli käytetty paljon if-else lauseita. Koodi oli sekavaa ja vaikeasti luettavaa.
- Koodissa oli paljon toistoa ja se ei ollut olio-ohjelmoinnin periaatteiden mukaista.
- Koodi ei kommenttien mukaan toiminut oikein.

### Refaktorointi

1. Muutin koodin kielen englanniksi, luettaavuuden parantamiseksi.
2. Poistin turhat kommentit ja muuttujat
3. Refaktoroin koodia siirtämällä koodia luokkiin,metodeihin ja poistamalla toistoa.
4. Pääluokka `Game` luokkaan luotiin metodeja jotka hoitavat pelin toiminnallisuuden.
5. Pääluokkaa muokattiin siten, että se toimii pelin ohjausluokkana.
6. `Player` luokkaan luotiin metodeja jotka hoitavat pelaajan toiminnallisuuden.
7. `ConsoleOutputManager` luokkaan luotiin metodeja jotka hoitavat tulostuksen konsoliin ja se käyttää `OutputManager` rajapintaa.
8. Refaktoroin koodia siten, että se noudattaa mahdollisimman hyvin olio-ohjelmoinnin keskeisiä periaatteita.
9. Kijroitin JUnit5 testit pelin luokille ja metodeille.
10. Kirjoitin puuttuvat JavaDoc kommentit.
