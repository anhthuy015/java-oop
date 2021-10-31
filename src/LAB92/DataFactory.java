package LAB92;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class DataFactory {

    public static boolean saveBookList(List<Book> books, String path) {
        try (FileOutputStream fileOutputStream = new FileOutputStream(path);
             OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream, StandardCharsets.UTF_8);
             BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter)) {
            for (Book book : books) {
                String dataLine = book.getTitle() + ";" + book.getISBN() + ";" + book.getAuthorName() + ";" + book.getYear();
                bufferedWriter.write(dataLine);
                bufferedWriter.newLine();
            }
            return true;
        } catch (Exception exception) {
            exception.printStackTrace();
        }

        return false;
    }

    public static List<Book> readBookList(String path) {
        List<Book> books = new ArrayList<>();
        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, StandardCharsets.UTF_8);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

            String dataLIne = bufferedReader.readLine();
            while (dataLIne != null) {
                String[] bookData = dataLIne.split(";");
                String ISBN = bookData[0];

                String title = bookData[1];

                String authorName = bookData[2];

                int year = Integer.parseInt(bookData[3]);

                books.add(new Book(title, ISBN, authorName, year));

                dataLIne = bufferedReader.readLine();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return books;
    }


//    public static void readFileContent(String path) throws IOException {
//        FileInputStream fileInputStream = null;
//        InputStreamReader inputStreamReader = null;
//        BufferedReader bufferedReader = null;
//            try {
//            fileInputStream = new FileInputStream(path);
//            inputStreamReader = new InputStreamReader(fileInputStream);
//            bufferedReader = new BufferedReader(inputStreamReader);
//
//            String dataLIne = bufferedReader.readLine();
//            while (dataLIne != null) {
//                System.out.println(dataLIne);
//                dataLIne = bufferedReader.readLine();
//            }
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//                if(fileInputStream != null)
//                fileInputStream.close();
//                if(inputStreamReader != null)
//                    inputStreamReader.close();
//                if(bufferedReader != null)
//                    bufferedReader.close();
//            }
//    }

    public static void main(String[] args) throws IOException {
        String projectRootDirectory = System.getProperty("user.dir");
        final String bookDataFileName = "/book.txt";

//        List<Book> bookList = DataFactory.readBookList(projectRootDirectory + bookDataFileName);
//        for (Book book : bookList) {
//            System.out.println(book);
//        }

        List<Book> saveBookList = new ArrayList<>();
        saveBookList.add(new Book("title_01", "9999", "Name1", 1990));
        saveBookList.add(new Book("title_02", "9998", "Name2", 1991));
        saveBookList.add(new Book("title_03", "9997", "Name3", 1992));

        boolean isSavedSuccess = DataFactory.saveBookList(saveBookList, projectRootDirectory + bookDataFileName);

        if (isSavedSuccess) {
            List<Book> bookList = DataFactory.readBookList(projectRootDirectory + bookDataFileName);
            for (Book book : bookList) {
                System.out.println(book);
            }
        }
    }
}