# 목록

> 할일 목록
>
- [ ]  Docs 1차 작성
- [ ]  MVC 패턴 생성
- [ ]  기능 구현
    - [ ]  값 입력하기
    - [ ]  입력값 벨리데이션
    - [ ]  (컴퓨터)랜덤 3자리만들기
    - [ ]  (컴퓨터)랜덤값 벨리데이션
    - [ ]  정답 여부 확인
    - [ ]  재시작 여부 확인

> **로직 정리**
>
- 게임시작( validation )
    - 사용자 값 입력
    - 값이 3자리수가 들어왔는가? 체크(bool)
    - 한 자리의 값이 1~9 범위 내에 있는 숫자들인가? 체크(bool)
    - 세자리수가 중복이 되는가? 체크(bool)
    - 예외처리 :**IllegalArgumentException 후 종료**
    - 값 입력하기(자체 Random함수 활용)
- (앞의 validation 통과 후) 게임 로직
    - (각 자리별) 먼저 같은 숫자인지 체크 →통과 시 +1스트라이크
    - (각 자리별) 자리는 다르지만 포함되는 숫자가 있는지 체크 →통과시 +1볼
    - 둘다 아닐 시 → nothing
- 게임 로직 후
    - (실패시) 힌트 출력
        - 재시작 여부 확인
            - Yes - 재시작
            - no - 종료
    - (성공시) 완료메시지 출력
        - 종료

> **제약 사항**
>
- [ ]  숫자 야구게임을 실행하는 시작점은 src/main/java 폴더의 baseball.Application의 main()
- [ ]  JDK 8버전에서 실행 가능해야 함
- [ ]  입력값과 렌덤값에 대한 nextstep API 활용
    - Random 값 추출은 camp.nextstep.edu.missionutils.Randoms의 pickNumberInRange()
    - 사용자가 입력하는 값은 camp.nextstep.edu.missionutils.Console의 readLine()을 활용
- [ ]  기본으로 들어있는 TestCase 2개 통과
- [ ]  자바 코드컨벤션을 지켰느냐?
    - 기본적인 코드컨벤션 지키기
    - intent Depth 2가 넘어가지 않도록 구현한다. 1까지만 허용한다.
    - stram api 사용하지 않고 구현
    - else 사용금지
    - 함수(메소드) 길이 10라인 넘지 않기
- [ ]  도메인 로직에 단위테스트 구현 (UI 로직 제외)
    - [ ]  핵심 로직을 구현하는 코드와 UI담당 로직 분리 구현
    - [ ]  MVC 패턴 기반으로 구현 후 View, Controller 제외한 Model 단위 테스트 추가하는 것에 집중