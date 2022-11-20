public class DemoRobotSimulation {

    public static void main(String[] args) {
        Robot robot = new Robot();

        WalkForward walkForward = new WalkForward(robot);
        Stop stop = new Stop(robot);
        TurnLeft turnLeft = new TurnLeft(robot);
        TurnRight turnRight = new TurnRight(robot);
        GoBackward goBackward = new GoBackward(robot);


        CommandHandler commandHandler = new CommandHandler();
        commandHandler.takeCommand(walkForward);
        commandHandler.takeCommand(stop);
        commandHandler.takeCommand(turnLeft);
        commandHandler.takeCommand(turnRight);
        commandHandler.takeCommand(goBackward);
        commandHandler.takeCommand(stop);
        commandHandler.takeCommand(turnLeft);
        commandHandler.takeCommand(walkForward);

        commandHandler.executeCommand();
    }
}
