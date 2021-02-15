public class Filmato extends Audio{
    private int luminosità;
    public Filmato(String titolo, int durata, int volume,int luminosità){
        super(titolo,durata,volume);
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

    }

