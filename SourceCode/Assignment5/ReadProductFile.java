package oamk.stream;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.time.LocalDateTime;

public class ReadProductFile {
    private File dataFile;
    private List<Product> products = new LinkedList<Product>();

    public ReadProductFile(String fileName){
        dataFile = new File(fileName);

        if (!dataFile.exists()) {
           throw new IllegalArgumentException();
        }

        System.out.println(dataFile.exists());
    }

    public List<Product> getProducts(){
        return products;
    }

    public void readCSV() throws IOException, CSVMissingParameterException{
        BufferedReader reader = new BufferedReader(new FileReader(dataFile.getPath()));
        String line;
        String testArray[] = {"", "", "", ""};
        int i = 0;
        while ((line = reader.readLine()) != null) {
            i++;
            try {
                testArray = line.split(",",4);
                
                for (String string : testArray) {
                    System.out.println(string);
                    if(string == "")
                        throw new CSVMissingParameterException("Error in " + dataFile.getName() + ", skipped line " + i + ": missing parameter");
                }
                if(testArray.length != 4)
                    throw new CSVMissingParameterException("Error in " + dataFile.getName() + ", skipped line " + i + ": missing parameter");
                
                String name = testArray[0];
                Double price = Double.parseDouble(testArray[1]);
                String category = testArray[2];
                LocalDateTime bestBefore = LocalDateTime.parse(testArray[3]);
        
                products.add(new Product(name, price, category, bestBefore));
            } catch (Exception e) {
                e.getMessage();
                e.printStackTrace();
            }
        }

        reader.close();
    }

    public class CSVMissingParameterException extends Exception{
        public CSVMissingParameterException(String message){
            super(message);
        }
    }
}