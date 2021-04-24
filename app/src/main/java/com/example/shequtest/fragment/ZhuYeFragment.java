package com.example.shequtest.fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.shequtest.Adapter.AllmeunAdapter;
import com.example.shequtest.Adapter.JOBAdapter;
import com.example.shequtest.Adapter.JOBaAdapter;
import com.example.shequtest.R;
import com.example.shequtest.activity.PositionDetails;
import com.example.shequtest.shiti.Allmeun;
import com.example.shequtest.shiti.JOB;
import com.example.shequtest.shiti.JOBa;
import com.example.shequtest.shiti.OnItemClickListener;

import java.util.ArrayList;
import java.util.List;

public class ZhuYeFragment extends Fragment {

    private List<JOB> jobList = new ArrayList<>();

    private List<JOBa> jobaList = new ArrayList<>();

    private List<Allmeun> allmeunList = new ArrayList<>();

    private Context context;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_zhuye, container, false);
        context = view.getContext();

        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.popular_recycler);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this.getActivity());
        recyclerView.setLayoutManager(layoutManager);
        layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        JOBAdapter adapter = new JOBAdapter(this.getActivity(),jobList);
        recyclerView.setAdapter(adapter);
        initJOB();
//        ImageView viewb = (ImageView)findViewById(R.id.all_menu_image);
//        adapter.setmOnItemClickListener(new OnItemClickListener() {
//            @Override
//            public void onItemClick(View view, int position) {
//                Intent intent = new Intent(MainActivity.this,PositionDetails.class);
//                intent.putExtra("name",jobList.get(position).getName());
//                intent.putExtra("id",jobList.get(position).getImageId());
//                intent.putExtra("text",jobList.get(position).getText());
//                startActivity(intent);
//            }
//        });

        RecyclerView recyclerViewa = (RecyclerView) view.findViewById(R.id.recommended_recycler);
        LinearLayoutManager layoutManagera = new LinearLayoutManager(this.getActivity());
        recyclerViewa.setLayoutManager(layoutManagera);
        layoutManagera.setOrientation(LinearLayoutManager.HORIZONTAL);
        JOBaAdapter adaptera = new JOBaAdapter(this.getActivity(),jobaList);
        recyclerViewa.setAdapter(adaptera);
        initJOBa();


        RecyclerView recyclerViewb = (RecyclerView) view.findViewById(R.id.all_menu_recycler);
        LinearLayoutManager layoutManagerb = new LinearLayoutManager(this.getActivity());
        recyclerViewb.setLayoutManager(layoutManagerb);
        layoutManagerb.setOrientation(LinearLayoutManager.VERTICAL);
        AllmeunAdapter adapterb = new AllmeunAdapter(this.getActivity(),allmeunList);
        recyclerViewb.setAdapter(adapterb);
        initAllmeun();

        ImageView view1 = (ImageView) getActivity().findViewById(R.id.all_menu_image);
        adapterb.setmOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                Intent intent = new Intent(getActivity(), PositionDetails.class);
                intent.putExtra("name",allmeunList.get(position).getAllmeunname());
                intent.putExtra("id",allmeunList.get(position).getAllmeunimageId());
                intent.putExtra("text",allmeunList.get(position).getPositiontext());

