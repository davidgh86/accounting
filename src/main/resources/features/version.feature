Feature: new employee resource with cadastre ref
  Scenario: create employee resource with valid cadastre ref size equals to 14
    When I create a new employee with cadastreRef "1234567890ABCD"
    Then a new employee is created with cadastreRef "1234567890ABCD"
    
  Scenario: create employee resource with valid cadastre ref size equals to 20
    When I create a new employee with cadastreRef "1234567890ABCD7856ND"
    Then a new employee is created with cadastreRef "1234567890ABCD7856ND"
    
  Scenario: create employee resource with cadastre ref size not equals to 14 or 20
	When I create a new employee and the size of the cadastre ref. is not 14 or 20
	Then an error of not created employee is shown  