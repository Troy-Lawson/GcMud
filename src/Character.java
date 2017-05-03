
public class Character {
	/*
	 * name
	 * class
	 * stats
	 * resistance
	 * hp
	 * mp
	 * equipment?
	 * race
	 * 
	 */
	
	private String name;
	private String characterClass;
	private int strength;
	private int endurance;
	private int agility;
	private int intelligence;
	private int spirit;
	private int hitPoints;
	private int magicPoints;
	private String race;
	
	/*public Character(){
		
	}*/
	public Character(){
		this(" ", " ");
	}
	public Character(String name, String charClass){
		this.name = name;
		this.characterClass = charClass;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCharacterClass() {
		return characterClass;
	}
	public void setCharacterClass(String characterClass) {
		this.characterClass = characterClass;
	}
	public int getStrength() {
		return strength;
	}
	public void setStrength(int strength) {
		this.strength = strength;
	}
	public int getEndurance() {
		return endurance;
	}
	public void setEndurance(int endurance) {
		this.endurance = endurance;
	}
	public int getAgility() {
		return agility;
	}
	public void setAgility(int agility) {
		this.agility = agility;
	}
	public int getIntelligence() {
		return intelligence;
	}
	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}
	public int getSpirit() {
		return spirit;
	}
	public void setSpirit(int spirit) {
		this.spirit = spirit;
	}
	public int getHitPoints() {
		return hitPoints;
	}
	public void setHitPoints(int hitPoints) {
		this.hitPoints = hitPoints;
	}
	public int getMagicPoints() {
		return magicPoints;
	}
	public void setMagicPoints(int magicPoints) {
		this.magicPoints = magicPoints;
	}
	public String getRace() {
		return race;
	}
	public void setRace(String race) {
		this.race = race;
	}
	
	
	
}
