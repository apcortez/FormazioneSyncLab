public class Immagine extends Multimediale{
    private int luminosità;
    public Immagine(String titolo,int luminosità){
        super(titolo);
        this.luminosità = luminosità;
    }

    public int getLuminosità() {
        return luminosità;
    }

    public void setLuminosità(int luminosità) {
        this.luminosità = luminosità;
    }

    public void brighter(){
        setLuminosità(luminosità--);
        System.out.println("Luminosità alzata al "+ getLuminosità());
    }

    public void darker(){
        setLuminosità(luminosità--);
        System.out.println("Luminosità abbassata al "+getLuminosità());
    }

    public void show() {
        try {
            if (luminosità > 0) {
                System.out.print(getTitolo());
                for (int i = 0; i < luminosità; i++) {
                    System.out.print("*");

                }System.out.println();
            }

        } catch (Exception e) {
            System.out.println("Data error!");
        }
    }
}