# EventCloseTag
通过EventBus来关闭指定activity页面，基类定义，可借鉴

## 简单解说

#1 首先引入 EventBus，官网地址：https://github.com/greenrobot/EventBus

#2 我们在Activity的自定义基类中进行如下操作：

 重写onCreate方法中加入 EventBus.getDefault().register(this); 进行注册
 
 重写onDestroy方法中加入 EventBus.getDefault().unregister(this);进行取消注册

 接下来就是关键方法了，在基类中定义如下方法：

   ```java
    @Subscribe
    public void closeCurrentActivity(Class cls) {
        if (TextUtils.equals(getClass().getName(), cls.getName()))
            this.finish();
    }
    ```
		
	 接下来的使用方法大家应该都很熟悉了
	 
	 EventBus.getDefault().post(MainActivity.class);
	 
	 就是post一个需要关闭的Activity的class过去就行了。
