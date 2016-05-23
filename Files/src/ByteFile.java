import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.IOException;
public class ByteFile {

	public static void main(String[] args) {
		try{
			FileOutputStream fs=new FileOutputStream("D:\\java\\text.txt");
			String content="hello how are you?hhhhhh";
			fs.write(content.getBytes("UTF-8"));
			System.out.println("Sucess!");
		}
		catch(IOException ioe){
			ioe.toString();
		}
	}

}
