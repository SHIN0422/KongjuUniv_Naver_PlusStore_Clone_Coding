# 🛒 네이버 플러스스토어 클론코딩  
## DB 설계 기반 Full-Stack 팀 프로젝트

---

## 개요
네이버 스마트스토어(Naver SmartStore)를 분석하여  
**DB 모델링 → Backend API → Frontend UI → 배포**까지  
실제 전자상거래 서비스와 유사한 구조를 구현하는 팀 프로젝트입니다.

---

## 기술 스택

### Frontend
- React  
- TypeScript  

### Backend
- Spring Boot  
- Spring MVC  
- Spring Data JPA  
- MySQL  
- Lombok  

### Database
- MySQL 8.x  
- ERD / 정규화 / 인덱스 설계 포함  

### Server / Deployment
- Railway.app (무료 서버 호스팅)  
- Railway MySQL or 외부 MySQL 연동  

---

## 프로젝트 설계 구성

### 1. 요구사항 분석
- 회원(구매자), 판매자, 관리자 Use-Case 정의  
- 상품, 옵션, 카테고리, 장바구니  
- 주문, 결제, 배송 상태 관리  
- 리뷰, 정산 등 추가 기능 구조 파악  

---

### 2. DB 모델링
- **개념 모델 (ERD)**  
- **논리 모델 (정규화, 관계 매핑)**  
- **물리 모델 (데이터 타입, 제약조건, 인덱스 설계)**  

---

### 3. Backend API 설계
- Controller / Service / Repository 계층 분리  
- DTO 기반 요청/응답 구조  
- 예외 처리 및 Validator 적용  
- RESTful API 구축  

