Feature: check own available publications
  Authorised User would like to check his publications on myProfile page

  Scenario: success
    Given Authorised user have a publication
    When He click the button myProfile
    Then He see profile page with his publication
