/*Find Intersection
    Have the function FindIntersection(strArr) read the array of strings stored in strArr which will contain 2
    elements: the first element will represent a list of comma-separated numbers sorted in ascending order,
    the second element will represent a second list of comma-separated numbers (also sorted). Your goal is
    to return a comma-separated string containing the numbers that occur in elements of strArr in sorted order.
    If there is no intersection, return the string false.
        Examples
        Input: new String[] {"1, 3, 4, 7, 13", "1, 2, 4, 13, 15"}
        Output: 1,4,13
        Input: new String[] {"1, 3, 9, 10, 17, 18", "1, 4, 9, 10"}
        Output: 1,9,10*/
public class FindIntersection {

    public static void main(String[] args) {
        String[] test = {"1, 3, 4, 7, 13", "1, 2, 4, 13, 15"};

        System.out.println(findIntersection(test));
    }

    public static String findIntersection(String[] strArr) {
        String[] firstArray = strArr[0].split(", ");
        String[] secondArray = strArr[1].split(", ");
        String result = "";

        for (int i = 0; i < firstArray.length; i++) {
            for (int j = 0; j < secondArray.length; j++) {
                if (firstArray[i].equals(secondArray[j])) {
                    if (!result.equals("")) {
                        result = result + ",";
                    }
                    result = result + firstArray[i];
                }
            }
        }

        if (result.equals("")) {
            return "false";
        } else {
            return result;
        }
    }

}
