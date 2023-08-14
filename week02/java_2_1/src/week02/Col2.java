package week02;

import java.util.LinkedList;

public class Col2 {
    public static void main(String[] args) {
        // linked list
        // 메모리에 남는 공간을 요청해서 여기 저기 나누어서 실제 값을 담는다.
        // 실제 값이 있느 ㄴ조소값으로 목록을 구성하고 저장하는 자료구조

        // 기본적 기능은 -> ArrayList와 동일
        // LinkedList는 값을 여기저기 나누기에 조회 속도가 느리다
        // 값을 추가하거나, 삭제할 때는 빠르다.

        LinkedList<Integer> linkedList = new LinkedList<Integer>();

        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);

        System.out.println(linkedList.toString());

        linkedList.add(2,4);
        System.out.println(linkedList.toString());

        linkedList.set(1,30);
        System.out.println(linkedList.toString());

        linkedList.remove(1);
        System.out.println(linkedList);

        linkedList.clear();
        System.out.println(linkedList);
    }
}
