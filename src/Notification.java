package homesafe.digital;

import javafx.scene.control.TextField;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class Notification extends TextField {
    private AccessSafe safe;

    public Notification(Double width, Double height, AccessSafe safe){
        this.safe = safe;
        setup(width,height,this);
    }

    private void setup(Double width, Double height, Notification display){
        this.setMaxWidth(width);
        this.setMinWidth(width);
        this.setMaxHeight(height);
        this.setMinHeight(height);
        display.setFocusTraversable(false);
        display.appendText("enter pin");
        display.setEditable(false);
        display.setFont(Font.font("Helvetica", FontWeight.BOLD,30));
        display.setStyle("-fx-background-radius: 10px; -fx-background-color: #000000; -fx-text-fill: #08E023; -fx-border: 20px; -fx-border-radius: 10px; -fx-border-color: #ffffff; -fx-alignment: center-left");
    }

    public void accessGranted(){
        this.safe.getDoor().getSensor().releaseMotor();
        this.setFont(Font.font("Helvetica", FontWeight.BOLD,25));
        this.appendText("Access Granted!");
        this.setFont(Font.font("Helvetica", FontWeight.BOLD,30));
    }


    public void accessDenied() {
        this.clear();
        this.setFont(Font.font("Helvetica", FontWeight.BOLD,25));
        this.appendText("Access Denied!");
        this.safe.getCode().incrementAccessCount();
        this.setFont(Font.font("Helvetica", FontWeight.BOLD,30));
    }

    public void oldPassword(){
        this.clear();
        this.setFont(Font.font("Helvetica", FontWeight.BOLD,25));
        this.appendText("enter old password:");
        this.setFont(Font.font("Helvetica", FontWeight.BOLD,30));
    }

    public void newPassword(){
        this.clear();
        this.setFont(Font.font("Helvetica", FontWeight.BOLD,25));
        this.appendText("enter new password:");
        this.setFont(Font.font("Helvetica", FontWeight.BOLD,30));
    }

    public void tryAgain(){
        this.clear();
        this.setFont(Font.font("Helvetica", FontWeight.BOLD,25));
        this.appendText("try again:");
        this.setFont(Font.font("Helvetica", FontWeight.BOLD,30));
    }

    public void confirmPassword() {
        this.clear();
        this.setFont(Font.font("Helvetica", FontWeight.BOLD,25));
        this.appendText("confirm password:");
        this.setFont(Font.font("Helvetica", FontWeight.BOLD,30));
    }

    public void resetComplete(String pinDisplay) {
        this.clear();
        this.setFont(Font.font("Helvetica", FontWeight.BOLD,25));
        this.appendText("reset complete!");
        this.setFont(Font.font("Helvetica", FontWeight.BOLD,30));
        this.safe.getPwd().setText(pinDisplay);
    }

    public void overrideComplete(String pinDisplay){
        this.clear();
        this.setFont(Font.font("Helvetica", FontWeight.BOLD,25));
        this.appendText("override complete!");
        this.safe.getTimer().lockTimer();
        this.setFont(Font.font("Helvetica", FontWeight.BOLD,30));
        this.safe.getPwd().setText(pinDisplay);
    }

    public void doorIsClosed(){
        this.clear();
        this.setFont(Font.font("Helvetica", FontWeight.BOLD,25));
        this.appendText("unlock door first!");
        this.setFont(Font.font("Helvetica", FontWeight.BOLD,30));
    }

    public void doorIsOpen(){
        this.clear();
        this.setFont(Font.font("Helvetica", FontWeight.BOLD,25));
        this.appendText("Door is open!");
        this.setFont(Font.font("Helvetica", FontWeight.BOLD,30));
    }

    public void timeout(){
        this.safe.getTimer().getTimeline().stop();
        this.clear();
        this.setFont(Font.font("Helvetica", FontWeight.BOLD,25));
        this.appendText("timeout!");
        this.setFont(Font.font("Helvetica", FontWeight.BOLD,30));
    }

    public void safeLock(){
        this.safe.getTimer().getTimeline().stop();
        this.clear();
        this.setFont(Font.font("Helvetica", FontWeight.BOLD,25));
        this.appendText("Lock set!");
        this.setFont(Font.font("Helvetica", FontWeight.BOLD,30));
    }

    public void lockOut(){
        this.clear();
        this.setFont(Font.font("Helvetica", FontWeight.BOLD,25));
        this.appendText("Lock out 15s!");
        this.setFont(Font.font("Helvetica", FontWeight.BOLD,30));
    }

    public void enterPin(){
        this.clear();
        this.setFont(Font.font("Helvetica", FontWeight.BOLD,25));
        this.appendText("enter pin:");
        this.setFont(Font.font("Helvetica", FontWeight.BOLD,30));
    }

    public void unlocked(){
        this.clear();
        this.setFont(Font.font("Helvetica", FontWeight.BOLD,25));
        this.appendText("Unlocked!");
        this.setFont(Font.font("Helvetica", FontWeight.BOLD,30));
    }
}
