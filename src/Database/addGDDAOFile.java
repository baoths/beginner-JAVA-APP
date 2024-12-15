package Database;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import Entity.GiaoDich;

public class addGDDAOFile {
    private File fileData = null;
    private List<GiaoDich> tempData = null;

    public addGDDAOFile(String fileName){
        fileData = new File(fileName);
    }

    public void addGD(GiaoDich gd){
        FileOutputStream fileStream = null;
        ObjectOutputStream os = null;

        try {
            readDataToListFromFile();
            fileStream = new FileOutputStream(fileData);
            os = new ObjectOutputStream(fileStream);
            this.tempData.add(gd);
            os.writeObject(tempData);
            os.close();
            fileStream.close();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void readDataToListFromFile(){
        FileInputStream fileStream = null;
        ObjectInputStream oIS = null;
        
        try {
            fileStream = new FileInputStream(fileData);
            oIS = new ObjectInputStream(fileStream);

            this.tempData = (List<GiaoDich>) oIS.readObject();

            oIS.close();
            fileStream.close();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (EOFException eofException) {
			System.out.println("End of File.");
			if(tempData == null) {
				tempData = new ArrayList<GiaoDich>();
			}
		} catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
