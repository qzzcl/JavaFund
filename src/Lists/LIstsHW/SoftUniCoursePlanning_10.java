package Lists.LIstsHW;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SoftUniCoursePlanning_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String initialSchedule = scanner.nextLine();
        List<String> listInitSchedule = Arrays
                .stream(initialSchedule.split(", "))
                .collect(Collectors.toList());
        String command = "";

        while(true){
            command = scanner.nextLine();

            if (command.equals("course start")){

                break;
            }
            String[] commArr = command.split(":");
            String lessonTitle = commArr[1];
            if(command.contains("Add")){
                if (!listInitSchedule.contains(lessonTitle)){
                    listInitSchedule.add(lessonTitle);
                }
            }else if(command.contains("Insert")){
                int index = Integer.parseInt(commArr[2]);
                if (!listInitSchedule.contains(lessonTitle)){
                    listInitSchedule.add(index,lessonTitle);
                }
            }else if(command.contains("Remove")){
                if (listInitSchedule.contains(lessonTitle)){
                    String exerciseTitle = lessonTitle+ "-Exercise";
                    listInitSchedule.remove(lessonTitle); // remove the lesson
                    //check if there is exercise  --- no need to explicitly check if it is in the list, because this is done automatically in the remove method
                    listInitSchedule.remove(exerciseTitle);
                }
            }else if(command.contains("Swap")){
                String lessonTwoTitle = commArr[2];

                if (listInitSchedule.contains(lessonTitle) && listInitSchedule.contains(lessonTwoTitle)){
                    // Methods, Lists, Arrays, Databases, Databases-Exercise
                    int indexLessonOne = listInitSchedule.indexOf(lessonTitle);
                    int indexLessonTwo = listInitSchedule.indexOf(lessonTwoTitle);



                    //EXERCISE
                    //check if there is exercise after the lesson and store its index
                    int indexExerciseOne = -1;
                    int indexExerciseTwo = -1;

                    String tempEx = "";
                    String exerciseOneTitle = lessonTitle+ "-Exercise";
                    String exerciseTwoTitle = lessonTwoTitle+ "-Exercise";
                    boolean swapExerciseOne = false;
                    boolean swapExerciseTwo = false;

                    //check if there is exercise after the lesson and store its index
                    if (listInitSchedule.contains(exerciseOneTitle)){
                        indexExerciseOne = listInitSchedule.indexOf(exerciseOneTitle);
                        swapExerciseOne = true;
                    }

                    if (listInitSchedule.contains(exerciseTwoTitle)){
                        indexExerciseTwo = listInitSchedule.indexOf(exerciseTwoTitle);
                        swapExerciseTwo = true;
                    }

                    //swap lessons
                    listInitSchedule.set(indexLessonOne,lessonTwoTitle);    // Methods, Lists, Methods, Methods-Exercise
                    listInitSchedule.set(indexLessonTwo,lessonTitle);       // Methods , Lists, Arrays, Methods-Exercise

                    if(swapExerciseOne){
                        tempEx = exerciseOneTitle;
                        listInitSchedule.remove(exerciseOneTitle);
                        indexExerciseOne = listInitSchedule.indexOf(lessonTitle) + 1;
                        listInitSchedule.add(indexExerciseOne,tempEx);

                    }
                    if(swapExerciseTwo){
                        tempEx = exerciseTwoTitle;                                  // Methods , Lists, Arrays, Methods-Exercise
                        listInitSchedule.remove(exerciseTwoTitle);                  // Methods , Lists, Arrays
                        indexExerciseTwo = listInitSchedule.indexOf(lessonTwoTitle) + 1;
                        listInitSchedule.add(indexExerciseTwo, tempEx);     // Methods, Methods-Exercise, Lists, Arrays
                    }
                }
            }else if(command.contains("Exercise")){
                //if the lesson exists in the list alreayd
                if (listInitSchedule.contains(lessonTitle)){
                    //if the lesson doesnt have an exercise attached to it already, add it
                    String exerciseName = lessonTitle + "-Exercise";
                    if (!listInitSchedule.contains(exerciseName)){
                        int indexEx = listInitSchedule.indexOf(lessonTitle) + 1;
                        listInitSchedule.add(indexEx,exerciseName);
                    }

                }
                //otherwise - if the lesson DOESN"T exists, add the lesson at the end of the list
                else{
                    listInitSchedule.add(lessonTitle);
                    //then add the exercise
                    listInitSchedule.add(lessonTitle+"-Exercise");
                }
            }
        }

        int count = 1;
        for (String topic : listInitSchedule) {
            System.out.println(count + "." + topic);
            count++;
        }
    }
}
