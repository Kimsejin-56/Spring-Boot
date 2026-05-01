package hello.external;

import lombok.extern.slf4j.Slf4j;

import java.util.Properties;

@Slf4j
public class JavaSystemProperties {

    public static void main(String[] args) {
        Properties properties = System.getProperties();
        for (Object key : properties.keySet()) {
            log.info("prop {}={}", key, System.getProperty(String.valueOf(key)));
        }

        //사용자가 직접 자바 시스템 속성 정의
        //IDE가 아닌 jar로 실행할 때 명령어(실행 시점에 자바 시스템 속성 추가)
        //java -Durl=devdb -Dusername=dev_user -Dpassword=dev_pw -jar app.jar
        String url = System.getProperty("url");
        String username = System.getProperty("username");
        String password = System.getProperty("password");

        log.info("url={}", url);
        log.info("username={}", username);
        log.info("password={}", password);
    }
}
