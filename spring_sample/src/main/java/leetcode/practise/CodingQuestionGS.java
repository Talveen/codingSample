package leetcode.practise;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class CodingQuestionGS {
    public static void main(String[] args){
        CodingQuestionGS codingQuestionGS = new CodingQuestionGS();
        String seq = "AABAABC";
        System.out.println(codingQuestionGS.solve(seq));
    }

    private String solve(String seq) {
        StringBuilder sb = new StringBuilder();
        List<Character> seqList = new LinkedList<>();
        List<Character> seqListTemp = new LinkedList<>();
        if(seq.length()>0){
            seqList.add(seq.charAt(0));
            sb.append(String.valueOf(seq.charAt(0)));
        }
        for(int i =1;i<seq.length();i++){
            Iterator iterator = seqList.iterator();
            boolean flag = true; int k=i;
            while(iterator.hasNext()){
                seqListTemp.add(seq.charAt(k));
                if(iterator.next().equals(seq.charAt(k))){
                    k++;
                }else{
                    flag=false;
                    break;
                }
            }
            if(flag){
                sb.append("*");
                seqList.addAll(seqListTemp);
                i=k-1;
            }
            else{
                Iterator<Character> itr = seqListTemp.iterator();
                while(itr.hasNext()){
                    Character tmp = itr.next();
                    sb.append(String.valueOf(tmp));
                    seqList.add(tmp);
                }
            }
            seqListTemp.clear();
        }
        return sb.toString();
    }
}
