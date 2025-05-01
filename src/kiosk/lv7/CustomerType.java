package kiosk.lv7;

import java.util.stream.IntStream;

public enum CustomerType {
    NMP("국가유공자", 10),
    MILITARY("군인",5),
    STUDENT("학생",3),
    GENERAL("일반",0);

    private final int discountRate;
    private final String customerType;

    CustomerType(String customerType, int discountRate){
        this.customerType = customerType;
        this.discountRate = discountRate;
    }


    // Enum값 getter
    public String getCustomerType() {
        return customerType;
    }

    public int getDiscountRate() {
        return discountRate;
    }

    // Enum 활용 > 할인 대상자 조회
    public static void printDiscountType() {
        System.out.println("===============================");
        IntStream.range(0,CustomerType.values().length)
                .mapToObj(num -> (num+1) + ". " + CustomerType.values()[num].getCustomerType())
                .forEach(System.out::println);
    }


}
