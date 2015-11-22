/*Compare two version numbers version1 and version2.
If version1 > version2 return 1, if version1 < version2 return -1, otherwise return 0.

You may assume that the version strings are non-empty and contain only digits and the . character.
The . character does not represent a decimal point and is used to separate number sequences.
For instance, 2.5 is not "two and a half" or "half way to version three", it is the fifth second-level revision of the second first-level revision.

Here is an example of version numbers ordering:

0.1 < 1.1 < 1.2 < 13.37 */ 

public class CompareVersionNo {
    public int compareVersion(String version1, String version2) {
        
    //split them inot indivudual digits
    String[] arr1 = version1.split("\\.");
    String[] arr2 = version2.split("\\.");
 
    int i=0;
    //while the index is lesser than the length of one of the versions
    while(i<arr1.length || i<arr2.length){
        
        //if the index is less than both the versions
        if(i<arr1.length && i<arr2.length){
            if(Integer.parseInt(arr1[i]) < Integer.parseInt(arr2[i])){
                return -1;
            }else if(Integer.parseInt(arr1[i]) > Integer.parseInt(arr2[i])){
                return 1;
            }
        //if the index is less than version 1 length and the number at the index is not 0, version 1 is greater
        } else if(i<arr1.length){
            if(Integer.parseInt(arr1[i]) != 0){
                return 1;
            }
        //if the index is less than version 2 length and the number at the index is not 0, version 2 is greater
        } else if(i<arr2.length){
           if(Integer.parseInt(arr2[i]) != 0){
                return -1;
            }
        }
 
        i++;
    }
    
    //if none of these conditions occur, version 1 and version 2 are equal
 
    return 0;
    }
}