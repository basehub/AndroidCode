<?xml version="1.0" encoding="utf-8" ?>
<selector xmlns:android="http://schemas.android.com/apk/res/android">
<item android:state_window_focused="false"
android:drawable="@drawable/没有焦点时的图片背景" />
<item android:state_focused="true" android:state_pressed="true"
android:drawable=
"@drawable/非触摸模式下获得焦点并单击时的背景图片" />
<item android:state_focused="false" android:state_pressed="true"
android:drawable="@drawable/触摸模式下单击时的背景图片" />
<item android:state_selected="true"
android:drawable="@drawable/选中时的图片背景" />
<item android:state_focused="true"
android:drawable="@drawable/获得焦点时的图片背景" />
<selector>
