import java.io.*;

class Test6 {
	
		public boolean existe(String name) {	
			File f = new File(name);
			return f.existe();
		
		}
}