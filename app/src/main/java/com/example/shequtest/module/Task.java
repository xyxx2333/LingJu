package com.example.shequtest.module;

import cn.bmob.v3.BmobObject;
import cn.bmob.v3.datatype.BmobFile;
import cn.bmob.v3.datatype.BmobRelation;

public class Task extends BmobObject {
    private String taskcotent;//任务文字内容
    private String title;//标题
    private MyUser author;//发帖人
    private BmobFile picture;//图片
    private BmobRelation view;//浏览量(关联到用户)一对多关系：用于存储评论该帖子的所有用户
}
