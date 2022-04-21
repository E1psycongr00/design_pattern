package pattern.creational.builder;

public class Test {
    public static void main(String[] args) {
        DeptDTO deptDTO = new DeptDTO.Builder()
                .setDeptno(15)
                .setDname("기획")
                .setLoc("서울")
                .build();

        System.out.println(deptDTO);
    }
}
