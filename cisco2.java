import java.util.*;

public class cisco2{

    public static List<String> folderNameSystem(List<String> foldername) {
        HashMap<String, Integer> map = new HashMap<>();
        List<String> result = new ArrayList<>();

        for (String name : foldername) {

            if (!map.containsKey(name)) {
                result.add(name);
                map.put(name, 1);
            } else {
                int count = map.get(name);
                String newName = name + count;

                result.add(newName);

                map.put(name, count + 1);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        List<String> foldername = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            foldername.add(sc.nextLine());
        }

        List<String> ans = folderNameSystem(foldername);

        for (String s : ans) {
            System.out.println(s);
        }
    }
}