package com.im.test

import spock.lang.Specification
import spock.lang.Unroll

class TransactionSpec extends Specification {


    def "Sell product"() {
        given:
        Product product = new Product(price: 500);

        and:
        User user = new User(balance: 1000);

        and:
        Transaction transaction = new Transaction();

        when:
        transaction.sell(product, user);

        then:
        notThrown(SaleException);
    }


    def "CancelSale"() {
        given:
        Product product = new Product(name: 'Product A', price: 500);

        and:
        User user = new User(balance: 1000);

        and:
        Transaction transaction = new Transaction();

        and:
        def emailService = Mock(EmailService);
        transaction.emailService = emailService;


        when:
        transaction.cancelSale(product, user);

        then:
        emailService.sendCancellationEmail(user, _ as String);
    }


    @Unroll
    def "CalculateDiscount:privillegedUser #isPrivellegedCustomer and discountType : #discountType"() {
        given:
        User user = new User(isPrivellegedCustomer: isPrivellegedCustomer);

        and:
        Product product = new Product(discountType: discountType, price: 500);

        and:
        Transaction transaction = new Transaction();

        when:
        BigDecimal calculatedDiscount = transaction.calculateDiscount(product, user);

        then:
        calculatedDiscount == result

        where:
        isPrivellegedCustomer | discountType                 | result
        true                  | DiscountType.NONE            | 0
        true                  | DiscountType.PRIVELLEGE_ONLY | 150
        false                 | DiscountType.PRIVELLEGE_ONLY | 50
        false                 | DiscountType.NONE            | 0
        null                  | null                         | 0

    }


}
