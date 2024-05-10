import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import qingjiashenqing from '@/views/modules/qingjiashenqing/list'
    import xuesheng from '@/views/modules/xuesheng/list'
    import jiaowuchuzhang from '@/views/modules/jiaowuchuzhang/list'
    import lixiaoshenqing from '@/views/modules/lixiaoshenqing/list'
    import xueshengjibenxinxi from '@/views/modules/xueshengjibenxinxi/list'
    import jiankangshenbao from '@/views/modules/jiankangshenbao/list'
    import xueyuan from '@/views/modules/xueyuan/list'
    import yuanbulixiaoshenqing from '@/views/modules/yuanbulixiaoshenqing/list'
    import fenguanyuanzhang from '@/views/modules/fenguanyuanzhang/list'
    import gonggaolan from '@/views/modules/gonggaolan/list'
    import zhuanye from '@/views/modules/zhuanye/list'
    import yuanshuji from '@/views/modules/yuanshuji/list'
    import jiaqiquxiang from '@/views/modules/jiaqiquxiang/list'
    import huojiangqingkuang from '@/views/modules/huojiangqingkuang/list'
    import zhuguanxiaolingdao from '@/views/modules/zhuguanxiaolingdao/list'
    import fudaoyuan from '@/views/modules/fudaoyuan/list'
    import config from '@/views/modules/config/list'
    import luxianhenji from '@/views/modules/luxianhenji/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
          ,{
	path: '/qingjiashenqing',
        name: '请假申请',
        component: qingjiashenqing
      }
          ,{
	path: '/xuesheng',
        name: '学生',
        component: xuesheng
      }
          ,{
	path: '/jiaowuchuzhang',
        name: '教务处长',
        component: jiaowuchuzhang
      }
          ,{
	path: '/lixiaoshenqing',
        name: '离校申请',
        component: lixiaoshenqing
      }
          ,{
	path: '/xueshengjibenxinxi',
        name: '学生基本信息',
        component: xueshengjibenxinxi
      }
          ,{
	path: '/jiankangshenbao',
        name: '健康申报',
        component: jiankangshenbao
      }
          ,{
	path: '/xueyuan',
        name: '学院',
        component: xueyuan
      }
          ,{
	path: '/yuanbulixiaoshenqing',
        name: '院部离校申请',
        component: yuanbulixiaoshenqing
      }
          ,{
	path: '/fenguanyuanzhang',
        name: '分管院长',
        component: fenguanyuanzhang
      }
          ,{
	path: '/gonggaolan',
        name: '公告栏',
        component: gonggaolan
      }
          ,{
	path: '/zhuanye',
        name: '专业',
        component: zhuanye
      }
          ,{
	path: '/yuanshuji',
        name: '院书记',
        component: yuanshuji
      }
          ,{
	path: '/jiaqiquxiang',
        name: '假期去向',
        component: jiaqiquxiang
      }
          ,{
	path: '/huojiangqingkuang',
        name: '获奖情况',
        component: huojiangqingkuang
      }
          ,{
	path: '/zhuguanxiaolingdao',
        name: '主管校领导',
        component: zhuguanxiaolingdao
      }
          ,{
	path: '/fudaoyuan',
        name: '辅导员',
        component: fudaoyuan
      }
          ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
          ,{
	path: '/luxianhenji',
        name: '路线痕迹',
        component: luxianhenji
      }
        ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
