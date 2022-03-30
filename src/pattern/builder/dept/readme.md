# 빌더 패턴

생성자 패턴 중 하나이다.

기존의 생성자를 이용하는 방식은 가독성이 떨어졌다. 예를 들어 DeptDTO를 가정해보자. <br>
DeptDTO에는 deptno, dname, loc가 있는데 new 를 이용해 생성하면 <br>
new DeptDTO(10, "기획", "서울") 이게 무슨 의미인지 알 수가 없다. 
그렇다고 setter를 이용하자니 가독성은 나을 수 있지만 뭔가 번거롭다. 그래서 builder 
패턴이 나오게 된다.

builder 패턴은 setter가 메서드체이닝 형태로 사용하고 마지막에 
build() 메서드를 호출하면 생성자를 호출한다. 이 방법을 이용하면 가독성, 편리한 모두 
가져 올 수 있다.

```java
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
```

builder 패턴을 구현하기 위해서 가장 핵심은 메서드 체이닝이다. 이를 구현하기 위해선 내부에 Builder
라는 static class를 만들어 외부 클래스가 생성되지 않더라도 생성자를 만들 수 있도록 한다. 그 다음
setter 메서드의 리턴 값을 모두 builder 자신을 호출하고 최종적으로 build를 호출하면 외부 클래스의
생성자를 호출한다. 이 때 builder 저장해 놓았던 인스턴스 변수를 외부 클래스에 초기화해준다.

```java

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
```