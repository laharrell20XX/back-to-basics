public class TakeWalk {
    public static void main(String[] args) {
        char[] walk1 = {'n'};
        char[] walk2 = {'n','n','n','n','n','s','s','s','s','s'};
        char[] walk3 = {'n', 'n', 'w', 'w', 'n', 's', 'e', 'e', 's', 's'};
        char[] walk4 = {};
        char[] walk5 = {'n', 'n', 'n', 'n', 'n', 'w', 'e', 's', 'e', 'n'};
        System.out.println(takeWalk(walk1) + " false");
        System.out.println(takeWalk(walk2) + " true");
        System.out.println(takeWalk(walk3) + " true");
        System.out.println(takeWalk(walk4) + " false");
        System.out.println(takeWalk(walk5) + " false");
    }
    public static boolean takeWalk(char[] walk){
        int walkLength = walk.length;
        if (walkLength < 10){
            return false;
        }
        else {
            int posX = 0;
            int posY = 0;
            for (var i = 0; i < walkLength; i++) {
                char cur_step = walk[i];
                switch (cur_step) {
                    case 'n':
                        posY += 1;
                        break;
                    case 'e':
                        posX += 1;
                        break;
                    case 's':
                        posY -= 1;
                        break;
                    case 'w':
                        posX -= 1;
                        break;
                }
            }
            return checkWalk(posX, posY);
        }

    }

    public static boolean checkWalk(int posX, int posY){
        if (posX == 0 && posY == 0){
            return true;
        }
        return false;

    }
}
