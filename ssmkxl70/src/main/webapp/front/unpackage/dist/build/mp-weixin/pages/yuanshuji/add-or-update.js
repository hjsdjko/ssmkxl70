(global["webpackJsonp"]=global["webpackJsonp"]||[]).push([["pages/yuanshuji/add-or-update"],{"1a4f":function(e,n,t){"use strict";(function(e){Object.defineProperty(n,"__esModule",{value:!0}),n.default=void 0;var a=u(t("a34a"));function u(e){return e&&e.__esModule?e:{default:e}}function r(e,n,t,a,u,r,i){try{var o=e[r](i),s=o.value}catch(c){return void t(c)}o.done?n(s):Promise.resolve(s).then(a,u)}function i(e){return function(){var n=this,t=arguments;return new Promise((function(a,u){var i=e.apply(n,t);function o(e){r(i,a,u,o,s,"next",e)}function s(e){r(i,a,u,o,s,"throw",e)}o(void 0)}))}}var o=function(){Promise.all([t.e("common/vendor"),t.e("components/w-picker/w-picker")]).then(function(){return resolve(t("5d1f"))}.bind(null,t)).catch(t.oe)},s={data:function(){return{ruleForm:{yuanshujigonghao:"",mima:"",yuanshujixingming:"",xingbie:"",xueyuan:"",dianhua:"",youxiang:"",zhaopian:"",sfsh:"",shhf:""},xingbieOptions:[],xingbieIndex:0,xueyuanOptions:[],xueyuanIndex:0,user:{},ro:{yuanshujigonghao:!1,mima:!1,yuanshujixingming:!1,xingbie:!1,xueyuan:!1,dianhua:!1,youxiang:!1,zhaopian:!1,sfsh:!1,shhf:!1}}},components:{wPicker:o},computed:{},onLoad:function(n){var t=this;return i(a.default.mark((function u(){var r,i,o,s;return a.default.wrap((function(u){while(1)switch(u.prev=u.next){case 0:return r=e.getStorageSync("nowTable"),u.next=3,t.$api.session(r);case 3:return i=u.sent,t.user=i.data,t.xingbieOptions="男,女".split(","),u.next=8,t.$api.option("xueyuan","xueyuan",{});case 8:if(i=u.sent,t.xueyuanOptions=i.data,t.ruleForm.userid=e.getStorageSync("userid"),n.refid&&(t.ruleForm.refid=n.refid,t.ruleForm.nickname=e.getStorageSync("nickname")),!n.id){u.next=18;break}return t.ruleForm.id=n.id,u.next=16,t.$api.info("yuanshuji",t.ruleForm.id);case 16:i=u.sent,t.ruleForm=i.data;case 18:if(!n.cross){u.next=57;break}o=e.getStorageSync("crossObj"),u.t0=a.default.keys(o);case 21:if((u.t1=u.t0()).done){u.next=57;break}if(s=u.t1.value,"yuanshujigonghao"!=s){u.next=27;break}return t.ruleForm.yuanshujigonghao=o[s],t.ro.yuanshujigonghao=!0,u.abrupt("continue",21);case 27:if("mima"!=s){u.next=31;break}return t.ruleForm.mima=o[s],t.ro.mima=!0,u.abrupt("continue",21);case 31:if("yuanshujixingming"!=s){u.next=35;break}return t.ruleForm.yuanshujixingming=o[s],t.ro.yuanshujixingming=!0,u.abrupt("continue",21);case 35:if("xingbie"!=s){u.next=39;break}return t.ruleForm.xingbie=o[s],t.ro.xingbie=!0,u.abrupt("continue",21);case 39:if("xueyuan"!=s){u.next=43;break}return t.ruleForm.xueyuan=o[s],t.ro.xueyuan=!0,u.abrupt("continue",21);case 43:if("dianhua"!=s){u.next=47;break}return t.ruleForm.dianhua=o[s],t.ro.dianhua=!0,u.abrupt("continue",21);case 47:if("youxiang"!=s){u.next=51;break}return t.ruleForm.youxiang=o[s],t.ro.youxiang=!0,u.abrupt("continue",21);case 51:if("zhaopian"!=s){u.next=55;break}return t.ruleForm.zhaopian=o[s],t.ro.zhaopian=!0,u.abrupt("continue",21);case 55:u.next=21;break;case 57:t.styleChange();case 58:case"end":return u.stop()}}),u)})))()},methods:{styleChange:function(){this.$nextTick((function(){}))},xingbieChange:function(e){this.xingbieIndex=e.target.value,this.ruleForm.xingbie=this.xingbieOptions[this.xingbieIndex]},xueyuanChange:function(e){this.xueyuanIndex=e.target.value,this.ruleForm.xueyuan=this.xueyuanOptions[this.xueyuanIndex]},zhaopianTap:function(){var e=this;this.$api.upload((function(n){e.ruleForm.zhaopian=e.$base.url+"upload/"+n.file,e.$forceUpdate(),e.$nextTick((function(){e.styleChange()}))}))},getUUID:function(){return(new Date).getTime()},onSubmitTap:function(){var e=this;return i(a.default.mark((function n(){return a.default.wrap((function(n){while(1)switch(n.prev=n.next){case 0:if(e.ruleForm.yuanshujigonghao){n.next=3;break}return e.$utils.msg("院书记工号不能为空"),n.abrupt("return");case 3:if(e.ruleForm.mima){n.next=6;break}return e.$utils.msg("密码不能为空"),n.abrupt("return");case 6:if(e.ruleForm.yuanshujixingming){n.next=9;break}return e.$utils.msg("院书记姓名不能为空"),n.abrupt("return");case 9:if(!e.ruleForm.dianhua||e.$validate.isMobile(e.ruleForm.dianhua)){n.next=12;break}return e.$utils.msg("电话应输入手机格式"),n.abrupt("return");case 12:if(!e.ruleForm.youxiang||e.$validate.isEmail(e.ruleForm.youxiang)){n.next=15;break}return e.$utils.msg("邮箱应输入邮件格式"),n.abrupt("return");case 15:if(!e.ruleForm.id){n.next=20;break}return n.next=18,e.$api.update("yuanshuji",e.ruleForm);case 18:n.next=22;break;case 20:return n.next=22,e.$api.add("yuanshuji",e.ruleForm);case 22:e.$utils.msgBack("提交成功");case 23:case"end":return n.stop()}}),n)})))()},optionsChange:function(e){this.index=e.target.value},bindDateChange:function(e){this.date=e.target.value},getDate:function(e){var n=new Date,t=n.getFullYear(),a=n.getMonth()+1,u=n.getDate();return"start"===e?t-=60:"end"===e&&(t+=2),a=a>9?a:"0"+a,u=u>9?u:"0"+u,"".concat(t,"-").concat(a,"-").concat(u)},toggleTab:function(e){this.$refs[e].show()}}};n.default=s}).call(this,t("543d")["default"])},3543:function(e,n,t){"use strict";(function(e){t("9240");a(t("66fd"));var n=a(t("9a8b"));function a(e){return e&&e.__esModule?e:{default:e}}e(n.default)}).call(this,t("543d")["createPage"])},50429:function(e,n,t){"use strict";var a=t("9d7f"),u=t.n(a);u.a},"6d6b":function(e,n,t){"use strict";t.r(n);var a=t("1a4f"),u=t.n(a);for(var r in a)"default"!==r&&function(e){t.d(n,e,(function(){return a[e]}))}(r);n["default"]=u.a},"9a8b":function(e,n,t){"use strict";t.r(n);var a=t("bf58"),u=t("6d6b");for(var r in u)"default"!==r&&function(e){t.d(n,e,(function(){return u[e]}))}(r);t("50429");var i,o=t("f0c5"),s=Object(o["a"])(u["default"],a["b"],a["c"],!1,null,"a800f5c8",null,!1,a["a"],i);n["default"]=s.exports},"9d7f":function(e,n,t){},bf58:function(e,n,t){"use strict";var a;t.d(n,"b",(function(){return u})),t.d(n,"c",(function(){return r})),t.d(n,"a",(function(){return a}));var u=function(){var e=this,n=e.$createElement;e._self._c},r=[]}},[["3543","common/runtime","common/vendor"]]]);