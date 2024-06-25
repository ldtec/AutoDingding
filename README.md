# AutoDingDing

Kotlin+Java混编实现的钉钉打卡小工具，解决您上班途中迟到问题，只需一部备用手机置于公司工位，设置一下第二天上班打卡时间，接下来的事就交给我吧。  
相比于之前的版本，此版本做了版本兼容，最低兼容 6.0（本人测试机版本），最高兼容到Android 14（本人手机版本）或者鸿蒙
3.0系统。
此应用最开始的本意是方便自己，但后来本人换了新的单位，此款工具软件也就不用了，所以选择开源，有不到之处还请谅解。  
本应用仅限学习和内部使用，严禁商用和用作其他非法用途，如有违反，与本人无关！！！  
本应用的出发点是为了解决上班路途遥远，或者每天卡点上班族的燃眉之急，出发点自认为是友好的，但是，不可滥用！！！

# 说几句（最新版本 1.4.3 ）- 更新时间：2024年6月25日14点32分

本不想多说什么的，奈何总有人问，那我就给你们问的人统一回复下！  
**开篇我就说过了，我早已经换了单位，这个软件已经用不上了，以后估计很少会更新版本或者不会更新版本了，有能力的可以自行下载源码修改。
**  
其次，总有人提自己把锁屏功能关掉，弄个定时闹钟，到点的时候亮屏，再隔一分钟就能自动打卡。  
你们说的这些我都考虑过，也都尝试过。非系统级别应用调用系统AlarmManager会出现不能精准唤醒的问题（这里涉及到PowerManager和CPU唤醒机制），这样会导致迟到，一个月迟到个几次，你们能接受吗？  
监听微信或者QQ消息（**已实现，但是灭屏后概率收不到消息，这与系统以及推送送达率有关**
），监听电话或者短信（必须要电话卡），监听系统闹钟（高版本无法监听）我都试过，以上种种或多或少的都会出现不能按时打卡导致迟到的问题，目前的方式虽然是最笨的，但却是最稳妥的。  
另外，手机灭屏了，关机了可能都不知道，还谈什么打卡？如果觉得亮屏耗电严重，把手机亮度调最低不就行了？

# 注意！！！

#### [被检测到作弊的，用此版本（Android 6+）(AUTO_20240625_1.4.3.apk)](apk/auto/release/AUTO_20240625_1.4.3.apk)

1. 解决首次添加任务不显示数据的问题。
2. 保存手机所有收到的通知

#### 收不到邮件的问题：

把工具进程杀掉，然后重启工具并关闭工具的通知监听，最后再重新打开工具的通知监听。随便发条消息到手机，如果能在工具的”所有通知“找到刚刚发的消息，则表示可以正常监听通知，否则重复刚刚的操作。

#### 如有其他问题请加QQ群：560354109

#### [历史版本点这里](apk/history)

# 使用注意事项：

1、请先确认悬浮窗权限已开启，如不开启将Android
10以上系统可能会出现闪退或者仅能打卡一次且没有邮件通知的问题。（找到"自动打卡"软件，打开悬浮窗权限即可）

![Screenshot_2024-03-19-09-02-42-81_fc704e6b13c4fb26bf5e411f75da84f2.jpg](appImage/Screenshot_2024-03-19-09-02-42-81_fc704e6b13c4fb26bf5e411f75da84f2.jpg)

2、请先确认好通知栏监听已开启，如不开启将无法监听打卡成功的通知。（"其他设置"
可以直接跳转到系统通知监听页面，打开开关就好了。放心，不会有其他窃密小动作），然后设置钉钉设置为“极速打卡”。

![Screenshot_2024-03-19-09-03-02-56_fc704e6b13c4fb26bf5e411f75da84f2.jpg](appImage/Screenshot_2024-03-19-09-03-02-56_fc704e6b13c4fb26bf5e411f75da84f2.jpg)

3、**【很重要】**
最近钉钉做了作弊检测，所以，需要打开手机无障碍服务。因为此版本不会覆盖安装之前的版本，防止被之前版本干扰，请先卸载之前的版本（之前的安装包的包名估计是被钉钉拉黑了），具体设置如下：

![Screenshot_2024-05-10-14-25-52-36_fc704e6b13c4fb26bf5e411f75da84f2.jpg](appImage/Screenshot_2024-05-10-14-25-52-36_fc704e6b13c4fb26bf5e411f75da84f2.jpg)
![Screenshot_2024-05-10-14-25-58-67_fc704e6b13c4fb26bf5e411f75da84f2.jpg](appImage/Screenshot_2024-05-10-14-25-58-67_fc704e6b13c4fb26bf5e411f75da84f2.jpg)

![Screenshot_2024-05-10-14-26-03-93_fc704e6b13c4fb26bf5e411f75da84f2.jpg](appImage/Screenshot_2024-05-10-14-26-03-93_fc704e6b13c4fb26bf5e411f75da84f2.jpg)
![Screenshot_2024-05-10-14-26-12-73_fc704e6b13c4fb26bf5e411f75da84f2.jpg](appImage/Screenshot_2024-05-10-14-26-12-73_fc704e6b13c4fb26bf5e411f75da84f2.jpg)

设置完成后，点击左上角的返回键回到打卡软件，可以在设置界面查看是否打开成功，如果没有成功请重复此操作。设置完成后，后续步骤和之前一样。另外，无障碍服务会帮助你直接跳转到打卡界面（有那个大圆按钮的界面），不再是之前的钉钉主界面。

4、如果想通过QQ或者微信唤起钉钉打卡，需要设置如下图：

![Screenshot_2024-05-02-11-29-45-45_e6871cd13ad370b30dca80a8c4050ac0.jpg](appImage/Screenshot_2024-05-02-11-29-45-45_e6871cd13ad370b30dca80a8c4050ac0.jpg)

如果不需要可以跳过此步骤。

5、设置打卡结果通知邮箱（经自测试，邮箱设置支持QQ邮箱和163邮箱，别的邮箱有需要的可以自行测试）

![Screenshot_2024-03-19-09-03-20-89_28207dbc726d79bfd22d0f80719fc3af.jpg](appImage/Screenshot_2024-03-19-09-03-20-89_28207dbc726d79bfd22d0f80719fc3af.jpg)

好了，基本设置就是这样了，附一张主页面，如下：

![Screenshot_2024-03-19-09-04-16-20_28207dbc726d79bfd22d0f80719fc3af.jpg](appImage/Screenshot_2024-03-19-09-04-16-20_28207dbc726d79bfd22d0f80719fc3af.jpg)
![Screenshot_2024-05-02-11-42-55-86_28207dbc726d79bfd22d0f80719fc3af.jpg](appImage/Screenshot_2024-05-02-11-42-55-86_28207dbc726d79bfd22d0f80719fc3af.jpg)

5、打卡结果如下：

a、打卡成功

![打卡成功](appImage/6.png)

b、打卡失败（失败原因有很多，比如，钉钉账号被自己另一个手机挤下去，再比如，钉钉未设置极速打卡，或者钉钉应用内部打卡通知或者手机通知被关闭，或者钉钉打卡手机又2个以上，因为钉钉最多只能有两个常用打卡手机等等情况都会导致打卡失败，所以，在使用本软件之前，最好先自行测试一两天没确认没问题之后再使用，谢谢理解！）
