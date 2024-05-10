const base = {
    get() {
        return {
            url : "http://localhost:8080/ssmkxl70/",
            name: "ssmkxl70",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssmkxl70/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "校园防疫微信小程序"
        } 
    }
}
export default base
