# LoadingView

菊花加载中

# 基本使用

```java
loadingView = new LoadingDialog.Builder(this)
                    .setMessage("加载中...")
                    .setCancelable(true)
                    .setCancelOutside(true)
                    .create(); 

loadingView.show();
```
