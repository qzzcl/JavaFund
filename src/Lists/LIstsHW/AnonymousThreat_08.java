package Lists.LIstsHW;

import java.util.*;
import java.util.stream.Collectors;

public class AnonymousThreat_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String inputS = scanner.nextLine();
        List<String> listInput = Arrays
                .stream(inputS.split(" "))
                .collect(Collectors.toList());

        String command = "";

        while(true){
            command = scanner.nextLine();

            if(command.equals("3:1")){
                System.out.println(listInput.toString().replace("[","").replace("]","").replace(",",""));
                break;
            }else{
                String[] commArr = command.split(" ");

                if (command.contains("merge")){
                    int startIdx = Integer.parseInt(commArr[1]);
                    int endIdx = Integer.parseInt(commArr[2]);

                    //check indexes bounds - If any of the given indexes is out of the array, you must take ONLY the range that is INSIDE the array and merge it.
                    startIdx = Math.max(startIdx, 0);
                    endIdx = Math.min(endIdx,listInput.size()-1);

                    //merge
                    for (int i = startIdx ; i < endIdx ; ){
                        listInput.set(i,listInput.get(i) + listInput.get(i+1));
                        listInput.remove(i+1);
                        endIdx--;
                    }
                }else if (command.contains("divide")){
                    int index = Integer.parseInt(commArr[1]);
                    int partitions = Integer.parseInt(commArr[2]);

                    //divide the selected element
                    String element = listInput.get(index); // Get the element at the given index
                    int elementLength = element.length();

                    String reversedElement = new StringBuilder(element).reverse().toString();

                    List<String> dividedList = new ArrayList<>();
                    int partitionSize = elementLength / partitions; // Calculate the size of each partition
                    int remainingChars = elementLength % partitions; // Calculate the remaining characters

                    int startIndex = 0;
                    int endIndex;
                    if(remainingChars != 0){
                        for (int i = 0; i < partitions; i++) {
                            int partitionLength = partitionSize + (i < remainingChars ? 1 : 0); // Adjust the partition length

                            endIndex = startIndex + partitionLength;
                            String partition = reversedElement.substring(startIndex, endIndex);
                            String reverseBack = new StringBuilder(partition).reverse().toString();
                            dividedList.add(reverseBack);

                            startIndex = endIndex;
                        }
                        //reverse the list back to send the largest element at the end
                        Collections.reverse(dividedList);
                    }else{
                        for (int i = 0; i < partitions; i++) {
                            endIndex = startIndex + partitionSize;
                            String partition = element.substring(startIndex, endIndex);
                            dividedList.add(partition);

                            startIndex = endIndex;
                        }
                    }

                    //at the end, replace the undivided element with the dividedList
                    listInput.remove(index);
                    String joinedString = String.join(" ", dividedList);
                    listInput.add(index,joinedString);
                }
            }
        }
    }
}

