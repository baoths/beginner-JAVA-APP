package Database;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

import Control.printDAO;
import Entity.GiaoDich;

public class printGDDAOFile implements printDAO{
    private File fileData = null;

    public printGDDAOFile(String fileName){
        this.fileData = new File(fileName);
    }

    public ArrayList<GiaoDich> getDSGD(){
        FileInputStream fileStream = null;
        ObjectInputStream oIS = null;
        ArrayList<GiaoDich> dsGD = null;

        try {

            fileStream = new FileInputStream(fileData);
            oIS = new ObjectInputStream(fileStream);

            dsGD = (ArrayList<GiaoDich>) oIS.readObject();

            oIS.close();
            fileStream.close();

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (EOFException eofException) {
		    System.out.println("eofException catched");
		}catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return dsGD;
    }

}
