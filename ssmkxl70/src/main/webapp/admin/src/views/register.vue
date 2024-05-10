<template>
  <div>
    <div class="container">
      <div class="login-form" style="backgroundColor:rgba(255, 255, 255, 0.53);borderRadius:10px">
        <h1 class="h1" style="color:rgba(101, 126, 253, 1);fontSize:25px;">校园防疫微信小程序注册</h1>
		<el-form ref="rgsForm" class="rgs-form" :model="rgsForm" label-width="120px">
															<!-- <div v-if="tableName=='xuesheng'" class="input-group">
			   <div class="label">学号</div>
			   <div class="input-container">
			     <input v-model="ruleForm.xuehao" class="input" type="text" placeholder="学号">
			   </div>
			 </div> -->
			<el-form-item label="学号" class="input" v-if="tableName=='xuesheng'">
			  <el-input v-model="ruleForm.xuehao" autocomplete="off" placeholder="学号" type="text" />
			</el-form-item>
												<!-- <div v-if="tableName=='xuesheng'" class="input-group">
			   <div class="label">密码</div>
			   <div class="input-container">
			     <input v-model="ruleForm.mima" class="input" type="text" placeholder="密码">
			   </div>
			 </div> -->
			<el-form-item label="密码" class="input" v-if="tableName=='xuesheng'">
			  <el-input v-model="ruleForm.mima" autocomplete="off" placeholder="密码" type="text" />
			</el-form-item>
												<!-- <div v-if="tableName=='xuesheng'" class="input-group">
			   <div class="label">姓名</div>
			   <div class="input-container">
			     <input v-model="ruleForm.xingming" class="input" type="text" placeholder="姓名">
			   </div>
			 </div> -->
			<el-form-item label="姓名" class="input" v-if="tableName=='xuesheng'">
			  <el-input v-model="ruleForm.xingming" autocomplete="off" placeholder="姓名" type="text" />
			</el-form-item>
																														<!-- <div v-if="tableName=='xuesheng'" class="input-group">
			   <div class="label">班级</div>
			   <div class="input-container">
			     <input v-model="ruleForm.banji" class="input" type="text" placeholder="班级">
			   </div>
			 </div> -->
			<el-form-item label="班级" class="input" v-if="tableName=='xuesheng'">
			  <el-input v-model="ruleForm.banji" autocomplete="off" placeholder="班级" type="text" />
			</el-form-item>
												<!-- <div v-if="tableName=='xuesheng'" class="input-group">
			   <div class="label">联系电话</div>
			   <div class="input-container">
			     <input v-model="ruleForm.lianxidianhua" class="input" type="text" placeholder="联系电话">
			   </div>
			 </div> -->
			<el-form-item label="联系电话" class="input" v-if="tableName=='xuesheng'">
			  <el-input v-model="ruleForm.lianxidianhua" autocomplete="off" placeholder="联系电话" type="text" />
			</el-form-item>
												<!-- <div v-if="tableName=='xuesheng'" class="input-group">
			   <div class="label">邮箱</div>
			   <div class="input-container">
			     <input v-model="ruleForm.youxiang" class="input" type="text" placeholder="邮箱">
			   </div>
			 </div> -->
			<el-form-item label="邮箱" class="input" v-if="tableName=='xuesheng'">
			  <el-input v-model="ruleForm.youxiang" autocomplete="off" placeholder="邮箱" type="text" />
			</el-form-item>
												<!-- <div v-if="tableName=='xuesheng'" class="input-group">
			   <div class="label">身份证</div>
			   <div class="input-container">
			     <input v-model="ruleForm.shenfenzheng" class="input" type="text" placeholder="身份证">
			   </div>
			 </div> -->
			<el-form-item label="身份证" class="input" v-if="tableName=='xuesheng'">
			  <el-input v-model="ruleForm.shenfenzheng" autocomplete="off" placeholder="身份证" type="text" />
			</el-form-item>
																																																<!-- <div v-if="tableName=='fudaoyuan'" class="input-group">
			   <div class="label">辅导员工号</div>
			   <div class="input-container">
			     <input v-model="ruleForm.fudaoyuangonghao" class="input" type="text" placeholder="辅导员工号">
			   </div>
			 </div> -->
			<el-form-item label="辅导员工号" class="input" v-if="tableName=='fudaoyuan'">
			  <el-input v-model="ruleForm.fudaoyuangonghao" autocomplete="off" placeholder="辅导员工号" type="text" />
			</el-form-item>
												<!-- <div v-if="tableName=='fudaoyuan'" class="input-group">
			   <div class="label">密码</div>
			   <div class="input-container">
			     <input v-model="ruleForm.mima" class="input" type="text" placeholder="密码">
			   </div>
			 </div> -->
			<el-form-item label="密码" class="input" v-if="tableName=='fudaoyuan'">
			  <el-input v-model="ruleForm.mima" autocomplete="off" placeholder="密码" type="text" />
			</el-form-item>
												<!-- <div v-if="tableName=='fudaoyuan'" class="input-group">
			   <div class="label">辅导员姓名</div>
			   <div class="input-container">
			     <input v-model="ruleForm.fudaoyuanxingming" class="input" type="text" placeholder="辅导员姓名">
			   </div>
			 </div> -->
			<el-form-item label="辅导员姓名" class="input" v-if="tableName=='fudaoyuan'">
			  <el-input v-model="ruleForm.fudaoyuanxingming" autocomplete="off" placeholder="辅导员姓名" type="text" />
			</el-form-item>
																														<!-- <div v-if="tableName=='fudaoyuan'" class="input-group">
			   <div class="label">电话</div>
			   <div class="input-container">
			     <input v-model="ruleForm.dianhua" class="input" type="text" placeholder="电话">
			   </div>
			 </div> -->
			<el-form-item label="电话" class="input" v-if="tableName=='fudaoyuan'">
			  <el-input v-model="ruleForm.dianhua" autocomplete="off" placeholder="电话" type="text" />
			</el-form-item>
												<!-- <div v-if="tableName=='fudaoyuan'" class="input-group">
			   <div class="label">邮箱</div>
			   <div class="input-container">
			     <input v-model="ruleForm.youxiang" class="input" type="text" placeholder="邮箱">
			   </div>
			 </div> -->
			<el-form-item label="邮箱" class="input" v-if="tableName=='fudaoyuan'">
			  <el-input v-model="ruleForm.youxiang" autocomplete="off" placeholder="邮箱" type="text" />
			</el-form-item>
																																																									<!-- <div v-if="tableName=='yuanshuji'" class="input-group">
			   <div class="label">院书记工号</div>
			   <div class="input-container">
			     <input v-model="ruleForm.yuanshujigonghao" class="input" type="text" placeholder="院书记工号">
			   </div>
			 </div> -->
			<el-form-item label="院书记工号" class="input" v-if="tableName=='yuanshuji'">
			  <el-input v-model="ruleForm.yuanshujigonghao" autocomplete="off" placeholder="院书记工号" type="text" />
			</el-form-item>
												<!-- <div v-if="tableName=='yuanshuji'" class="input-group">
			   <div class="label">密码</div>
			   <div class="input-container">
			     <input v-model="ruleForm.mima" class="input" type="text" placeholder="密码">
			   </div>
			 </div> -->
			<el-form-item label="密码" class="input" v-if="tableName=='yuanshuji'">
			  <el-input v-model="ruleForm.mima" autocomplete="off" placeholder="密码" type="text" />
			</el-form-item>
												<!-- <div v-if="tableName=='yuanshuji'" class="input-group">
			   <div class="label">院书记姓名</div>
			   <div class="input-container">
			     <input v-model="ruleForm.yuanshujixingming" class="input" type="text" placeholder="院书记姓名">
			   </div>
			 </div> -->
			<el-form-item label="院书记姓名" class="input" v-if="tableName=='yuanshuji'">
			  <el-input v-model="ruleForm.yuanshujixingming" autocomplete="off" placeholder="院书记姓名" type="text" />
			</el-form-item>
																														<!-- <div v-if="tableName=='yuanshuji'" class="input-group">
			   <div class="label">电话</div>
			   <div class="input-container">
			     <input v-model="ruleForm.dianhua" class="input" type="text" placeholder="电话">
			   </div>
			 </div> -->
			<el-form-item label="电话" class="input" v-if="tableName=='yuanshuji'">
			  <el-input v-model="ruleForm.dianhua" autocomplete="off" placeholder="电话" type="text" />
			</el-form-item>
												<!-- <div v-if="tableName=='yuanshuji'" class="input-group">
			   <div class="label">邮箱</div>
			   <div class="input-container">
			     <input v-model="ruleForm.youxiang" class="input" type="text" placeholder="邮箱">
			   </div>
			 </div> -->
			<el-form-item label="邮箱" class="input" v-if="tableName=='yuanshuji'">
			  <el-input v-model="ruleForm.youxiang" autocomplete="off" placeholder="邮箱" type="text" />
			</el-form-item>
																																																			<!-- <div v-if="tableName=='fenguanyuanzhang'" class="input-group">
			   <div class="label">工号</div>
			   <div class="input-container">
			     <input v-model="ruleForm.gonghao" class="input" type="text" placeholder="工号">
			   </div>
			 </div> -->
			<el-form-item label="工号" class="input" v-if="tableName=='fenguanyuanzhang'">
			  <el-input v-model="ruleForm.gonghao" autocomplete="off" placeholder="工号" type="text" />
			</el-form-item>
												<!-- <div v-if="tableName=='fenguanyuanzhang'" class="input-group">
			   <div class="label">密码</div>
			   <div class="input-container">
			     <input v-model="ruleForm.mima" class="input" type="text" placeholder="密码">
			   </div>
			 </div> -->
			<el-form-item label="密码" class="input" v-if="tableName=='fenguanyuanzhang'">
			  <el-input v-model="ruleForm.mima" autocomplete="off" placeholder="密码" type="text" />
			</el-form-item>
												<!-- <div v-if="tableName=='fenguanyuanzhang'" class="input-group">
			   <div class="label">姓名</div>
			   <div class="input-container">
			     <input v-model="ruleForm.xingming" class="input" type="text" placeholder="姓名">
			   </div>
			 </div> -->
			<el-form-item label="姓名" class="input" v-if="tableName=='fenguanyuanzhang'">
			  <el-input v-model="ruleForm.xingming" autocomplete="off" placeholder="姓名" type="text" />
			</el-form-item>
																														<!-- <div v-if="tableName=='fenguanyuanzhang'" class="input-group">
			   <div class="label">电话</div>
			   <div class="input-container">
			     <input v-model="ruleForm.dianhua" class="input" type="text" placeholder="电话">
			   </div>
			 </div> -->
			<el-form-item label="电话" class="input" v-if="tableName=='fenguanyuanzhang'">
			  <el-input v-model="ruleForm.dianhua" autocomplete="off" placeholder="电话" type="text" />
			</el-form-item>
												<!-- <div v-if="tableName=='fenguanyuanzhang'" class="input-group">
			   <div class="label">邮箱</div>
			   <div class="input-container">
			     <input v-model="ruleForm.youxiang" class="input" type="text" placeholder="邮箱">
			   </div>
			 </div> -->
			<el-form-item label="邮箱" class="input" v-if="tableName=='fenguanyuanzhang'">
			  <el-input v-model="ruleForm.youxiang" autocomplete="off" placeholder="邮箱" type="text" />
			</el-form-item>
																																																			<!-- <div v-if="tableName=='jiaowuchuzhang'" class="input-group">
			   <div class="label">工号</div>
			   <div class="input-container">
			     <input v-model="ruleForm.gonghao" class="input" type="text" placeholder="工号">
			   </div>
			 </div> -->
			<el-form-item label="工号" class="input" v-if="tableName=='jiaowuchuzhang'">
			  <el-input v-model="ruleForm.gonghao" autocomplete="off" placeholder="工号" type="text" />
			</el-form-item>
												<!-- <div v-if="tableName=='jiaowuchuzhang'" class="input-group">
			   <div class="label">密码</div>
			   <div class="input-container">
			     <input v-model="ruleForm.mima" class="input" type="text" placeholder="密码">
			   </div>
			 </div> -->
			<el-form-item label="密码" class="input" v-if="tableName=='jiaowuchuzhang'">
			  <el-input v-model="ruleForm.mima" autocomplete="off" placeholder="密码" type="text" />
			</el-form-item>
												<!-- <div v-if="tableName=='jiaowuchuzhang'" class="input-group">
			   <div class="label">姓名</div>
			   <div class="input-container">
			     <input v-model="ruleForm.xingming" class="input" type="text" placeholder="姓名">
			   </div>
			 </div> -->
			<el-form-item label="姓名" class="input" v-if="tableName=='jiaowuchuzhang'">
			  <el-input v-model="ruleForm.xingming" autocomplete="off" placeholder="姓名" type="text" />
			</el-form-item>
																					<!-- <div v-if="tableName=='jiaowuchuzhang'" class="input-group">
			   <div class="label">电话</div>
			   <div class="input-container">
			     <input v-model="ruleForm.dianhua" class="input" type="text" placeholder="电话">
			   </div>
			 </div> -->
			<el-form-item label="电话" class="input" v-if="tableName=='jiaowuchuzhang'">
			  <el-input v-model="ruleForm.dianhua" autocomplete="off" placeholder="电话" type="text" />
			</el-form-item>
												<!-- <div v-if="tableName=='jiaowuchuzhang'" class="input-group">
			   <div class="label">邮箱</div>
			   <div class="input-container">
			     <input v-model="ruleForm.youxiang" class="input" type="text" placeholder="邮箱">
			   </div>
			 </div> -->
			<el-form-item label="邮箱" class="input" v-if="tableName=='jiaowuchuzhang'">
			  <el-input v-model="ruleForm.youxiang" autocomplete="off" placeholder="邮箱" type="text" />
			</el-form-item>
																																																			<!-- <div v-if="tableName=='zhuguanxiaolingdao'" class="input-group">
			   <div class="label">工号</div>
			   <div class="input-container">
			     <input v-model="ruleForm.gonghao" class="input" type="text" placeholder="工号">
			   </div>
			 </div> -->
			<el-form-item label="工号" class="input" v-if="tableName=='zhuguanxiaolingdao'">
			  <el-input v-model="ruleForm.gonghao" autocomplete="off" placeholder="工号" type="text" />
			</el-form-item>
												<!-- <div v-if="tableName=='zhuguanxiaolingdao'" class="input-group">
			   <div class="label">密码</div>
			   <div class="input-container">
			     <input v-model="ruleForm.mima" class="input" type="text" placeholder="密码">
			   </div>
			 </div> -->
			<el-form-item label="密码" class="input" v-if="tableName=='zhuguanxiaolingdao'">
			  <el-input v-model="ruleForm.mima" autocomplete="off" placeholder="密码" type="text" />
			</el-form-item>
												<!-- <div v-if="tableName=='zhuguanxiaolingdao'" class="input-group">
			   <div class="label">姓名</div>
			   <div class="input-container">
			     <input v-model="ruleForm.xingming" class="input" type="text" placeholder="姓名">
			   </div>
			 </div> -->
			<el-form-item label="姓名" class="input" v-if="tableName=='zhuguanxiaolingdao'">
			  <el-input v-model="ruleForm.xingming" autocomplete="off" placeholder="姓名" type="text" />
			</el-form-item>
																					<!-- <div v-if="tableName=='zhuguanxiaolingdao'" class="input-group">
			   <div class="label">电话</div>
			   <div class="input-container">
			     <input v-model="ruleForm.dianhua" class="input" type="text" placeholder="电话">
			   </div>
			 </div> -->
			<el-form-item label="电话" class="input" v-if="tableName=='zhuguanxiaolingdao'">
			  <el-input v-model="ruleForm.dianhua" autocomplete="off" placeholder="电话" type="text" />
			</el-form-item>
												<!-- <div v-if="tableName=='zhuguanxiaolingdao'" class="input-group">
			   <div class="label">邮箱</div>
			   <div class="input-container">
			     <input v-model="ruleForm.youxiang" class="input" type="text" placeholder="邮箱">
			   </div>
			 </div> -->
			<el-form-item label="邮箱" class="input" v-if="tableName=='zhuguanxiaolingdao'">
			  <el-input v-model="ruleForm.youxiang" autocomplete="off" placeholder="邮箱" type="text" />
			</el-form-item>
																																																																																																<div style="display: flex;flex-wrap: wrap;width: 100%;justify-content: center;">
				<el-button class="btn" type="primary" @click="login()">注册</el-button>
				<el-button class="btn close" type="primary" @click="close()">取消</el-button>
			</div>
		</el-form>
      </div>
      <!-- <div class="nk-navigation">
        <a href="#">
          <div @click="login()">注册</div>
        </a>
      </div> -->
    </div>
  </div>
