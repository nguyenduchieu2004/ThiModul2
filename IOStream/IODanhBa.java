package IOStream;

import Model.DanhBa;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class IODanhBa {
    private static final String PATH="src/Data/DanhBa";
    public static List<DanhBa> ConvertToListDanhBa() {
        List<DanhBa> list=new ArrayList<>();
        try (
                FileReader fileReader = new FileReader(PATH);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                ) {
        String temp ;
            while((temp=bufferedReader.readLine())!=null){
            String[] arrData=temp.split(",");
            list.add(new DanhBa(
                   Integer.parseInt(arrData[0]),
                    arrData[1].trim(),
                    arrData[2].trim(),
                    arrData[3].trim(),
                    LocalDate.parse(arrData[4]),
                    arrData[5].trim(),
                    arrData[6].trim()

            ));
            }
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return list;
    }
    public static void  SaveDanhBaToFile(DanhBa danhBa){
        try (
                FileWriter filewriter=new FileWriter(PATH,true);
                BufferedWriter bufferedWriter= new BufferedWriter(filewriter);
        ) {

            bufferedWriter.write(danhBa.convertToLine());
            bufferedWriter.newLine();

        } catch (FileNotFoundException e) {
            System.out.println("Lỗi không ghi được vào file!!!");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void saveToListDanhBa(List<DanhBa> list) {
        try(
                FileWriter fileWriter =  new FileWriter(PATH);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        ){
            for(DanhBa danhBa:list) {
                bufferedWriter.write(danhBa.convertToLine());
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
