public class BonusMilesService {
    public int calculate(int cost) {
        int oneMileBonus = 20;
        int totalMileBonus = cost / oneMileBonus;

        return totalMileBonus;
    }
}
