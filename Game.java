import javax.swing.*;
import java.io.IOException;
public class Game {
	
	// public String tileset = "tileset/my_tileset";

	// public void loadTileSet() {
	// 	File file = new File(this.tileset);
	// }

	public static void main(String [] args) throws IOException {
		JFrame frame = new JFrame();
		Map map = new Map("test.map");
		frame.setTitle("Pokemon World");
		frame.add(map); 
		frame.setSize(800,800);
		frame.setResizable(false);
		frame.setVisible(true); 
	}
}`