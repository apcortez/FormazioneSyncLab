public class Audio extends Multimediale implements oggettovolume, play {
    private int durata;
    private int volume;

    public Audio(String titolo, String tipo,int durata, int volume){
        super(titolo,tipo);
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

    public void show() {

    }

    @Override
    public void louder(int n) {
        volume = volume+n;
        System.out.println("Volume alzato al "+volume);
    }

    @Override
    public void weaker(int n) {
        volume = volume -n;
        System.out.println("Volume abbassato al "+ volume);

    }
}
