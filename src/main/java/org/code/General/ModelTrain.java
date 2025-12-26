package org.code.General;

import java.util.Scanner;

public class ModelTrain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("please chose model train mode ");
        System.out.println("1.change model");
        System.out.println("2.output now train model");
        System.out.println("3.link to me github");

        int user_input_chose = sc.nextInt();

        String TrainModel = "DeepSeek-R1";

        switch (user_input_chose){
            case 1:
                System.out.println("Please chose you need train model");
                String user_need_change_model = sc.nextLine();

                String New_Model = "DeepSeek-R1";

                String Now_Using_model = user_need_change_model;

            case 2:
                System.out.println("Now your train model is  " );
                break;
            case 3:


        }

    }
}
