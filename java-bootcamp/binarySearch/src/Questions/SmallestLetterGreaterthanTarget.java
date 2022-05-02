package Questions;

public class SmallestLetterGreaterthanTarget {

    public static void main(String[] args) {
        char[] letters={'c','f','j'};
        char target='c';
        char ans=nextGreatestLetter(letters,target);
        System.out.println(ans);
    }


    public static char nextGreatestLetter(char[] letters, char target) {
    int start=0;
    int end=letters.length-1;
    int mid=0;
    //here we are using the bunary search algo except one condition
        while (start<=end)
	{
        mid=start+(end-start)/2;

        if(letters[mid] > target)
        {
            end=mid-1;
        }
        else
        {
            start=mid+1;
        }

    }

    return letters[start % (letters.length)];
    }
}


