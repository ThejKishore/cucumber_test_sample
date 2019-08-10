Feature: FizzBizz Game testing


  Scenario: If user provides a number which is a multiple of 3
    Given  A user provide a number which is 3
    Then The result should be "Fizz"

  Scenario:  If user provides a number which is a multpile of 5
    Given  A user provide a number which is 5
    Then The result should be "Bizz"

  Scenario:  If user provides a number which is a multpile of 5 and 3
    Given  A user provide a number which is 15
    Then The result should be "FizzBizz"

  Scenario:  If user provides a number which is a less than 1
    Given  A user provide a number which is 0
    Then The result should be "only non negative number greater than 0 is alllowed"