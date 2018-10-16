package com.hfut.algorithms;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wangyj
 * @date 2018/10/9
 * @description test
 */
public class TwoSum {

    public static void main(String[] args) {
        int[] demo = {2, 7, 11, 15};
        int target = 9;
        int[] result = solution2(demo, target);
        for (int index : result) {
            System.out.println(index);
        }
    }


    private static int[] solution(int[] data, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> dataMap = new HashMap<>();
        for (int i = 0; i < data.length; i++) {
            dataMap.put(data[i], i);
        }

        for (int j = 0; j < data.length; j++) {
            if (dataMap.get(target - data[j]) != null) {
                result[0] = j;
                result[1] = dataMap.get(target - data[j]);
            }
        }
        return result;
    }


    private static int[] solution2(int[] data, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> dataMap = new HashMap<>();
        for (int i = 0; i < data.length; i++) {
            int temp = target-data[i];
            if(dataMap.containsKey(temp)){
                result[0] = dataMap.get(target-data[i]);
                result[1] = i;
            }else {
                dataMap.put(data[i], i);
            }
        }
        return result;
    }


}
