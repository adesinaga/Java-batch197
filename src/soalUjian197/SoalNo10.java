package soalUjian197;
import java.util.Scanner;

public class SoalNo10 {
	public static void main(String[] args) {
        // perintah untuk memasukkan input
        System.out.println("Masukkan kalimat: ");
        Scanner in = new Scanner(System.in);
        System.out.println(SoalNo10.getOutput(in.nextLine()));
        in.close();
    }
    
    protected static String getOutput(String sentence) {
        return (isPangram(sentence)) ? "It's a PANGRAM" : "It's NOT a PANGRAM";
    }
    protected static boolean isPangram(String sentence) {
    	//mengubah huruf besar ke huruf kecil
        String lowerSentence = sentence.toLowerCase();
        for (char letter = 'a'; letter <= 'z'; letter++) {
            if (lowerSentence.indexOf(letter) < 0) return false;
        }
        return true;
    }
}