</template>
<script>
export default {
  data() {
    return {
      ruleForm: {
              },
      tableName:"",
      rules: {}
    };
  },
  mounted(){
    let table = this.$storage.get("loginTable");
    this.tableName = table;
  },
  methods: {
    // 获取uuid
    getUUID () {
      return new Date().getTime();
    },
    close(){
	this.$router.push({ path: "/login" });
    },
    // 注册
    login() {
                                                                                                                                                                                                                                                                                                                                                                                    if(`xuesheng` == this.tableName && this.ruleForm.lianxidianhua&&(!this.$validate.isPhone(this.ruleForm.lianxidianhua))){
        this.$message.error(`联系电话应输入电话格式`);
        return
      }
                                                                              if(`xuesheng` == this.tableName && this.ruleForm.youxiang&&(!this.$validate.isEmail(this.ruleForm.youxiang))){
        this.$message.error(`邮箱应输入邮件格式`);
        return
      }
                                                                        if(`xuesheng` == this.tableName && this.ruleForm.shenfenzheng&&(!this.$validate.checkIdCard(this.ruleForm.shenfenzheng))){
        this.$message.error(`身份证应输入身份证格式`);
        return
      }
                                                                                                                                                                              if((!this.ruleForm.fudaoyuangonghao) && `fudaoyuan` == this.tableName){
        this.$message.error(`辅导员工号不能为空`);
        return
      }
                                                                  if((!this.ruleForm.mima) && `fudaoyuan` == this.tableName){
        this.$message.error(`密码不能为空`);
        return
      }
                                                                  if((!this.ruleForm.fudaoyuanxingming) && `fudaoyuan` == this.tableName){
        this.$message.error(`辅导员姓名不能为空`);
        return
      }
                                                                                                                                                                                                      if(`fudaoyuan` == this.tableName && this.ruleForm.dianhua&&(!this.$validate.isMobile(this.ruleForm.dianhua))){
        this.$message.error(`电话应输入手机格式`);
        return
      }
                                                                        if(`fudaoyuan` == this.tableName && this.ruleForm.youxiang&&(!this.$validate.isEmail(this.ruleForm.youxiang))){
        this.$message.error(`邮箱应输入邮件格式`);
        return
      }
                                                                                                                                                                                                                                          if((!this.ruleForm.yuanshujigonghao) && `yuanshuji` == this.tableName){
        this.$message.error(`院书记工号不能为空`);
        return
      }
                                                                  if((!this.ruleForm.mima) && `yuanshuji` == this.tableName){
        this.$message.error(`密码不能为空`);
        return
      }
                                                                  if((!this.ruleForm.yuanshujixingming) && `yuanshuji` == this.tableName){
        this.$message.error(`院书记姓名不能为空`);
        return
      }
                                                                                                                                                                                                      if(`yuanshuji` == this.tableName && this.ruleForm.dianhua&&(!this.$validate.isMobile(this.ruleForm.dianhua))){
        this.$message.error(`电话应输入手机格式`);
        return
      }
                                                                        if(`yuanshuji` == this.tableName && this.ruleForm.youxiang&&(!this.$validate.isEmail(this.ruleForm.youxiang))){
        this.$message.error(`邮箱应输入邮件格式`);
        return
      }
                                                                                                                                                                                                                              if((!this.ruleForm.gonghao) && `fenguanyuanzhang` == this.tableName){
        this.$message.error(`工号不能为空`);
        return
      }
                                                                  if((!this.ruleForm.mima) && `fenguanyuanzhang` == this.tableName){
        this.$message.error(`密码不能为空`);
        return
      }
                                                                  if((!this.ruleForm.xingming) && `fenguanyuanzhang` == this.tableName){
        this.$message.error(`姓名不能为空`);
        return
      }
                                                                                                                                                                                                      if(`fenguanyuanzhang` == this.tableName && this.ruleForm.dianhua&&(!this.$validate.isMobile(this.ruleForm.dianhua))){
        this.$message.error(`电话应输入手机格式`);
        return
      }
                                                                        if(`fenguanyuanzhang` == this.tableName && this.ruleForm.youxiang&&(!this.$validate.isEmail(this.ruleForm.youxiang))){
        this.$message.error(`邮箱应输入邮件格式`);
        return
      }
                                                                                                                                                                                                                              if((!this.ruleForm.gonghao) && `jiaowuchuzhang` == this.tableName){
        this.$message.error(`工号不能为空`);
        return
      }
                                                                  if((!this.ruleForm.mima) && `jiaowuchuzhang` == this.tableName){
        this.$message.error(`密码不能为空`);
        return
      }
                                                                  if((!this.ruleForm.xingming) && `jiaowuchuzhang` == this.tableName){
        this.$message.error(`姓名不能为空`);
        return
      }
                                                                                                                                                if(`jiaowuchuzhang` == this.tableName && this.ruleForm.dianhua&&(!this.$validate.isMobile(this.ruleForm.dianhua))){
        this.$message.error(`电话应输入手机格式`);
        return
      }
                                                                        if(`jiaowuchuzhang` == this.tableName && this.ruleForm.youxiang&&(!this.$validate.isEmail(this.ruleForm.youxiang))){
        this.$message.error(`邮箱应输入邮件格式`);
        return
      }
                                                                                                                                                                                                                              if((!this.ruleForm.gonghao) && `zhuguanxiaolingdao` == this.tableName){
        this.$message.error(`工号不能为空`);
        return
      }
                                                                  if((!this.ruleForm.mima) && `zhuguanxiaolingdao` == this.tableName){
        this.$message.error(`密码不能为空`);
        return
      }
                                                                  if((!this.ruleForm.xingming) && `zhuguanxiaolingdao` == this.tableName){
        this.$message.error(`姓名不能为空`);
        return
      }
                                                                                                                                                if(`zhuguanxiaolingdao` == this.tableName && this.ruleForm.dianhua&&(!this.$validate.isMobile(this.ruleForm.dianhua))){
        this.$message.error(`电话应输入手机格式`);
        return
      }
                                                                        if(`zhuguanxiaolingdao` == this.tableName && this.ruleForm.youxiang&&(!this.$validate.isEmail(this.ruleForm.youxiang))){
        this.$message.error(`邮箱应输入邮件格式`);
        return
      }
                                                                                                                                                                                                                                                                                                                        this.$http({
        url: `${this.tableName}/register`,
        method: "post",
        data:this.ruleForm
      }).then(({ data }) => {
        if (data && data.code === 0) {
          this.$message({
            message: "注册成功",
            type: "success",
            duration: 1500,
            onClose: () => {
              this.$router.replace({ path: "/login" });
            }
          });
        } else {
          this.$message.error(data.msg);
        }
      });
    }
  }
};
</script>
<style lang="scss" scoped>
	.el-radio__input.is-checked .el-radio__inner {
		border-color: #00c292;
		background: #00c292;
	}

	.el-radio__input.is-checked .el-radio__inner {
		border-color: #00c292;
		background: #00c292;
	}

	.el-radio__input.is-checked .el-radio__inner {
		border-color: #00c292;
		background: #00c292;
	}

	.el-radio__input.is-checked+.el-radio__label {
		color: #00c292;
	}

	.el-radio__input.is-checked+.el-radio__label {
		color: #00c292;
	}

	.el-radio__input.is-checked+.el-radio__label {
		color: #00c292;
	}

	.h1 {
		margin-top: 10px;
	}

	body {
		padding: 0;
		margin: 0;
	}

	// .container {
 //    min-height: 100vh;
 //    text-align: center;
 //    // background-color: #00c292;
 //    padding-top: 20vh;
 //    background-image: url(../assets/img/bg.jpg);
 //    background-size: 100% 100%;
 //    opacity: 0.9;
 //  }

	// .login-form:before {
	// 	vertical-align: middle;
	// 	display: inline-block;
	// }

	// .login-form {
	// 	max-width: 500px;
	// 	padding: 20px 0;
	// 	width: 80%;
	// 	position: relative;
	// 	margin: 0 auto;

	// 	.label {
	// 		min-width: 60px;
	// 	}

	// 	.input-group {
	// 		max-width: 500px;
	// 		padding: 20px 0;
	// 		width: 80%;
	// 		position: relative;
	// 		margin: 0 auto;
	// 		display: flex;
	// 		align-items: center;

	// 		.input-container {
	// 			display: inline-block;
	// 			width: 100%;
	// 			text-align: left;
	// 			margin-left: 10px;
	// 		}

	// 		.icon {
	// 			width: 30px;
	// 			height: 30px;
	// 		}

	// 		.input {
	// 			position: relative;
	// 			z-index: 2;
	// 			float: left;
	// 			width: 100%;
	// 			margin-bottom: 0;
	// 			box-shadow: none;
	// 			border-top: 0px solid #ccc;
	// 			border-left: 0px solid #ccc;
	// 			border-right: 0px solid #ccc;
	// 			border-bottom: 1px solid #ccc;
	// 			padding: 0px;
	// 			resize: none;
	// 			border-radius: 0px;
	// 			display: block;
	// 			width: 100%;
	// 			height: 34px;
	// 			padding: 6px 12px;
	// 			font-size: 14px;
	// 			line-height: 1.42857143;
	// 			color: #555;
	// 			background-color: #fff;
	// 		}

	// 	}
	// }

	.nk-navigation {
		margin-top: 15px;

		a {
			display: inline-block;
			color: #fff;
			background: rgba(255, 255, 255, .2);
			width: 100px;
			height: 50px;
			border-radius: 30px;
			text-align: center;
			display: flex;
			align-items: center;
			margin: 0 auto;
			justify-content: center;
			padding: 0 20px;
		}

		.icon {
			margin-left: 10px;
			width: 30px;
			height: 30px;
		}
	}

	.register-container {
		margin-top: 10px;

		a {
			display: inline-block;
			color: #fff;
			max-width: 500px;
			height: 50px;
			border-radius: 30px;
			text-align: center;
			display: flex;
			align-items: center;
			margin: 0 auto;
			justify-content: center;
			padding: 0 20px;

			div {
				margin-left: 10px;
			}
		}
	}
	
	.container {
		background-image: url("http://codegen.caihongy.cn/20201210/7dba79b2a0b040acb200b4efba4089fe.jpg");
		height: 100vh;
		background-position: center center;
		background-size: cover;
		background-repeat: no-repeat;
	
		.login-form {
			right: 50%;
			top: 50%;
			height: auto;
			transform: translate3d(50%, -50%, 0);
			border-radius: 10px;
			background-color: rgba(255,255,255,.5);
			width: 420px;
			padding: 30px 30px 40px 30px;
			font-size: 14px;
			font-weight: 500;
			
			.h1 {
				margin: 0;
				text-align: center;
				line-height: 54px;
			    font-size: 24px;
			    color: #000;
			}
				
			.rgs-form {
				display: flex;
				flex-direction: column;
				justify-content: center;
				align-items: center;
				
				.input {
					width: 100%;
					
					& /deep/ .el-form-item__label {
						line-height: 40px;
						color: 14px;
						font-size: #606266;
					}
					
					& /deep/ .el-input__inner {
						height: 40px;
						color: #606266;
						font-size: 14px;
						border-width: 1px;
						border-style: solid;
						border-color: #606266;
						border-radius: 4px;
						background-color: #fff;
					}
				}
				
				.btn {
					margin: 0 10px;
					width: 88px;
					height: 44px;
					color: #fff;
					font-size: 14px;
					border-width: 1px;
					border-style: solid;
					border-color: #409EFF;
					border-radius: 4px;
					background-color: rgba(101, 126, 253, 1);
				}

				.close {
					margin: 0 10px;
					width: 88px;
					height: 45px;
					color: #409EFF;
					font-size: 14px;
					border-width: 1px;
					border-style: solid;
					border-color: #409EFF;
					border-radius: 4px;
					background-color: #FFF;
				}

			}
		}
	}
</style>
