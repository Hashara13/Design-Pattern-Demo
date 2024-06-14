/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hashara
 */
import java.util.Scanner;

interface AudioContent {

    void play();
}

class Song implements AudioContent {

    @Override
    public void play() {
        System.out.println("Playing a song...");
    }
}

class Podcast implements AudioContent {

    @Override
    public void play() {
        System.out.println("Playing a podcast...");
    }
}

// Factory Class
class Factory {

    public static AudioContent getAudio(String audioType) {
        if (audioType == null) {
            return null;
        } else if (audioType.equalsIgnoreCase("Song")) {
            return new Song();
        } else if (audioType.equalsIgnoreCase("Podcast")) {
            return new Podcast();
        } else {
            return null;
        }
    }
}

// User Class
public class FactoryMethod {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("Enter the type of Audio Content (Song / Podcast) or type 'exit' to quit:");
            String audio = scanner.nextLine();

            if (audio.equalsIgnoreCase("exit")) {
                exit = true;
                System.out.println("Exiting the program...");
            } else {
                
                Factory obj01 = new Factory(); 
                AudioContent obj02 = Factory.getAudio(audio);
                
                if (obj02 != null) {
                    obj02.play();
                } else {
                    System.out.println("Invalid audio type. Please try again.");
                }
            }
        }

        scanner.close();
    }
}
