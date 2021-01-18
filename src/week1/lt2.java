package week1;

import java.util.*;

public class lt2 {
    int[] pre;
    public int[] findRedundantConnection(int[][] edges) {
        pre = new int[edges.length+1];
        init(pre);
        int[] edge = null;
        for(int i = 0 ; i < edges.length ; i++){
            edge = edges[i];
            int x = edges[i][0];
            int y = edges[i][1];
//            if(pre[y] == y){
//                int temp = x;
//                while(pre[temp] != temp){
//                    if(pre[temp] == y){
//                        return edge;
//                    }else{
//                        temp = pre[temp];
//                    }
//                }
//                pre[y] = x;
//            }else{
                int i1 = find(pre, x);
                int i2 = find(pre, y);
                if(i1 == i2){
                    return edge;
                }else{
                    pre[i2] = i1;
                }
            }

//        }
        return edge;
    }

    // 找到并查集根结点
    public int find(int[] pre,int x){
        while(pre[x] != x){
            x = pre[x];
        }
        return x;
    }

    public void init(int[] pre){
        for(int i = 0 ; i < pre.length; i++){
            pre[i] = i;
        }
    }

    public static void main(String[] args) {
        lt2 lt2 = new lt2();
        lt2.findRedundantConnection(new int[][]{new int[]{1,2},new int[]{1,3},new int[]{2,3}});
    }
}
