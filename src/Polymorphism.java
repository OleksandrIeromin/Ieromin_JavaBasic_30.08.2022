public class Polymorphism {

// Сделайте класс MusicStyles, который будет содержать метод playMusic()
    public class MusicStyles{

    public static String groupName;

    MusicStyles (String groupName) {
        this.groupName=groupName;

    }
    void playMusic(){
        System.out.println("﴾͡๏̯͡๏﴿");
}
//Сделайте его наследников: PopMusic, RockMusic, и ClassicMusic.
        public class PopMusic extends MusicStyles {
    PopMusic(String groupName) {
        super(groupName);
    }

    //Наследники должны по-своему реализовывать метод playMusic().
            @Override
            public void playMusic() {
                System.out.println("(•_•)");
            }
        }
        public class RockMusic extends MusicStyles {
            RockMusic(String groupName) {
                super(groupName);
            }

            @Override
            public void playMusic() {
                System.out.println("(ノಠ益ಠ)ノ彡┻━┻");
            }
        }
    public class ClassicMusic extends MusicStyles {
        ClassicMusic(String groupName) {
            super(groupName);
        }

        @Override
        public void playMusic() {
            System.out.println("ヾ(⌐■_■)ノ♪");
        }
    }



    }

//В мейн-классе создайте музыкальные группы для каждого стиля
    public void main(String[] args) {
        MusicStyles justinBieber = new MusicStyles("Justin Bieber");
        justinBieber.playMusic();
    }
}
