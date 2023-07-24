package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp
public class TeleOpModeTest extends OpMode {
    private DcMotor motor;
    private Servo servo;

    @Override
    public void init() {
        motor = hardwareMap.get(DcMotor.class, "<insert your motor name>>");
        servo = hardwareMap.get(Servo.class, "<insert your servo name");
    }

    @Override
    public void init_loop() {
        telemetry.addData("Status", "Waiting for play");
    }

    @Override
    public void start() {
        // called only once when start is pressed
    }

    @Override
    public void loop() {
        motor.setPower(gamepad1.left_stick_y);

        if (gamepad1.left_bumper) {
            servo.setPosition(.8);
        }

        if (gamepad1.right_bumper) {
            servo.setPosition(-.8);
        }

        if (gamepad1.a) {
            servo.setPosition(0);
        }
    }

    @Override
    public void stop() {
        // stop something that you might have started in start
    }
}
