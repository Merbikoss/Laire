/*
    The Laire Project - 2025
    This piece of code belongs to The Laire Project.
    (Original programmer: Mertbikoss - Mert Coşkun)
*/

/*
    Laire - Open Source code. The code belongs to the Laire project and authors.
    Any derivatives or distrobutions that use this code must note to 'Use:' as
    'DERIVATIVE'.

    Use: 'ORIGINAL'

    Warning! This piece of code may be used by some Laire derivatives. Please
    be cautious of the licenses and agreements of these derivatives and obey
    these rules.

    We do not want our users to have any legal problems.

    Thanks for your attention.
*/

package Laire.Misc;

import java.util.ArrayList;

public class ActivationKey {
    // A key consists of 3 pieces. Each piece has 1 checked and 4 unchecked characters.
    // The first and the third pieces are checked, and the second is left unchecked.
    // 16**13 = 4.503.599.627.370.496 possible combinations. And this is only the accepted
    // possible combinations. 16**15 = 1.152.921.504.606.846.976 total legal and illegal
    // key combinations. The total illegal key combinations are here : 1.148.417.904.979.476.480

    // Warning: This key system is open, and it is vulnerable for closed source derivatives.
    // You may use the planned shift() method, but you may also want to add more pieces and
    // even completely checked pieces. Laire is open for everything, and every decision is
    // yours. Thanks for reading this comment.

    public ArrayList<String> KeyGen = new ArrayList<String>();
    public void Generate(){
        String piece1;
        String piece2;
        String piece3;
        Hex hex = new Hex();
        piece1 = "A"+hex.generate(4);
        piece2 = hex.generate(5);
        piece3 = hex.generate(4)+"6";
        KeyGen.add(piece1);
        KeyGen.add(piece2);
        KeyGen.add(piece3);
    }

    // For convention and intuitiveness, the second piece is also taken.
    public boolean Check(String sOne, String sTwo, String sThree){
        char[] aOne = sOne.toCharArray();
        char[] aThree = sThree.toCharArray();
        if(aOne[0] == 'A' && aThree[4] == '6'){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean CheckFromArray(){
        boolean pass = Check(KeyGen.get(0), KeyGen.get(1), KeyGen.get(2));
        return pass;
    }
}