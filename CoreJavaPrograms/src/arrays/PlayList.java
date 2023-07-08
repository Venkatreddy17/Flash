package arrays;

import java.util.ArrayList;

class PlayList {

	public static void main(String[] args) {
		ArrayList<String> desertIslandPlaylist = new ArrayList<String>();
		desertIslandPlaylist.add("dj tellu");
		desertIslandPlaylist.add("jaiho");
		desertIslandPlaylist.add("revanth song");
		desertIslandPlaylist.add("baby song");
		desertIslandPlaylist.add("om namo venkateshia");
		desertIslandPlaylist.add("jaisriram");

		int indexA = desertIslandPlaylist.indexOf("om namo venkateshia");
		int indexB = desertIslandPlaylist.indexOf("jaisriram");

		String tempA = "om namo venkateshia";
		desertIslandPlaylist.set(indexA, "jaisriram");
		desertIslandPlaylist.set(indexB, tempA);

		desertIslandPlaylist.remove(2);
		System.out.println(desertIslandPlaylist.size());

		System.out.println(desertIslandPlaylist);

	}

}
