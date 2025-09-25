int biletaFillestare = 100;
int shitje1 = 35;
int shitje2 = 28;
boolean bonusDitor = true;
int cmim = 40;

System.out.println("Stok fillestar: " + biletaFillestare);

biletaFillestare -= shitje1;
System.out.println("Shitje paradite: " + shitje1 + " \u2192 stok: " + biletaFillestare);

biletaFillestare -= shitje2;
System.out.println("Shitje pasdite: " + shitje2 + " \u2192 stok: " + biletaFillestare);

int totalBiletaShitura = shitje1 + shitje2;
System.out.println("Totali i biletave të shitura: " + totalBiletaShitura);

double teArdhura = totalBiletaShitura * cmim;
System.out.println("Të ardhurat bruto: " + teArdhura);

double bonus = 0;
if (bonusDitor) {
    bonus = teArdhura * 0.05;
    teArdhura += bonus;
    System.out.println("Bonus 5% i aplikuar: " + bonus);
}

System.out.println("Të ardhurat neto: " + teArdhura);

int lek = (int)Math.round(teArdhura);
System.out.println("Raporto (lek, i rrumbullakuar): " + lek);
