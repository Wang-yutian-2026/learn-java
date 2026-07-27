enum PaperMoney{
    ONE_YUAN,
    FIVE_YUAN,
    TEN_YUAN,
    TWENTY_YUAN,
    FIFTY_YUAN,
    ONE_HUNDRED_YUAN
}

public class EnumPaperTest {
    public static void main(String[] args){

        for (PaperMoney money : PaperMoney.values()){
            System.out.println("枚举值：："+money+"->描述：");
            switch (money){
                case ONE_YUAN:
                    System.out.println("1元人民币纸币");
                    break;
                case FIVE_YUAN:
                    System.out.println("5元人民币纸币");
                    break;
                case TEN_YUAN:
                    System.out.println("10元人民币纸币");
                    break;
                case TWENTY_YUAN:
                    System.out.println("20元人民币纸币");
                    break;
                case FIFTY_YUAN:
                    System.out.println("50元人民币纸币");
                    break;
                case ONE_HUNDRED_YUAN:
                    System.out.println("100元人民币纸币");
                    break;
                default:
                    System.out.println("未知面值纸币");
            }
        }
    }
}
