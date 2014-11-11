1、微信导航
原作者：http://blog.csdn.net/guolin_blog/article/details/26365683
使用ActionBar+PagerSlidingTabStrip（https://github.com/astuetz/PagerSlidingTabStrip  ）导航。
容器使用ViewPager+Fragment。
在Fragment中重写setuservisiblehint()方法。来避免了ViewPager预加载下一个Fragment。
