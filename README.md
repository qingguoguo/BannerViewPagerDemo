# BannerView
### BannerView简介
封装ViewPager成BannerView  

1.支持自定义属性配置  
2.支持无限轮播，触摸暂停，抬起继续轮播  
3.支持banner点击事件

### 如何使用
添加依赖
```
implementation 'com.qingguoguo:bannerviewpager:1.2.0'  
```
具体可以参考demo工程中的app module代码
```
 @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBannerView = findViewById(R.id.banner);
        // mBannerView.showPageIndicator(); // 默认是显示的
        mBannerView.setOnBannerItemClickListener(new BannerViewPager.BannerItemClickListener() {
            @Override
            public void click(int position) {
                Toast.makeText(MainActivity.this, "点击了banner" + position, Toast.LENGTH_SHORT).show();
            }
        });
        mBannerView.setAdapter(new BannerAdapter() {
            @Override
            public View getView(int position, View convertView) {
                ImageView imageView = new ImageView(MainActivity.this);
                imageView.setImageResource(R.mipmap.ic_launcher);
                return imageView;
            }

            @Override
            public int getCount() {
                return 4;
            }

            @Override
            public String getBannerDesc(int position) {
                return "哎哟，不错哦";
            }
        });
    }
```
