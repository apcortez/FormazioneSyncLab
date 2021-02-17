public class Filmato extends Audio implements oggettoluminosità{
    private int luminosità;
    public Filmato(String titolo, String tipo,int durata, int volume,int luminosità){
        super(titolo,tipo,durata,volume);
        this.luminosità = luminosità;
    }

    public int getLuminosità() {
        return luminosità;
    }

    public void setLuminosità(int luminosità) {
        this.luminosità = luminosità;
    }

    @Override
    public void play() {
        try{
            if(getDurata()>0){
                for(int i =0; i<getDurata(); i++){
                    System.out.print(getTitolo());
                    if (getVolume()>0 && luminosità>0){
                        for (int j =0; j<getVolume(); j++){
                            System.out.print("!");
                        }
                        for (int j =0; j<luminosità;j++){
                            System.out.print("*");

                        }
                    } System.out.println();
                }
            }

        }catch (Exception e){
            System.out.println("Data error! Riesegui il programma");
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

