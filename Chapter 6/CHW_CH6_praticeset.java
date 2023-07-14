public class CHW_CH6_praticeset {
    public static void main(String[] args) {
        /*float [] marks = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f};
        float sum=0;
        for(int i=0;i< marks.length;i++){
            sum+=marks[i];
        }
        System.out.println(sum);*/
        int [][] mat1 = {{1, 2, 3},
                {4, 5, 6}};
        int [][] mat2 = {{2, 6, 13},
                {3, 7, 1}};
        int [][] result = {{0, 0, 0},
                {0, 0, 0}};
        for(int i=0;i<result.length;i++){
            for(int j=0;j<result[i].length;j++){
                result[i][j]=mat1[i][j]+mat2[i][j];

            }
        }


        for(int i=0;i<result.length;i++){
            for(int j=0;j<result[i].length;j++){
                System.out.println(result[i][j]);

            }
        }






    }
}
