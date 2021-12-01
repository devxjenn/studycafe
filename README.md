# 📚 그...스터디카페
MVC Model 방식을 이용한 스터디카페 온라인 예약 사이트입니다.  

<br>

## 목차
### 1. 프로젝트 소개
  - 1-1 [간단 소개](#간단-소개)
  - 1-2 [기획 배경 및 목적](#기획-배경-및-목적)
  - 1-3 [개발환경](#개발-환경)
### 2. 팀원 소개
  - 2-1 [팀원 소개](#Team-김이박)
  - 2-2 [역할 분담](#역할-분담)
### 3. 프로그램 구조 및 설계
  - 3-1 [클래스 구조](#클래스-구조)
  - 3-2 [테이블 관계](#테이블-관계)
  - 3-3 [todolist](#todolist)
### 4. DEMO  
  - 4-1 [Contents List](#Contents-List)
  - 4-2 [UI 및 Code](#UI-및-Code)

<br>

***

<br>

# 🔖 프로젝트 소개
## 간단 소개  
- 구분 : 웹개발  
- 명칭 : 그...스터디카페  
- 소개 : 스터디카페 예약 시스템  
- 개발인원 : 본인 외 2명  
- 제작기간 : 2020.12.18 ~ 2021.01.19 (4주)  
- 주 담당 업무 : 상품 관련 기능 구현, 문의 메일 전송 기능 구현  
- 보조 업무 : DB 설계 및 테이블 정의, 메인페이지 및 이용안내 페이지 구현  

<br>

## 기획 배경 및 목적
카페에서 공부를 하는 카공족, 업무를 보는 코피스족 등 공부 문화와 라이프 스타일의 변화로 스터디카페의 이용객이 점차 증가하고 있습니다.   


저희 팀원들 모두 스터디카페를 자주 이용하며 기존의 현장 결제 및 좌석 선택 방식에 대한 개선의 필요성을 느끼게 되어 온라인 예약 시스템을 구현하게 되었습니다.   


현재 스터디 카페 이용을 위해서는 대부분 입구에서 키오스크 1대로 사용권을 직접 발권하거나 사전에 좌석 선택이 어렵다는 점이 있으며,   


저희는 편리함과 유용성 증대를 목표로 이번 프로젝트를 통해 실시간 예약 및 조회 시스템을 구현하였습니다.

<br>

## 개발 환경
- Back-End : JAVA, JSP  
- Front-End : HTML, CSS, JS, BootStrap  
- Database : Oracle, eXerd  
- Library: jQuery, ojdbc, JSTL  
- Server : Apache Tomcat v9.0  
- IDE : Eclipse  
- Control : GitHub  
- OS : Windows 10  
　  
<br><br>

# 🙆 팀원 소개  
## Team 김이박
|  | 　팀원　 | 　팀원　 | 　팀장　 |  
|:--------:|:--------:|:--------:|:--------:|  
| 　name　 | 　김영남　 | 　이지은　 | 　박현지　 |  
| git | [<img width="30" src="https://user-images.githubusercontent.com/74857433/114282246-b567cb80-9a7d-11eb-9bfe-8982f04e1cfc.png" />](https://github.com/YoungnamK) | [<img width="30" src="https://user-images.githubusercontent.com/74857433/114282246-b567cb80-9a7d-11eb-9bfe-8982f04e1cfc.png" />](https://github.com/seeyoufriyay) | [<img width="30" src="https://user-images.githubusercontent.com/74857433/114282246-b567cb80-9a7d-11eb-9bfe-8982f04e1cfc.png" />](https://github.com/Hyunji-P) |  

<br>

## 역할 분담  
<details>
    <summary> Click! :point_up_2: </summary>
  
<img src="https://user-images.githubusercontent.com/74857433/114042123-1c3f8600-98c0-11eb-848c-45fc9a86850c.png" align="right">

</details>

<br><br>

# 🛠 프로그램 구조
## 클래스 구조
<details>
    <summary> Click! :point_up_2: </summary>
 
<img src="https://user-images.githubusercontent.com/74857433/114030785-afbf8980-98b5-11eb-863e-4bc1de561d3a.png" align="right">

</details>

<br>

## 테이블 관계
<details>
    <summary> Click! :point_up_2: </summary>

ERD

![erd](https://user-images.githubusercontent.com/74857433/114038701-0c727280-98bd-11eb-8f5b-07c4c0325dc0.png)

</details>

<br>

## todolist
<details>
    <summary> Click! :point_up_2: </summary>
  
###### *전체 기능에 대한 todolist입니다.*  
![image](https://user-images.githubusercontent.com/74857433/114054509-e48a0b80-98ca-11eb-839b-6cac7e6f9c86.png)

</details>

<br><br>

# 👩🏻‍💻 DEMO
## Contents List
###### *담당 기능은 Bold.*
  1. **메인페이지**
  2. 회원가입/탈퇴
  3. 로그인/로그아웃
  4. ID/PW 찾기
  5. 회원 상세보기
  6. 회원 정보 수정
  7. 공지사항 및 답글
  8. 공지사항 등록, 수정, 삭제
  9. **상품 목록 및 상세보기**
  10. **상품 등록, 수정, 삭제**
  11. 예약하기
  12. 예약 목록 및 상세보기
  13. **문의 메일 전송하기**
  14. 관리자메뉴 - 전체회원목록
  15. **관리자메뉴 - 매출현황**

<br>

## UI 및 Code  
###### *담당 기능을 중심으로 작성하였습니다.*
### 메인페이지 및 QnA 메일 전송
![studycafe01](https://user-images.githubusercontent.com/74857433/114054240-a2f96080-98ca-11eb-85c3-7cc9fa74e6c0.gif)
* 메인페이지 하단의 QnA를 통해 문의 메일을 전송할 수 있습니다.  
* Gmail SMTP를 통해 메일 전송 기능을 구현하였으며, 메인 view페이지에서 입력받은 메일주소와 문의내용 등 텍스트를 관리자의 메일로 전송합니다.  
* [코드보기 Click! :point_up_2:](https://github.com/seeyoufriyay/StudyCafe/blob/master/StudyCafe_2/src/mypkg/qna/MailSend.java)  

<br>

### 이용 안내 및 상품 목록 
![studycafe1](https://user-images.githubusercontent.com/74857433/113317664-8ef1b400-934a-11eb-8dfa-c4bf13555a55.gif)
* 좌석 예약 화면은 이용안내 또는 예약하기 탭을 통해 비회원/회원 모두 접근 가능합니다.  
* dao의 SelectDataList메소드를 통해 상품테이블에 접근하여 필요한 데이터를 가져와 목록으로 보여줍니다.  
* [코드보기 Click! :point_up_2:](https://github.com/seeyoufriyay/StudyCafe/blob/master/StudyCafe_2/src/mypkg/product/ProductListController.java)

<br>

### 좌석 상세보기  
![studycafe2_1](https://user-images.githubusercontent.com/74857433/113315359-299cc380-9348-11eb-8459-d915dafd3366.gif)
* 좌석 상세보기 화면은 [상품 목록] - [좌석유형] 순으로 선택하여 접근합니다.  
* 날짜는 현재날짜를 기준으로 최대 2주 이내까지 선택할 수 있습니다.  
* 시작 및 시간은 오전 9시부터 오후 9시까지 최소 1시간 단위로 선택할 수 있습니다.  
* 날짜와 시간은 제이쿼리 UI 중 datepicker와 timepicker 옵션을 통해 선택 기능을 구현했습니다.  
* 예약하기를 눌렀을 때, 중복확인 및 유효성검사 통과 후 DB의 예약테이블에 데이터를 추가합니다.  
* [코드보기 Click! :point_up_2:](https://github.com/seeyoufriyay/StudyCafe/blob/master/StudyCafe_2/WebContent/product/prDetail.jsp)

<br>

### 관리자용) 좌석 등록 
![studycafe2_1](https://user-images.githubusercontent.com/74857433/114059092-fbcaf800-98ce-11eb-9e1f-d749b380a276.gif)
* 좌식 등록 시 좌석 유형, 이름, 가격, 파일 업로드 등 필수 입력사항을 작성하고 유효성검사 통과 시 상품테이블에 추가됩니다.  
* 실제 좌석 등록 시 상품 예약날짜 및 시간은 테스트 등은 관리자에게 필요하지 않지만, 필요한 경우를 고려하여 추가해 놓았습니다.  
* [코드보기 Click! :point_up_2:](https://github.com/seeyoufriyay/StudyCafe/blob/master/StudyCafe_2/src/mypkg/product/ProductInsertController.java)

<br>

### 관리자용) 좌석 관리 및 매출 현황
![studycafe03](https://user-images.githubusercontent.com/74857433/114061912-e4413e80-98d1-11eb-9fba-f9d00bc5e31f.gif)
* 좌식 관리 화면에서 기존 등록된 좌석 목록을 확인하고 정보를 수정 및 삭제합니다.  
* 매출 현황은 회원별, 월별 기준으로 누적건수와 총매출 등을 보여줍니다.  
* 회원별 매출은 예약 이력이 있는 회원 아이디를 조회하여 해당 회원의 각 이용 금액을 누적하여 보여줍니다.  
* 월별 매출은 매출 내역이 있는 월을 조회하여 해당 월의 예약 건 수와 총금액을 오름차순으로 보여줍니다.  
* [코드보기 Click! :point_up_2:](https://github.com/seeyoufriyay/StudyCafe/blob/master/StudyCafe_2/src/mypkg/dao/PriceDao.java)

<br>

