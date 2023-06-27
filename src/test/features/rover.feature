Feature: This feature is used to test Rover functionality

  Scenario Outline: Test for Rover direction facing and positioning initialisation
    Given Set rover position at <x-axis> <y-axis> and "<position>"
    When Process the rover in following "<directions>"
    Then Print rover position

    Examples:
    |x-axis|y-axis| position| directions  |
    |   1  |  2   | N       |  LMLMLMLMM  |
    |   3  |  3   | E       |  MMRMMRMRRM |
   # | 2    |  4   | W       |   MMRF      |

