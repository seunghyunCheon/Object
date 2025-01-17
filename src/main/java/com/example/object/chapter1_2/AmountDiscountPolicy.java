package com.example.object.chapter1_2;

public class AmountDiscountPolicy extends DiscountPolicy {
    private Money discountAmount;

    public AmountDiscountPolicy(Money discountAmount, DiscountCondition ... conditions) {
        super(conditions);
        this.discountAmount = discountAmount;
    }

    @Override
    Money getDiscountAmount(Screening screening) {
        return discountAmount;
    }
}
