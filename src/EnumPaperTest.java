enum PaperMoney{
    ONE_YUAN,
    FIVE_YUAN,
    TEN_YUAN,
    TWENTY_YUAN,
    FIFTY_YUAN,
    ONE_HUNDRED
}

public class EnumPaperTest {
    public static void main(String[] args){
        PaperMoney[] moneyArr = PaperMoney.values();

        for (PaperMoney money : moneyArr){
            System.out.println("枚举常量："+money+",ordinal序号："+money.ordinal());
        }
    }
}
