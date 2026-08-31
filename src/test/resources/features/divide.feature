Feature: División de números

  Como usuario
  Quiero realizar una división
  Para obtener el resultado de dividir dos números

  Scenario: Dividir dos números correctamente
    Given que tengo el número 10 y el número 2
    When realizo la división
    Then el resultado debe ser 5

  Scenario Outline: Dividir diferentes números correctamente
    Given que tengo el número <dividendo> y el número <divisor>
    When realizo la división
    Then el resultado debe ser <resultado>

    Examples:
      | dividendo | divisor | resultado |
      | 10        | 2       | 5         |
      | 20        | 4       | 5         |
      | 15        | 3       | 5         |