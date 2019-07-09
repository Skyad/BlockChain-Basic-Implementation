package blockchain;

import java.util.Arrays;
import java.lang.reflect.*;

public class blockchain {

	public static void main(String[] args) {
		
		transcation tr1 = new transcation(223,"from mobile","account",2000);
		transcation tr2 = new transcation(225,"from mobile","account",2400);
		transcation tr3 = new transcation(227,"from account","account",1500);
		
		block blk1 = new block(0,Arrays.asList(tr1));
		block blk2 = new block(blk1.hashCode(),Arrays.asList(tr2));
		block blk3 = new block(blk2.hashCode(),Arrays.asList(tr3));
		System.out.println("block1\t");
		System.out.println("block1 hash code--"+blk1.hashCode());
		System.out.println(" transcation id-"+tr1.id);
		System.out.println("transcation source--"+tr1.source);
		System.out.println("transcation destination--"+tr1.destinataion);
		System.out.println("transcation value-"+tr1.value);
		System.out.println("previous block hash--"+null);
		System.out.println("block2\t");
		System.out.println("block2 hash code--"+blk2.hashCode());
		System.out.println(" transcation id-"+tr2.id);
		System.out.println("transcation source--"+tr2.source);
		System.out.println("transcation destination--"+tr2.destinataion);
		System.out.println("transcation value-"+tr2.value);
		System.out.println("previous block hash--"+blk2.getPreviousblock());
		System.out.println("block3\t");
		System.out.println("block3 hash code"+blk3.hashCode());
		System.out.println(" transcation id-"+tr3.id);
		System.out.println("transcation source--"+tr3.source);
		System.out.println("transcation destination--"+tr3.destinataion);
		System.out.println("transcation value-"+tr3.value);
		System.out.println("previous block hash --"+blk3.getPreviousblock());
		
				
		

	}

}
