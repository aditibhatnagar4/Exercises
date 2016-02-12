package com.im.test

import groovy.util.logging.Slf4j
import spock.lang.Specification
import spock.lang.Unroll


@Slf4j
class UserSpec extends Specification {


    @Unroll
    def "For User with (#firstName, #lastName) the full name should be '#fullName' "() {

        log.info "Create a user "
        User user = new User(firstName: firstName, lastName: lastName)

        expect:
        log.info "Checking user's full name"
        user.getFullName() == fullName

        where:
        firstName | lastName    || fullName
        "Aditi"   | "Bhatnagar" || "Aditi Bhatnagar"
        null      | null        || ""
        null      | "Bhatnagar" || ""

    }


    @Unroll
    def "For User with (#firstName, #lastName) the name should be dislayed as 'Mr/Ms#fullName' "() {

        log.info "Create a user "
        User user = new User(firstName: firstName, lastName: lastName, gender: gender)

        expect:
        log.info "Checking user's full name"
        user.displayName() == displayName

        where:
        firstName | lastName    | gender   || displayName
        "Aditi"   | "Bhatnagar" | "Female" || "MsAditi Bhatnagar"
        null      | null        | null     || ""
        null      | "Bhatnagar" | "Female" || "MsBhatnagar"
        "Aditi"   | null        | "Female" || "MsAditi"
        "Aditi"   | "Bhatnagar" | null     || ""

    }


    @Unroll
    def "User's password validated"() {
        given: "A user's password"
        User user = new User(password: password)

        expect:
        user.isValidPassword(user.password) == result

        where:
        password | result
        123456   | false
        1234567  | false
        12345678 | true
        null     | false
        ""       | false
    }


    def "test that reset password is resetting password and sending email"() {
        User user = [encyryptPassword: { log.info "encryptPassword called" }] as User

        user.emailService = Mock(EmailService) {
            1 * sendCancellationEmail(user, _ as String)
        }

        expect:
        user.resetPasswordAndSendEmail() == "dummy"


    }


    @Unroll("Testing encrypt password for '#password' ")

    def "encrypt password"() {
        setup:
        User user = new User()

        user.passwordEncrypterService = Mock(PasswordEncrypterService) {
            encrypt(_) >> { result }
        }


        when:
        String output = user.encyryptPassword(password)

        then:
        output != password

        where:
        password  | result
        "test"    | null
        "testqqq" | "ok"

    }

    @Unroll
    def "Get income groups"() {
        given: "A user"
        User user = new User(incomePerMonth: incomePerMonth)

        expect:
        user.getIncomeGroup() == group

        where:
        incomePerMonth | group
        5000           | "MiddleClass"
        0              | "MiddleClass"
        null           | "null"
        1000           | "Higher MiddleClass"


    }

    def "Purchase"() {
        given:
        User user = new User(purchasedProducts: [])

        and:
        Product product = new Product()

        when:
        user.purchase(product)

        then:
        user.purchasedProducts.contains(product) == true
    }

    def "CancelPurchase"() {
        given:
        Product product = new Product()

        and:
        User user = new User(purchasedProducts: [product])

        when:
        user.cancelPurchase(product)

        then:
        user.purchasedProducts.contains(product) == false
    }

    def "GetSortedInterestedInCategories"() {
        given:
        def user = Spy(User);
        user.getInterestedInCategories() >> ['u', 'j', 'l'];

        when:
        def sortedCategories = user.getSortedInterestedInCategories()

        then:
        sortedCategories == ['j', 'l', 'u'];
    }


}
