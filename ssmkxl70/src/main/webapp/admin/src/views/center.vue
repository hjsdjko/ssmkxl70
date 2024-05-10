<template>
  <div>
    <el-form
      class="detail-form-content"
      ref="ruleForm"
      :model="ruleForm"
      label-width="80px"
    >  
     <el-row>
                              <el-col :span="12">
        <el-form-item   v-if="flag=='xuesheng'"  label="学号" prop="xuehao">
          <el-input v-model="ruleForm.xuehao" readonly              placeholder="学号" clearable></el-input>
        </el-form-item>
      </el-col>
                                          <el-col :span="12">
        <el-form-item   v-if="flag=='xuesheng'"  label="姓名" prop="xingming">
          <el-input v-model="ruleForm.xingming"               placeholder="姓名" clearable></el-input>
        </el-form-item>
      </el-col>
                        <el-col :span="12">
        <el-form-item v-if="flag=='xuesheng'"  label="性别" prop="xingbie">
          <el-select v-model="ruleForm.xingbie" placeholder="请选择性别">
            <el-option
                v-for="(item,index) in xueshengxingbieOptions"
                v-bind:key="index"
                :label="item"
                :value="item">
            </el-option>
          </el-select>
        </el-form-item>
      </el-col>
                        <el-col :span="12">
        <el-form-item v-if="flag=='xuesheng'"  label="专业" prop="zhuanye">
          <el-select v-model="ruleForm.zhuanye" placeholder="请选择专业">
            <el-option
                v-for="(item,index) in xueshengzhuanyeOptions"
                v-bind:key="index"
                :label="item"
                :value="item">
            </el-option>
          </el-select>
        </el-form-item>
      </el-col>
                        <el-col :span="12">
        <el-form-item   v-if="flag=='xuesheng'"  label="班级" prop="banji">
          <el-input v-model="ruleForm.banji"               placeholder="班级" clearable></el-input>
        </el-form-item>
      </el-col>
                        <el-col :span="12">
        <el-form-item   v-if="flag=='xuesheng'"  label="联系电话" prop="lianxidianhua">
          <el-input v-model="ruleForm.lianxidianhua"               placeholder="联系电话" clearable></el-input>
        </el-form-item>
      </el-col>
                        <el-col :span="12">
        <el-form-item   v-if="flag=='xuesheng'"  label="邮箱" prop="youxiang">
          <el-input v-model="ruleForm.youxiang"               placeholder="邮箱" clearable></el-input>
        </el-form-item>
      </el-col>
                        <el-col :span="12">
        <el-form-item   v-if="flag=='xuesheng'"  label="身份证" prop="shenfenzheng">
          <el-input v-model="ruleForm.shenfenzheng"               placeholder="身份证" clearable></el-input>
        </el-form-item>
      </el-col>
                                                                                                <el-col :span="12">
        <el-form-item   v-if="flag=='fudaoyuan'"  label="辅导员工号" prop="fudaoyuangonghao">
          <el-input v-model="ruleForm.fudaoyuangonghao" readonly              placeholder="辅导员工号" clearable></el-input>
        </el-form-item>
      </el-col>
                                          <el-col :span="12">
        <el-form-item   v-if="flag=='fudaoyuan'"  label="辅导员姓名" prop="fudaoyuanxingming">
          <el-input v-model="ruleForm.fudaoyuanxingming"               placeholder="辅导员姓名" clearable></el-input>
        </el-form-item>
      </el-col>
                        <el-col :span="12">
        <el-form-item v-if="flag=='fudaoyuan'"  label="性别" prop="xingbie">
          <el-select v-model="ruleForm.xingbie" placeholder="请选择性别">
            <el-option
                v-for="(item,index) in fudaoyuanxingbieOptions"
                v-bind:key="index"
                :label="item"
                :value="item">
            </el-option>
          </el-select>
        </el-form-item>
      </el-col>
                        <el-col :span="12">
        <el-form-item v-if="flag=='fudaoyuan'"  label="学院" prop="xueyuan">
          <el-select v-model="ruleForm.xueyuan" placeholder="请选择学院">
            <el-option
                v-for="(item,index) in fudaoyuanxueyuanOptions"
                v-bind:key="index"
                :label="item"
                :value="item">
            </el-option>
          </el-select>
        </el-form-item>
      </el-col>
                        <el-col :span="12">
        <el-form-item   v-if="flag=='fudaoyuan'"  label="电话" prop="dianhua">
          <el-input v-model="ruleForm.dianhua"               placeholder="电话" clearable></el-input>
        </el-form-item>
      </el-col>
                        <el-col :span="12">
        <el-form-item   v-if="flag=='fudaoyuan'"  label="邮箱" prop="youxiang">
          <el-input v-model="ruleForm.youxiang"               placeholder="邮箱" clearable></el-input>
        </el-form-item>
      </el-col>
                        <el-col :span="24">  
        <el-form-item v-if="flag=='fudaoyuan'" label="照片" prop="zhaopian">
          <file-upload
          tip="点击上传照片"
          action="file/upload"
          :limit="3"
          :multiple="true"
          :fileUrls="ruleForm.zhaopian?ruleForm.zhaopian:''"
          @change="fudaoyuanzhaopianUploadChange"
          ></file-upload>
        </el-form-item>
      </el-col>
                                                                                                <el-col :span="12">
        <el-form-item   v-if="flag=='yuanshuji'"  label="院书记工号" prop="yuanshujigonghao">
          <el-input v-model="ruleForm.yuanshujigonghao" readonly              placeholder="院书记工号" clearable></el-input>
        </el-form-item>
      </el-col>
                                          <el-col :span="12">
        <el-form-item   v-if="flag=='yuanshuji'"  label="院书记姓名" prop="yuanshujixingming">
          <el-input v-model="ruleForm.yuanshujixingming"               placeholder="院书记姓名" clearable></el-input>
        </el-form-item>
      </el-col>
                        <el-col :span="12">
        <el-form-item v-if="flag=='yuanshuji'"  label="性别" prop="xingbie">
          <el-select v-model="ruleForm.xingbie" placeholder="请选择性别">
            <el-option
                v-for="(item,index) in yuanshujixingbieOptions"
                v-bind:key="index"
                :label="item"
                :value="item">
            </el-option>
          </el-select>
        </el-form-item>
      </el-col>
                        <el-col :span="12">
        <el-form-item v-if="flag=='yuanshuji'"  label="学院" prop="xueyuan">
          <el-select v-model="ruleForm.xueyuan" placeholder="请选择学院">
            <el-option
                v-for="(item,index) in yuanshujixueyuanOptions"
                v-bind:key="index"
                :label="item"
                :value="item">
            </el-option>
          </el-select>
        </el-form-item>
      </el-col>
                        <el-col :span="12">
        <el-form-item   v-if="flag=='yuanshuji'"  label="电话" prop="dianhua">
          <el-input v-model="ruleForm.dianhua"               placeholder="电话" clearable></el-input>
        </el-form-item>
      </el-col>
                        <el-col :span="12">
        <el-form-item   v-if="flag=='yuanshuji'"  label="邮箱" prop="youxiang">
          <el-input v-model="ruleForm.youxiang"               placeholder="邮箱" clearable></el-input>
        </el-form-item>
      </el-col>
                        <el-col :span="24">  
        <el-form-item v-if="flag=='yuanshuji'" label="照片" prop="zhaopian">
          <file-upload
          tip="点击上传照片"
          action="file/upload"
          :limit="3"
          :multiple="true"
          :fileUrls="ruleForm.zhaopian?ruleForm.zhaopian:''"
          @change="yuanshujizhaopianUploadChange"
          ></file-upload>
        </el-form-item>
      </el-col>
                                                                                    <el-col :span="12">
        <el-form-item   v-if="flag=='fenguanyuanzhang'"  label="工号" prop="gonghao">
          <el-input v-model="ruleForm.gonghao" readonly              placeholder="工号" clearable></el-input>
        </el-form-item>
      </el-col>
                                          <el-col :span="12">
        <el-form-item   v-if="flag=='fenguanyuanzhang'"  label="姓名" prop="xingming">
          <el-input v-model="ruleForm.xingming"               placeholder="姓名" clearable></el-input>
        </el-form-item>
      </el-col>
                        <el-col :span="12">
        <el-form-item v-if="flag=='fenguanyuanzhang'"  label="性别" prop="xingbie">
          <el-select v-model="ruleForm.xingbie" placeholder="请选择性别">
            <el-option
                v-for="(item,index) in fenguanyuanzhangxingbieOptions"
                v-bind:key="index"
                :label="item"
                :value="item">
            </el-option>
          </el-select>
        </el-form-item>
      </el-col>
                        <el-col :span="12">
        <el-form-item v-if="flag=='fenguanyuanzhang'"  label="学院" prop="xueyuan">
          <el-select v-model="ruleForm.xueyuan" placeholder="请选择学院">
            <el-option
                v-for="(item,index) in fenguanyuanzhangxueyuanOptions"
                v-bind:key="index"
                :label="item"
                :value="item">
            </el-option>
          </el-select>
        </el-form-item>
      </el-col>
                        <el-col :span="12">
        <el-form-item   v-if="flag=='fenguanyuanzhang'"  label="电话" prop="dianhua">
          <el-input v-model="ruleForm.dianhua"               placeholder="电话" clearable></el-input>
        </el-form-item>
      </el-col>
                        <el-col :span="12">
        <el-form-item   v-if="flag=='fenguanyuanzhang'"  label="邮箱" prop="youxiang">
          <el-input v-model="ruleForm.youxiang"               placeholder="邮箱" clearable></el-input>
        </el-form-item>
      </el-col>
                        <el-col :span="24">  
        <el-form-item v-if="flag=='fenguanyuanzhang'" label="照片" prop="zhaopian">
          <file-upload
          tip="点击上传照片"
          action="file/upload"
          :limit="3"
          :multiple="true"
          :fileUrls="ruleForm.zhaopian?ruleForm.zhaopian:''"
          @change="fenguanyuanzhangzhaopianUploadChange"
          ></file-upload>
        </el-form-item>
      </el-col>
                                                                                    <el-col :span="12">
        <el-form-item   v-if="flag=='jiaowuchuzhang'"  label="工号" prop="gonghao">
          <el-input v-model="ruleForm.gonghao" readonly              placeholder="工号" clearable></el-input>
        </el-form-item>
      </el-col>
                                          <el-col :span="12">
        <el-form-item   v-if="flag=='jiaowuchuzhang'"  label="姓名" prop="xingming">
          <el-input v-model="ruleForm.xingming"               placeholder="姓名" clearable></el-input>
        </el-form-item>
      </el-col>
                        <el-col :span="12">
        <el-form-item v-if="flag=='jiaowuchuzhang'"  label="性别" prop="xingbie">
          <el-select v-model="ruleForm.xingbie" placeholder="请选择性别">
            <el-option
                v-for="(item,index) in jiaowuchuzhangxingbieOptions"
                v-bind:key="index"
                :label="item"
                :value="item">
            </el-option>
          </el-select>
        </el-form-item>
      </el-col>
                        <el-col :span="12">
        <el-form-item   v-if="flag=='jiaowuchuzhang'"  label="电话" prop="dianhua">
          <el-input v-model="ruleForm.dianhua"               placeholder="电话" clearable></el-input>
        </el-form-item>
      </el-col>
                        <el-col :span="12">
        <el-form-item   v-if="flag=='jiaowuchuzhang'"  label="邮箱" prop="youxiang">
          <el-input v-model="ruleForm.youxiang"               placeholder="邮箱" clearable></el-input>
        </el-form-item>
      </el-col>
                        <el-col :span="24">  
        <el-form-item v-if="flag=='jiaowuchuzhang'" label="照片" prop="zhaopian">
          <file-upload
          tip="点击上传照片"
          action="file/upload"
          :limit="3"
          :multiple="true"
          :fileUrls="ruleForm.zhaopian?ruleForm.zhaopian:''"
          @change="jiaowuchuzhangzhaopianUploadChange"
          ></file-upload>
        </el-form-item>
      </el-col>
                                                                                    <el-col :span="12">
        <el-form-item   v-if="flag=='zhuguanxiaolingdao'"  label="工号" prop="gonghao">
          <el-input v-model="ruleForm.gonghao" readonly              placeholder="工号" clearable></el-input>
        </el-form-item>
      </el-col>
                                          <el-col :span="12">
        <el-form-item   v-if="flag=='zhuguanxiaolingdao'"  label="姓名" prop="xingming">
          <el-input v-model="ruleForm.xingming"               placeholder="姓名" clearable></el-input>
        </el-form-item>
      </el-col>
                        <el-col :span="12">
        <el-form-item v-if="flag=='zhuguanxiaolingdao'"  label="性别" prop="xingbie">
          <el-select v-model="ruleForm.xingbie" placeholder="请选择性别">
            <el-option
                v-for="(item,index) in zhuguanxiaolingdaoxingbieOptions"
                v-bind:key="index"
                :label="item"
                :value="item">
            </el-option>
          </el-select>
        </el-form-item>
      </el-col>
                        <el-col :span="12">
        <el-form-item   v-if="flag=='zhuguanxiaolingdao'"  label="电话" prop="dianhua">
          <el-input v-model="ruleForm.dianhua"               placeholder="电话" clearable></el-input>
        </el-form-item>
      </el-col>
                        <el-col :span="12">
        <el-form-item   v-if="flag=='zhuguanxiaolingdao'"  label="邮箱" prop="youxiang">
          <el-input v-model="ruleForm.youxiang"               placeholder="邮箱" clearable></el-input>
        </el-form-item>
      </el-col>
                        <el-col :span="24">  
        <el-form-item v-if="flag=='zhuguanxiaolingdao'" label="照片" prop="zhaopian">
          <file-upload
          tip="点击上传照片"
          action="file/upload"
          :limit="3"
          :multiple="true"
          :fileUrls="ruleForm.zhaopian?ruleForm.zhaopian:''"
          @change="zhuguanxiaolingdaozhaopianUploadChange"
          ></file-upload>
        </el-form-item>
      </el-col>
                                                                                                                                                                              <el-form-item v-if="flag=='users'" label="用户名" prop="username">
        <el-input v-model="ruleForm.username" 
        placeholder="用户名"></el-input>
      </el-form-item>
      <el-col :span="24">
      <el-form-item>
        <el-button type="primary" @click="onUpdateHandler">修 改</el-button>
      </el-form-item>
      </el-col>
      </el-row>
    </el-form>
  </div>
