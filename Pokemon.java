public class Pokemon {
	
	public int id;
	public int hp;
	public int attack;
	public int defense;
	public int sp_attack;
	public int sp_defense;
	public int speed;
	public String name;
	public Moves [] moves;
	public Status status;

	public Pokemon(int pokemon_id){
		this.id         = pokemon_id;
		this.name       = getBaseName(pokemon_id);
		this.moves      = getBaseMoves(pokemon_id);
		this.hp         = getBaseHP(pokemon_id);
		this.attack     = getBaseAttack(pokemon_id);
		this.defense    = getBaseDefense(pokemon_id);
		this.sp_defense = getBaseSpDefense(pokemon_id);
		this.sp_attack  = getBaseSpAttack(pokemon_id);
		this.speed      = getBaseSpeed(pokemon_id);
	}

	public String getBaseName(int pokemon_id) {

		return "";
	}

	public Moves[] getBaseMoves(int pokemon_id) {

		return moves;
	}

	public int getBaseHP(int pokemon_id) {

		return hp;
	}

	public int getBaseAttack(int pokemon_id) {

		return attack;
	}

	public int getBaseDefense(int pokemon_id) {

		return defense;
	}

	public int getBaseSpDefense(int pokemon_id) {

		return sp_defense;
	}

	public int getBaseSpAttack(int pokemon_id) {

		return sp_attack;
	}

	public int getBaseSpeed(int pokemon_id) {

		return speed;
	}

}