# LoadingView

菊花加载中

Step 1. Add the JitPack repository to your build file

```java
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  ```
Step 2. Add the dependency
```java
	dependencies {
	        implementation 'com.github.leifu1107:LoadingView:v1.0'
	}
  ```
Share this release:

# 基本使用

```java
loadingView = new LoadingDialog.Builder(this)
                    .setMessage("加载中...")
                    .setCancelable(true)
                    .setCancelOutside(true)
                    .create(); 

loadingView.show();
```
