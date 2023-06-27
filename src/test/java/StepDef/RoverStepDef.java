package StepDef;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Rover;

public class RoverStepDef {
    Rover roverObj = new Rover();
    int position = 0;

    @Given("Set rover position at {int} {int} and {string}")
    public void set_rover_position_at_and(Integer xAxis, Integer yAxis, String roverPosition){
        position = roverObj.covertCharToIntegerValue(roverPosition.charAt(0));
        roverObj.setPosition(xAxis,yAxis,position);

    }

    @When("Process the rover in following {string}")
    public void process_the_rover_in_following(String roverMovingDirections) {
        roverObj.process(roverMovingDirections);
    }

    @Then("Print rover position")
    public void print_rover_position() {
        System.out.println("Position of rover: ");
        roverObj.printPosition();
    }
}
