# 我决定写一本Java实用技术，特点实用！实用！还是实用！



> **引言：**
>
> 最近掘金举办了一个活动叫“程序员必备小知识”，让我恍悟到工作中真的有很多必备知识，但是很多程序员为了追求高大上都忽略了。



## 前言

前几年我开始带应届生，有本科有硕士，到实际工作中发现，工作能力差距并不在于学历，而在于经验和思考。有的同学可以写一手好代码，使用的方法得当，代码分支健壮，而有的同学写的代码则惨不忍睹，虽然勉强能实现功能，但是使用的方法并不合适，也有很多同学重复造轮子，绞尽脑汁写了一个工具类已经有的方法。

如果单纯为了炫技而写的代码，那肯定不是工作需要的，但是能写出赏心悦目的健壮代码，那一定是基于多年的代码修养写出的。



很多Java教材和书籍都倾向于从小白开始介绍java的基础，然后全面而冗余地介绍所有java内容，等到实际工作中发现工作需要的java技术并没有掌握，而工作中并不需要的java技术（比如Swing）却占用了一定学习时间。更有甚者，面试时，一堆分布式和高并发理论，实际代码，连个线程安全方法都不会写，所以**实用**才是王道。

基于上述情况，笔者每次带新员工的时候都会从编码规范到必备基础知识开始让他们学习。



本次笔者根据在华为和阿里的工作经验，决定筹划整理和编写一本java实用技术，力求用最实用的技术帮助新入行的程序员成长，这里不炫技，只学技。前年机械工业出版社编辑找过我谈出书，当时因为太忙碌最终没有签约。

这次我决定先通过博客形式更新章节，如果大家反馈较好，后面再整理出书吧。

笔者假定阅读本书的读者已经具备必要的java基础知识，文中并不会全面讲解java的语法、控制语句和面向对象等概念，如有必要，请自行参看相关教材。



希望本书可以成为Java工程师踏入职场的第一本Java书。欢迎加入QQ交流群：`866944450`

对于每个章节，如果你有更好的方法，欢迎在评论区留言。

文中如有错误和不妥，也恳请指正。

PS：同名公众号同步更新。

## 全书思维导图

![《Java实用技术》——踏入职场的第一本java书](http://img.zqzhaopin.cn/md/java_mind.png)

## 章节介绍

### 章节划分

**本书计划分为4篇，共15章。**

其中第一篇为编程习惯和开发工具的介绍，俗话说磨刀不误砍柴工，良好的编程习惯会受益终身，而顺手的开发工具会显著提升战斗力。

第二篇为主要内容，包括了必备的String、数组、集合、对象、接口、异常和常用工具包。该篇内容以实际工作为内容，遴选优秀方法进行精讲，再给出实际代码进行应用讲解。最后将必备接口列举出来供大家自行学习。

第三篇综合性内容，包括了设计模式、Lambda表达式、Stream流式计算等高级技术，以及Spring基础、Maven等工具技术。这些技术在实际工作中可以提高代码质量，提高代码优雅性。

第四篇属于高阶内容，反射、枚举、IO和并发会简要介绍，Spring框架、多线程、缓存和分布式系统等内容作为预告，在以后的《Java高阶实用技术》中详细介绍。

如果大家对章节划分有更好的意见，也欢迎私信或者评论。



### 小节

每个章节下面会划分若干小节，每个小节的内容会有文字和代码，使用的demo以工作中常用场景为例，代码也以精简为主。当然，不可能所有的例子都恰到好处，如有不妥欢迎指正。

为了避免枯燥的讲解和代码沙漠，部分小节我会录制视频，发布在西瓜和B站，一起来玩哈。

每个小节结束，我也会以思维导图的方式做总结，方便大家记忆。

**形如：**![image-20211009221601616](http://img.zqzhaopin.cn/md/image-20211009221601616.png)



## 更新说明

不一定严格按照章节顺序更新，根据工作忙碌情况决定更新频率，尽量每周更新一个章节。

有些内容可能使用代码演示的方式更好，因此我会选取部分内容手写代码演示，配套视频发布到西瓜/B站，也欢迎大家前往交流。

书中代码样例我会在每期结束，统一整理到GitHub，如果你有更好的内容，也欢迎私信我添加到更新内容。

目前我仅在掘金社区和微信公众号第一时间发布，如需转载，请联系我获得授权。

*欢迎大家关注公众号，有资料有技术文章*

![欢迎大家关注公众号，有资料有技术文章](http://img.zqzhaopin.cn/javaqr.jpg)
