# YAPP 14기 4조 프로젝트 

### 'BORA' 앱 소개
### Emotion Record by colors (색깔을 통한 감정 관리 서비스)
- 🤹‍감정 + 📖일기 + 🎨그림 = 한줄 감성일기 캘린더앱

- 각 날짜의 내 감정을 색상과 한 줄로 표현합니다.

- 내용을 토대로 필터가 적용된 감정 사진을 확인할 수 있습니다.  

- 통계를 통해 월별로 가장 많이 선택한 감정을 확인할 수 있습니다.
#
<img width="210" alt="" src="https://user-images.githubusercontent.com/34999925/75469962-3f1c1d00-59d3-11ea-97ec-2aa32dbd58ef.jpg"><img width="210" alt="" src="https://user-images.githubusercontent.com/34999925/75469969-43e0d100-59d3-11ea-9383-af90263de1b3.jpg"><img width="210" alt="" src="https://user-images.githubusercontent.com/34999925/75469974-46432b00-59d3-11ea-9c86-cf8e412c4728.jpg"><img width="210" alt="" src="https://user-images.githubusercontent.com/34999925/75469977-480cee80-59d3-11ea-801a-4339baacefa9.jpg">
<img width="210" alt="" src="https://user-images.githubusercontent.com/34999925/75469979-493e1b80-59d3-11ea-80ea-5e358e09e617.jpg"><img width="210" alt="" src="https://user-images.githubusercontent.com/34999925/75469989-4ba07580-59d3-11ea-9c7f-c1437d380393.jpg"><img width="210" alt="" src="https://user-images.githubusercontent.com/34999925/75469993-4e02cf80-59d3-11ea-969d-0a7f51220432.jpg"><img width="210" alt="" src="https://user-images.githubusercontent.com/34999925/75469999-50652980-59d3-11ea-8175-d701be450c63.jpg">


## 기초 Architecture

1. AAC VIewModel 사용

   - 팀내 Java 전공자가 대부분이므로, Java 기반으로 로직 구성
   
     > 사용 rule  
     > - ViewModel 내에서는 **context** 를 사용하지 않는다.
     > - ViewModel에서 View를 갱신할 때, **LiveData**(or **SIngleLiveEvent**) 또는 **DataBinding**을 활용해서 알린다.
     > - View와 ViewModel의 의존성을 줄임
     >   ex> ViewModel 내의 데이터가 수정되더라도, View 수정 내용이 최대한 없도록 설계
     > - Activity의 onDestroy() 동작 시, ViewModel 내부의 **onCleared()** 를 통해 LiveData 를 초기화한다.

   

2. DataBinding

   - 팀원이 Java가 대부분이므로 Java 기반으로 로직 구성
   
     > **1, 2 example**  
     > Use DataBinding & AAC ViewModel : **TemplateActivity**  
     > Not Use : **NouseActivity**

   

3. Kotlin

   - 사용 희망하는 팀원에 따라 Kotlin 파일 사용할 수 있도록 구성
   
     > **3 example**  
     > Use DataBinding & AAC ViewModel : **SplashActivity**  
     > Not Use : **MainActivity**  

4. LiveData

   - LiveData를 통한 observe 

5. 추후 활용 예정 기능

   - Retrofit
   - RxJava

## 앱내 주요 기능 및 컴포넌트

1. [캘린더](https://github.com/search?l=Java&q=calendar&type=Repositories)
2. [차트 - MPAndroidChart](https://github.com/PhilJay/MPAndroidChart)

## 참고 Reference

1. https://thdev.tech/androiddev/2018/08/05/Android-Architecture-Components-ViewModel-Inject/ 
2. [java clean architecture - mvvm](https://github.com/googlesamples/android-architecture/tree/todo-mvvm-live/)
