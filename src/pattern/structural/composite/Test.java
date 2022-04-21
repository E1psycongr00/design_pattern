package pattern.structural.composite;


import pattern.structural.composite.filesystem.File;
import pattern.structural.composite.filesystem.FileSystem;
import pattern.structural.composite.filesystem.Folder;

public class Test {
    public static void main(String[] args) {
        Folder school = new Folder("학교");

        Folder grade1 = new Folder("1학년");
        Folder grade2= new Folder("2학년");

        Folder study1 = new Folder("미적분학");
        Folder study2 = new Folder("통계");
        Folder study3 = new Folder("마케팅");

        File chapter1 = new File("행렬", 10);
        File chapter2 = new File("사람의심리", 50);
        File chapter3 = new File("고객의특성", 20);
        File chapter4 = new File("사칙연산", 5);

        school.add(grade1);
        school.add(grade2);

        grade1.add(study1);
        grade2.add(study2);
        grade2.add(study3);

        study1.add(chapter1);
        study3.add(chapter4);
        study2.add(chapter2);
        study2.add(chapter3);

        school.getSize();
        boolean s = school.remove("미적분학");
        System.out.println(s);
    }
}
