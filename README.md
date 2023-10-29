## 🖥️welcome-pet-capstone

### 🔧수정 사항

먼저, unityLibrary 추가와 unity, sdk, ndk 경로 모두 변경 후에 아래에 해당하는 에러 찾아서 해결하기

#### 23.10.25
- app > java > ExampleInstrumentUnitTest file ➜ Junit4 Add Dependency 후 오류 제거 ✅
- Run/Debug Configurations <no module> ➜ build.gradle or android file 열어야 함 
- sdk location not found ➜ 시스템 변수 > ANDROID_HOME > 경로 설정 🔗[참고링크](https://velog.io/@vector13/Android-Studio-SDK-location-not-found-%EC%97%90%EB%9F%AC-%ED%95%B4%EA%B2%B0-%EB%B0%A9%EB%B2%95) ✅
- Unity Full Delete and reinstall 🔗[참고링크](https://www.youtube.com/watch?v=IpOeYJYcYtE) (일단 보류)

#### 23.10.27
- AR 패키지에 클래스 추가, UnityPlayerView 클래스 구현은 일단 안 함 ➜ Unity 클래스 제외하면 에러 안 남 ✅ 
- App > manifest > AndroidManifest.xml
  - 5 : uses-permission 에러 ➜ 카메라 권한 추가 후 에러 제거 🔗[참고링크](https://velog.io/@ksh-g001/Android-AR-ARCore-SceneView) ✅
  - uses-permission 아래에 
- build.gradle(:app)에서 unity, AR을 제외한 나머지 의존성 주석 해제 ➜ 실행 후 에러 안 남 ✅
- gradle.properties에서 org.gradle.parallel=true 주석 해제 ➜ gradle build 속도 향상 해결 ✅
- #### unityLibrary module이 없는 문제 ➜ 모듈이 없어서 에러가 난 것 
  - 프로젝트 파일에 unityLibrary파일 복사붙여넣기 
  - 복사한 경로를 build.gradle(Project:..), settings.gradle(Project Settings) 변경
  - build.gradle에 주석처리 되어 있던 의존성 모두 추가
  - Sync build 후 unityLibrary에 module이 추가되고 unityPlayerView클래스 오류 해결 ✅

#### 23.10.29
- targetSdkversion, compileSdkVersion 30 버전 에러, 설치된 거 없음 ➜ settings > sdk platforms에서 API Level 33 설치 후 프로젝트 다시 열면 gradle 구조가 변경되어있을 수 있음. ➜ Unity 없는 파일 처음부터 새로 열기 후 위 과정 반복
- Gradle Scripts > local.properties ndk 경로 오류 ➜ File > Settings > sdk 검색 후 SDK Tools탭에서 하단의 Show Package Details 체크하면 NDK 설치 가능, 경로 변경 후 build gradle
 - '21.3.xxx' version 다운받아야 함. 2CppTask 버전이랑 맞아야 함 🔗[참고링크](https://math-coding.tistory.com/177)
  - File > Project Structure > Sdk Location에서 경로 변경되었는지 확인, 에러 해결 ✅
- unityLibrary > manifests > AndroidManifest.xml에서 activity 에러 ➜ Ctrl+Enter하면 알아서 추가 됨


### 📃보완 목록

- Emulator digital wellbeing isn't responding 
- 홈 화면 로딩 안 됨

깃 토큰 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
