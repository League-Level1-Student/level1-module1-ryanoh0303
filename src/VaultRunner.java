import sun.net.www.content.audio.x_aiff;

public class VaultRunner {
	Vault x= new Vault(); 
    
	
	public int findcode(Vault vault) {
		for(int i=0; i<1000000; i++) {
		  if(i==x.secretcode) {
			  return i;
		  }
		  else {
			  return -1;
		  }
		}
		return 0;
	}
		
	
	public static void main(String[] args) {
		Vault vault= new Vault();
	
		VaultRunner vault1= new VaultRunner();
		vault1.findcode(vault);
		
		
		boolean b=vault.trycode(234);
		System.out.println(b);
	}

}
