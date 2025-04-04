# 🛒 Product Management Service

**Spring Boot 기반의 전자상거래 상품 관리 백엔드 서비스**입니다.  
상품 등록, 조회, 수정, 삭제를 포함한 기본적인 상품 관리 기능을 RESTful API로 제공합니다.  
JPA, MySQL, Spring Security, JWT 등을 활용하여 실제 서비스 수준의 웹 애플리케이션을 구현하였습니다.



## ✅ 주요 기능

- **회원 기능**: 회원가입, 로그인, JWT 인증 기반 보안
- **상품 관리**: 상품 등록, 수정, 삭제, 상세 조회
- **검색 & 필터**: 상품 검색 및 정렬
- **댓글 기능**: 상품에 대한 댓글 작성 및 관리
- **주문 기능**: 장바구니 담기, 주문 처리
- **이미지 업로드**: AWS S3를 이용한 이미지 업로드
- **페이지네이션**: 상품 목록 페이지 나누기
- **예외 처리**: REST API 표준 예외 처리 적용
- **배포**: AWS Elastic Beanstalk를 통한 실서버 배포



## ⚙️ 기술 스택

| 분류             | 사용 기술                                                      |
|------------------|---------------------------------------------------------------|
| Backend          | Spring Boot 3, Spring Security, Spring Data JPA              |
| ORM & DB         | Hibernate, MySQL                                              |
| 인증             | JWT (Json Web Token), Session 기반 로그인                     |
| 프론트 템플릿    | Thymeleaf                                                     |
| 배포             | AWS Elastic Beanstalk, S3                                     |
| 프로젝트 관리    | Gradle, IntelliJ IDEA                                         |
| 기타             | Lombok, DTO 패턴, AOP 기반 예외 처리                          |



## 💡 학습 내용 및 구현 경험

- Spring Boot 3.0 기반 웹 서버 개발
- Java 문법 복습 및 객체지향 프로그래밍 활용
- JPA & Hibernate 기반 Entity 설계 및 데이터베이스 연동
- Thymeleaf로 동적 페이지 생성
- JWT 인증 기반 보안 처리 및 로그인 상태 유지
- AJAX와 RESTful API 연동
- 서비스/레포지토리/DTO 분리로 유지보수성과 확장성 강화
- AWS S3 이미지 업로드와 Elastic Beanstalk 배포 경험
- 예외 처리 AOP 및 통합 테스트 적용



## 📌 향후 개선 사항

- 상품 다중 이미지 업로드
- 관리자 페이지 UI 구현
- Redis 캐시 적용
- 테스트 코드 보완 및 CI/CD 파이프라인 구축

