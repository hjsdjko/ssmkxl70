<template>
	<view class="content">
		<view class="logo" v-if="false">
			<image :style='{"boxShadow":"0 0 16rpx #59f43e","borderColor":"#ccc","borderRadius":"40rpx","borderWidth":"2rpx","width":"160rpx","borderStyle":"solid","url":"http://codegen.caihongy.cn/20201024/ed5e326ca66f403aa3197b5fbb4ec733.jpg","isShow":false,"height":"160rpx"}' src='http://codegen.caihongy.cn/20201024/ed5e326ca66f403aa3197b5fbb4ec733.jpg' mode="aspectFill"></image>
		</view>
		<view v-if="tableName=='xuesheng'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"rgba(255, 153, 0, 1)","backgroundColor":"#fff","borderRadius":"40rpx","color":"#333","textAlign":"left","borderWidth":"4rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' v-model="ruleForm.xuehao" type="text" class="uni-input" name="" placeholder="学号" />
		</view>
		<view v-if="tableName=='xuesheng'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"rgba(255, 153, 0, 1)","backgroundColor":"#fff","borderRadius":"40rpx","color":"#333","textAlign":"left","borderWidth":"4rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' v-model="ruleForm.mima" type="text" class="uni-input" name="" placeholder="密码" />
		</view>
		<view v-if="tableName=='xuesheng'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"rgba(255, 153, 0, 1)","backgroundColor":"#fff","borderRadius":"40rpx","color":"#333","textAlign":"left","borderWidth":"4rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' v-model="ruleForm.xingming" type="text" class="uni-input" name="" placeholder="姓名" />
		</view>
		<view v-if="tableName=='xuesheng'" class="uni-form-item uni-column">
                        <picker @change="xueshengxingbieChange" :value="xueshengxingbieIndex" :range="xueshengxingbieOptions">
                                <view :style='{"borderColor":"rgba(255, 153, 0, 1)","backgroundColor":"#fff","borderRadius":"40rpx","color":"#333","textAlign":"left","borderWidth":"4rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' class="uni-input">{{ruleForm.xingbie?ruleForm.xingbie:"请选择性别"}}</view>
                        </picker>
                </view>
		<view v-if="tableName=='xuesheng'" class="uni-form-item uni-column">
                        <picker @change="xueshengzhuanyeChange" :value="xueshengzhuanyeIndex" :range="xueshengzhuanyeOptions">
                                <view :style='{"borderColor":"rgba(255, 153, 0, 1)","backgroundColor":"#fff","borderRadius":"40rpx","color":"#333","textAlign":"left","borderWidth":"4rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' class="uni-input">{{ruleForm.zhuanye?ruleForm.zhuanye:"请选择专业"}}</view>
                        </picker>
                </view>
		<view v-if="tableName=='xuesheng'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"rgba(255, 153, 0, 1)","backgroundColor":"#fff","borderRadius":"40rpx","color":"#333","textAlign":"left","borderWidth":"4rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' v-model="ruleForm.banji" type="text" class="uni-input" name="" placeholder="班级" />
		</view>
		<view v-if="tableName=='xuesheng'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"rgba(255, 153, 0, 1)","backgroundColor":"#fff","borderRadius":"40rpx","color":"#333","textAlign":"left","borderWidth":"4rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' v-model="ruleForm.lianxidianhua" type="text" class="uni-input" name="" placeholder="联系电话" />
		</view>
		<view v-if="tableName=='xuesheng'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"rgba(255, 153, 0, 1)","backgroundColor":"#fff","borderRadius":"40rpx","color":"#333","textAlign":"left","borderWidth":"4rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' v-model="ruleForm.youxiang" type="text" class="uni-input" name="" placeholder="邮箱" />
		</view>
		<view v-if="tableName=='xuesheng'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"rgba(255, 153, 0, 1)","backgroundColor":"#fff","borderRadius":"40rpx","color":"#333","textAlign":"left","borderWidth":"4rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' v-model="ruleForm.shenfenzheng" type="text" class="uni-input" name="" placeholder="身份证" />
		</view>
		<view v-if="tableName=='fudaoyuan'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"rgba(255, 153, 0, 1)","backgroundColor":"#fff","borderRadius":"40rpx","color":"#333","textAlign":"left","borderWidth":"4rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' v-model="ruleForm.fudaoyuangonghao" type="text" class="uni-input" name="" placeholder="辅导员工号" />
		</view>
		<view v-if="tableName=='fudaoyuan'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"rgba(255, 153, 0, 1)","backgroundColor":"#fff","borderRadius":"40rpx","color":"#333","textAlign":"left","borderWidth":"4rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' v-model="ruleForm.mima" type="text" class="uni-input" name="" placeholder="密码" />
		</view>
		<view v-if="tableName=='fudaoyuan'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"rgba(255, 153, 0, 1)","backgroundColor":"#fff","borderRadius":"40rpx","color":"#333","textAlign":"left","borderWidth":"4rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' v-model="ruleForm.fudaoyuanxingming" type="text" class="uni-input" name="" placeholder="辅导员姓名" />
		</view>
		<view v-if="tableName=='fudaoyuan'" class="uni-form-item uni-column">
                        <picker @change="fudaoyuanxingbieChange" :value="fudaoyuanxingbieIndex" :range="fudaoyuanxingbieOptions">
                                <view :style='{"borderColor":"rgba(255, 153, 0, 1)","backgroundColor":"#fff","borderRadius":"40rpx","color":"#333","textAlign":"left","borderWidth":"4rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' class="uni-input">{{ruleForm.xingbie?ruleForm.xingbie:"请选择性别"}}</view>
                        </picker>
                </view>
		<view v-if="tableName=='fudaoyuan'" class="uni-form-item uni-column">
                        <picker @change="fudaoyuanxueyuanChange" :value="fudaoyuanxueyuanIndex" :range="fudaoyuanxueyuanOptions">
                                <view :style='{"borderColor":"rgba(255, 153, 0, 1)","backgroundColor":"#fff","borderRadius":"40rpx","color":"#333","textAlign":"left","borderWidth":"4rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' class="uni-input">{{ruleForm.xueyuan?ruleForm.xueyuan:"请选择学院"}}</view>
                        </picker>
                </view>
		<view v-if="tableName=='fudaoyuan'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"rgba(255, 153, 0, 1)","backgroundColor":"#fff","borderRadius":"40rpx","color":"#333","textAlign":"left","borderWidth":"4rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' v-model="ruleForm.dianhua" type="text" class="uni-input" name="" placeholder="电话" />
		</view>
		<view v-if="tableName=='fudaoyuan'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"rgba(255, 153, 0, 1)","backgroundColor":"#fff","borderRadius":"40rpx","color":"#333","textAlign":"left","borderWidth":"4rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' v-model="ruleForm.youxiang" type="text" class="uni-input" name="" placeholder="邮箱" />
		</view>
		<view v-if="tableName=='yuanshuji'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"rgba(255, 153, 0, 1)","backgroundColor":"#fff","borderRadius":"40rpx","color":"#333","textAlign":"left","borderWidth":"4rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' v-model="ruleForm.yuanshujigonghao" type="text" class="uni-input" name="" placeholder="院书记工号" />
		</view>
		<view v-if="tableName=='yuanshuji'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"rgba(255, 153, 0, 1)","backgroundColor":"#fff","borderRadius":"40rpx","color":"#333","textAlign":"left","borderWidth":"4rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' v-model="ruleForm.mima" type="text" class="uni-input" name="" placeholder="密码" />
		</view>
		<view v-if="tableName=='yuanshuji'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"rgba(255, 153, 0, 1)","backgroundColor":"#fff","borderRadius":"40rpx","color":"#333","textAlign":"left","borderWidth":"4rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' v-model="ruleForm.yuanshujixingming" type="text" class="uni-input" name="" placeholder="院书记姓名" />
		</view>
		<view v-if="tableName=='yuanshuji'" class="uni-form-item uni-column">
                        <picker @change="yuanshujixingbieChange" :value="yuanshujixingbieIndex" :range="yuanshujixingbieOptions">
                                <view :style='{"borderColor":"rgba(255, 153, 0, 1)","backgroundColor":"#fff","borderRadius":"40rpx","color":"#333","textAlign":"left","borderWidth":"4rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' class="uni-input">{{ruleForm.xingbie?ruleForm.xingbie:"请选择性别"}}</view>
                        </picker>
                </view>
		<view v-if="tableName=='yuanshuji'" class="uni-form-item uni-column">
                        <picker @change="yuanshujixueyuanChange" :value="yuanshujixueyuanIndex" :range="yuanshujixueyuanOptions">
                                <view :style='{"borderColor":"rgba(255, 153, 0, 1)","backgroundColor":"#fff","borderRadius":"40rpx","color":"#333","textAlign":"left","borderWidth":"4rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' class="uni-input">{{ruleForm.xueyuan?ruleForm.xueyuan:"请选择学院"}}</view>
                        </picker>
                </view>
		<view v-if="tableName=='yuanshuji'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"rgba(255, 153, 0, 1)","backgroundColor":"#fff","borderRadius":"40rpx","color":"#333","textAlign":"left","borderWidth":"4rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' v-model="ruleForm.dianhua" type="text" class="uni-input" name="" placeholder="电话" />
		</view>
		<view v-if="tableName=='yuanshuji'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"rgba(255, 153, 0, 1)","backgroundColor":"#fff","borderRadius":"40rpx","color":"#333","textAlign":"left","borderWidth":"4rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' v-model="ruleForm.youxiang" type="text" class="uni-input" name="" placeholder="邮箱" />
		</view>
		<view v-if="tableName=='fenguanyuanzhang'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"rgba(255, 153, 0, 1)","backgroundColor":"#fff","borderRadius":"40rpx","color":"#333","textAlign":"left","borderWidth":"4rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' v-model="ruleForm.gonghao" type="text" class="uni-input" name="" placeholder="工号" />
		</view>
		<view v-if="tableName=='fenguanyuanzhang'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"rgba(255, 153, 0, 1)","backgroundColor":"#fff","borderRadius":"40rpx","color":"#333","textAlign":"left","borderWidth":"4rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' v-model="ruleForm.mima" type="text" class="uni-input" name="" placeholder="密码" />
		</view>
		<view v-if="tableName=='fenguanyuanzhang'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"rgba(255, 153, 0, 1)","backgroundColor":"#fff","borderRadius":"40rpx","color":"#333","textAlign":"left","borderWidth":"4rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' v-model="ruleForm.xingming" type="text" class="uni-input" name="" placeholder="姓名" />
		</view>
		<view v-if="tableName=='fenguanyuanzhang'" class="uni-form-item uni-column">
                        <picker @change="fenguanyuanzhangxingbieChange" :value="fenguanyuanzhangxingbieIndex" :range="fenguanyuanzhangxingbieOptions">
                                <view :style='{"borderColor":"rgba(255, 153, 0, 1)","backgroundColor":"#fff","borderRadius":"40rpx","color":"#333","textAlign":"left","borderWidth":"4rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' class="uni-input">{{ruleForm.xingbie?ruleForm.xingbie:"请选择性别"}}</view>
                        </picker>
                </view>
		<view v-if="tableName=='fenguanyuanzhang'" class="uni-form-item uni-column">
                        <picker @change="fenguanyuanzhangxueyuanChange" :value="fenguanyuanzhangxueyuanIndex" :range="fenguanyuanzhangxueyuanOptions">
                                <view :style='{"borderColor":"rgba(255, 153, 0, 1)","backgroundColor":"#fff","borderRadius":"40rpx","color":"#333","textAlign":"left","borderWidth":"4rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' class="uni-input">{{ruleForm.xueyuan?ruleForm.xueyuan:"请选择学院"}}</view>
                        </picker>
                </view>
		<view v-if="tableName=='fenguanyuanzhang'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"rgba(255, 153, 0, 1)","backgroundColor":"#fff","borderRadius":"40rpx","color":"#333","textAlign":"left","borderWidth":"4rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' v-model="ruleForm.dianhua" type="text" class="uni-input" name="" placeholder="电话" />
		</view>
		<view v-if="tableName=='fenguanyuanzhang'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"rgba(255, 153, 0, 1)","backgroundColor":"#fff","borderRadius":"40rpx","color":"#333","textAlign":"left","borderWidth":"4rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' v-model="ruleForm.youxiang" type="text" class="uni-input" name="" placeholder="邮箱" />
		</view>
		<view v-if="tableName=='jiaowuchuzhang'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"rgba(255, 153, 0, 1)","backgroundColor":"#fff","borderRadius":"40rpx","color":"#333","textAlign":"left","borderWidth":"4rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' v-model="ruleForm.gonghao" type="text" class="uni-input" name="" placeholder="工号" />
		</view>
		<view v-if="tableName=='jiaowuchuzhang'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"rgba(255, 153, 0, 1)","backgroundColor":"#fff","borderRadius":"40rpx","color":"#333","textAlign":"left","borderWidth":"4rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' v-model="ruleForm.mima" type="text" class="uni-input" name="" placeholder="密码" />
		</view>
		<view v-if="tableName=='jiaowuchuzhang'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"rgba(255, 153, 0, 1)","backgroundColor":"#fff","borderRadius":"40rpx","color":"#333","textAlign":"left","borderWidth":"4rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' v-model="ruleForm.xingming" type="text" class="uni-input" name="" placeholder="姓名" />
		</view>
		<view v-if="tableName=='jiaowuchuzhang'" class="uni-form-item uni-column">
                        <picker @change="jiaowuchuzhangxingbieChange" :value="jiaowuchuzhangxingbieIndex" :range="jiaowuchuzhangxingbieOptions">
                                <view :style='{"borderColor":"rgba(255, 153, 0, 1)","backgroundColor":"#fff","borderRadius":"40rpx","color":"#333","textAlign":"left","borderWidth":"4rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' class="uni-input">{{ruleForm.xingbie?ruleForm.xingbie:"请选择性别"}}</view>
                        </picker>
                </view>
		<view v-if="tableName=='jiaowuchuzhang'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"rgba(255, 153, 0, 1)","backgroundColor":"#fff","borderRadius":"40rpx","color":"#333","textAlign":"left","borderWidth":"4rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' v-model="ruleForm.dianhua" type="text" class="uni-input" name="" placeholder="电话" />
		</view>
		<view v-if="tableName=='jiaowuchuzhang'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"rgba(255, 153, 0, 1)","backgroundColor":"#fff","borderRadius":"40rpx","color":"#333","textAlign":"left","borderWidth":"4rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' v-model="ruleForm.youxiang" type="text" class="uni-input" name="" placeholder="邮箱" />
		</view>
		<view v-if="tableName=='zhuguanxiaolingdao'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"rgba(255, 153, 0, 1)","backgroundColor":"#fff","borderRadius":"40rpx","color":"#333","textAlign":"left","borderWidth":"4rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' v-model="ruleForm.gonghao" type="text" class="uni-input" name="" placeholder="工号" />
		</view>
		<view v-if="tableName=='zhuguanxiaolingdao'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"rgba(255, 153, 0, 1)","backgroundColor":"#fff","borderRadius":"40rpx","color":"#333","textAlign":"left","borderWidth":"4rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' v-model="ruleForm.mima" type="text" class="uni-input" name="" placeholder="密码" />
		</view>
		<view v-if="tableName=='zhuguanxiaolingdao'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"rgba(255, 153, 0, 1)","backgroundColor":"#fff","borderRadius":"40rpx","color":"#333","textAlign":"left","borderWidth":"4rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' v-model="ruleForm.xingming" type="text" class="uni-input" name="" placeholder="姓名" />
		</view>
		<view v-if="tableName=='zhuguanxiaolingdao'" class="uni-form-item uni-column">
                        <picker @change="zhuguanxiaolingdaoxingbieChange" :value="zhuguanxiaolingdaoxingbieIndex" :range="zhuguanxiaolingdaoxingbieOptions">
                                <view :style='{"borderColor":"rgba(255, 153, 0, 1)","backgroundColor":"#fff","borderRadius":"40rpx","color":"#333","textAlign":"left","borderWidth":"4rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' class="uni-input">{{ruleForm.xingbie?ruleForm.xingbie:"请选择性别"}}</view>
                        </picker>
                </view>
		<view v-if="tableName=='zhuguanxiaolingdao'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"rgba(255, 153, 0, 1)","backgroundColor":"#fff","borderRadius":"40rpx","color":"#333","textAlign":"left","borderWidth":"4rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' v-model="ruleForm.dianhua" type="text" class="uni-input" name="" placeholder="电话" />
		</view>
		<view v-if="tableName=='zhuguanxiaolingdao'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"rgba(255, 153, 0, 1)","backgroundColor":"#fff","borderRadius":"40rpx","color":"#333","textAlign":"left","borderWidth":"4rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' v-model="ruleForm.youxiang" type="text" class="uni-input" name="" placeholder="邮箱" />
		</view>
		<view>
			<button @tap="register" type="primary" :style='{"borderColor":"#ccc","backgroundColor":"rgba(255, 153, 0, 1)","borderRadius":"40rpx","color":"rgba(255, 255, 255, 1)","borderWidth":"2rpx","fontSize":"32rpx","borderStyle":"solid","height":"88rpx"}'>注册</button>
		</view>
	</view>
