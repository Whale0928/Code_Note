package src.com.programmers.java.basic;

import java.util.*;

/**
 * 깊이 우선 탐색 dfs
 * 너비 우선 탐색 bfs
 */
//Node 와 Eage를 직접 구현해줘야한다.

class Node {
    String name;
    List<Node> links;
    boolean visited; //이미 확인했는지 여부

    public Node(String name) {
        this.name = name;
        this.links = new LinkedList<>();
    }

    @Override
    public String toString() {
        return name;
    }

    void link(Node node) {
        links.add(node);
    }

    void visit() {  //visit으로 방문했는지 여부를 조정
        this.visited = true;
    }

    boolean isVisited(){
        return this.visited;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Node node = (Node) o;
        return Objects.equals(name, node.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}

public class FsMain {
    public static void main(String[] args) {
        Node a = new Node("A");
        Node b = new Node("B");
        Node c = new Node("C");
        Node d = new Node("D");
        Node e = new Node("E");

        a.link(b);
        a.link(d);

        b.link(a);
        b.link(c);
        b.link(e);

        c.link(b);
        c.link(d);

        d.link(a);
        d.link(c);
        d.link(e);

        e.link(b);
        e.link(d);


        Node targer = e;
        int count = 0;
        //bfs
        Queue<Node> queue = new LinkedList<>();
        queue.offer(a);//a를 예약;

//        while (!queue.isEmpty()) {
//            Node n = queue.poll();
//            n.visit(); //방문 했으니 true으로 변경..
//            System.out.println(n);
//
//            if (n.equals(targer)) {
//                System.out.println("find it ::  " + n + "\ncount ::" + count);
//                break;
//            }
//
//            count++;
//            n.links.stream()
//                    //filter는 거른다는 의미니깐 포함되면 거른다.
//                    //만약 방문하면 true가 대입되니깐 논리부정을 사용해 false일때를 걸러야 한다.
//                    //같은 논리로 큐에 없어야 되니깐 false일때 ture여야한다.
//                    .filter(l->!l.isVisited())       //방문했는지
//                    .filter(l -> !queue.contains(l)) //큐에 이미 있는지.
//                    .forEach(queue::offer);  //큐에 연결된 노드들 정리.
//
//            for을 활용한 스트림과 동일한 문구
//            이번 반복에서 꺼낸 노드의 연결된 노드들을 하나씩 꺼내 반복하며 삽입했던 큐에 있을 경우 continue해 반복하지 않는다.
//            for(Node item : n.links){
//                if(item.isVisited()) continue;
//                if(queue.contains(item)) continue;
//                else queue.offer(item);
//            }
//        }//while 끝


        //DFS
        //DFS는 stack으로 구현하면 끝!
        Stack<Node> stack = new Stack<>();
        stack.push(a);//a를 예약;

        while (!stack.isEmpty()) {
            Node n = stack.pop();
            n.visit(); //방문 했으니 true으로 변경..
            System.out.println(n);

            if (n.equals(targer)) {
                System.out.println("find it ::  " + n);
                break;
            }
            for(Node item : n.links){
                if(item.isVisited()) continue;
                if(stack.contains(item)) continue;
                else stack.push(item);
            }
        }//while 끝


    }
}
