import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("자료구조명을 입력하세요(List, Set, Map)");
        String dataStructure = sc.nextLine();
        System.out.println("요리 제목을 입력하세요");
        String cooking = sc.nextLine();
        System.out.println("요리 레시피를 입력하세요(입력을 마쳣다면 마지막에 \"끝\"을 입력하세요)");


        switch (dataStructure) {
            case "List" :
                ArrayList<String> textList = new ArrayList<String>();
                while (true) {
                    String a = sc.nextLine();
                    if(!a.equals("끝")) {
                        textList.add(a);
                    }
                    else break;
                }
                System.out.println("[ "+dataStructure +"으로 저장된 "+ cooking+" 만들기 ]");
                int i=1;
                for (String listValue : textList) {
                    System.out.println(i+". "+ listValue);
                    i++;
                }
                textList.clear();
            case "Set" :    //hashset은 무작위로 저장하기 때문에 순서대로 저장하는 linkedhashset을 사용
                Set<String> textSet = new LinkedHashSet<String>();
                while (true) {
                    String a = sc.nextLine();
                    if(!a.equals("끝")) {
                        textSet.add(a);
                    }
                    else break;
                }
                System.out.println("[ "+dataStructure +"으로 저장된 "+ cooking+" 만들기 ]");
                i = 1;
                for (String setValue : textSet) {
                    System.out.println(i+". "+ setValue);
                    i++;
                }
                textSet.clear();
            case "Map" :
                Map<Integer, String > textMap = new HashMap<Integer, String>();
                i=0;
                while (true) {
                    String a = sc.nextLine();
                    if(!a.equals("끝")) {
                        textMap.put(i, a);
                        i++;
                    }
                    else break;
                }
                System.out.println("[ "+dataStructure +"으로 저장된 "+ cooking+" 만들기 ]");
                i=1;
                for (String mapValue : textMap.values()) {
                    System.out.println(i+". "+ mapValue);
                    i++;
                }
                textMap.clear();
        }
        sc.close();
        return;
    }

}