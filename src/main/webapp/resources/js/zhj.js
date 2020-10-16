Date.prototype.format = function (fmt) {
    var o = {
        "M+": this.getMonth() + 1, //月份
        "d+": this.getDate(), //日
        "h+": this.getHours(), //小时
        "m+": this.getMinutes(), //分
        "s+": this.getSeconds(), //秒
        "q+": Math.floor((this.getMonth() + 3) / 3), //季度
        "S": this.getMilliseconds() //毫秒
    };
    if (/(y+)/.test(fmt)) fmt = fmt.replace(RegExp.$1, (this.getFullYear() + "").substr(4 - RegExp.$1.length));
    for (var k in o)
        if (new RegExp("(" + k + ")").test(fmt)) fmt = fmt.replace(RegExp.$1, (RegExp.$1.length == 1) ? (o[k]) : (("00" + o[k]).substr(("" + o[k]).length)));
    return fmt;
}
//最小值
Array.prototype.minValue = function() {
    var min = this[0];
    var len = this.length;
    for (var i = 1; i < len; i++){
        if (this[i] < min){
            min = this[i];
        }
    }
    return min;
}
//最大值
Array.prototype.maxValue = function() {
    var max = this[0];
    var len = this.length;
    for (var i = 1; i < len; i++){
        if (this[i] > max) {
            max = this[i];
        }
    }
    return max;
}
function getStddev(arr) {
    var total=0;
    for(var i=0;i<arr.length;i++){
        total += arr[i]
    }
    var avg = total/arr.length;
    var sum = 0
    for(var i=0;i<arr.length;i++){
        sum += Math.pow(Math.abs(arr[i]-avg),2);
    }
    var sum_n=sum/(arr.length-1);
    var res = Math.sqrt(sum_n);
    return res;
}

function initLoading(divname,loadingName) {
    $('#'+divname).loading({
        loadingWidth:120,
        title:'',
        name:loadingName,
        discription:'',
        direction:'column',
        type:'origin',
        // originBg:'#71EA71',
        originDivWidth:40,
        originDivHeight:40,
        originWidth:6,
        originHeight:6,
        smallLoading:false,
        loadingMaskBg:'rgba(0,0,0,0.1)'
    });
}

function noRepeatArr(arr) {
    var ret = [];
    for (var i = 0; i < arr.length; i++) {
        if (arr.indexOf(arr[i]) == i) {
            ret.push(arr[i]);
        }
    }
    return ret;
}

function toleranceChange(meugw,meogw,percentage) {
    var reObj=new Object();
    if(!isBlank(meugw)&isBlank(meogw)){
        if("0"===meugw){
            reObj.meugw=0;
        }else if(parseFloat(meugw)>0){
            reObj.meugw=parseFloat(meugw)+parseFloat(meugw)*(1-parseFloat(percentage));
        }else if (Float.parseFloat(meugw)<0){
            remap.put("meugw",Float.parseFloat(meugw)-Float.parseFloat(meugw)*(1-percentage));
            reObj.meugw=parseFloat(meugw)-parseFloat(meugw)*(1-parseFloat(percentage));
        }
        reObj.meogw=undefined;
        return reObj;
    }else if(isBlank(meugw)&!isBlank(meogw)){
        if("0"===meogw){
            reObj.meogw=0;
        }else if(parseFloat(meogw)>0){
            reObj.meogw=parseFloat(meugw)-parseFloat(meugw)*(1-parseFloat(percentage));
        }else if(parseFloat(meogw)<0){
            reObj.meogw=parseFloat(meugw)+parseFloat(meugw)*(1-parseFloat(percentage));
        }
        reObj.meugw=undefined;
        return reObj;
    }else if(!isBlank(meugw)&&!isBlank(meogw)){
        if("0"===meugw){
            reObj.meugw=meugw;
            reObj.meogw=parseFloat(meogw)*parseFloat(percentage);
            return reObj;
        }else if("0"===meogw){
            reObj.meogw=meogw;
            reObj.meugw=parseFloat(meugw)*parseFloat(percentage);
            return reObj;
        }else{
            var tolerance=parseFloat(meogw)-parseFloat(meugw);
            var newTolerance=((parseFloat(meogw)-parseFloat(meugw))*parseFloat(percentage)-tolerance)/2;
            reObj.meugw=parseFloat(meugw)-newTolerance;
            reObj.meogw=parseFloat(meogw)+newTolerance;
            return reObj;
        }
    }else{
        reObj.meugw=meugw;
        reObj.meogw=meogw;
    }
    reObj.meugw=reObj.meugw;
    reObj.meogw=reObj.meogw;
    return reObj;
}
function isBlank(str) {
    if(str===""|str==="null"|str===undefined){
        return true
    }
    return false;
}