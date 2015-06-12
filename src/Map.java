import javax.swing.*;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.*;
import javax.imageio.ImageIO;

public class Map extends JPanel implements KeyListener {
	
	public HashMap<String,BufferedImage> tiles;
	public String map_name,map_directory,tile_directory,tile_base,tile_extension,tileset,image_dir;
	public int width,height;
	public BufferedImage up,down,left,right;
	public Player player;


	public Map(String name) throws IOException {
		try {
			setFocusable( true );
			this.image_dir = "../images";
			this.tile_directory = image_dir+"/Tiles/";
			this.map_directory = image_dir+"/maps/";
			this.tile_base      = "tile-";
			this.tile_extension = ".png";
			this.map_name   = name;
			addKeyListener(this);
			loadMap();

			up = ImageIO.read(new File(image_dir+"/Characters/Player/Up.png"));
			down = ImageIO.read(new File(image_dir+"/Characters/Player/Down.png"));
			right = ImageIO.read(new File(image_dir+"/Characters/Player/Right.png"));
			left = ImageIO.read(new File(image_dir+"/Characters/Player/Left.png"));

		} 
		catch (IOException e) {
		    e.printStackTrace();
		}
	}

	public void paintComponent(Graphics g) { 
		try {

			drawMap(g);
			drawPlayer(g);

			repaint();
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public boolean isLegalMove(int x, int y){
		return true;
	}


	public void drawMap(Graphics g){
		for(int i = 1; i < 4; i++) {
			for(int j = 0; j < this.height; j++) {
				for(int k = 0; k < this.width; k++){
					g.drawImage(tiles.get(i+"-"+j+"-"+k),(k * 32),(j * 32),null);
				}
			}
		}
	}

	public void drawPlayer(Graphics g){
		this.player.draw(g);
	}



	//need to fix
	public void loadMap() throws IOException{
		try {
			Scanner in = new Scanner(new File(image_dir+"/maps/"+this.map_name));
			this.width   = in.nextInt();
			this.height  = in.nextInt();

			in.nextLine();
			in.nextLine();
			in.nextLine();

			this.tiles  = new HashMap<String,BufferedImage>();
			
			for(int i = 1; i < 4; i++){
				for(int j = 0; j < this.height; j++) {
					for(int k = 0; k < this.width; k++) {
						String spot = i+"-"+j+"-"+k;
						Integer next = in.nextInt();
						this.tiles.put(spot,ImageIO.read(new File(this.tile_directory+this.tile_base+(next)+this.tile_extension)));
					}
				}
			}
		}	
		catch(IOException e){
			e.printStackTrace();
		}
	}

	public void loadPokemon() {

	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public void keyTyped(KeyEvent e) {
	       System.out.println("Key Typed");
	    }

}