/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hashara
 */
abstract class GoogleDrive {

    abstract void chooseFile();

    abstract void performAction();

    void check_Authentication() {
        System.out.println("Authenticating with Google Drive.");
    }

    void finish_Operation() {
        System.out.println("Close the Tab.");
    }

    public final void operation() {
        check_Authentication();
        chooseFile();
        performAction();
        finish_Operation();
    }
}

class Upload extends GoogleDrive {

    @Override
    void chooseFile() {
        System.out.println("Choose File from loacal Files to Upload");
    }

    @Override
    void performAction() {
        System.out.println("Press Open Button to Upload.");
    }

}

class Download extends GoogleDrive {

    @Override
    void chooseFile() {
        System.out.println("Choose File from Drive Files to Download");
    }

    @Override
    void performAction() {
        System.out.println("Press Download Button for save to local files.");
    }

}

// User class
public class TemplateMethod {

    public static void main(String[] args) {
        GoogleDrive obj1 = new Download();
        GoogleDrive obj2 = new Upload();

        System.out.println("....Steps to Upload a File....");
        obj1.operation();

        System.out.println();

        System.out.println("....Steps to Download a File....");
        obj2.operation();

    }
}
