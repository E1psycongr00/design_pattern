package pattern.builder.dept;

public class DeptDTO {
    private final int deptno;
    private final String dname;
    private final String loc;

    // 메서드 체이닝 + 생성자 제어
    public static class Builder {
        int deptno;
        String dname;
        String loc;
        public Builder() {}

        public Builder setDeptno(int deptno) {
            this.deptno = deptno;
            return this;
        }
        public Builder setDname(String dname) {
            this.dname = dname;
            return this;
        }
        public Builder setLoc(String loc) {
            this.loc = loc;
            return this;
        }

        // 외부 클래스 생성자는 build() 로만 호출 할 수 있다.
        public DeptDTO build() {
            return new DeptDTO(this);
        }

    }

    // 생성자 은닉 => builder의 build() 로만 호출 할 수 있다.
    private DeptDTO(Builder builder) {
        this.deptno = builder.deptno;
        this.dname = builder.dname;
        this.loc = builder.loc;
    }

    // getter
    public int getDeptno() {
        return deptno;
    }

    public String getDname() {
        return dname;
    }

    public String getLoc() {
        return loc;
    }

    @Override
    public String toString() {
        return "DeptDTO{" +
                "deptno=" + deptno +
                ", dname='" + dname + '\'' +
                ", loc='" + loc + '\'' +
                '}';
    }
}
