import java.util.*;

public class Pokemon {
	public Integer id,hp,attack,defense,sp_attack,sp_defense,speed;
	public String name,status;
	public HashMap<Move,Integer> moves;

	public Pokemon(String name, Integer hp, Integer attack, Integer defense, Integer sp_attack, Integer sp_defense, Integer speed){
		this.setName(name);
		this.setMoves(moves);
		this.setHp(hp);
		this.setAttack(attack);
		this.setDefense(defense);
		this.setSpDefense(sp_defense);
		this.setSpAttack(sp_attack);
		this.setSpeed(speed);
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getHp() {
		return hp;
	}

	public void setHp(Integer hp) {
		this.hp = hp;
	}

	public Integer getAttack() {
		return attack;
	}

	public void setAttack(Integer attack) {
		this.attack = attack;
	}

	public Integer getDefense() {
		return defense;
	}

	public void setDefense(Integer defense) {
		this.defense = defense;
	}

	public Integer getSpAttack() {
		return sp_attack;
	}

	public void setSpAttack(Integer sp_attack) {
		this.sp_attack = sp_attack;
	}

	public Integer getSpDefense() {
		return sp_defense;
	}

	public void setSpDefense(Integer sp_defense) {
		this.sp_defense = sp_defense;
	}

	public Integer getSpeed() {
		return speed;
	}

	public void setSpeed(Integer speed) {
		this.speed = speed;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public HashMap<Move, Integer> getMoves() {
		return moves;
	}

	public void setMoves(HashMap<Move, Integer> moves) {
		this.moves = moves;
	}

}