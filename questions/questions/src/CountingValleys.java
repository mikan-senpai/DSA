//Sample Input
//
//        8
//        UDDDUDUU
//        Sample Output
//
//        1
//        Explanation
//
//        If we represent _ as sea level, a step up as /, and a step down as \, the hike can be drawn as:
//
//        _/\      _
//           \    /
//            \/\/
//        The hiker enters and leaves one valley.


import java.util.Arrays;


public class CountingValleys {
    public static void main(String[] args) {
        countingValleys(8, Arrays.toString(new String[]{"UDDDUDUU"}));
    }

    public static void countingValleys(int steps, String path) {
        // Write your code here
        int valleys = 0 ;
        int belowSeaLevel = 0, aboveSeaLevel = 0;
        int man = 0;
        for (int i = 0; i < path.length(); i++) {
            if (path.charAt(i) == 'D') {
                belowSeaLevel += 1;
            } else {
                aboveSeaLevel += 1;
            }

        }
        System.out.println(valleys);


    }
}
