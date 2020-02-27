# YAPP 14기 4조 프로젝트

<img width="965" alt="스크린샷 2020-02-28 오전 1 36 18" src="https://user-images.githubusercontent.com/34999925/75464903-36bfe400-59cb-11ea-8788-81fa2d14106d.png">



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
3. 

## 참고 Reference

1. https://thdev.tech/androiddev/2018/08/05/Android-Architecture-Components-ViewModel-Inject/ 
2. [java clean architecture - mvvm](https://github.com/googlesamples/android-architecture/tree/todo-mvvm-live/)
