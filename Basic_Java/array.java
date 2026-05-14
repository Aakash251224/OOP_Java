
 class array {
    public static void main(String[] args) {

        int numberOne = 250; 
        int numberTwo = 75;  


        int[] examScores1 = {95, 70, 88, 66, 79};
        int examScores2[] = {95, 70, 88, 66, 79};

        int examScores3[];
        examScores3 = new int[5];


        String[][] classroomBench = {
                {"P1", "Q1", "R1", "S1"},
                {"P2", "Q2", "R2", "S2"}
        };

        for (String[] benchRow : classroomBench) {
            for (String bench : benchRow) {
                System.out.println(bench);
            }
        }
    }
}