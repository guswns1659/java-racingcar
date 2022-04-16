# 자동차 경주 게임
## 진행 방법
* 자동차 경주 게임 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 코드 리뷰 요청을 한다.
* 코드 리뷰 피드백에 대한 개선 작업을 하고 다시 PUSH한다.
* 모든 피드백을 완료하면 다음 단계를 도전하고 앞의 과정을 반복한다.

## 온라인 코드 리뷰 과정
* [텍스트와 이미지로 살펴보는 온라인 코드 리뷰 과정](https://github.com/next-step/nextstep-docs/tree/master/codereview)

## Step3 기능목록 
- 입력받으면 이동하는 자동차 객체에 기능 추가
- 동작하는 레이싱 게임 구현
- 자동차의 이동 거리를 출력해주는 Printer 추가 
- 사용자에게 입력을 받는 Prompt 추가 
- 레이싱을 시작, 관리하는 RacingController 생성
 
### 리팩토링
- RacingCar가 이동거리 상태를 가지도록 변경
- Rule에게 차량 준비하는 책임 부여 
- 게임 시작과 종료 책임이 있는 Racing 객체 생성

## Step4 기능목록 
- [X] 쉼표를 기준으로 자동차 이름을 묻도록 Prompt 기능 변경
- [X] 자동차 이름은 5자 이하로 
- [X] Input을 검증하는 InputValidator 생성 
- [X] 각 자동차는 점수를 가지고 있도록 한다 
- [ ] RacingCar를 담고 있는 일급컬렉션 cars를 생성.
- [ ] Printer 인터페이스를 추가해 변경에 유연하게 대비
- Rule 객체에 List<Car> 들어가도록 변경 
- 한 회차의 결과를 자동차 이름과 함께 출력 
- 우승자를 결정하는 Organizer.award()를 구현
