public class FlourPackProblem {
    public static boolean canPack(int bigCount, int smallCount, int goal){
        if ((bigCount*5) + (smallCount*1) == goal){
            return true;
        }
        return false;
    }
}