</template>
<script>
// 数字，邮件，手机，url，身份证校验
import { isNumber,isIntNumer,isEmail,isMobile,isPhone,isURL,checkIdCard } from "@/utils/validate";

export default {
  data() {
    return {
      ruleForm: {},
      flag: '',
      usersFlag: false,
                                                                  xueshengxingbieOptions: [],
                        xueshengzhuanyeOptions: [],
                                                                                                                                                                        fudaoyuanxingbieOptions: [],
                        fudaoyuanxueyuanOptions: [],
                                                                                                                                                            yuanshujixingbieOptions: [],
                        yuanshujixueyuanOptions: [],
                                                                                                                                                fenguanyuanzhangxingbieOptions: [],
                        fenguanyuanzhangxueyuanOptions: [],
                                                                                                                                                jiaowuchuzhangxingbieOptions: [],
                                                                                                                                                zhuguanxiaolingdaoxingbieOptions: [],
                                                                                                                                                                                                    };
  },
  mounted() {
    var table = this.$storage.get("sessionTable");
    this.flag = table;
    this.$http({
      url: `${this.$storage.get("sessionTable")}/session`,
      method: "get"
    }).then(({ data }) => {
      if (data && data.code === 0) {
        this.ruleForm = data.data;
      } else {
        this.$message.error(data.msg);
      }
    });
                                            this.xueshengxingbieOptions = "男,女".split(',')
                this.$http({
      url: `option/zhuanye/zhuanye`,
      method: "get"
    }).then(({ data }) => {
      if (data && data.code === 0) {
        this.xueshengzhuanyeOptions = data.data;
      } else {
        this.$message.error(data.msg);
      }
    });
                                                                                                                this.fudaoyuanxingbieOptions = "男,女".split(',')
                this.$http({
      url: `option/xueyuan/xueyuan`,
      method: "get"
    }).then(({ data }) => {
      if (data && data.code === 0) {
        this.fudaoyuanxueyuanOptions = data.data;
      } else {
        this.$message.error(data.msg);
      }
    });
                                                                                                        this.yuanshujixingbieOptions = "男,女".split(',')
                this.$http({
      url: `option/xueyuan/xueyuan`,
      method: "get"
    }).then(({ data }) => {
      if (data && data.code === 0) {
        this.yuanshujixueyuanOptions = data.data;
      } else {
        this.$message.error(data.msg);
      }
    });
                                                                                                this.fenguanyuanzhangxingbieOptions = "男,女".split(',')
                this.$http({
      url: `option/xueyuan/xueyuan`,
      method: "get"
    }).then(({ data }) => {
      if (data && data.code === 0) {
        this.fenguanyuanzhangxueyuanOptions = data.data;
      } else {
        this.$message.error(data.msg);
      }
    });
                                                                                                this.jiaowuchuzhangxingbieOptions = "男,女".split(',')
                                                                                                this.zhuguanxiaolingdaoxingbieOptions = "男,女".split(',')
                                                                                                                                  },
  methods: {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                fudaoyuanzhaopianUploadChange(fileUrls) {
        this.ruleForm.zhaopian = fileUrls;
    },
                                                                                                                yuanshujizhaopianUploadChange(fileUrls) {
        this.ruleForm.zhaopian = fileUrls;
    },
                                                                                                        fenguanyuanzhangzhaopianUploadChange(fileUrls) {
        this.ruleForm.zhaopian = fileUrls;
    },
                                                                                                jiaowuchuzhangzhaopianUploadChange(fileUrls) {
        this.ruleForm.zhaopian = fileUrls;
    },
                                                                                                zhuguanxiaolingdaozhaopianUploadChange(fileUrls) {
        this.ruleForm.zhaopian = fileUrls;
    },
                                                                                                            onUpdateHandler() {
                                                                                                                                                                                                                                                                                                                                                                                    if( 'xuesheng' ==this.flag && this.ruleForm.lianxidianhua&&(!isPhone(this.ruleForm.lianxidianhua))){
        this.$message.error(`联系电话应输入电话格式`);
        return
      }
                                                                              if( 'xuesheng' ==this.flag && this.ruleForm.youxiang&&(!isEmail(this.ruleForm.youxiang))){
        this.$message.error(`邮箱应输入邮箱格式`);
        return
      }
                                                                        if( 'xuesheng' ==this.flag && this.ruleForm.shenfenzheng&&(!checkIdCard(this.ruleForm.shenfenzheng))){
        this.$message.error(`身份证应输入身份证格式`);
        return
      }
                                                                                                                                                                              if((!this.ruleForm.fudaoyuangonghao)&& 'fudaoyuan'==this.flag){
        this.$message.error('辅导员工号不能为空');
        return
      }
                                                                  if((!this.ruleForm.mima)&& 'fudaoyuan'==this.flag){
        this.$message.error('密码不能为空');
        return
      }
                                                                  if((!this.ruleForm.fudaoyuanxingming)&& 'fudaoyuan'==this.flag){
        this.$message.error('辅导员姓名不能为空');
        return
      }
                                                                                                                                                                                                      if( 'fudaoyuan' ==this.flag && this.ruleForm.dianhua&&(!isMobile(this.ruleForm.dianhua))){
        this.$message.error(`电话应输入手机格式`);
        return
      }
                                                                        if( 'fudaoyuan' ==this.flag && this.ruleForm.youxiang&&(!isEmail(this.ruleForm.youxiang))){
        this.$message.error(`邮箱应输入邮箱格式`);
        return
      }
                                                                                                                                                                                                                                          if((!this.ruleForm.yuanshujigonghao)&& 'yuanshuji'==this.flag){
        this.$message.error('院书记工号不能为空');
        return
      }
                                                                  if((!this.ruleForm.mima)&& 'yuanshuji'==this.flag){
        this.$message.error('密码不能为空');
        return
      }
                                                                  if((!this.ruleForm.yuanshujixingming)&& 'yuanshuji'==this.flag){
        this.$message.error('院书记姓名不能为空');
        return
      }
                                                                                                                                                                                                      if( 'yuanshuji' ==this.flag && this.ruleForm.dianhua&&(!isMobile(this.ruleForm.dianhua))){
        this.$message.error(`电话应输入手机格式`);
        return
      }
                                                                        if( 'yuanshuji' ==this.flag && this.ruleForm.youxiang&&(!isEmail(this.ruleForm.youxiang))){
        this.$message.error(`邮箱应输入邮箱格式`);
        return
      }
                                                                                                                                                                                                                              if((!this.ruleForm.gonghao)&& 'fenguanyuanzhang'==this.flag){
        this.$message.error('工号不能为空');
        return
      }
                                                                  if((!this.ruleForm.mima)&& 'fenguanyuanzhang'==this.flag){
        this.$message.error('密码不能为空');
        return
      }
                                                                  if((!this.ruleForm.xingming)&& 'fenguanyuanzhang'==this.flag){
        this.$message.error('姓名不能为空');
        return
      }
                                                                                                                                                                                                      if( 'fenguanyuanzhang' ==this.flag && this.ruleForm.dianhua&&(!isMobile(this.ruleForm.dianhua))){
        this.$message.error(`电话应输入手机格式`);
        return
      }
                                                                        if( 'fenguanyuanzhang' ==this.flag && this.ruleForm.youxiang&&(!isEmail(this.ruleForm.youxiang))){
        this.$message.error(`邮箱应输入邮箱格式`);
        return
      }
                                                                                                                                                                                                                              if((!this.ruleForm.gonghao)&& 'jiaowuchuzhang'==this.flag){
        this.$message.error('工号不能为空');
        return
      }
                                                                  if((!this.ruleForm.mima)&& 'jiaowuchuzhang'==this.flag){
        this.$message.error('密码不能为空');
        return
      }
                                                                  if((!this.ruleForm.xingming)&& 'jiaowuchuzhang'==this.flag){
        this.$message.error('姓名不能为空');
        return
      }
                                                                                                                                                if( 'jiaowuchuzhang' ==this.flag && this.ruleForm.dianhua&&(!isMobile(this.ruleForm.dianhua))){
        this.$message.error(`电话应输入手机格式`);
        return
      }
                                                                        if( 'jiaowuchuzhang' ==this.flag && this.ruleForm.youxiang&&(!isEmail(this.ruleForm.youxiang))){
        this.$message.error(`邮箱应输入邮箱格式`);
        return
      }
                                                                                                                                                                                                                              if((!this.ruleForm.gonghao)&& 'zhuguanxiaolingdao'==this.flag){
        this.$message.error('工号不能为空');
        return
      }
                                                                  if((!this.ruleForm.mima)&& 'zhuguanxiaolingdao'==this.flag){
        this.$message.error('密码不能为空');
        return
      }
                                                                  if((!this.ruleForm.xingming)&& 'zhuguanxiaolingdao'==this.flag){
        this.$message.error('姓名不能为空');
        return
      }
                                                                                                                                                if( 'zhuguanxiaolingdao' ==this.flag && this.ruleForm.dianhua&&(!isMobile(this.ruleForm.dianhua))){
        this.$message.error(`电话应输入手机格式`);
        return
      }
                                                                        if( 'zhuguanxiaolingdao' ==this.flag && this.ruleForm.youxiang&&(!isEmail(this.ruleForm.youxiang))){
        this.$message.error(`邮箱应输入邮箱格式`);
        return
      }
                                                                                                                                                                                                                                                                                                                        this.$http({
        url: `${this.$storage.get("sessionTable")}/update`,
        method: "post",
        data: this.ruleForm
      }).then(({ data }) => {
        if (data && data.code === 0) {
          this.$message({
            message: "修改信息成功",
            type: "success",
            duration: 1500,
            onClose: () => {
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
</style>
