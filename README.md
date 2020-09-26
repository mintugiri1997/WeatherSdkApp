# WeatherSdkApp

In this WeatherSdkApp we have used OpenWeatherMap Api for getting weather data.

# Usage

Add it in your root build.gradle at the end of repositories:

```gradle
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```

# Dependency

Add the dependency:

```gradle
dependencies {
	        implementation 'com.github.mintugiri1997:WeatherSdkApp:0.0.1'
	}
```

To start using the library you just need to call WeatherSdk with a valid city name and context:

```java

public MyActivity extends Activity {
	@Override public void onCreate() {
		super.onCreate();
    //city = "Any City Name" 
		WeatherSdk.getData(city, context);
	}
}

```
For setting fields into Textview:

```java
//You can use it like this
textView.setText(WeatherSdk.getCityName);
```

# Methods:

getTemp(), 
getMainState(), 
getDescription(), 
getFeelsLike(), 
getTempMin(), 
getTempMax(), 
getPressure(), 
getHumidity(), 
getSpeed(), 
getDegree(), 
getCityName(), 
getCountry(), 
getIconId()

