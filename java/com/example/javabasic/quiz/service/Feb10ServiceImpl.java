package com.example.javabasic.quiz.service;

/**
 * packageName: com.example.javabasic.quiz.service
 * fileName   : Feb10ServiceImpl
 * author     : HAJINHEE
 * date       : 2022-02-10
 * desc       :
 * ================================
 * DATE       AUTHOR       NOTE
 * ================================
 * 2022-02-10   HAJINHEE    최초 생성
 */
public class Feb10ServiceImpl implements Feb10Service{

/**
 * 1. 앞에서부터 현재 원소와 바로 다음의 원소를 비교한다.
 * 2. 현재 원소가 다음 원소보다 크면 원소를 교환한다.
 * 3. 다음 원소로 이동하여 해당 원소와 그 다음원소를 비교한다.
 * */

    @Override
    public void bubbleSort() {
        int[] arr = new int[10]; //숫자 10개의 공간을 만들어준다.

        for (int i=0; i<arr.length; i++) {
            arr[i]= (int)(Math.random()*100)+1;  //랜덤함수를 이용해 1~100까지의 정수 중 10개를 arr배열에 넣어준다.
            for (int j=0; j<i; j++) {
                if (arr[i]==arr[j]) {
                        i--; break;     //숫자가 나오는 순서대로 중복되는 값이 있으면 그 자리에 다시 새로운 값이 들어오도록 한다.
                    }
                }
            }
        int temp = 0;
        for (int i=0; i< arr.length; i++){        //1회전을 하면 가장 큰 수가 제일 뒤에 위치하므로
            for (int j=0; j< arr.length-1; j++){  //총 길이에서 -1 하여 9번째 숫자까지 비교한다.(계속 반복되며 큰 수가 뒤로 이동)
                if(arr[j]>arr[j+1]){              //왼쪽숫자(j)가 오른쪽숫자(j+1)보다 크면,
                    temp = arr[j];                //우선 temp에 왼쪽숫자(j)를 넣어두고
                arr[j] = arr[j+1];                //비어있는 왼쪽자리에는 오른쪽숫자(j+1)를 넣어준다.
                arr[j+1] = temp;}                 //마지막으로 temp에 있던 j를 비어있는 오른쪽자리에 넣어주면 두 숫자의 자리가 바뀐다.
            }
        }

        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }
    }
    /**
     * 1. 현재 타겟이 되는 숫자와 이전 위치에 있는 원소들을 비교한다.
     * 2. 첫 번째 타겟은 두 번째 원소부터 시작해 첫 번째 값과 비교한다.
     * 3. 타겟이 되는 숫자가 이전 위치에 있던 원소보다 작다면 위치를 서로 교환한다.
     * 4. 그 다음 타겟을 찾아 위와 같은 방법으로 반복한다.
     */

    @Override
    public void insertionSort() {
        int[] arr = new int[10];

        for (int i=0; i<arr.length; i++) {
            arr[i]= (int)(Math.random()*100)+1;
            for (int j=0; j<i; j++) {
                if (arr[i]==arr[j]) {
                    i--; break;
                }
            }
        }
        int temp = 0;
        for (int i=0; i<arr.length-1; i++){         //
            for (int j=0; j<i; j++){
               if (arr[j]>arr[i]){
                   temp = arr[j];
                   arr[j] = arr[i];
                   arr[i] = temp;
                }
            }
        }
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ "\t");
        }
    }

    /**
     * 1. 주어진 리스트에서 최솟값을 찾는다.
     * 2. 최솟값을 맨 앞 자리의 값과 교환한다.
     * 3. 맨 앞 자리를 제외한 나머지 값들 중 최솟값을 찾아 위와 같은 방법으로 반복한다.
     * */

    @Override
    public void selectionSort() {
        int[] arr = new int[10];

        for (int i=0; i<arr.length; i++) {
            arr[i]= (int)(Math.random()*100)+1;
            for (int j=0; j<i; j++) {
                if (arr[i]==arr[j]) {
                    i--; break;
                }
            }
        }

        int min = 0;
        for (int i=0; i<arr.length-1; i++) {        //마지막 요소는 자연스럽게 정렬 되므로 -1
            min = i;                                //우선 i를 최소값 변수에 저장해둔다. -> arr[min]
            for (int j=i+1; j<arr.length; j++) {    //arr[i+1]번째 원소부터 arr[min] 값과 비교한다.
                if (arr[min] > arr[j]) {            //arr[min]의 값이 arr[j]의 값보다 크면 arr[min]은 j가 된다.
                    min = j;                        //반복해서 비교하며 최종 최소값을 찾아낸다.
                }
            }
            int temp = 0;
            temp = arr[min];                  //temp에 최소값을 넣어주고,
            arr[min] = arr[i];                //비어있는 arr[min] 자리에 arr[i]에 있던 값을 넣어준다.
            arr[i] = temp;                    //다시 비어있는 arr[i]로 temp에 있던 최소값을 넣어준다.
        }                                     //이제 인덱스0번 자리는 최소값이 들어갔고, 인덱스1번부터 다시 반복한다.
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }

    @Override
    public void quickSort() {

    }

    @Override
    public void mergeSort() {

    }

    @Override
    public void magicSquare() {

    }

    @Override
    public void zigzag() {

    }

    @Override
    public void rectangleStarPrint() {

    }

    @Override
    public void triangleStarPrint() {

    }
}
