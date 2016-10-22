/**
 * Class for each character
 */

//imports
import java.io.*;
import java.util.ArrayList;

public class Character {
  //globals
  private String race, char_class, name, eye, hair, skin, height, weight, biography, alignment;
  private int level, strength, dexterity, constitution, intelligence, wisdom, charisma;
  ArrayList<ArrayList<String>> inventory = new ArrayList<ArrayList<String>>();
  FileInputStream in = null;
  
  //constructor
  public Character(String char_class, String race, String name, String eye, String hair, String skin, String weight, String biography, String alignment) {
    this.name = name;
    this.char_class=char_class;
    this.race= race;
    this.eye = eye;
    this.hair = hair;
    this.skin = skin;
    this.weight = weight;
    this.biography = biography;
    this.alignment = alignment;
    level = 1;
    strength = 8;
    dexterity = 8;
    constitution = 8;
    intelligence = 8;
    wisdom = 8;
    charisma = 8;
  }
  //load
  public Character(String filename)
  {
    BufferedReader br = null;
    
    try{
      br = new BufferedReader(new FileReader(filename+".txt"));
      this.name= br.readLine();
      this.char_class=br.readLine();
      this.race = br.readLine();
      this.level=Integer.parseInt(br.readLine());
      this.strength= Integer.parseInt(br.readLine());
      this.dexterity=Integer.parseInt(br.readLine());
      this.constitution=Integer.parseInt(br.readLine());
      this.intelligence=Integer.parseInt(br.readLine());
      this.wisdom=Integer.parseInt(br.readLine());
      this.charisma=Integer.parseInt(br.readLine());
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
    outFile.println(this.level);
    outFile.println(this.strength);
    outFile.println(this.dexterity);
    outFile.println(this.constitution);
    outFile.println(this.intelligence);
    outFile.println(this.wisdom);
    outFile.println(this.charisma);
    outFile.close();
    
  }
  

  //getters
  public ArrayList get_inventory(){
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
    return level;
  }
  public int get_dexterity(){
    return level;
  }
  public int get_constituion(){
    return level;
  }
  public int get_intelligence(){
    return level;
  }
  public int get_wisdom(){
    return level;
  }
  public int get_charisma(){
    return level;
  }
  
  //Setters
  public void set_inventory(ArrayList inventory){
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
  
  }
