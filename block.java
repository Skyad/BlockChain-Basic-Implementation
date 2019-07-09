package blockchain;

import java.util.List;

public class block {
	private int previousblock;
	private List<transcation> transcation;

	public int getPreviousblock() {
		return previousblock;
	}

	public void setPreviousblock(int previousblock) {
		this.previousblock = previousblock;
	}

	public List<transcation> getTranscation() {
		return transcation;
	}

	public void setTranscation(List<transcation> transcation) {
		this.transcation = transcation;
	}



	public block(int previousblock, List<transcation> transcation) {

		this.previousblock = previousblock;
		this.transcation = transcation;
	}


}
