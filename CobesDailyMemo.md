2024.12.13
JDK 11.0.25 설치
환경설정 완료

2024.12.14
inteliJ update - 24.3.1 ver

유튜브에서
톰캣은 9.0.8 버전  (재설치)
프로젝트 오픈하고 나서 링크 제대로 눌리는지 봐야 함. (완료)
Sprong core maven - 5.3.27 ver

C:\Users\bluem\IdeaProjects\ex00\src\main\webapp\WEB-INF\spring/root-context.xml


2024.12.15
환경 설정 ing ..
의존성 주입 테스트 까지 진행함.


    /**
     * method        : dataSource
     * date          : 24-12-04
     * return        : DataSource - 데이터베이스 연결을 관리하는 DataSource 객체
     * description   : MySQL 데이터베이스와 연결하기 위한 DataSource 설정.
     */
    @Bean(destroyMethod = "close")
    public DataSource dataSource() {
        DataSource ds = new DataSource();
        ds.setDriverClassName("com.mysql.jdbc.Driver");
        //ds.setUrl("jdbc:mysql://localhost/spring5fs?characterEncoding=utf8");  //빌드 실패
        ds.setUrl("jdbc:mysql://localhost/spring5fs?characterEncoding=utf8&useSSL=false&requireSSL=false");  // SSL을 사용하지 않도록 설정 ,  URL에 useSSL=false와 requireSSL=false를 추가
        ds.setUsername("spring5");  //Db연결시 사용자명
        ds.setPassword("spring5");  // Db연결시 암호
        ds.setInitialSize(2);       // 커넥션 갯수
        ds.setMaxActive(10);        // 커넥션 풀에서 가져올 수 있는 커넥션 max개수
        ds.setTestWhileIdle(true);  // 유휴 커넥션 검사
        ds.setMinEvictableIdleTimeMillis(1000*60*3);  // 최소 유휴 시간 3분
        ds.setTimeBetweenEvictionRunsMillis(1000*10);  // 유휴 커넥션 검사 주기: 10초
        return ds;
    }

2024.12.16
mariaDB JDBC 연결.
HikariCP 설정 
Mybatis 설정 완료
Mybatis의 Mapper 인터페이스, XML 설정 


