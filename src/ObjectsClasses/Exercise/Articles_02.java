package ObjectsClasses.Exercise;

import java.util.Scanner;

public class Articles_02 {
    public static class Articles {
        String title;
        String author;
        String content;

        public Articles (String title, String content, String author){
            this.title = title;
            this.content = content;
            this.author = author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        @Override
        public String toString() {
            return this.title + " - " + this.content + ": " + this.author;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String articleInp = scanner.nextLine();
        String[] commArr = articleInp.split(", ");
        String title = commArr[0];
        String content = commArr[1];
        String author = commArr[2];

        Articles article = new Articles(title,content,author);

        int numCommands = Integer.parseInt(scanner.nextLine());

        for (int i = 0 ; i < numCommands; i++){
            String command = scanner.nextLine();
            String[] commandSplit = command.split(": ");
            String secondPart = commandSplit[1];

            if(command.contains("Edit")){
                article.setContent(secondPart);
            }else if (command.contains("Change")){
                article.setAuthor(secondPart);
            }else if (command.contains("Rename")){
                article.setTitle(secondPart);
            }
        }

        System.out.println(article.toString());
    }
}
