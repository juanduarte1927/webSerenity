Feature: Navigate through the site
  @OpenSite
  Scenario Outline: Navigate
    Given that the user Open the Site
    When Register their Account with personal information "<firstName>" "<lastName>" "<address>"
    And contact information "<email>" "<phone>"
    And gender information "<gender>"
    And also info about "<hobbies>" "<languages>" "<skills>"
    And the location info "<country>" "<department>"
    And "<birthday>" information
    And for last the account info "<password>"
    Then the user is registered succesfully "Register"


    Examples:
      |firstName|lastName|address|email|phone|gender|hobbies|languages|skills|country|department|birthday|password|
      |Juan|Duarte|Tra 60 # 114 a 50|jduarte@prueba.com|3192806477|Male|Hockey|Spanish|Programming|Colombia|United States of America|1991,February,25|Password123|
