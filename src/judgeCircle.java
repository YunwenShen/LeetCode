/**
 * 657. 机器人能否返回原点
 *
 * @author ShenYunWen
 **/
public class judgeCircle {

    public boolean func(String moves) {
        int[] OPoint = new int[]{0,0};
        String[] moveArray = moves.split("");
        for (String move: moveArray) {
            switch (move) {
                case "L":
                    OPoint[1] = OPoint[1] - 1;
                    break;
                case "R":
                    OPoint[1] = OPoint[1] + 1;
                    break;
                case "U":
                    OPoint[0] = OPoint[0] + 1;
                    break;
                default:
                    OPoint[0] = OPoint[0] - 1;
                    break;
            }
        }
        return OPoint[0] == 0 && OPoint[1] == 0;
    }
}
