package Probleme;

import java.util.Scanner;

public class Probleme {

    //todo: 1. Se consideră un text de maximum 255 de caractere. Realizați un program care afişează:
    //         a) Numărul de apariții al unei litere în text. Litera va fi citită de la tastatură.
    //         b) Câte vocale apar în textul citit.
    //         c) Numărul de apariții al unei silabe în text. Silaba va fi citită de la tastatură. //?


    public void solutie1() {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Introduceti  un text");
        String text = scanner1.nextLine();

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Introduceti  o litea");
        char litera = scanner2.nextLine().charAt(0);

        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Introduceti o silaba");
        String silaba = scanner3.nextLine();

        String textA = "a) ";
        textA += nrApartiiiLitera(text, litera);
        System.out.println(textA);

        String textB = "b) ";
        textB += nrApartiiiVocale(text);
        System.out.println(textB);

        String textc = "c) ";
        textc += nrApartiiiSilaba(text, silaba);
        System.out.println(textc);
    }

    private int nrApartiiiLitera(String str, char ch) {
        int nr = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                nr++;
            }
        }
        return nr;
    }

    private boolean isVocala(char ch) {

        if (!Character.isAlphabetic(ch)) {

            return false;
        }
        String vocale = "AEIOUaeiou";
        return vocale.contains(ch + "");
    }

    private int nrApartiiiVocale(String str) {
        int nr = 0;
        for (int i = 0; i < str.length(); i++) {
            if (isVocala(str.charAt(i)) == true) {
                nr++;
            }
        }
        return nr;
    }

    private int nrApartiiiSilaba(String str, String silaba) {
        int nr = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.equals(silaba)) {
                nr++;
            }
        }
        return nr;
    }


    //todo: 2. Se consideră un cuvânt format din litere mici şi mari ale alfabetului englez. Realizați un program care permite ştergerea tuturor aparițiilor primei litere în cadrul cuvântului respectiv.


    public void solutie2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti  un text");
        String text = scanner.nextLine();
        String textFinal = eliminareAparitiiPrimaLitera(text);
        System.out.println(textFinal);
    }

    private String eliminareAparitiiPrimaLitera(String str) {
        char pl = str.charAt(0);
        String aux = "";
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == pl) {
                aux += "";
            } else {
                aux += str.charAt(i);
            }
        }
        return aux;
    }

    //todo:3. Se consideră un cuvânt format din literele mici şi mari ale alfabetului englez. Să se scrie un program care afişează cuvintele obținute din cuvântul inițial prin eliminarea succesivă a primului şi ultimului caracter al şirului.


    public void solutie3() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti  un text");
        String text = scanner.nextLine();
        afisareCuvinteDupaEliminarePcSiUcSuccesiv(text);
    }

    private void afisareCuvinteDupaEliminarePcSiUcSuccesiv(String str) {
        int ctr = str.length();
        String mainAux = str;
        while (ctr >= 0) {
            String aux = "";
            for (int i = 0; i < mainAux.length(); i++) {
                if (i == 0) {
                    aux += "";
                } else if (i == mainAux.length() - 1) {
                    aux += "";

                } else {
                    aux += mainAux.charAt(i);
                }
            }
            mainAux = aux;
            System.out.println(mainAux);
            ctr--;
        }
    }


    //todo:4. Se consideră o matrice de dimensiune nxm cu elemente de tip şir de caractere. Creați un program care afişează şirul de caractere de lungime maximă de pe fiecare linie a matricei. ???

    public void solutie4() {

    }

    public void adisareSirulCuLungimeMaximaMatrice() {

    }


    //todo:  5. Să se creeze un program care transformă literele mici ale unui cuvânt în litere mari şi literele mari în litere mici. Exemplu: Pentru cuvântul 'MiorItIC' se va afişa: 'mIORiTic'.

    public void solutie5() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti  un text");
        String text = scanner.nextLine();
        String textFinal = transformareLitereMiciInMariSiMariInMici(text);
        System.out.println(textFinal);
    }

    private String transformareLitereMiciInMariSiMariInMici(String str) {
        String aux = "";
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLowerCase(str.charAt(i)) == true) {
                aux += Character.toUpperCase(str.charAt(i));
            } else if (Character.isUpperCase(str.charAt(i)) == true) {
                aux += Character.toLowerCase(str.charAt(i));
            }
        }
        return aux;
    }


    //todo: 6.  Se consideră un şir de n cuvinte. Să se determine cuvântul de lungime maximă care se poate forma prin concatenarea a două dintre cuvintele citite


    public void solutie6() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti  un text");
        String text = scanner.nextLine();
        String textFinal = cuvantulCombinatCuLungimeMaxima(text);
        System.out.println(textFinal);
    }

    private int lungimeCuvant(String str) {
        int l = 0;
        for (int i = 0; i < str.length(); i++) {
            l++;
        }
        return l;
    }

    private String cuvantulCombinatCuLungimeMaxima(String str) {
        String[] split = str.split(" ");
        int lMax = -1;
        String cuvMax = "";
        for (int i = 1; i < split.length - 1; i++) {
            String aux = split[i] + split[i + 1];
            if (lungimeCuvant(aux) > lMax) {
                lMax = lungimeCuvant(aux);
                cuvMax = aux;
            }

        }
        return cuvMax;
    }


    //todo:7. Se consideră un şir de n cuvinte. Să se determine cuvântul cel mai mic în ordine lexicografică obținut prin concatenarea a două dintre cuvintele citite.

    public void solutie7() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti  un text");
        String text = scanner.nextLine();
        String textFinal = celMaiMicCuvantCombinatInOrdineLexicografica(text);
        System.out.println(textFinal);
    }

    private String celMaiMicCuvantCombinatInOrdineLexicografica(String str) {
        String[] split = str.split(" ");
        String cuvMin = "";
        for (int i = 1; i < split.length - 2; i++) {
            String aux = split[i] + split[i + 1];
            String aux2 = split[i + 1] + split[i + 2];
            if (aux.compareTo(aux2) < 0) {
                cuvMin = aux;
            }
            else {
                cuvMin = aux2;
            }

        }
        return cuvMin;
    }


    //todo: 8.Considerăm un text de maximum 255 de caractere. Propozițiile sunt delimitate prin caracterele punct (.) sau prin semnul exclamării (!). Realizați un program care afişează fiecare propoziție pe o singură linie, fiecare cuvânt începînd cu majusculă.


    public void solutie8() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti  un text");
        String text = scanner.nextLine();
        afisarePropozitiiPeLiniiNoi(text);
    }

    private void afisarePropozitiiPeLiniiNoi(String str) {
        String[] split = str.split(".");
        for (int i = 1; i < split.length; i++) {
            System.out.println(split[i]);
        }
    }


    //todo: 9. Se consideră o listă cu n (n<100) prenume ale elevilor dintr-o clasă. Prenumele unei fete este recunoscut datorită faptului că fie are ulima literă 'a', fie este 'Carmen' sau 'Alice'. Să se creeze un program care afişează numărul fetelor din clasă şi cel mai mare prenume în sens lexicografic ale cărui litere vor fi transformate în majuscule.

    public void solutie9() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti  un text");
        String text = scanner.nextLine();
        String solutie = "";
        solutie += nrFete(text) + transformareCuvantInMajuscule(celMaiMareNumeLexicografic(text));
        System.out.println(solutie);
    }

    private boolean esteNumeDeFata(String str) {
        if (str.contains("AnaMariaIoanaAndreeaAliceCarmen") == true) {
            return true;
        }
        return false;
    }

    private int nrFete(String str) {
        String[] split = str.split(" ");
        int nr =0;
        for (int i = 1; i < split.length; i++) {
            if (esteNumeDeFata(split[i]) == true) {
                nr++;
            }
        }
        return nr;
    }

    private String transformareCuvantInMajuscule(String  str) {
        String aux = "";
        for (int i = 0; i < str.length(); i++) {
            aux += Character.toUpperCase(str.charAt(i));
        }
        return aux;
    }

    private String celMaiMareNumeLexicografic(String str) {
        String[] split = str.split(" ");
        String cuvMax = "";
        for (int i = 1; i < split.length -1; i++) {
           if (split[i].compareTo(split[i+1]) > 0) {
               cuvMax = split[i];
           }
           else {
               cuvMax = split[i+1];
           }

        }
        return cuvMax;
    }



    //todo:Se consideră 2 cuvinte ce conțin numai litere mici. Considerăm că ultima silabă a unui cuvânt este subşirul care începe cu ultima lui vocală. Verificați dacă aceste cuvinte rimează (dacă au ultima silabă identică). Dacă un cuvânt nu conţine vocale, atunci ultima silabă este întregul cuvânt.

    public void solutie10() {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Introduceti primul cuvant");
        String cuv1 = scanner1.nextLine();

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Introduceti al doilea cuvant");
        String cuv2 = scanner2.nextLine();

        if (rimeaza(cuv1,cuv2) == true) {
            System.out.println("Cuvintele rimeaza");
        }
        else {
            System.out.println("Cuvintele nu rimeaza");
        }

    }

    private int pozitieUltimaVocala(String str) {
        int ultPoz = 0;
        for (int i = 0; i < str.length(); i++) {
            if (isVocala(str.charAt(i)) == true) {
                ultPoz = i;
            }
        }
        return ultPoz;
    }

    private String ultimaSilaba(String str) {
        String aux = "";
        for (int i = pozitieUltimaVocala(str); i < str.length(); i++) {
            aux += str.charAt(i);
        }
        return aux;
    }
    private boolean rimeaza(String cuv1, String cuv2) {
        if (ultimaSilaba(cuv1).equals(ultimaSilaba(cuv2)) == true) {
            return true;
        }
        return false;
    }




    //todo: De la tastatură se citeşte un text codificat după regula următoare: în fața fiecărui caracter este scris un număr ce reprezintă numărul de apariții consecutive al acestuia. Realizați un program care decodifică textul. Numărul ce apare în fața unui caracter va fi mai mic sau cel mult egal cu 20. /??

    public void solutie11() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti  un text");
        String text = scanner.nextLine();
        String textFinal = textDecodificat(text);
        System.out.println(textFinal);
    }

    public String textDecodificat(String str) {
        String aux = "";
        for (int i = 0; i < str.length()-1; i++) {
            if (i % 2 == 0) {
                if (i == 1) {
                    aux+= str.charAt(i+1);
                }
                else {
                    int ctr =0;
                    while (ctr < i) {
                        aux += str.charAt(i+1);
                        ctr++;
                    }
                }
            }
        }
        return aux;
    }



    //todo:12. Se consideră un text în care spațiul este unicul separator. Realizați un program care afişează numerele ce apar în text, despărțite prin câte un spațiu.

    public void solutie12() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti  un text");
        String text = scanner.nextLine();
        afisareDoarNumere(text);
    }

    public boolean esteNumar(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (Character.isAlphabetic(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public void afisareDoarNumere(String str) {
        String[] split = str.split(" ");
        String cuvMax = "";
        for (int i = 1; i < split.length -1; i++) {
           if (esteNumar(split[i]) == true) {
               System.out.println(split[i]);
           }
        }
    }



    //todo: 13. Se citeşte de la tastatură un şir de caractere. Realizați un program care determină cea mai lungă secvență de cifre alăturate din şir. //?


    public void solutie13() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti  un text");
        String text = scanner.nextLine();
        afisareDoarNumere(text);
    }

    public String ceaMaiLungaSecventaDeCifreAlaturate(String str) {
        String aux = "";
        for (int i = 0; i < str.length()-1; i++) {
            if (Character.isDigit(str.charAt(i)) == true && Character.isDigit(str.charAt(i+1)) == true) {
                aux+= str.charAt(i);
            }
            else if(Character.isDigit(str.charAt(i)) == true && Character.isAlphabetic(str.charAt(i+1)) == true) {
                aux+= "";
            }
            else if (Character.isAlphabetic(str.charAt(i)) == true && Character.isDigit(str.charAt(i+1)) == true) {

            }
        }
        return aux;
    }



    //todo: 14. Se doreşte ca operația Find-Replace să fie executată asupra unui text care nu conține mai mult de 255 de caractere. Această operație constă în înlocuirea tuturor aparițiilor unui subşir s1 cu un alt subşir s2. Realizați un program care simulează această operație. Şirurile s1 şi s2 nu au neapărat aceeaşi lungime


    public void solutie14() {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Introduceti  un text");
        String text = scanner1.nextLine();

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Introduceti s1");
        String s1 = scanner2.nextLine();

        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Introduceti s2");
        String s2 = scanner3.nextLine();


        String textFinal = text.replace(s1, s2);
        System.out.println(textFinal);

    }


    //todo: 15. Se consideră un şir de n cuvinte. Realizați un program care identifică toate anagramele primului cuvânt care se regăsesc în şir.

    public void solutie15() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti  un text");
        String text = scanner.nextLine();
        String textFinal = anagramelePrimuluiCuvant(text);
        System.out.println(textFinal);
    }

    private String onglindit(String str) {
        String aux = "";
        for (int i = str.length()-1; i >= 0; i--) {
            aux+= str.charAt(i);
        }
       return aux;
    }

    public String anagramelePrimuluiCuvant(String str) {
        String[] split = str.split(" ");
        String pc = split[0];
        String aux = "";
        for (int i = 1; i < split.length -1; i++) {
            if (split[i].equals(pc) || split[i].equals(onglindit(pc))) {
               aux+= split[i];
               aux+= " ";
            }
        }
        return aux;
    }



    //todo: 16. Se consideră o propoziție care are maximum 255 de caractere. Orice caracter diferit de literă este considerat separator. Realizați un program care afişează fiecare cuvânt pe o linie a ieşirii standard.

    public void solutie16() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti un text");
        String text = scanner.nextLine();
        afisrareDoarCuvinte(text);
    }

    public void afisrareDoarCuvinte(String str) {
        String[] split = str.split("[,.!?;: ]");
        for (int i =0; i < split.length; i++) {
            System.out.println(split[i]);
        }
    }



    //todo: 17. Se consideră un text de maximum 255 de caractere. Realizați un program care determină cea mai lungă secvență de litere alăturate care apar în ordine alfabetică. //?



    //todo: 18. Se consideră un text de maximum 255 de caractere. Realizați un program care determină cea mai lungă secvență de litere care reprezintă un palindrom. //?


    //todo: 19. Se consideră un text de maximum 255 de caractere litere mici sau spații. Realizați un program care rescrie textul astfel încât cuvintele să apară ordonate alfabetic. //??

    public void solutie19() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti  un text");
        String text = scanner.nextLine();
        String textFinal = reordonarePropozitieInOridneAlfabetica(text);
        System.out.println(textFinal);

    }
    public String reordonarePropozitieInOridneAlfabetica(String str) {
        String[] split = str.split(" ");
        String aux = "";
        for (int i = 0; i < split.length; i++) {
            for (int j = i + 1; j < split.length; j++) {
                if (split[i].compareTo(split[j]) > 0) {
                    aux = split[i];
                    split[i] = split[j];
                    split[j] = aux;
                }
            }
        }
        String fin = "";
        for (int k = 0; k < split.length; k++) {
            fin += split[k];
            fin += " ";
        }
        return fin;
    }


    //todo: 20. Se consideră un text de maximum 255 de caractere. Realizați un program care inversează literele fiecărui cuvânt;


    public void solutie20() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti  un text");
        String text = scanner.nextLine();
        String textFinal = inversareCuvinte(text);
        System.out.println(textFinal);
    }

    public String inversareCuvinte(String str) {
        String[] split = str.split("[,.!?;: ]");
        String aux = "";
        for (int i =0; i < split.length; i++) {
            aux+= onglindit(split[i]);
            aux+= " ";
        }
        return aux;
    }



    //todo: 21. Fie un şir cu maximum 100 de caractere alfanumerice. Să se afişeze toate subşirurile formate din două caractere alăturate care pot reprezenta un număr natural de două cifre, separate prin câte un singur spațiu.


    public void solutie21() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti  un text");
        String text = scanner.nextLine();
        String textFinal = perechiDeDouaCifre(text);
        System.out.println(textFinal);
    }

    public String perechiDeDouaCifre(String str) {
        String aux = "";
        for (int i = str.length()-1; i >= 0; i--) {
            if (Character.isDigit(str.charAt(i)) == true && Character.isDigit(str.charAt(i+1)) == true ) {
                aux+= str.charAt(i) + str.charAt(i+1);
                aux+= " ";
            }
        }
        return aux;
    }



    //todo: 22.De la tastatură se citeşte un şir de maximum 10 caractere. Realizați un program care verifică dacă acest şir poate reprezenta un număr real exprimat în forma zecimală cu 3 zecimale exacte. ///?


    //todo: 23.Creați un program care afişează numărul vocalelor dintr-o dată de tip şir de caractere împreună cu şirul obținut după ştergerea lor.

    public void solutie23() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti  un text");
        String text = scanner.nextLine();
        afisareVocaleSiStergereVocale(text);

    }

    public void afisareVocaleSiStergereVocale(String str) {
        String aux = "";
        int nr =0;
        for (int i = str.length(); i >= 0; i--) {
            if (isVocala(str.charAt(i)) == true) {
                aux+="";
                nr++;
            }
            else {
                aux+= str.charAt(i);
            }
        }
        String finAux = nr + " " + aux;
        System.out.println(finAux);
    }


    //todo: 24. Se consideră o propoziție care are maximum 250 de caractere. Ea cuprinde separator. Creați un program ce va afişa pe ecran fiecare cuvânt din propoziție pe unul sau mai mulți separatori. Orice caracter care nu este literă va fi considerat  câte o linie. Cuvintele vor avea prima literă majusculă.

    public void solutie24() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti  un text");
        String text = scanner.nextLine();
        afisareCuvintePeLiniiNoi(text);
    }

    private void afisareCuvintePeLiniiNoi(String str) {
        String[] split = str.split("[,.!?;: ]");
        for (int i = 1; i < split.length; i++) {
            System.out.println(split[i]);
        }
    }



    //todo: 25. Se citeşte de la intrarea standard un şir de maximum 200 de caractere reprezentând o propoziție. Cuvintele sunt secvenţe de litere mici sau mari ale alfabetului englezesc. Realizați un program care afişează propoziția după ce cuvintele au fost ordonate lexicografic. După fiecare cuvânt vor fi afişaţi separatorii prezenți în propoziția inițială după cuvântul cu numărul de ordine respectiv.

    public void solutie25() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti  un text");
        String text = scanner.nextLine();
        String textFinal = reordonarePropozitieInOridneAlfabetica(text);
        System.out.println(textFinal);
    }



    //todo: 26. Se consideră un şir de cel mult 100 de caractere, citit de pe prima linie a fişierului in.txt. Să se afişeze toate şirurile de caractere de lungime maximă 2*k obținute prin concatenarea prefixelor cu sufixele de aceeaşi lungime ale acestui şir.


    public void solutie26() {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Introduceti  un text");
        String text = scanner1.nextLine();

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Introduceti k ");
        int k = scanner2.nextInt();

        afisarePrefixeSiSufixeCombinate(text, k);
    }

    public void afisarePrefixeSiSufixeCombinate(String str, int k) {
        int ctr = 1;
        while (ctr <= k) {
            String aux = "";
            for (int i =0 ; i < ctr; i++) {
                aux+= str.charAt(i);
            }
            for (int j = str.length()-1; j > str.length() - ctr; j--) {
                aux+= str.charAt(j);
            }
            System.out.println(aux);
            ctr++;
        }
    }




    //todo: 27.  Fişierul in.txt conține un text dispus pe mai multe linii. Orice caracter care nu reprezintă o litera mică a alfabetului englezesc se consideră separator. Numărul de caractere ale unei linii nu depăşeşte 200. Realizați un program care afişează numărul de apariții ale unui cuvânt, preluat de la tastatură, în textul din fişier.ton


    public void solutie27() {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Introduceti  un text");
        String text = scanner1.nextLine();

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Introduceti  un cuvant");
        String cuv = scanner2.nextLine();

        int nr = nrAparitiiCuvant(text,cuv);

        String solutie = "Numarul de apartii al cuvantului " + cuv + " este: " + nr;
        System.out.println(solutie);
    }

    public int nrAparitiiCuvant(String str, String cuv) {
        int nr =0;
        String[] split = str.split("[,.!?;: ]");
        for (int i =0; i < split.length; i++) {
            if (split[i].equals(cuv) == true) {
                nr++;
            }
        }
        return nr;
    }



    //todo: 28. Conținutul fişierul virus.txt a fost deteriorat, iar valorile naturale care inițial erau separate în cadrul liniilor prin câte un singur spațiu, au acum ca separatori orice caracter ce nu reprezintă o cifră. Realizați un program care creează fişierul sum.txt în care pe fiecare linie se află suma numerelor aflate în fişierul virus.txt.

    public void solutie28() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti  un text");
        String text = scanner.nextLine();
        int s = sumaNumerelorDinFisierVirus(text);
        System.out.println(s);
    }

    public int sumaNumerelorDinFisierVirus(String str) {
        int s =0;
        String[] split = str.split("[ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz]");
        for (int i =0; i < split.length; i++) {
            //    s+= split[i]; ??
        }
        return s;
    }



    //todo: 29. Se consideră o propozitie de maximum 50 de caractere, citită de la tastatură. Să se realizeze un program care afişează propoziția după eliminarea tuturor cuvintelor de lungime p.

   public void solutie29() {
       Scanner scanner1 = new Scanner(System.in);
       System.out.println("Introduceti  un text");
       String text = scanner1.nextLine();

       Scanner scanner2 = new Scanner(System.in);
       System.out.println("Introduceti p ");
       int p = scanner2.nextInt();

       String textFinal = eliminareCuvinteDeLungimeP(text,p);
       System.out.println(textFinal);
   }


    public String eliminareCuvinteDeLungimeP(String str, int p) {
        String aux = "";
        String[] split = str.split("[,.!?;: ]");
        for (int i =0; i < split.length; i++) {
            if (lungimeCuvant(split[i]) == p) {
                aux += "";
            }
            else {
                aux+= split[i];
                aux+= " ";
            }
        }
        return aux;
    }



    //todo: 30.Fie un cuvânt de maximum 50 de caractere litere mici ale alfabetului englez. Să se afişeze toate cuvintele distincte obținute prin eliminarea unor secvente de p litere aflate pe poziții consecutive în cuvântul initial. Cuvintele afişate vor fi despărțite prin câte un spațiu.




    //todo:31. Se citesc de la tastatură două cuvinte formate doar din literele minuscule ale alfabetului englezesc. Se cere realizarea unui program care afişează:
    //         - mulţimea literelelor comune celor două cuvinte (intersecția);
    //         - mulţimea literelelor care se găsesc în unul din cele două cuvinte (reuniunea);
    //         - mulţimea literelelor care se găsesc în primul cuvânt citit şi nu apar în al doilea.


    public void solutie31() {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Introduceti un cuvant ");
        String cuv1 = scanner1.nextLine();

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("ntroduceti alt cuvant ");
        String cuv2 = scanner2.nextLine();

        System.out.println(multimeaLiterorComune(cuv1,cuv2));
        System.out.println(multimeaLiterelorCareAparMacarOdata(cuv1,cuv2));
        System.out.println(multimeaLiterelorCareAparInPrimulCuvantDarNuAlDoilea(cuv1,cuv2));

    }

    public boolean apartineCuvant(String str, char ch) {
        for (int i =0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                return true;
            }
        }
        return false;
    }

    public String multimeaLiterorComune(String cuv1, String cuv2) {
        String aux = "";
        for (int i =0; i < cuv1.length(); i++) {
            for (int j =0; j < cuv2.length(); j++) {
                if (apartineCuvant(aux,cuv1.charAt(i)) == false && apartineCuvant(aux,cuv2.charAt(j)) == false && cuv1.charAt(i) == cuv2.charAt(j)) {
                    aux += cuv1.charAt(i);
                    aux += " ";
                }
            }
        }
        return aux;
    }

    public String multimeaLiterelorCareAparMacarOdata(String cuv1, String cuv2) {
        String aux = "";
        for (int i =0; i < cuv1.length(); i++) {
            for (int j =0; j < cuv2.length(); j++) {
                if (apartineCuvant(aux,cuv1.charAt(i)) == false) {
                    aux += cuv1.charAt(i);
                    aux += " ";
                }
                if (apartineCuvant(aux,cuv2.charAt(j)) == false) {
                    aux += cuv2.charAt(j);
                    aux += " ";
                }
            }
        }
        return aux;

    }

    public String multimeaLiterelorCareAparInPrimulCuvantDarNuAlDoilea(String cuv1, String cuv2) {
        String aux = "";
        for (int i =0; i < cuv1.length(); i++) {
            if (apartineCuvant(cuv2,cuv1.charAt(i)) == false) {
                aux += cuv1.charAt(i);
                aux += " ";
            }
        }
        return aux;
    }



    //todo: 32. Fişierul in.txt conține un text, fiecare propoziție fiind dispusă pe o singură linie. Afişaţi pe ecran propoziția de lungime maximă, obținută după eliminarea tuturor secvenţelor de două caractere consecutive, ambele vocale.

    public void soutie32() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti  un text");
        String text = scanner.nextLine();
        String textFinal = elminareSecventeDeVocaleDinFiecareCuvant(text);
        System.out.println(textFinal);
    }
    public String eliminareSecventeDeDouaCaractereVocale(String str) {
        String aux = "";
        for (int i = 1; i < str.length()-1; i++) {
            if (isVocala(str.charAt(i)) == true && isVocala(str.charAt(i+1)) == true) {
                aux += "";
            }
            else if (isVocala(str.charAt(i)) == true && isVocala(str.charAt(i-1)) == true) {
                aux+= "";
            }
            else {
                aux+= str.charAt(i);
            }
        }
        return aux;
    }

    public String elminareSecventeDeVocaleDinFiecareCuvant(String str) {
        String aux = "";
        String[] split = str.split("_");
        for (int i =0; i < split.length; i++) {
           aux+= eliminareSecventeDeDouaCaractereVocale(split[i]);
           aux+="_";
        }
        return aux;
    }

}

