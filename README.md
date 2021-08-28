# 구구단 게임
## 진행 방법
* 구구단 게임의 게임 요구사항을 파악한다.
* PULL REQUEST 통하여 코드를 확인하고 git의 사용법을 같이 연습한다.

###기능 요구사항
* 구구단의 시작 숫자를 입력 받는다.
* 구구단의 범위를 입력받는다.
* 구구단의 최대 범위는 50이다.(공통)
* 구구단의 계산값을 출력한다.
* 계산에 대한 부분은 별도의 계산기에서 작업을 진행한다.
* 계산기는 enum과 java 8의 Function, BitFunction을 이용하여 구현한다.
* 모든 Error 및 validation을 체크한다.

### 실행화면
#### 구구단을 실행한 사람을 입력하세요(최대 5글자)
#### coa
####구구단의 숫자를 입력하세요.
#### 2
#### 구구단의 범위를 입력하세요.
#### 4
#### 실행결과
#### 2 * 1 = 2
#### 2 * 2 = 4
#### 2 * 3 = 6
#### 2 * 4 = 8
#### coa가  2단을 실행 했습니다.
### 프로그래밍 요구사항
* indent(들여쓰기) depth를 1단계만 사용한다.
  * depth의 경우 if문을 사용하는 경우 1단계의 depth가 증가한다. if문 안에 while문을 사용한다면 depth가 2단계가 된다.
* 메소드의 크기가 최대 10라인을 넘지 않도록 구현한다.
  * method가 한 가지 일만 하도록 최대한 작게 만들어라.
* else를 사용하지 마라.
* 모든 기능을 TDD로 구현해 단위 테스트가 존재해야 한다. 단, UI(System.out, System.in) 로직은 제외
  * 핵심 로직을 구현하는 코드와 UI를 담당하는 로직을 구분한다.
  * UI 로직을 InputView, ResultView와 같은 클래스를 추가해 분리한다.
  * MVC로 구현을 진행한다.
* 자바 코드 컨벤션을 지키면서 프로그래밍한다.
* 반드시 TODO LIST를 READ ME에 작성한다.
* commit은 기능단위로 commit을하고 github의 commit 규칙을 지킨다.
* 줄여쓰기를 하지 않는다. ex) search -> sel -> x
* class, method, 변수, 상수의 naming 규칙을 반드시 지킨다.(코드컨벤션 확인)

------------
------------
### 구구단 TODO-LIST (김태현 2021-08-28)
* 테스트 코드를 작성한다.
  * 이름 입력을 테스트한다. 
    * 공백이나 null 값을 체크해서 boolean 으로 처리
  * 구구단의 숫자 및 범위릍 테스트한다. 
    * 최소 1 최대 50까지 입력가능
  * 숫자 및 범위 테스트와 계산값 테스트를 한번에 처리한다.
* 메인, 입력, 결과 화면을 분할한다.
* MVC 패턴으로 만든다.
  * 모델(데이터 담당(Service)) 
  * 뷰(화면담당(InputView, ResultView)) 
  * 컨트롤러(모델과 뷰 사이의 중재자(Controller))
* ResultView의 Message는 enum으로 관리한다.
------------