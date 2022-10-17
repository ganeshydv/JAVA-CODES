//import java.io.File;
//import java.io.FileWriter;
//
//public class CSV_file {
//    public static void writeDataLineByLine(String filePath)
//    {
//        // first create file object for file placed at location
//        // specified by filepath
//        File file = new File(filePath);
//        try {
//            // create FileWriter object with file as parameter
//            FileWriter outputfile = new FileWriter(file);
//
//            // create CSVWriter object filewriter object as parameter
//            CSVWriter writer = new CSVWriter(outputfile);
//
//            // adding header to csv
//            String[] header = { "Name", "Class", "Marks" };
//            writer.writeNext(header);
//
//            // add data to csv
//            String[] data1 = { "Aman", "10", "620" };
//            writer.writeNext(data1);
//            String[] data2 = { "Suraj", "10", "630" };
//            writer.writeNext(data2);
//
//            // closing writer connection
//            writer.close();
//        }
//        catch (IOException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
//    }
//
//}
