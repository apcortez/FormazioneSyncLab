public class Audio extends Multimediale{
    private int durata;
    private int volume;

    public Audio(String titolo, int durata, int volume){
        super(titolo);
        this.durata = durata;
        this.volume = volume;
    }
    public int getDurata() {
        return durata;
    }

    public int getVolume() {
        return volume;
    }

    public void setDurata(int durata) {
        this.durata = durata;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void play(){
        try{
                if(durata>0){
                for(int i =0; i<durata; i++){
                    System.out.print(getTitolo());
                    if (volume>0){
                    for (int j =0; j<volume; j++){
                        System.out.print("!");

                    }System.out.println();
                    }
                }
                }

        }catch (Exception e){
            System.out.println("Data error!");
        }
    }
    public void louder(){
        setVolume(volume++);
        System.out.println("Volume alzato: "+getVolume());
    }
    public void weaker(){
        setVolume(volume--);
        System.out.println("Volume diminuito: "+getVolume());
    }
}