//                intent.putExtra("image",R.id.all_menu_image);
//                intent.putExtra("name",R.id.all_menu_name);

                startActivity(intent);
            }
        });

        return view;
    }

    private void initAllmeun() {
        for (int i = 0; i<1;i++){
            Allmeun sandi = new Allmeun("3D打印",R.drawable.dayin,"1、负责3D打印机的操作管理及技术支持工作；\n" +
                    "\n" +
                    "2、熟悉或了解3D打印行业基础知识及产品者优先；\n" +
                    "\n" +
                    "3、有机械、电气类相关设备生产组装、调试、检测工作或实习实践经验者优先；\n" +
                    "\n" +
                    "4、具备较强的动手能力及自主学习能力、能自主思考分析、解决问题者优先；\n" +
                    "\n" +
                    "5、熟悉3D模型文件的设计和修复优先；\n" +
                    "\n" +
                    "6、会使用3D建模常用软件，如Pro-e,SolidWorks等优先；\n" +
                    "\n" +
                    "7、了解模型的后处理工作；\n" +
                    "\n" +
                    "8、对待工作积极主动，有责任心、协作能力良好，具备吃苦耐劳的精神。");
            allmeunList.add(sandi);

            Allmeun android = new Allmeun("Android软件开发",R.drawable.android,"1.大专及以上计算机相关专业在校生，毕业前可实习6个月以上，每周至少5天实习时间；\n" +
                    "2.熟悉Android，Java，理解面向对象的设计思想，有Android实际开发经验者优先；\n" +
                    "3.良好的数据结构和算法基础，优秀的编码能力及习惯；\n" +
                    "4.学习能力强，具备分析、解决问题能力，对解决具有挑战性的问题充满激情；\n" +
                    "5.热爱电竞游戏者优先。?");
            allmeunList.add(android);

            Allmeun network = new Allmeun("网络编程",R.drawable.network,"1、深入理解http,https,tcp/Ip协议。\n" +
                    "2、具备扎实的Java基础，对JVM原理有扎实的理解；对spring mvc、spring、mybatis开源框架熟悉，并能了解它的原理和机制，具有大型分布式系统设计研发经验。\n" +
                    "3、熟悉nginx、rabbitmq、redis、springcloud等负载均衡、缓存、消息中间件、分布式协调框架、分布式服务治理框架的使用。\n" +
                    "4、熟悉MySQL、Oracle数据库，索引优化，数据库调优。\n" +
                    "5、有相关工作经验者优先。");
            allmeunList.add(network);

            Allmeun photshop = new Allmeun("Photshop",R.drawable.ps,"1、学习软件及内容：\n" +
                    "\n" +
                    "PS、AI、ID、CDR 四大软件，基础训练，融会贯通。设计原理，设计流程，平面设计材质规格学习掌握。\n" +
                    "\n" +
                    "2、平面视觉设计\n" +
                    "\n" +
                    "通过大量项目实战训练，熟练甚至精通标志VI、艺术插画、版式、包装、海报、宣传画册、logo等常规商业设计。");
            allmeunList.add(photshop);

            Allmeun software = new Allmeun("软件测试",R.drawable.software_testing,"1.熟悉linux操作系统，熟悉一款主流数据库的基本操作和原理，熟悉SQL语言；\n" +
                    "\n" +
                    "2.熟悉java、python、C等至少一种编程语言，有Shell、Python或nodejs等使用经验者优先；\n" +
                    "\n" +
                    "3.熟悉测试基本方法，能够独立编写测试计划、用例，执行测试过程，熟悉接口测试和性能测试；\n" +
                    "\n" +
                    "4.有Hadoop/HBase/Spark/Hive等大数据或分布式系统测试经验者优先；\n" +
                    "\n" +
                    "5.具备高度的责任心，热爱开发及测试工作，具有很强的适应能力和学习能力。");
            allmeunList.add(software);

            Allmeun vehicle = new Allmeun("洗车修理",R.drawable.vehicle_repairing,"1、对车辆进行日常保养、检查和维修；\n" +
                    "2、严格执行汽车维护工艺规范和修理技术标准；\n" +
                    "3、对工具、设备进行定期保养；\n" +
                    "4、按照车间主管安排工作任务及时完成。\n" +
                    "5、品行端正，能吃苦耐劳、服从分配。\n" +
                    "6、良好的团队合作精神。");
            allmeunList.add(vehicle);

            Allmeun shiping = new Allmeun("视频剪辑",R.drawable.huobao_ic,"1、熟练掌握AE和Premiere或者vegas剪辑软件；\n" +
                    "2、熟悉电视购物广告，可独立完成广告包装、三维片头动画、广告片等的设计及制作；\n" +
                    "3、对作品的主题创意、标版设计、动画、质感、节奏、色彩等方面有较好的把握；\n" +
                    "4、有良好的团队意识以及较强的主动性和创造性；");
            allmeunList.add(shiping);
        }
    }

    private void initJOBa() {
        for (int i = 0 ; i<1; i++){
            JOBa shiping = new JOBa("视频剪辑及其图片修整",R.drawable.rengwuioc,"1、熟练掌握AE和Premiere或者vegas剪辑软件；\n" +
                    "2、熟悉电视购物广告，可独立完成广告包装、三维片头动画、广告片等的设计及制作；\n" +
                    "3、对作品的主题创意、标版设计、动画、质感、节奏、色彩等方面有较好的把握；\n" +
                    "4、有良好的团队意识以及较强的主动性和创造性；");
            jobaList.add(shiping);

            JOBa android = new JOBa("Android开发功能外包",R.drawable.rengwuioc,"1.大专及以上计算机相关专业在校生，毕业前可实习6个月以上，每周至少5天实习时间；\n" +
                    "2.熟悉Android，Java，理解面向对象的设计思想，有Android实际开发经验者优先；\n" +
                    "3.良好的数据结构和算法基础，优秀的编码能力及习惯；\n" +
                    "4.学习能力强，具备分析、解决问题能力，对解决具有挑战性的问题充满激情；\n" +
                    "5.热爱电竞游戏者优先。?");
            jobaList.add(android);

            JOBa vehicle = new JOBa("汽车刹车片更换",R.drawable.rengwuioc,"1、对车辆进行日常保养、检查和维修；\n" +
                    "2、严格执行汽车维护工艺规范和修理技术标准；\n" +
                    "3、对工具、设备进行定期保养；\n" +
                    "4、按照车间主管安排工作任务及时完成。\n" +
                    "5、品行端正，能吃苦耐劳、服从分配。\n" +
                    "6、良好的团队合作精神。");
            jobaList.add(vehicle);
        }
    }

    private void initJOB() {
        for (int i =0; i<1;i++){
            JOB sandi = new JOB("医学系",R.drawable.yixue,"1、负责3D打印机的操作管理及技术支持工作；\n" +
                    "\n" +
                    "2、熟悉或了解3D打印行业基础知识及产品者优先；\n" +
                    "\n" +
                    "3、有机械、电气类相关设备生产组装、调试、检测工作或实习实践经验者优先；\n" +
                    "\n" +
                    "4、具备较强的动手能力及自主学习能力、能自主思考分析、解决问题者优先；\n" +
                    "\n" +
                    "5、熟悉3D模型文件的设计和修复优先；\n" +
                    "\n" +
                    "6、会使用3D建模常用软件，如Pro-e,SolidWorks等优先；\n" +
                    "\n" +
                    "7、了解模型的后处理工作；\n" +
                    "\n" +
                    "8、对待工作积极主动，有责任心、协作能力良好，具备吃苦耐劳的精神。");
            jobList.add(sandi);

            JOB android = new JOB("护理系",R.drawable.huli,"1.大专及以上计算机相关专业在校生，毕业前可实习6个月以上，每周至少5天实习时间；\n" +
                    "2.熟悉Android，Java，理解面向对象的设计思想，有Android实际开发经验者优先；\n" +
                    "3.良好的数据结构和算法基础，优秀的编码能力及习惯；\n" +
                    "4.学习能力强，具备分析、解决问题能力，对解决具有挑战性的问题充满激情；\n" +
                    "5.热爱电竞游戏者优先。?");
            jobList.add(android);

            JOB network = new JOB("现代工程系",R.drawable.xiandai,"1、深入理解http,https,tcp/Ip协议。\n" +
                    "2、具备扎实的Java基础，对JVM原理有扎实的理解；对spring mvc、spring、mybatis开源框架熟悉，并能了解它的原理和机制，具有大型分布式系统设计研发经验。\n" +
                    "3、熟悉nginx、rabbitmq、redis、springcloud等负载均衡、缓存、消息中间件、分布式协调框架、分布式服务治理框架的使用。\n" +
                    "4、熟悉MySQL、Oracle数据库，索引优化，数据库调优。\n" +
                    "5、有相关工作经验者优先。");
            jobList.add(network);

            JOB photshop = new JOB("农工系",R.drawable.nonggong,"1、学习软件及内容：\n" +
                    "\n" +
                    "PS、AI、ID、CDR 四大软件，基础训练，融会贯通。设计原理，设计流程，平面设计材质规格学习掌握。\n" +
                    "\n" +
                    "2、平面视觉设计\n" +
                    "\n" +
                    "通过大量项目实战训练，熟练甚至精通标志VI、艺术插画、版式、包装、海报、宣传画册、logo等常规商业设计。");
            jobList.add(photshop);

            JOB software = new JOB("旅游系",R.drawable.lyou,"1.熟悉linux操作系统，熟悉一款主流数据库的基本操作和原理，熟悉SQL语言；\n" +
                    "\n" +
                    "2.熟悉java、python、C等至少一种编程语言，有Shell、Python或nodejs等使用经验者优先；\n" +
                    "\n" +
                    "3.熟悉测试基本方法，能够独立编写测试计划、用例，执行测试过程，熟悉接口测试和性能测试；\n" +
                    "\n" +
                    "4.有Hadoop/HBase/Spark/Hive等大数据或分布式系统测试经验者优先；\n" +
                    "\n" +
                    "5.具备高度的责任心，热爱开发及测试工作，具有很强的适应能力和学习能力。");
            jobList.add(software);

            JOB vehicle = new JOB("信工系",R.drawable.xingong,"1、对车辆进行日常保养、检查和维修；\n" +
                    "2、严格执行汽车维护工艺规范和修理技术标准；\n" +
                    "3、对工具、设备进行定期保养；\n" +
                    "4、按照车间主管安排工作任务及时完成。\n" +
                    "5、品行端正，能吃苦耐劳、服从分配。\n" +
                    "6、良好的团队合作精神。");
            jobList.add(vehicle);

            JOB jingguan= new JOB("经管系",R.drawable.jingguan,"1、对车辆进行日常保养、检查和维修；\n" +
                    "2、严格执行汽车维护工艺规范和修理技术标准；\n" +
                    "3、对工具、设备进行定期保养；\n" +
                    "4、按照车间主管安排工作任务及时完成。\n" +
                    "5、品行端正，能吃苦耐劳、服从分配。\n" +
                    "6、良好的团队合作精神。");
            jobList.add(jingguan);
        }
    }
}
