# Author :- Nimit Agarwal Pin Box Library implemented...
### Provide widget in the xml file for enter OTP/Password in the Pinbox
<p>
  <img src="https://user-images.githubusercontent.com/86598310/190971301-814f5201-f515-478d-9f4a-3bca03a09d70.jpeg" width = "30%" height = "450" >
  <img src="https://user-images.githubusercontent.com/86598310/190971310-fdc6cc6c-302d-4d22-a01a-5fb6679646a7.jpeg" width="30%"  height = "450"   alt="accessibility text">
  <img src="https://user-images.githubusercontent.com/86598310/190971328-04f81701-266b-4f50-8e14-8d090be7695a.jpeg" width="30%" height = "450" alt="accessibility text">
</p>

## Add it in your root build.gradle at the end of repositories:
### allprojects {
		repositories {
			
			maven { url 'https://jitpack.io' }
		}
	}
  ##  Add the dependency
  ###	dependencies {
	        implementation 'com.github.NimitA123:PinBoxLibraryBigOh:1.0.0'
	}
	
	
## Add PinView in the xml file
### <com.nimitagrawal.pinbox.PinView
    android:id="@+id/firstPinView"
    style="@style/PinWidget.PinView"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:cursorVisible="true"
    android:hint="Hint."
    android:inputType="text"
    android:itemBackground="@mipmap/ic_launcher"
    android:padding="@dimen/common_padding"
    android:textColor="@color/text_colors"
    android:textSize="18sp"
    android:textStyle="bold"
    app:cursorColor="@color/line_selected"
    app:cursorWidth="2dp"
    app:hideLineWhenFilled="true"
    app:itemCount="5"
    app:itemHeight="48dp"
    app:itemRadius="4dp"
    app:itemSpacing="0dp"
    app:itemWidth="48dp"
    app:lineColor="@color/line_colors"
    app:lineWidth="2dp"
    app:viewType="rectangle" />
    
   #### if viewType is circle than you can use app:circleItemRadius="20dp" to specify the radius of the circle.
    
