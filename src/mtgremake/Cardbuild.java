package mtgremake;

public class Cardbuild {
	
	public Cardbuild(){
		while(true){
			System.out.println(genname((int)(Math.random()*3)+1));
			try{
				Thread.sleep(10);
			}catch(Exception e){}
		}
		//System.out.println(maketext(new int[] {1,2}));
	}
	
	public Object getrand(Object[] arr){
		return arr[(int)(Math.random()*arr.length)];
	}
	
	public String genname(int segs){
		String m = "";
		String charmap = "abcdefghijklmnopqrstuvwxyz";
		String vowels = "aeiou";
		String[] start = {
				"b","c","d","f","g","h","j","k","l","m","n","p",
				"q","r","s","t","v","w","x","y","z","bl","br",
				"cr","cl","st","str","ch","sh","th","st"
				};
		String[] vow = {
				"a","i","o","u","ai","au","ea","ou","oo","oi"
		};
		String[] end = {
				"b","c","d","f","g","j","k","l","m","n","p",
				"q","r","s","t","v","w","x","y","z"
		};
		String[] finals = {
				"lt","ck","b","c","d","f","g","j","k","l","m","n","p",
				"q","r","s","t","v","w","x","y","z","rd","nt","ct","sh",
				"ch","th","mp"
		};
		for(int i=0;i<segs;i++){
			if(Math.random()>0.5){
				m += getrand(start);
			}
			m += getrand(vow);
			if(i==segs-1){
				m += getrand(finals);
				if(Math.random()>0.92 && m.charAt(m.length()-1) != 's'){
					m += "s";
				}
			}else{
				m += getrand(end);
			}
		}
		return m;
	}
	
	public String maketext(int[] identity){
		String t = "";
		String[] abs = {"Flying","First strike","Indestructible","Haste","Trample","Vigilance","Deathtouch","Skulk","Defender","Battle cry"};
		String[] csymbol = {"W","U","B","R","G"};
		String[] ptype = {"creature","enchantment","planeswalker","permanent","land","artifact"};
		String[] ctype = {"permanent","card","instant","sorcery","land","planeswalker","artifact","creature","encahntment"};
		String[] tribes = {"Spider","Goblin","Human","Soldier","Plant","Elemental","Snake","Insect","Avatar","Wolf","Treefolk","Elf","Scout","Rat","Vampire","Spirit","Bear","Cleric","Warrior","Merfolk","Wizard","Dragon","Bird","Rogue","Shaman","Druid"};
		
		return null;
	}
	
	public static void main(String[] args) {
		new Cardbuild();
	}
	
	public class Card{
		int cmc;
		int[] identity;
		String[] types;
		String[] subtypes;
		String text;
		int[] pt;
		String[] cost;
		int rarity;
		String name;
		boolean permanent;
		boolean creature;
	}
	
}
