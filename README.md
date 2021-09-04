# 주사위 게임
## 진행 방법
* 주사위 게임
* 이전 미션과 동일

###기능 요구사항
* 입력인원을 입력받는다 최대 4명
* 참가자의 이름을 입력받는다.
* 참가자의 이름은 최대 5자리이고 영문만 가능하다.
* 참가자별 주사위 2개를 굴린다.
* 주사위의 합이 높은사g람이 우승이다.
* 우승자는 여러명이 가능하다.

### 실행화면
#### 참여 인원은 몇명인가요?(최대4명)
#### 3
#### 참가자의 이름을 입력하세요 :
#### aaa
#### 참가자의 이름을 입력하세요 :
#### bbb
#### 참가자의 이름을 입력하세요 :
#### ccc
#### 실행결과
#### aaa : 5 - 5 : 10
#### bbb : 2 - 6 : 8
#### ccc : 4 - 6 : 10
#### 우승자는 aaa, bbb 입니다.
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
* commit은 기능단위로 commit을하고 github의 commit 규칙을 지킨다.
* 줄여쓰기를 하지 않는다. ex) search -> sel -> x
* class, method, 변수, 상수의 naming 규칙을 반드시 지킨다.(코드컨벤션 확인)
* 개행을 통해서 가독성을 늘린다.
* 모든 Entity는 작게 유지한다.
* 2개 이상의 인스턴스 변수를 가진 클래스를 쓰지않는다.
* java8의 lambda, stream을 적극 활용한다.(IDE에만 의존하면 안된다.)
* 모든 원시값을 포장한다.
* 일급 컬렉션을 사용한다.
* 반드시 TODO LIST를 READ ME에 작성한다.
---
---
### 주사위 게임 TODO-LIST (2021-09-03 작성)
* 주사위 게임 참가자 인원 숫자를 입력받는다. (최대 4명)
* 인원은 숫자만 입력 가능하고 입력받은 인원 숫자를 확인한다.
* 입력받은 참가자가 2명이상 4명이하 인지 확인한다. (경쟁자 가 있어야 하므로 게임은 혼자 진행할수 없다.)
* 참가자 이름을 입력받는다. (영문 최대 5자리)
* 이름이 영문인지 확인한다.
* 나머지 인원수 만큼 이름을 입력받는다.
* 참가자 마다 6면체 주사위를 2개씩 굴린다. (주사위는 굴리는 작업은 실제 구현하지 않고 랜덤으로 처리한다.)
* 6면체 주사위 2개를 굴리므로 주사위 눈의 합은 최소 2 최대 12 의 결과가 나온다.
* 참가자 별 게임 결과를 확인한다.
* 게임 결과는 참가자 이름 : 첫번째 주사위 결과 - 두번째 주사위 결과 : 주사위 눈의 합 으로 나타낸다.
* 주사위 눈의 합이 가장 높은 사람을 확인한다.
* 주사위 눈의 합이 같은경우 공동 우승자 가 나올수 있다.
* 우승자 를 발표한다.
* 게임 반복 플레이는 없으므로 프로그램은 종료된다.
---