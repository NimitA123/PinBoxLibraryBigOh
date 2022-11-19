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
	        implementation 'com.github.NimitA123:PinBoxLibraryBigOh:1.0.3'
	}
	
	
## Add PinView in the xml file

```xml  
<com.nimitagrawal.pinbox.PinView
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
```
    
<p style="color:blue;">
    if viewType is circle than you can use app:circleItemRadius="20dp" to specify the radius of the circle.
</p>



##  Kotlin
     var pinView = findViewById(R.id.pinView)
     pinView.setTextColor(
        ResourcesCompat.getColor(getResources(), R.color.colorAccent, getTheme()));
     pinView.setTextColor(
        ResourcesCompat.getColorStateList(getResources(), R.color.text_colors, getTheme()));
     pinView.setLineColor(
        ResourcesCompat.getColor(getResources(), R.color.colorPrimary, getTheme()));
     pinView.setLineColor(
        ResourcesCompat.getColorStateList(getResources(), R.color.line_colors, getTheme()));
     pinView.setItemCount(4);
     pinView.setItemHeight(getResources().getDimensionPixelSize(R.dimen.pv_pin_view_item_size));
     pinView.setItemWidth(getResources().getDimensionPixelSize(R.dimen.pv_pin_view_item_size));
     pinView.setItemRadius(getResources().getDimensionPixelSize(R.dimen.pv_pin_view_item_radius));
     pinView.setItemSpacing(getResources().getDimensionPixelSize(R.dimen.pv_pin_view_item_spacing));
     pinView.setLineWidth(getResources().getDimensionPixelSize(R.dimen.pv_pin_view_item_line_width));
     pinView.setAnimationEnable(true);// start animation when adding text
     pinView.setCursorVisible(false);
     pinView.setCursorColor(
        ResourcesCompat.getColor(getResources(), R.color.line_selected, getTheme()));
     pinView.setCursorWidth(getResources().getDimensionPixelSize(R.dimen.pv_pin_view_cursor_width));
     pinView.addTextChangedListener(new TextWatcher() {...});
     pinView.setItemBackgroundColor(Color.BLACK);
     pinView.setItemBackground(getResources().getDrawable(R.drawable.item_background));
     pinView.setItemBackgroundResources(R.drawable.item_background);
     pinView.setHideLineWhenFilled(false);
     pinView.setPasswordHidden(false);
     pinView.setTransformationMethod(new PasswordTransformationMethod());

## Attributes
  ***
  * itemCount, the length of your pin code.
  itemWidth, the width of each item.
  itemHeight, the height of each item.
  itemSpacing, the spacing between two items.
  lineWidth, the line (border) width.
  lineColor, the line (border) colors.
  viewType, the view type of PinView, currently this will be one of rectangle, line or none.
  cursorVisible, show cursor or not.
  cursorColor, the cursor color.
  cursorWidth, the width of cursor.
  itemBackground, the item background.
  hideLineWhenFilled, specifies whether the line (border) should be hidden or visible when text entered.



## Thanks......
    