</template>

<script>
	export default {
		data() {
			return {
                                xueshengxingbieOptions: [],
                                xueshengxingbieIndex: 0,
                                xueshengzhuanyeOptions: [],
                                xueshengzhuanyeIndex: 0,
                                fudaoyuanxingbieOptions: [],
                                fudaoyuanxingbieIndex: 0,
                                fudaoyuanxueyuanOptions: [],
                                fudaoyuanxueyuanIndex: 0,
                                yuanshujixingbieOptions: [],
                                yuanshujixingbieIndex: 0,
                                yuanshujixueyuanOptions: [],
                                yuanshujixueyuanIndex: 0,
                                fenguanyuanzhangxingbieOptions: [],
                                fenguanyuanzhangxingbieIndex: 0,
                                fenguanyuanzhangxueyuanOptions: [],
                                fenguanyuanzhangxueyuanIndex: 0,
                                jiaowuchuzhangxingbieOptions: [],
                                jiaowuchuzhangxingbieIndex: 0,
                                zhuguanxiaolingdaoxingbieOptions: [],
                                zhuguanxiaolingdaoxingbieIndex: 0,
				ruleForm: {
				},
				tableName:""
			}
		},
		async onLoad() {
			let res = [];
			let table = uni.getStorageSync("loginTable");
	    		this.tableName = table;

                        // 自定义下拉框值
			if(this.tableName=='xuesheng'){
                        	this.xueshengxingbieOptions = "男,女".split(',');
				this.ruleForm.xingbie=this.xueshengxingbieOptions[0]
			}
			if(this.tableName=='xuesheng'){
                        	res = await this.$api.option(`zhuanye`,`zhuanye`,{});
                        	this.xueshengzhuanyeOptions = res.data;
				this.ruleForm.zhuanye=this.xueshengzhuanyeOptions[0]
			}
                        // 自定义下拉框值
			if(this.tableName=='fudaoyuan'){
                        	this.fudaoyuanxingbieOptions = "男,女".split(',');
				this.ruleForm.xingbie=this.fudaoyuanxingbieOptions[0]
			}
			if(this.tableName=='fudaoyuan'){
                        	res = await this.$api.option(`xueyuan`,`xueyuan`,{});
                        	this.fudaoyuanxueyuanOptions = res.data;
				this.ruleForm.xueyuan=this.fudaoyuanxueyuanOptions[0]
			}
                        // 自定义下拉框值
			if(this.tableName=='yuanshuji'){
                        	this.yuanshujixingbieOptions = "男,女".split(',');
				this.ruleForm.xingbie=this.yuanshujixingbieOptions[0]
			}
			if(this.tableName=='yuanshuji'){
                        	res = await this.$api.option(`xueyuan`,`xueyuan`,{});
                        	this.yuanshujixueyuanOptions = res.data;
				this.ruleForm.xueyuan=this.yuanshujixueyuanOptions[0]
			}
                        // 自定义下拉框值
			if(this.tableName=='fenguanyuanzhang'){
                        	this.fenguanyuanzhangxingbieOptions = "男,女".split(',');
				this.ruleForm.xingbie=this.fenguanyuanzhangxingbieOptions[0]
			}
			if(this.tableName=='fenguanyuanzhang'){
                        	res = await this.$api.option(`xueyuan`,`xueyuan`,{});
                        	this.fenguanyuanzhangxueyuanOptions = res.data;
				this.ruleForm.xueyuan=this.fenguanyuanzhangxueyuanOptions[0]
			}
                        // 自定义下拉框值
			if(this.tableName=='jiaowuchuzhang'){
                        	this.jiaowuchuzhangxingbieOptions = "男,女".split(',');
				this.ruleForm.xingbie=this.jiaowuchuzhangxingbieOptions[0]
			}
                        // 自定义下拉框值
			if(this.tableName=='zhuguanxiaolingdao'){
                        	this.zhuguanxiaolingdaoxingbieOptions = "男,女".split(',');
				this.ruleForm.xingbie=this.zhuguanxiaolingdaoxingbieOptions[0]
			}
			
			this.styleChange()
		},
		methods: {
                        // 下拉变化
                        xueshengxingbieChange(e) {
                                this.xueshengxingbieIndex = e.target.value
                                this.ruleForm.xingbie = this.xueshengxingbieOptions[this.xueshengxingbieIndex]
                        },
                        // 下拉变化
                        xueshengzhuanyeChange(e) {
                                this.xueshengzhuanyeIndex = e.target.value
                                this.ruleForm.zhuanye = this.xueshengzhuanyeOptions[this.xueshengzhuanyeIndex]
                        },
                        // 下拉变化
                        fudaoyuanxingbieChange(e) {
                                this.fudaoyuanxingbieIndex = e.target.value
                                this.ruleForm.xingbie = this.fudaoyuanxingbieOptions[this.fudaoyuanxingbieIndex]
                        },
                        // 下拉变化
                        fudaoyuanxueyuanChange(e) {
                                this.fudaoyuanxueyuanIndex = e.target.value
                                this.ruleForm.xueyuan = this.fudaoyuanxueyuanOptions[this.fudaoyuanxueyuanIndex]
                        },
                        // 下拉变化
                        yuanshujixingbieChange(e) {
                                this.yuanshujixingbieIndex = e.target.value
                                this.ruleForm.xingbie = this.yuanshujixingbieOptions[this.yuanshujixingbieIndex]
                        },
                        // 下拉变化
                        yuanshujixueyuanChange(e) {
                                this.yuanshujixueyuanIndex = e.target.value
                                this.ruleForm.xueyuan = this.yuanshujixueyuanOptions[this.yuanshujixueyuanIndex]
                        },
                        // 下拉变化
                        fenguanyuanzhangxingbieChange(e) {
                                this.fenguanyuanzhangxingbieIndex = e.target.value
                                this.ruleForm.xingbie = this.fenguanyuanzhangxingbieOptions[this.fenguanyuanzhangxingbieIndex]
                        },
                        // 下拉变化
                        fenguanyuanzhangxueyuanChange(e) {
                                this.fenguanyuanzhangxueyuanIndex = e.target.value
                                this.ruleForm.xueyuan = this.fenguanyuanzhangxueyuanOptions[this.fenguanyuanzhangxueyuanIndex]
                        },
                        // 下拉变化
                        jiaowuchuzhangxingbieChange(e) {
                                this.jiaowuchuzhangxingbieIndex = e.target.value
                                this.ruleForm.xingbie = this.jiaowuchuzhangxingbieOptions[this.jiaowuchuzhangxingbieIndex]
                        },
                        // 下拉变化
                        zhuguanxiaolingdaoxingbieChange(e) {
                                this.zhuguanxiaolingdaoxingbieIndex = e.target.value
                                this.ruleForm.xingbie = this.zhuguanxiaolingdaoxingbieOptions[this.zhuguanxiaolingdaoxingbieIndex]
                        },

			styleChange() {
				this.$nextTick(()=>{
					// document.querySelectorAll('.uni-input .uni-input-input').forEach(el=>{
					//   el.style.backgroundColor = this.registerFrom.content.input.backgroundColor
					// })
				})
			},
			// 获取uuid
			getUUID () {
				return new Date().getTime();
			},
			// 注册
			async register() {
				if(`xuesheng` == this.tableName && this.ruleForm.lianxidianhua&&(!this.$validate.isPhone(this.ruleForm.lianxidianhua))){
					this.$utils.msg(`联系电话应输入电话格式`);
					return
				}
				if(`xuesheng` == this.tableName && this.ruleForm.youxiang&&(!this.$validate.isEmail(this.ruleForm.youxiang))){
					this.$utils.msg(`邮箱应输入邮件格式`);
					return
				}
				if(`xuesheng` == this.tableName && this.ruleForm.shenfenzheng&&(!this.$validate.checkIdCard(this.ruleForm.shenfenzheng))){
					this.$utils.msg(`身份证应输入身份证格式`);
					return
				}
				if((!this.ruleForm.fudaoyuangonghao) && `fudaoyuan` == this.tableName){
					this.$utils.msg(`辅导员工号不能为空`);
					return
				}
				if((!this.ruleForm.mima) && `fudaoyuan` == this.tableName){
					this.$utils.msg(`密码不能为空`);
					return
				}
				if((!this.ruleForm.fudaoyuanxingming) && `fudaoyuan` == this.tableName){
					this.$utils.msg(`辅导员姓名不能为空`);
					return
				}
				if(`fudaoyuan` == this.tableName && this.ruleForm.dianhua&&(!this.$validate.isMobile(this.ruleForm.dianhua))){
					this.$utils.msg(`电话应输入手机格式`);
					return
				}
				if(`fudaoyuan` == this.tableName && this.ruleForm.youxiang&&(!this.$validate.isEmail(this.ruleForm.youxiang))){
					this.$utils.msg(`邮箱应输入邮件格式`);
					return
				}
				if((!this.ruleForm.yuanshujigonghao) && `yuanshuji` == this.tableName){
					this.$utils.msg(`院书记工号不能为空`);
					return
				}
				if((!this.ruleForm.mima) && `yuanshuji` == this.tableName){
					this.$utils.msg(`密码不能为空`);
					return
				}
				if((!this.ruleForm.yuanshujixingming) && `yuanshuji` == this.tableName){
					this.$utils.msg(`院书记姓名不能为空`);
					return
				}
				if(`yuanshuji` == this.tableName && this.ruleForm.dianhua&&(!this.$validate.isMobile(this.ruleForm.dianhua))){
					this.$utils.msg(`电话应输入手机格式`);
					return
				}
				if(`yuanshuji` == this.tableName && this.ruleForm.youxiang&&(!this.$validate.isEmail(this.ruleForm.youxiang))){
					this.$utils.msg(`邮箱应输入邮件格式`);
					return
				}
				if((!this.ruleForm.gonghao) && `fenguanyuanzhang` == this.tableName){
					this.$utils.msg(`工号不能为空`);
					return
				}
				if((!this.ruleForm.mima) && `fenguanyuanzhang` == this.tableName){
					this.$utils.msg(`密码不能为空`);
					return
				}
				if((!this.ruleForm.xingming) && `fenguanyuanzhang` == this.tableName){
					this.$utils.msg(`姓名不能为空`);
					return
				}
				if(`fenguanyuanzhang` == this.tableName && this.ruleForm.dianhua&&(!this.$validate.isMobile(this.ruleForm.dianhua))){
					this.$utils.msg(`电话应输入手机格式`);
					return
				}
				if(`fenguanyuanzhang` == this.tableName && this.ruleForm.youxiang&&(!this.$validate.isEmail(this.ruleForm.youxiang))){
					this.$utils.msg(`邮箱应输入邮件格式`);
					return
				}
				if((!this.ruleForm.gonghao) && `jiaowuchuzhang` == this.tableName){
					this.$utils.msg(`工号不能为空`);
					return
				}
				if((!this.ruleForm.mima) && `jiaowuchuzhang` == this.tableName){
					this.$utils.msg(`密码不能为空`);
					return
				}
				if((!this.ruleForm.xingming) && `jiaowuchuzhang` == this.tableName){
					this.$utils.msg(`姓名不能为空`);
					return
				}
				if(`jiaowuchuzhang` == this.tableName && this.ruleForm.dianhua&&(!this.$validate.isMobile(this.ruleForm.dianhua))){
					this.$utils.msg(`电话应输入手机格式`);
					return
				}
				if(`jiaowuchuzhang` == this.tableName && this.ruleForm.youxiang&&(!this.$validate.isEmail(this.ruleForm.youxiang))){
					this.$utils.msg(`邮箱应输入邮件格式`);
					return
				}
				if((!this.ruleForm.gonghao) && `zhuguanxiaolingdao` == this.tableName){
					this.$utils.msg(`工号不能为空`);
					return
				}
				if((!this.ruleForm.mima) && `zhuguanxiaolingdao` == this.tableName){
					this.$utils.msg(`密码不能为空`);
					return
				}
				if((!this.ruleForm.xingming) && `zhuguanxiaolingdao` == this.tableName){
					this.$utils.msg(`姓名不能为空`);
					return
				}
				if(`zhuguanxiaolingdao` == this.tableName && this.ruleForm.dianhua&&(!this.$validate.isMobile(this.ruleForm.dianhua))){
					this.$utils.msg(`电话应输入手机格式`);
					return
				}
				if(`zhuguanxiaolingdao` == this.tableName && this.ruleForm.youxiang&&(!this.$validate.isEmail(this.ruleForm.youxiang))){
					this.$utils.msg(`邮箱应输入邮件格式`);
					return
				}
				await this.$api.register(`${this.tableName}`, this.ruleForm);
				this.$utils.msgBack('注册成功');;
			}
		}
	}
</script>

<style lang="scss" scoped>
	$color-primary: #b49950;

	.content {
		padding: 100upx;
	}
	
	.content:after {
		position: fixed;
		top: 0;
		right: 0;
		left: 0;
		bottom: 0;
		content: '';
				background-attachment: fixed;
		background-size: cover;
		background-position: center;
	}

	.logo {
		text-align: center;

		image {
			height: 200upx;
			width: 200upx;
			margin: 0 0 60upx;
		}
	}

	.uni-form-item {
		margin-bottom: 40upx;
		padding: 0;

		.uni-input {
			font-size: 30upx;
			padding: 7px 0;
		}
	}

	button[type="primary"] {
		background-color: $color-primary;
		border-radius: 0;
		font-size: 34upx;
		margin-top: 60upx;
	}

	.links {
		text-align: center;
		margin-top: 40upx;
		font-size: 26upx;
		color: #999;

		view {
			display: inline-block;
			vertical-align: top;
			margin: 0 10upx;
		}

		.link-highlight {
			color: $color-primary
		}
	}
.picker-select-input {
	line-height: 88rpx;
}

</style>
