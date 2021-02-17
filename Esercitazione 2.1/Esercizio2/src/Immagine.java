public class Immagine extends Multimediale implements oggettoluminosità{
    private int luminosità;

    public Immagine(String titolo,String tipo, int luminosità) {
        super(titolo,tipo);
        this.luminosità = luminosità;
    }



    public void show() {
        try {
            if (luminosità > 0) {
                System.out.print(titolo);
                for (int i = 0; i < luminosità; i++) {
                    System.out.print("*");

                }System.out.println();
            }

        } catch (Exception e) {
            System.out.println("Data error!");
        }
    }

    @Override
    public void brighter(int n) {
        luminosità = luminosità + n;
        System.out.println("Luminosità alzata al "+ luminosità);
    }

    @Override
    public void darker(int n) {
        luminosità = luminosità -n;
        System.out.println("Luminosità abbassata al "+ luminosità);

    }
}