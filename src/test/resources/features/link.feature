Feature: Links

  @LinksInNaviBar
  Scenario:Checking links in the navigation bar
    Given  User launches Chrome browser
    When User opens ilcarro HomePage
    Then User should see five links in the navigation bar
    | Log in |
    | Sign up |
    | Terms of use |
    | Let the car work |
    | Search |

