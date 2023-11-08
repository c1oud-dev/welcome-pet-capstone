## 🖥️welcome-pet-capstone

### 🔧수정 사항

먼저, unityLibrary 추가와 unity, sdk, ndk 경로를 본인 컴퓨터에 있는 프로젝트 파일로 옮긴 후, 경로 모두 변경 후에 build하기, 그리고 아래에 해당하는 에러 찾아서 해결하기

#### 23.10.25
- app > java > ExampleInstrumentUnitTest file ➜ Junit4 Add Dependency 후 오류 제거 ✅
- Run/Debug Configurations <no module> ➜ build.gradle 열어야 함 
- sdk location not found ➜ 시스템 변수 > ANDROID_HOME > 경로 설정 🔗[참고링크](https://velog.io/@vector13/Android-Studio-SDK-location-not-found-%EC%97%90%EB%9F%AC-%ED%95%B4%EA%B2%B0-%EB%B0%A9%EB%B2%95) ✅
- Unity Full Delete and reinstall 🔗[참고링크](https://www.youtube.com/watch?v=IpOeYJYcYtE) (일단 보류)

#### 23.10.27
- AR 패키지에 클래스 추가, UnityPlayerView 클래스 구현은 일단 안 함 ➜ Unity 클래스 제외하면 에러 안 남 ✅ 
- App > manifest > AndroidManifest.xml
  - 5 : uses-permission 에러 ➜ 카메라 권한 추가 후 에러 제거 🔗[참고링크](https://velog.io/@ksh-g001/Android-AR-ARCore-SceneView) ✅
- Gradle Scripts > build.gradle(:app)에서 unity, AR을 제외한 나머지 의존성 주석 해제 ➜ 실행 후 에러 안 남 ✅
- Gradle Scripts > gradle.properties에서 org.gradle.parallel=true 주석 해제 ➜ gradle build 속도 향상 해결 ✅
- #### unityLibrary module이 없는 문제 ➜ 모듈이 없어서 에러가 난 것 
  - 프로젝트 파일에 unityLibrary파일 복사붙여넣기 
  - 복사한 경로를 build.gradle(Project:..), settings.gradle(Project Settings) 변경
  - build.gradle에 주석처리 되어 있던 의존성 모두 추가
  - Sync build 후 unityLibrary에 module이 추가되고 unityPlayerView클래스 오류 해결 ✅

#### 23.10.29
- targetSdkversion, compileSdkVersion 30 버전 에러, 설치된 거 없음 ➜ settings > sdk platforms에서 API Level 30 설치 후 프로젝트 다시 열면 gradle 구조가 변경되어있을 수 있음. ➜ Unity 없는 파일 처음부터 새로 열기 후 위 과정 반복
- Gradle Scripts > local.properties ndk 경로 오류 ➜ File > Settings > sdk 검색 후 SDK Tools탭에서 하단의 Show Package Details 체크하면 NDK 설치 가능, 경로 변경 후 build gradle ➜ ndk 해결 ✅
 - '21.3.xxx' version 다운받아야 함. 2CppTask 버전이랑 맞아야 함 🔗[참고링크](https://math-coding.tistory.com/177)
  - File > Project Structure > Sdk Location에서 경로 변경되었는지 확인, 에러 해결 ✅
- unityLibrary > manifests > AndroidManifest.xml에서 activity 에러 ➜ Ctrl+Enter하면 알아서 추가 됨

#### 23.10.30
- unityLibrary > jniLibs > arm64-v8a 패키지의 .so 파일들은 동적 라이브러리(프로그램실행후 필요할때 불려짐)
- Gradle Scripts > build.gradle(Project:프로젝트명) 에서 경로 변경 안 돼 있어서 UnityARCore.aar 에러 남 ➜ 수정 후 해결 ✅

🌟 여기까지는 Binding 에러, AR 에러 안 뜨고 실행 잘 됨. 그러나 홈 화면은 뜨지 않음. 🌟 

#### 23.11.01
- app > java > org.taehyeon.welcom_pet_khackathon > Home > progress_Fragment 클래스에서 58줄 에러 ➜ app > res > layout > fragment_progess.xml에 button이 없어서 주석 처리

<!--<img src="(https://github.com/c1oud-dev/welcome-pet-capstone/assets/117587834/b7491d10-012c-4ad8-b16c-6a18d08abf4b.png(https://github.com/c1oud-dev/welcome-pet-capstone/assets/117587834/bea5ef84-45c1-469c-a634-a938bc795f89)" width="200" height="300"/>-->

#### 23.11.09
- figma로 체험시작 화면 제작 완료
- 설문조사 화면 제작중

### 📃보완 목록

- Emulator digital wellbeing isn't responding 
- 홈 화면 로딩 안 됨 ➜ res > layout > activity_main.xml 애초에 홈 화면이 비어있긴 함
- 진척도 화면 안 나옴 ➜ res > layout > fragment_progress.xml 
- 회원가입하고 로그인 해도 설문조사 화면 나오지 않음 res > layout > fragment_home_.xml이 안 나옴
  - app > res > layout (대체로 사이즈 에러가 많음, 그러나 경고일 뿐이라서 굳이 안 고쳐도 된다고 한다.)
  - activity_survey.xml (TextView) Accessibility Issue 에러 ➜ 텍스트 크기 문제 🔗[참고링크](https://support.google.com/accessibility/android/answer/12159181)
  - activity_main.xml (viewPager) 에러 ➜ 화면 판독기에서 읽을 수 있는 라벨이 없다.
  - fragment_community_.xml (Button_add)
  - fragment_experience_.xml (editSearch)
  - fragment_shop_.xml (imageButton3) 에러 ➜ 화면 판독기에서 읽을 수 있는 라벨이 없다.
