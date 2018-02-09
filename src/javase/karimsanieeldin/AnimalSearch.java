/*
 * Name: Karim Sanieeldin
 * Date: 22/12/16
 * Version: 1.0
 * Description: This program reads animals.xml, and displays which elements meet a question's criteria in the .xml file.
 */
package javase.karimsanieeldin;

import java.io.File;
import nu.xom.Builder;
import nu.xom.Document;
import nu.xom.Element;
import nu.xom.Elements;

/**
 *
 * @author 1sanieeldkar
 */
public class AnimalSearch {

    static Document animalData;
    static Element animals;
    static Elements species;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //
        File file = new File("animals.xml");
        Builder builder = new Builder();
        try {
            animalData = builder.build(file);
            animals = animalData.getRootElement();
            species = animals.getChildElements();
        } catch (Exception e) {
        }

        //Question 1
        System.out.println("Question 1:");
        for (int i = 0; i < species.size(); i++) {
            if (species.get(i).getFirstChildElement("diet").getValue().equals("Carnivore")) {
                System.out.println(species.get(i).toXML());
            }
        }
        
        //Question 2
        System.out.println("\nQuestion 2:");
        for (int i = 0; i < species.size(); i++) {
            if (species.get(i).getFirstChildElement("flying").getValue().equals("Yes")) {
                System.out.println(species.get(i).getFirstChildElement("animalName").toXML());
            }
        }
        
        //Question 3
        System.out.println("\nQuestion 3:");
        for (int i = 0; i < species.size(); i++) {
            if (species.get(i).getFirstChildElement("habitat").getValue().equals("North America")) {
                System.out.println(species.get(i).toXML());
            }
        }
        
        //Question 4
        System.out.println("\nQuestion 4:");
        for (int i = 0; i < species.size(); i++) {
            if (species.get(i).getFirstChildElement("diet").getValue().equals("Herbivore")) {
                System.out.println(species.get(i).toXML());
            }
        }
        
        //Question 5
        System.out.println("\nQuestion 5:");
        for (int i = 0; i < species.size(); i++) {
            if (species.get(i).getFirstChildElement("habitat").getValue().equals("South America")) {
                System.out.println(species.get(i).getFirstChildElement("animalName").getValue());
            }
        }
        
        //Question 6
        System.out.println("\nQuestion 6:");
        for (int i = 0; i < species.size(); i++) {
            if (species.get(i).getFirstChildElement("flying").getValue().equals("No")) {
                System.out.println(species.get(i).getFirstChildElement("animalName").toXML());
            }
        }
        
        //Question 7
        System.out.println("\nQuestion 7:");
        for (int i = 0; i < species.size(); i++) {
            if (species.get(i).getFirstChildElement("diet").getValue().equals("Omnivore")) {
                System.out.println(species.get(i).toXML());
            }
        }
        
    }

}
