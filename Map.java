import javax.swing.*;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.*;
import javax.imageio.ImageIO;

public class Map extends JPanel {
	
	public BufferedImage[][] tiles;
	public String map_name;
	public String map_directory;
	public String tile_directory;
	public String tile_base;
	public String tile_extension;
	public String tileset;
	public int width;
	public int height;


	public Map(String name) throws IOException {
		try {
			this.tile_directory = "./images/Tiles/";
			this.map_directory = "./images/maps/";
			this.tile_base      = "tile-";
			this.tile_extension = ".png";
			this.map_name   = name;
			loadMap();

			up = ImageIO.read(new File("./images/Characters/Player/Up.png"));
			down = ImageIO.read(new File("./images/Characters/Player/Down.png"));
			right = ImageIO.read(new File("./images/Characters/Player/Right.png"));
			left = ImageIO.read(new File("./images/Characters/Player/Left.png"));

		} 

		catch (IOException e) {
		    e.printStackTrace();
		}
	}

	public void paintComponent(Graphics g) { 
		try {
			for(int i = 0; i < this.height; i++) {
				for(int j = 0; j < this.width; j++){
					g.drawImage(tiles[i][j],(i * 32),(j * 32),null);
				}
			}

			repaint();
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void loadMap() throws IOException{
		try {
			Scanner in = new Scanner(new File("./images/maps/"+this.map_name));
			this.width   = in.nextInt();
			this.height  = in.nextInt();
			this.tileset = in.next();
			this.tiles  = new BufferedImage[height][width];
			for(int i = 0; i < this.height; i++) {
				for(int j = 0; j < this.width; j++){
					this.tiles[i][j] = ImageIO.read(new File(this.tile_directory+this.tile_base+(in.nextInt() + 1)+this.tile_extension));
				}
			}
		}	
		catch(IOException e){
			e.printStackTrace();
		}
	}

	public void loadPokemon() {

	}
}