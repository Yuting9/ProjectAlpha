/**
 * Class for each character
 */

//imports
import java.io.*;
import java.util.ArrayList;

public class Character {
  //globals
  private String race, char_class, name, eye, hair, skin, height, weight, biography, alignment, backstory;
  private int level, strength, dexterity, constitution, intelligence, wisdom, charisma, health;
  ArrayList<ArrayList<String>> inventory = new ArrayList<ArrayList<String>>();
  //ArrayList[] inventory = new ArrayList[6];
  ArrayList<String> skills = new ArrayList<String>();
  int[] wealth= new int[5];
  FileInputStream in = null;
  
  //constructor
  public Character(String char_class, String race, String name, String eye, String hair, String skin, String weight, 
                   String biography, String alignment, String backstory, int[] wealth, int health, 
                   ArrayList<String> skills) {
    this.name = name;
    this.char_class=char_class;
    this.race= race;
    this.eye = eye;
    this.hair = hair;
    this.skin = skin;
    this.weight = weight;
    this.biography = biography;
    this.alignment = alignment;
    this.backstory = backstory;
    this.health = health;
    level = 1;
    strength = 8;
    dexterity = 8;
    constitution = 8;
    intelligence = 8;
    wisdom = 8;
    charisma = 8;
    for (int i=0; i<6;i++){
      inventory.add(new ArrayList<String>());
    }
    for(int i=0; i<5;i++){
      this.wealth[i]=0;
    }
  }
  //load
  public Character(String filename)
  {
    BufferedReader br = null;
    String line = null;
    int index=0;
    this.biography="";
    
    try{
      br = new BufferedReader(new FileReader(filename+".txt"));
      this.name= br.readLine();
      this.char_class=br.readLine();
      this.race = br.readLine();
      this.eye= br.readLine();
      this.hair = br.readLine();
      this.skin = br.readLine();
      this.alignment = br.readLine();
      this.backstory = br.readLine();
      this.level=Integer.parseInt(br.readLine());
      this.strength= Integer.parseInt(br.readLine());
      this.dexterity=Integer.parseInt(br.readLine());
      this.constitution=Integer.parseInt(br.readLine());
      this.intelligence=Integer.parseInt(br.readLine());
      this.wisdom=Integer.parseInt(br.readLine());
      this.charisma=Integer.parseInt(br.readLine());
      this.health= Integer.parseInt(br.readLine());
      for(int i = 0; i<6;i++){
      while ((line=br.readLine())!="\n")
      {
        inventory.get(index).add(line);
      }
      index++;
      }
      for(int i=0;i<5;i++)
      {
        this.wealth[i]=Integer.parseInt(br.readLine());
      }
      while ((line=br.readLine())!=null)
      {
        this.biography+=line;
      }
    }catch(Exception e){
      e.printStackTrace(); 
    }
    

  }
  
  public void save(String filename){
    File out =new File(filename+".txt");
    PrintWriter outFile =null;
    try{
    out.createNewFile();
    outFile = new PrintWriter(out);
    }catch(Exception e){
      e.printStackTrace();
    }
    outFile.println(this.name);
    outFile.println(this.char_class);
    outFile.println(this.race);
    outFile.println(this.eye);
    outFile.println(this.hair);
    outFile.println(this.skin);
    outFile.println(this.alignment);
    outFile.println(this.backstory);
    outFile.println(this.level);
    outFile.println(this.strength);
    outFile.println(this.dexterity);
    outFile.println(this.constitution);
    outFile.println(this.intelligence);
    outFile.println(this.wisdom);
    outFile.println(this.charisma);
    outFile.println(this.health);
    for(int i=0;i<6;i++){
      for(int j=0; j<this.inventory.get(i).size(); j++){
        outFile.println(this.inventory.get(i).get(j));
      }
      outFile.println();
    }
    for(int i=0;i<5;i++){
      outFile.println(this.wealth[i]);
    }
    outFile.println(this.biography);
    outFile.close();
    
  }
  

  //getters
  public ArrayList<ArrayList<String>> get_inventory(){
    return inventory;
  }
  public String get_class(){
    return char_class;
  }
  public String get_name(){
    return name;
  }
  public String get_race(){
    return race;
  }
  public int get_level(){
    return level;
  }
  public int get_strength(){
    return strength;
  }
  public int get_dexterity(){
    return dexterity;
  }
  public int get_constituion(){
    return constitution;
  }
  public int get_intelligence(){
    return intelligence;
  }
  public int get_wisdom(){
    return wisdom;
  }
  public int get_charisma(){
    return charisma;
  }
  public String get_biography(){
    return biography;
  }
  public String get_eye(){
    return eye;
  }
  public String get_hair(){
    return hair;
  }
  public String get_skin(){
    return skin;
  }
  public String get_alignment(){
    return alignment;
  }
  public int[] get_wealth(){
    return wealth;
  }
  public int get_health(){
    return health;
  }
  public String get_backstory(){
    return backstory;
  }
  
  //Setters
  public void set_inventory(ArrayList<ArrayList<String>> inventory){
    this.inventory = inventory;
  }
  public void set_name(String name){
    this.name= name;
  }
  public void set_class(String char_class){
    this.char_class= char_class;
  }
  public void set_race(String race){
    this.race= race;
  }
  public void set_level(int level){
    this.level=level;
  }
  public void set_strength(int strength){
    this.strength=strength;
  }
  public void set_dexterity(int dexterity){
    this.dexterity=dexterity;
  }
  public void set_constitution(int constitution){
    this.constitution=constitution;
  }
  public void set_intellgience(int intelligence){
    this.intelligence=intelligence;
  }
  public void set_wisdom(int wisdom){
    this.wisdom=wisdom;
  }
  public void set_charisma(int charisma){
    this.charisma=charisma;
  }
  public void get_race(String race){
    this.race=race;
  }
  public void set_biography(String biography){
    this.biography= biography;
  }
  public void set_eye(String eye){
    this.eye= eye;
  }
  public void set_hair(String hair){
    this.hair= hair;
  }
  public void set_skin(String skin){
    this.skin= skin;
  }
  public void set_alignment(String alignment){
    this.alignment= alignment;
  }
  public void set_wealth(int[] wealth){
    if(wealth.length==5)
      this.wealth=wealth;
  }
  public void set_health(int health){
    this.health=health;
  }
  public void set_backstory(String backstory){
    this.backstory = backstory;
  }
}
