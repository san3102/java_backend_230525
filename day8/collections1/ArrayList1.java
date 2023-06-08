package day8.collections1;

import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {
        int[] arr = new int[100];

        arr[0] = 100;

        // 추가, 수정, 삭제, 조회, 사이즈
        ArrayList<Integer> list = new ArrayList<>();

        // 추가 - add (add한번에 값 하나)
        list.add(10);
        list.add(150);

        // 조회 - get, 인덱싱
        System.out.println(list.get(0));

        // 수정 - set(인덱스번호, 바꿀 값)
        list.set(1, 120);
        System.out.println(list.get(1));

        // 삭제 - remove(값), remove(위치)
        // 하나 삭제하면 뒤에 있는 애들이 땡겨진다.
//        list.remove(1); // 위치(인덱스)
        list.remove(Integer.valueOf(10));  // 값(오브젝트)

        // 사이즈
        list.size();
        list.add(95);
        list.add(187);

        // 순회
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }

        for(int num : list){
            System.out.println(num);
        }
    }
}