import java.util.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.*;

public class Player {
	
	public String  name;
	public BufferedImage up,down,left,right;
	public Integer health,strength,defense,speed,level,xp,id,x,y,direction,team,icon_size;
	public HashMap<Item, Integer> items;
	public HashMap<Pokemon, Integer> pokemon;
	public HashMap<Badge, Integer> badges;
	public Map map;
	public static final int UP = 0;
	public static final int DOWN = 1;
	public static final int LEFT = 2;
	public static final int RIGHT = 3;
	
	// add team image x and y
	public Player(Map map, String name) {
		this.map = map;
		this.setName(name);
		this.setHealth(100);
		this.setStrength(25);
		this.setSpeed(25);
		this.setDefense(25);
		this.setLevel(1);
		this.setXp(1);
		this.setTeam(team);


		String image_path = "../images/Characters/Player";
		String ext = ".png";

		try {
			this.up = ImageIO.read(new File("../images/Characters/Player/Up.png"));
			this.down = ImageIO.read(new File("../images/Characters/Player/Down.png"));
			this.left = ImageIO.read(new File("../images/Characters/Player/Left.png"));
			this.right = ImageIO.read(new File("../images/Characters/Player/Right.png"));
		}
		catch(Exception e) {
			e.printStackTrace();
		}

		this.direction = DOWN;
		this.x = 0;
		this.y = 3;
		this.icon_size = 32;

	}
	
	public Player(String name,BufferedImage image, Integer team, Integer health, Integer strength, Integer speed, Integer defense) {
		this.setName(name);
		this.setHealth(health);
		this.setStrength(strength);
		this.setSpeed(speed);
		this.setDefense(defense);
		this.setLevel(1);
		this.setXp(1);
		this.setTeam(team);
	}



	public Player saveGame() {
		return this;
	}

	public boolean walk() {
		return true;
	}


	public void afterMove(){
		map.repaint();
	}
	
	public void checkMapForMove(int x, int y){
		if (map.isLegalMove(x, y)){
			
		}
		else{
			System.err.println("Illegal Move at " + x + " " + y);
		}
	}

	public void moveRight(){
		checkMapForMove(x+1, y);
		x += 1;
		this.direction = RIGHT;
		afterMove();
	}
	
	public void moveLeft(){
		checkMapForMove(x-1, y);
		x -= 1;
		this.direction = LEFT;
		afterMove();
	}
	
	public void moveDown(){
		checkMapForMove(x, y+1);
		y += 1;
		this.direction = DOWN;
		afterMove();
	}
	
	public void moveUp(){
		checkMapForMove(x, y-1);
		y -= 1;
		this.direction = UP;
		afterMove();
	}

	public void draw(Graphics g){
		int drawX = x * this.icon_size;
		int drawY = y * this.icon_size+this.icon_size;
		if(direction == UP){
			g.drawImage(up,drawX,drawY,null);
		}
		else if (direction == DOWN){
			g.drawImage(down,drawX,drawY,null);
		}
		else if (direction == LEFT){
			g.drawImage(left,drawX,drawY,null);
		}
		else if (direction == RIGHT){
			g.drawImage(right,drawX,drawY,null);
		}

	}



	public HashMap<Item,Integer> buyItem(){
		return this.items;
	}

	public HashMap<Item,Integer> sellItem(){
		return this.items;
	}

	public HashMap<Pokemon,Integer> catchPokemon(){
		return this.pokemon;
	}

	public HashMap<Pokemon,Integer> releasePokemon(){
		return this.pokemon;
	}

	public boolean attemptCatch(){
		return true;
	}


	/*
		need to add if it is a self player item, opponent player item, or pokemon item.
	*/
	public Player useItem(){
		return this;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getHealth() {
		return health;
	}

	public void setHealth(Integer health) {
		this.health = health;
	}

	public Integer getStrength() {
		return strength;
	}

	public void setStrength(Integer strength) {
		this.strength = strength;
	}

	public Integer getDefense() {
		return defense;
	}

	public void setDefense(Integer defense) {
		this.defense = defense;
	}

	public Integer getSpeed() {
		return speed;
	}

	public void setSpeed(Integer speed) {
		this.speed = speed;
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public Integer getXp() {
		return xp;
	}

	public void setXp(Integer xp) {
		this.xp = xp;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getX() {
		return x;
	}

	public void setX(Integer x) {
		this.x = x;
	}

	public Integer getY() {
		return y;
	}

	public void setY(Integer y) {
		this.y = y;
	}

	public Integer getDirection() {
		return direction;
	}

	public void setDirection(Integer direction) {
		this.direction = direction;
	}

	public Integer getTeam() {
		return team;
	}

	public void setTeam(Integer team) {
		this.team = team;
	}

	public HashMap<Item, Integer> getItems() {
		return items;
	}

	public void setItems(HashMap<Item, Integer> items) {
		this.items = items;
	}

	public HashMap<Pokemon, Integer> getPokemon() {
		return pokemon;
	}

	public void setPokemon(HashMap<Pokemon, Integer> pokemon) {
		this.pokemon = pokemon;
	}

	public HashMap<Badge, Integer> getBadges() {
		return badges;
	}

	public void setBadges(HashMap<Badge, Integer> badges) {
		this.badges = badges;
	}

	/*	getters and setters*/
	
	
}