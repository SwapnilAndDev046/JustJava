package Day15;

public class SearchingInString {
    public static void main(String[] args) {
        String Name = "Swapnil";
        char Alpha = 'i';
        if (SearchString(Name,Alpha)) {
            System.out.println("Char is Present");
        }
        else{
            System.out.println("Char is Not Present");
        }
    }
    static boolean SearchString(String name,char alpha){
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i)==alpha) {
                return true;
            }
        }
        return false;
    }
}
