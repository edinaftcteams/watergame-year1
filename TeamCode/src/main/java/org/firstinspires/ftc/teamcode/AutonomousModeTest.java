package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

@Autonomous
public class AutonomousModeTest extends LinearOpMode {

    @Override
    public void runOpMode() throws InterruptedException {
        DcMotor motor = null;
        Servo servo = null;

        motor = hardwareMap.get(DcMotor.class, "<insert your motor name>>");
        servo = hardwareMap.get(Servo.class, "<insert your servo name");

        waitForStart();

        if (opModeIsActive()) {
            motor.setPower(1);

            sleep(4000);

            motor.setPower(-1);

            servo.setPosition(.8);

            sleep(4000);

            motor.setPower(0);

            servo.setPosition(-.8);

            telemetry.addData("Status", "Done");
            telemetry.update();

            while (opModeIsActive()) {
                idle();
            }
        }
    }
}
